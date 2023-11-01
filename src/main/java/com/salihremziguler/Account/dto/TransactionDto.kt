package com.salihremziguler.Account.dto

import com.salihremziguler.Account.model.Transaction
import java.math.BigDecimal
import java.time.LocalDateTime

data class TransactionDto(
        val id:String?,
        val transactionType: Transaction.TransactionType?= Transaction.TransactionType.INITIAL,
        val amount: BigDecimal?,
        val transactionDate: LocalDateTime?

        )
