package com.tprogramar.bank.service

import com.tprogramar.bank.model.Account
import org.springframework.web.bind.annotation.RequestBody
import java.util.*

interface AccountService {
    fun create(account: Account) : Account

    fun getAll(): List<Account>

    fun getById(id: Long) : Optional<Account>

    fun update(id: Long, @RequestBody account: Account) : Optional<Account>

    fun delete(id: Long)
}