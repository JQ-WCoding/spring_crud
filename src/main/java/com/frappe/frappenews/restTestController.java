package com.frappe.frappenews;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
// ResponseBody & Mapper
public class restTestController {
    // git commit
    @GetMapping("/rest")
    public String test(){
        return "Hello World";
    }
}
