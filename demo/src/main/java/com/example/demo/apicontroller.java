package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class apicontroller {
    List <user> list=new ArrayList<>();
   
    @GetMapping("/welcome")
    public String getpage(){
        return ("welcome");
    }
    
    @PostMapping("/user")
    public user adduser(@RequestBody user u)
    {
        list.add(u);
       return u;
    }

   
   
}
