package com.example.devopsapp1

import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class MyController {
    // test
    @GetMapping("/api/hello")
    fun hello(): ResponseEntity<String> {
        return ResponseEntity("hello", HttpStatus.OK)
        // comment 1
    }

    @GetMapping("/")
    fun test(): ResponseEntity<String> {
        return ResponseEntity("test", HttpStatus.OK)
    }

}