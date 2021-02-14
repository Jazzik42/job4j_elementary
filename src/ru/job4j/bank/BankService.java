package ru.job4j.bank;

import java.util.*;

public class BankService {
    private Map<User, List<Account>> users = new HashMap<>();

    public void addUser(User user) {
        List<Account> accounts = new ArrayList<>();
        users.putIfAbsent(user, accounts);
    }

    public void addAccount(String passport, Account account) {
        User user = findByPassport(passport);
        if (user != null) {
        if (!users.get(user).contains(account)) {
            users.get(user).add(account);
        } else {
            System.out.println("Account already exists.");
        }
    } else {
            System.out.println("User not found.");
        }
    }

    public User findByPassport(String passport) {
        User buff = null;
        for (User user : users.keySet()) {
            if (user.getPassport().equals(passport)) {
                buff = user;
                break;
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
                    break;
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
        if (account != null && account2 != null) {
        double balance = account.getBalance();
        if (balance >= amount) {
            account.setBalance(balance - amount);
            account2.setBalance(account2.getBalance() + amount);
            rsl = true;
        }
        } else {
            System.out.println("Account not found.");
        }
        return rsl;
    }

}
