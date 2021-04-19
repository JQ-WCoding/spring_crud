package com.frappe.frappenews;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class restTestController {
    @GetMapping("/rest")
    public String test(){
        return "Hello World";
    }
}
