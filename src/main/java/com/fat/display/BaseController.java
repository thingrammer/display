package com.fat.display;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;



@RestController
public class BaseController {
    @Autowired
    BaseService bs;
    @Autowired
    BaseMapper bm;

    @RequestMapping("/")
    String root() {
        return "good";
    }

    @RequestMapping("/tt")
    String tt() {
        var map = bm.getBasic();
        return map.get("content");
    }

    @GetMapping
    String hah(@RequestParam(name = "name") String name) {
        return "ghaha" + name;
    }

    @PostMapping("/word/{spec}")
    String word(@PathVariable String spec) {
        return spec;
    }
}
