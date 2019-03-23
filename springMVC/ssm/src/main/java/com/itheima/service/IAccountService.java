package com.itheima.service;

import com.itheima.domain.Account;

import java.util.List;

public interface IAccountService {

    List<Account> findAll();

    void saveAccount(Account account);
}
