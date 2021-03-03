package ru.job4j.bank;

import org.junit.Test;

import javax.accessibility.AccessibleIcon;

import java.util.Optional;

import static org.junit.Assert.*;
import static org.hamcrest.Matchers.is;

public class BankServiceTest {

    @Test
    public void addUser() {
        User user = new User("1234", "Papa");
        BankService bs = new BankService();
        bs.addUser(user);
        assertThat(bs.findByPassport("1234").get(), is(user));
    }

    @Test
    public void addAccount() {
        User user = new User("1234", "Papa");
        BankService bs = new BankService();
        bs.addUser(user);
        Account account = new Account("12345", 123.0);
        bs.addAccount("1234", account);
        assertThat(bs.findByRequisite("1234", "12345").get().getBalance(), is(123.0));
    }

    @Test
    public void whenEnterInvalidPassport() {
        User user = new User("1234", "Papa");
        BankService bs = new BankService();
        bs.addUser(user);
        bs.addAccount(user.getPassport(), new Account("12345", 14));
        assertThat(bs.findByRequisite("34", "12345"), is(Optional.empty()));
    }

    @Test
    public void transferMoney() {
        User user = new User("1234", "Papa");
        User user2 = new User("4321", "Mama");
        BankService bs = new BankService();
        bs.addUser(user);
        bs.addUser(user2);
        Account accUser1 = new Account("5678", 2000.0);
        Account accUser2 = new Account("8765", 0.0);
        bs.addAccount("1234", accUser1);
        bs.addAccount("4321", accUser2);
        bs.transferMoney("1234", "5678",
                "4321", "8765", 1000.0);
        assertThat(bs.findByRequisite(user.getPassport(), "5678").get().getBalance(), is(1000.0));
    }
}