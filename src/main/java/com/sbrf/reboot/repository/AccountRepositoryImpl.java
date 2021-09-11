package com.sbrf.reboot.repository;

import com.sbrf.reboot.service.Account;
import com.sbrf.reboot.service.AccountRepository;
import lombok.AllArgsConstructor;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@AllArgsConstructor
public class AccountRepositoryImpl implements AccountRepository {
    private String path;

    @Override
    public Set<Account> getAllAccountsByClientId(long id) throws IOException {
        String clientId = "clientId";
        String number = "number";

        List<String> strings = Files.readAllLines(Paths.get(path))
                .stream()
                .filter(s -> s.contains(clientId) || s.contains(number))
                .map(s -> s.replaceAll("\\s|\"|,", ""))
                .collect(Collectors.toList());

        Set<Account> accounts = new HashSet<>();
        for (int i = 0; i < strings.size(); i++) {
            String string = strings.get(i);
            if (string.contains(clientId)) {
                String clientID = string.substring(string.indexOf(":") + 1);
                if (clientID.equals(Long.toString(id))) {
                    String nextString = strings.get(i + 1);
                    String accountNumber = nextString.substring(nextString.indexOf(":") + 1);
                    accounts.add(Account.builder().accnum(accountNumber).build());

                }
            }
        }
        return accounts;
    }

}
