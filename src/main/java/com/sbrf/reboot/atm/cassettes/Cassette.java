package com.sbrf.reboot.atm.cassettes;

import lombok.AllArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
public class Cassette<Banknote> {
    public List<Banknote> cassette = new ArrayList<>();

    public int getCountBanknotes() {
        return cassette.size();
    }
}
