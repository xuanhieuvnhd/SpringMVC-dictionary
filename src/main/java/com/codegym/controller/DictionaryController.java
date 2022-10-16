package com.codegym.controller;

import com.codegym.controller.service.IDictionary;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("dictionary")
public class DictionaryController {
    @Autowired
    IDictionary dictionary;
        @GetMapping
    private String moveToWelcome() {
            return "index";
        }
        @PostMapping
    private ModelAndView lookupWord(String english){
            String english1 = english;
            String vietnamese = this.dictionary.find(english1);
            ModelAndView modelAndView = new ModelAndView("index");
            modelAndView.addObject("vietnamese",vietnamese);
            return modelAndView;
        }

}
