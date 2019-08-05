package cn.pluto.web;

import cn.pluto.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {

    @Autowired
    TestService testService;

    @RequestMapping("/test")
    public String test(String name, Model model){
        model.addAttribute("name", name);
        System.out.println(testService.getTest());
        return "index";
    }
}
