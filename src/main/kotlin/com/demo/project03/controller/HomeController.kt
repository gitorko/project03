package com.demo.project03.controller

import com.demo.project03.domain.Customer
import com.demo.project03.repo.CustomerRepository
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
class HomeController {

    private val log: Logger = LoggerFactory.getLogger(this::class.java)

    @Autowired
    lateinit var repo: CustomerRepository

    @GetMapping("/customer")
    fun getCustomer(): MutableIterable<Customer> {
        log.info("Getting customers!")
        return repo.findAll()
    }

    @PostMapping("/customer")
    fun save(@RequestBody customer: Customer): Customer {
        return repo.save(customer)
    }
}
