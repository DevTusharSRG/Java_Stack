package com.example1.demo1;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/hello")
public class HelloController {

    private final List<String> names = new ArrayList<>();

    @GetMapping("/get")
    public List<String> getNames() {
        return names;
    }

    @PostMapping("/post")
    public String addName(@RequestBody String name) {
        names.add(name);
        return "Added: " + name;
    }
}

