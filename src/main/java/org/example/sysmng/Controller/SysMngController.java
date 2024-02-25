package org.example.sysmng.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SysMngController {
    @GetMapping("/hello")
    public String hello(String nickname) {
        return "nickname: " + nickname;
    }

}
