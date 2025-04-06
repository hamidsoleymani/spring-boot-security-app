package example2.springsecurity2.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class HelloController {

    @GetMapping("/public/hello")
    public String publicHello() {
        return "Hello, Public!";
    }

    @GetMapping("/private/hello")
    public String privateHello() {
        return "Hello, Authenticated User!";
    }
}
