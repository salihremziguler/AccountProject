package com.salihremziguler.Account.dto

import java.math.BigDecimal
import java.time.LocalTime

data class CustomerAccountDto(
        val id:String,
        val balance:BigDecimal?=BigDecimal.ZERO,
        val transaction:Set<TransactionDto>?,
        val creationalDate:LocalTime



)
