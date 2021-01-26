package com.tprogramar.bank.model

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id


@Entity(name = "accounts")
data class Account (
    @Id @GeneratedValue
    var id: Long? = null,
    var name: String,
    var document: String,
    var phone: String
)