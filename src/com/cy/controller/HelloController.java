package com.cy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
@RequestMapping("/hello")
public class HelloController {

    @RequestMapping("/helloworld")
    public String say(Model model) {
//        返回值必须是View的绝对路径这个事情么？一般情况下，我们是不会这样写的
//        return "/WEB-INF/jsp/helloworld.jsp";
        model.addAttribute("name","today"); // 指定Model的值
        model.addAttribute("url","http://www.cnblogs.com/wormday/p/8435617.html"); // 指定Model的值
        return "helloworld";
    }

}
