package com.web.boot_web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class MainController {

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public String editGet() {
        return "test";
    }
}
