package com.salihremziguler.Account.service

import java.math.BigDecimal

data class CreateAccountRequest(
    val customerId:String,
    val initialCredit:BigDecimal


){

}
