package com.salihremziguler.Account.model

import jakarta.persistence.*
import org.hibernate.annotations.GenericGenerator




data class Customer(
        @Id
        @GeneratedValue(generator = "UUID")
        @GenericGenerator(name="UUID", strategy = "org.hibernate.id.UUIDGenerator")
        val id:String?,
        val name:String?,
        val surname:String?,

        //Directionaly RelatonShip
        @OneToMany(mappedBy = "customer", fetch = FetchType.LAZY)
        val account: Set<Account>   //Tek kayıt olabilmesi için Set kullanıldı




){
        override fun equals(other: Any?): Boolean {
                if (this === other) return true
                if (javaClass != other?.javaClass) return false

                other as Customer

                if (id != other.id) return false
                if (name != other.name) return false
                if (surname != other.surname) return false
                return account == other.account
        }

        override fun hashCode(): Int {
                var result = id?.hashCode() ?: 0
                result = 31 * result + (name?.hashCode() ?: 0)
                result = 31 * result + (surname?.hashCode() ?: 0)

                return result
        }
}
