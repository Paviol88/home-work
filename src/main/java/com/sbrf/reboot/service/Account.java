package com.sbrf.reboot.service;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor

public class Account {
    @Getter
    private String accnum;

    public String getNumber() {
        return accnum;
    }
}

