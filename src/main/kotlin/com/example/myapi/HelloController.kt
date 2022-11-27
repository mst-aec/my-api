package com.example.myapi

import org.springframework.beans.factory.annotation.Value
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/hello")
class HelloController {

    @Value("\${server.port}")
    private var port: Int = 0

    @GetMapping
    fun hello(): String {
        return "Hello there from port: $port"
    }
}