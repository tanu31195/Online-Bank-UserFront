/*
 * Created by Tanushka Bandara (https://tanu31195.github.io)
 * Last Modified on 4/23/20, 3:14 PM
 * Copyright (c) 2020. All rights reserved.
 */

package io.github.tanu31195.UserFront.contoller;

import io.github.tanu31195.UserFront.domain.PrimaryAccount;
import io.github.tanu31195.UserFront.domain.SavingsAccount;
import io.github.tanu31195.UserFront.domain.User;
import io.github.tanu31195.UserFront.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.security.Principal;

@Controller
@RequestMapping("/account")
public class AccountController {

    @Autowired
    private UserService userService;

    @RequestMapping("/primaryAccount")
    public String primaryAccount(Model model, Principal principal) {
        User user = userService.findByUsername(principal.getName());
        PrimaryAccount primaryAccount = user.getPrimaryAccount();

        model.addAttribute("primaryAccount", primaryAccount);
        return "primaryAccount";
    }

    @RequestMapping("/savingsAccount")
    public String savingsAccount(Model model, Principal principal) {
        User user = userService.findByUsername(principal.getName());
        SavingsAccount savingsAccount = user.getSavingsAccount();

        model.addAttribute("savingsAccount", savingsAccount);
        return "savingsAccount";
    }
}
