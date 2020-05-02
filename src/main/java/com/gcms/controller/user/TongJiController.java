package com.gcms.controller.user;

import com.gcms.service.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Map;

@Controller("TongJiController")
@RequestMapping("/tj")
public class TongJiController {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());
    @Autowired
    UserGarbageService userGarbageService;
    @Autowired
    UserService userService;
    @Autowired
    private CategorizationService categorizationService;
    @Autowired
    private SearchService searchService;
    @Autowired
    private GarbageTypeService garbageTypeService;

    @RequestMapping("/tjFeiLei")
    public String tjFeiLei(Model model) {
        Long t1 = 0L;
        Long t2 = 0L;
        Long t3 = 0L;
        Long t4 = 0L;
        List<Map<String, Object>> map =  categorizationService.tjByTpye();
        for (Map<String, Object> m : map){
            Integer type = (Integer) m.get("type");
            switch (type){
                case 1:t1 = (Long) m.get("c");break;
                case 2:t2 = (Long) m.get("c");break;
                case 3:t3 = (Long) m.get("c");break;
                case 4:t4 = (Long) m.get("c");break;
            }
        }

        model.addAttribute("t1", t1);
        model.addAttribute("t2", t2);
        model.addAttribute("t3", t3);
        model.addAttribute("t4", t4);
        return "tj/tjFeiLei";
    }
}
