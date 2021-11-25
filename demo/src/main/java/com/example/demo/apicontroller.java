package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class apicontroller {
    List<user> list = new ArrayList<user>();

    @GetMapping("/welcome")
    public String getpage() {
        return ("welcome");
    }

    @PostMapping("/user")
    public response adduser(@RequestBody user u) {
        list.add(u);
        return new response("200", "Added User Successfully", u);
    }
}
