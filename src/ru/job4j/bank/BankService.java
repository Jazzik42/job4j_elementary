package ru.job4j.bank;

import java.util.*;

public class BankService {
    private Map<User, List<Account>> users = new HashMap<>();

    public void addUser(User user) {
        List<Account> accounts = new ArrayList<>();
        users.putIfAbsent(user, accounts);
    }

    public void addAccount(String passport, Account account) {
        users.get(findByPassport(passport)).add(account);
    }

    public User findByPassport(String passport) {
        User buff = null;
        for (User user : users.keySet()) {
            if (user.getPassport().equals(passport)) {
                buff = user;
            }
        }
        return buff;
    }

    public Account findByRequisite(String passport, String requisite) {
        User user = findByPassport(passport);
        Account buff = null;
        if (user != null) {
            List<Account> accounts = users.get(user);
            for (Account account : accounts) {
                if (account.getRequisite().equals(requisite)) {
                    buff = account;
                }
            }
        }
        return buff;
    }

    public boolean transferMoney(String srcPassport, String srcRequisite,
                                 String destPassport, String destRequisite, double amount) {
        boolean rsl = false;
        Account account = findByRequisite(srcPassport, srcRequisite);
        Account account2 = findByRequisite(destPassport, destRequisite);
        double balance = account.getBalance();
        if (balance >= amount) {
            account.setBalance(balance - amount);
            account2.setBalance(account2.getBalance() + amount);
            rsl = true;
        }
        return rsl;
    }

}
