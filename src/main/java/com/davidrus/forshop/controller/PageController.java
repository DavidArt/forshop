package com.davidrus.forshop.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Controller class that will handle various url mapping like /,
 * /index, /home and all will be mapped to the same method handler
 */
@Controller
public class PageController {

    /**
     * Any request from the front end that will have "/", "/home"
     * or "/index", will be handled by this method
     * @return a ModelAndView object
     */
    @RequestMapping(value = {"/", "/home", "/index"})
    public ModelAndView index() {
        ModelAndView mv = new ModelAndView("page");
        mv.addObject("greeting", "Welcome to ForShop");

        return mv;
    }
}
