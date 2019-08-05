package cn.pluto.web;

import cn.pluto.po.IndexCustom;
import cn.pluto.service.IndexService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

    @Autowired
    private IndexService indexService;

    @RequestMapping("/index")
    public String index(Model model){
        IndexCustom index = indexService.getIndexCustom();

        model.addAttribute("index", index);
        return "index";
    }
}
