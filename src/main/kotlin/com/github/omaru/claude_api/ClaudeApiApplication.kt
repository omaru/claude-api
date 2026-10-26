package com.github.omaru.claude_api

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication class ClaudeApiApplication

fun main(args: Array<String>) {
    runApplication<ClaudeApiApplication>(*args)
}
