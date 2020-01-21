package dev.eastar.springboot.helloworld.springboothelloworld

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SpringbootHelloworldApplication

fun main(args: Array<String>) {
	runApplication<SpringbootHelloworldApplication>(*args)
}
