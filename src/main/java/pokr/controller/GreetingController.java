package pokr.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController // указыввает на то что работает на слое web;
public class GreetingController {
    @GetMapping("/greet")// отвечает за бработку http запросов
    public String greet(@RequestParam String name){
        return "Hello, " + name;
    }
}
