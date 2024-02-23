package io.dashaun.service.helloworld.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
@RequestMapping("/hello")
public class HelloController {
    
    @GetMapping("/")
    public String hello() {
        return "Hello, World!";
    }
}
