package me.ausg.api.helloawsapprunner.ping

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping

@Controller
class PingController() {
    @GetMapping("/ping")
    fun getPing(): String {
        return "pong"
    }
}

