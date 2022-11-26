package com.example.myapi

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class MyApiApplication

fun main(args: Array<String>) {
    runApplication<MyApiApplication>(*args)
}
