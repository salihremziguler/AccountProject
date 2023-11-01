package com.salihremziguler.Account.repository;

import com.salihremziguler.Account.model.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account,String> {



}
