package com.salihremziguler.Account.dto;

import com.salihremziguler.Account.model.Customer;
import org.springframework.stereotype.Component;

@Component
public class CustomerDtoConverter {

    public AccountCustomerDto convertToCustomer(Customer from)
    {
        if(from==null)
        {
            return new AccountCustomerDto("","","");
        }
        return new AccountCustomerDto(from.getId(), from.getName(), from.getSurname());
    }

}
