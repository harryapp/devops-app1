package com.example.devopsapp1

import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api")
class MyController {
    // test
    @GetMapping("/hello")
    fun hello(): ResponseEntity<String>{
        return ResponseEntity("hello", HttpStatus.OK)
        // comment 1
    }

}