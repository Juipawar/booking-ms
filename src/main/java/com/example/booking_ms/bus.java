package com.example.booking_ms;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class bus {

    @GetMapping("/bus")
    public String getData () { return "Please book your bussssss ticket in bengaluru from redbus 10% discount";

    }
}
