package ru.job4j.bank;

import java.util.*;

/**
 * Класс описывает работу банковской системы, где
 * клиент может зарегистрироваться и совершать
 * манипуляции с своими счетами, а так же выполнять
 * денежные переводы
 * @author Ramil MUZIPOV
 * @version 1.0
 */
public class BankService {
    /**
     * Хранение счетов осуществляется посредством
     * HashMap, ключом является учетная запись клиента
     */
    private Map<User, List<Account>> users = new HashMap<>();

    /**
     * Метод принимает на вход учетную запись клиента
     * и если его нет в HahMap, добавляет,
     * а так же создает для него List с счетами
     * @param user учетная запись клиента
     */
    public void addUser(User user) {
        List<Account> accounts = new ArrayList<>();
        users.putIfAbsent(user, accounts);
    }

    /**
     * Метод принимает паспортные данные клиента,
     * и счет, и если такой клиент зарегистрирован
     * в базе, то прикрепляет к нему этот счет, если этого
     * не было сделано ранее
     * @param passport паспортные данные клиента
     * @param account счет клиента
     */
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

    /**
     * Метод принимает паспортные данные клиента,
     * и возвращает учетную запись клиента, если он
     * был зарегистрирован ранее
     * @param passport паспортные данные клиента
     * @return User учетная запись клиента
     */
    public User findByPassport(String passport) {
        return users.keySet()
                .stream()
                .filter(x -> x.getPassport().equals(passport))
                .findFirst()
                .orElse(null);
    }

    /**
     * Метод позволяет получить счет клиента, принимая
     * данные паспорта и реквизиты счета, если клиент
     * и его счет зарегистрированы в базе
     * @param passport паспортные данные клиента
     * @param requisite реквизиты его счета
     * @return возвращает его счет
     */
    public Account findByRequisite(String passport, String requisite) {
        User user = findByPassport(passport);
        if (user != null) {
            return users.get(user)
                    .stream()
                    .filter(x -> x.getRequisite().equals(requisite))
                    .findFirst()
                    .orElse(null);
        }
        return null;
    }

    /**
     * Метод позволяет перевести сумму денег amount
     * с одного счета на другой
     * @param srcPassport паспортные данные пользователя, переводящего деньги
     * @param srcRequisite реквизиты счета, с которого выполняется перевод
     * @param destPassport паспортные данные пользователя, получающего деньги
     * @param destRequisite реквизиты счета, на который переведутся деньги
     * @param amount сумма перевода
     * @return возвращает true, если перевод выполнился
     */
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
