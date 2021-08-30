package com.sbrf.reboot.service;

import lombok.AllArgsConstructor;

import java.io.IOException;

@AllArgsConstructor
public class AccountService {
    private AccountRepository accountRepository;


    public boolean isAccountExist(long id, Account account) throws IOException {
        return accountRepository.getAllAccountsByClientId(id).contains(account);
    }
}
