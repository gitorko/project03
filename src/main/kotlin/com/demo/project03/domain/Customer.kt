package com.demo.project03.domain

import org.springframework.data.annotation.Id
import java.time.LocalDateTime
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Table

@Entity
@Table(name = "customer")
data class Customer(
        @javax.persistence.Id @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        val id: Long = 0,
        val name: String,
        val age: Int,
        val createdAt: LocalDateTime = LocalDateTime.now(),
)
