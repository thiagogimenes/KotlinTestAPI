package com.tprogramar.bank.repository

import com.tprogramar.bank.model.Account
import org.springframework.data.jpa.repository.JpaRepository

interface AccountRepository: JpaRepository<Account, Long> {
}