package ru.marketplace.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Main {

    @GetMapping("/")
    public String main() {
        return "main";
    }

    @GetMapping("/info")
    public String info() {
        return "info";
    }
    @GetMapping("/contact")
    public String contact() {
        return "contact";
    }
    @GetMapping("/price")
    public String price() {
        return "price";
    }
    @GetMapping("/form")
    public String form() {
        return "form";
    }
}
