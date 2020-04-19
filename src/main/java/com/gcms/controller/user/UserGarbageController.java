package com.gcms.controller.user;

import com.gcms.pojo.User;
import com.gcms.pojo.UserGarbage;
import com.gcms.service.UserGarbageService;
import com.gcms.service.UserService;
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

@Controller("UserGarbageController")
@RequestMapping("/user/garbage")
public class UserGarbageController {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());
    @Autowired
    UserGarbageService userGarbageService;
    @Autowired
    UserService userService;

    @RequestMapping("/list")
    public String list() {
        return "user/garbageList";
    }

    @RequestMapping("/listBaoJie")
    public String listBaoJie() {
        return "user/garbageListBaoJie";
    }

    @RequestMapping("/add")
    public String addPage() {
        return "user/garbageAdd";
    }

    /**
     * 返回查询数据
     */
    @RequestMapping("/getAllByLimit")
    @ResponseBody
    public Object getAllByLimit(UserGarbage userGarbage) {
        Subject subject = SecurityUtils.getSubject();
        User user = (User) subject.getPrincipal();
        userGarbage.setUserId(user.getId());
        return userGarbageService.getAllByLimit(userGarbage);
    }

    /**
     * 返回查询数据
     */
    @RequestMapping("/getAllByLimitBaoJie")
    @ResponseBody
    public Object getAllByLimitBaoJie(UserGarbage userGarbage) {
        Subject subject = SecurityUtils.getSubject();
        User user = (User) subject.getPrincipal();
        userGarbage.setHandUserId(user.getId());
        return userGarbageService.getAllByLimit(userGarbage);
    }


    @RequestMapping(value = "/doAdd")
    @ResponseBody
    @Transactional
    public String doAdd(UserGarbage userGarbage) {
        Subject subject = SecurityUtils.getSubject();
        User user = (User) subject.getPrincipal();
        try {
            User userByPhoneAndName = userService.getUserByPhoneAndName(null, userGarbage.getName());
            if (userByPhoneAndName == null){
                return "PHONE_ERR";
            }
            userGarbage.setCreateTime(new Date());
            userGarbage.setHandUserId(user.getId());
            userGarbageService.save(userGarbage);
            return "SUCCESS";
        } catch (Exception e) {
            logger.error("添加异常", e);
            TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
            return "ERROR";
        }
    }
}
