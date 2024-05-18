package com.thomasjayconsulting.jsonlogme.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class MainController {

    @GetMapping("/")
    public String getHome() {
        log.info("We are in the home controller");
        log.warn("This is a warn message");
        return "hi";
    }

}
