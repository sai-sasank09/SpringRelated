package com.sasank.SpringBootWebProject;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
    @RequestMapping("/")
    public String home(){
        return "index";
    }
    @RequestMapping("add")
    public ModelAndView add(@RequestParam("num1") int num, int num2, ModelAndView mv){
        int result=num+num2;
//        System.out.println(result);
        mv.addObject("result",result);
        mv.setViewName("result");
        return mv;

    }

    @RequestMapping("addAlien")
    public String addAlien(Alien alien){
        return "result";
    }
    @ModelAttribute("course")
    public String courseName(){
        return "AI";
    }
}
