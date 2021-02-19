package ru.job4j.bank;

import java.util.Objects;

/**
 * Класс описывает счет клиента банка
 * @author Ramil MUZIPOV
 * @version 1.0
 */
public class Account {
    /**
     * Счет клиента состоит из реквизитов
     * и текущего баланса
     */
    private String requisite;
    private double balance;

    public Account(String requisite, double balance) {
        this.requisite = requisite;
        this.balance = balance;
    }

    public String getRequisite() {
        return requisite;
    }

    public void setRequisite(String requisite) {
        this.requisite = requisite;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    /**
     * Переопределен метод equals, так, чтобы
     * сравнения объектов класса Account происходило
     * по полю класса requisite
     * @param o в параметр идет второй объект сравнения
     * @return возвращает true, если объекты равны
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Account ab = (Account) o;
        return Objects.equals(requisite, ab.requisite);
    }

    /**
     * Возвращает hashCode поля requisite
     * @return  hashCode
     */
    @Override
    public int hashCode() {
        return Objects.hash(requisite);
    }
}
