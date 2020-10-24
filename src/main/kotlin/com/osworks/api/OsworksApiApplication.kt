package com.osworks.api

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class OsworksApiApplication

fun main(args: Array<String>) {
	runApplication<OsworksApiApplication>(*args)
}
