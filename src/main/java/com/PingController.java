package com;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(path = "/ping")
public class PingController {

    @GetMapping
    public String ping() {
        return "pong";
    }

}
