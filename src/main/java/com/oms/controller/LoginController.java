package com.oms.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by muyun on 2017/3/10.
 */
@RestController
public class LoginController {

    @RequestMapping(value = "/")
    public ModelAndView toLogin(){
        return new ModelAndView("/login.html");
    }

    @RequestMapping(value = "/login.do")
    public String Login(HttpServletRequest request, HttpServletResponse response){
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        return username + password;
    }

}
