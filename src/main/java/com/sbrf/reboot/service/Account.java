package com.sbrf.reboot.service;

import lombok.Builder;
import lombok.Getter;

import java.math.BigDecimal;
import java.time.LocalDate;

@Builder
@Getter
public class Account {
    private String accnum;
    private long id;
    private LocalDate createDate;
    private BigDecimal balance;
    private long clientId;
}

