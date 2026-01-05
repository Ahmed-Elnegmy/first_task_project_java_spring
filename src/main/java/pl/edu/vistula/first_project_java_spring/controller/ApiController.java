package pl.edu.vistula.first_project_java_spring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {

    @GetMapping("/api/hello")
    public String hello(@RequestParam(defaultValue = "Vistula") String name) {
        return "Hello, " + name + "!";
    }
}
