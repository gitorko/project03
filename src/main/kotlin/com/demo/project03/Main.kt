package com.demo.project03

import com.demo.project03.domain.Customer
import com.demo.project03.repo.CustomerRepository
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.boot.CommandLineRunner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Bean

@SpringBootApplication
class Main {
    private val log: Logger = LoggerFactory.getLogger(this::class.java)

    @Bean
    fun onStart(repo: CustomerRepository) = CommandLineRunner {
        log.info("Seeding!")
        val customer = Customer(0, "Jack", 35)
        repo.save(customer)
    }
}

fun main(args: Array<String>) {
    runApplication<Main>(*args)
}
