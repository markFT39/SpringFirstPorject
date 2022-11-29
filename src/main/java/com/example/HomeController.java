package com.example;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class HomeController {
    @RequestMapping("/")
    public String home() {
        return "index";
    }

    @RequestMapping("classlist")
    public String classList(Model model) {
        List<String> list = new ArrayList<String>();
        list.add("실전프로젝트 1분반");
        list.add("김형진");
        list.add("한동대학교");
        list.add("테스트 라인");

        model.addAttribute("classlist", list);
        String msg = "Spring Project Page";
        model.addAttribute("title", msg);
    return "board/list";
    }
}
