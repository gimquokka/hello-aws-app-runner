package me.ausg.api.helloawsapprunner.ping

import org.springframework.http.ResponseEntity
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping

@Controller
class PingController() {
    @GetMapping("/ping")
    fun getPing(): ResponseEntity<String> =
        ResponseEntity.ok("pong")
}

