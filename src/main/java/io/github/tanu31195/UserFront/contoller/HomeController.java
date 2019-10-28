/*
 * Created by Tanushka Bandara (https://tanu31195.github.io)
 * Last Modified on 10/28/19, 11:13 PM
 * Copyright (c) 2019. All rights reserved.
 */

package io.github.tanu31195.UserFront.contoller;

import io.github.tanu31195.UserFront.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String home() {
        return "redirect:/index";
    }

    @RequestMapping("/index")
    public String index() {
        return "index";
    }

    @RequestMapping(value = "/signup", method = RequestMethod.GET)
    public String signup(Model model) {
        User user = new User();
        model.addAttribute("user", user);

        return "signup";
//      binds the user which is initialized and binds the user object to "user" variable and return to signup.html
    }

//    @RequestMapping(value = "/signup", method = RequestMethod.POST)
//    public String signupPost(@ModelAttribute("user") User user, Model model) {
//        if (checkuservalidity) {
//
//            return "signup";
//        } else {
//            return "redirect:/";
//        }
//    }
}
