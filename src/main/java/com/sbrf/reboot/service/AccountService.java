package com.sbrf.reboot.service;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class AccountService {
    private AccountRepository accountRepository;


    public boolean isAccountExist(long id, Account account) {
        return accountRepository.getAllAccountsByClientId(id).contains(account);
    }
}
