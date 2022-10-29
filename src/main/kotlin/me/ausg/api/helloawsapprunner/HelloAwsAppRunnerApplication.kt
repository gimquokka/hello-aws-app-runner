package me.ausg.api.helloawsapprunner

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.web.bind.annotation.GetMapping

@SpringBootApplication
class HelloAwsAppRunnerApplication

fun main(args: Array<String>) {
    runApplication<HelloAwsAppRunnerApplication>(*args)
}

@GetMapping("/ping")
fun getPing(): String {
    return "pong"
}