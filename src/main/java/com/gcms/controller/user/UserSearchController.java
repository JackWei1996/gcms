package com.gcms.controller.user;

import com.gcms.pojo.Categorization;
import com.gcms.pojo.Search;
import com.gcms.pojo.User;
import com.gcms.service.CategorizationService;
import com.gcms.service.SearchService;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.interceptor.TransactionAspectSupport;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;

@Controller("UserSearchController")
@RequestMapping("/user/search")
public class UserSearchController {
    @Autowired
    private SearchService searchService;
    @Autowired
    private CategorizationService categorizationService;

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @RequestMapping("/log")
    public String fenleiList() {
        return "user/searchLog";
    }
    /**
     * 返回查询数据
     */
    @RequestMapping("/getAllByLimit")
    @ResponseBody
    public Object getAllByLimit(Search search) {
        Subject subject = SecurityUtils.getSubject();
        User user = (User) subject.getPrincipal();
        search.setUserId(user.getId());
        return searchService.getAllByLimit(search);
    }

    @RequestMapping("/")
    @ResponseBody
    @Transactional
    public Object search(Search search) {
        Subject subject = SecurityUtils.getSubject();
        User user = (User) subject.getPrincipal();
        try {
            Search old = searchService.getByContent(search);
            // 之前有记录
            if (old != null){
                search.setViewCount(old.getViewCount()+1);
                searchService.update(search);
            }else {
                search.setViewCount(0L);
                search.setUserId(user.getId());
                search.setCreateTime(new Date());
                searchService.save(search);
            }

            Categorization categorization = new Categorization();
            categorization.setContent(search.getContent());
            // 增加浏览量
            categorization.setViewCount(-1L);

           return categorizationService.getAllByLimit(categorization);
        } catch (Exception e) {
            logger.error("查询异常", e);
            TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
            return "ERROR";
        }
    }
}
