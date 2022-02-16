package com.example.simplewebapplication;
import jdk.nashorn.internal.ir.RuntimeNode;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class SimpaleController 
    @RequestMapping("/")
    public  String  index(){
    return "Hello World";
    }
}
