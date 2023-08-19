package com.manglik.aopdemo.dao;

import com.manglik.aopdemo.Account;
import org.springframework.stereotype.Repository;

@Repository
public class AccountDaoIml implements AccountDao{

    @Override
    public void addAccount(Account account, boolean vipFlag) {
        System.out.println(getClass() + "Doing my work in an account");
    }
}
