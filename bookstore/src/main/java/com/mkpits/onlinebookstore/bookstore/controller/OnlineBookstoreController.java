package com.mkpits.onlinebookstore.bookstore.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class OnlineBookstoreController {
    @GetMapping("/login")
    public String homeController(){
        return "/login";
    }
}
