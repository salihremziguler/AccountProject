package com.salihremziguler.Account.dto

import com.salihremziguler.Account.model.Transaction
import jakarta.persistence.Entity
import jakarta.persistence.EntityTransaction
import java.math.BigDecimal
import java.time.LocalDateTime


data class AccountDto(
        val id:String?,
        val balance: BigDecimal?= BigDecimal.ZERO,
        val creationDate: LocalDateTime?,
        val customer:AccountCustomerDto?,
        val transaction: Set<TransactionDto>?

        )
