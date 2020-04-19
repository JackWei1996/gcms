package com.gcms.controller.admin;

import com.gcms.pojo.Categorization;
import com.gcms.service.CategorizationService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.interceptor.TransactionAspectSupport;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller("AdminCategorizationController")
@RequestMapping("/admin/fenlei")
public class AdminCategorizationController {
    @Autowired
    private CategorizationService categorizationService;

    private final Logger logger = LoggerFactory.getLogger(this.getClass());
    /**
     * 分类列表页面
     */
    @RequestMapping("/fenleiList")
    public String fenleiList() {
        return "sa/fenleiList";
    }

    /**
     * 返回查询数据
     */
    @RequestMapping("/getAllByLimit")
    @ResponseBody
    public Object getAllByLimit(Categorization categorization) {
        return categorizationService.getAllByLimit(categorization);
    }

    @RequestMapping(value = "/del")
    @ResponseBody
    @Transactional
    public String delUser(Long id) {
        try {
            categorizationService.deleteById(id);
            return "SUCCESS";
        } catch (Exception e) {
            logger.error("删除异常", e);
            TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
            return "ERROR";
        }
    }

    @RequestMapping(value = "/add")
    public String addUserPage() {
        return "sa/fenleiAdd";
    }

    @RequestMapping(value = "/doAdd")
    @ResponseBody
    @Transactional
    public String doAdd(Categorization categorization) {
        try {
            categorization.setViewCount(0L);
            categorizationService.add(categorization);
            return "SUCCESS";
        } catch (Exception e) {
            logger.error("添加异常", e);
            TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
            return "ERROR";
        }
    }

}
