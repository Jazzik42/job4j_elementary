package ru.job4j.bank;

import java.util.Objects;

/**
 * Класс описывает учетные данные
 * клиента банка
 * @author Ramil MUZIPOV
 * @version 1.0
 */
public class User {
    /**
     * В качестве учетных данных
     * выступают паспорт и имя клиента
     */
    private String passport;
    private String username;

    public User(String passport, String username) {
        this.passport = passport;
        this.username = username;
    }

    public String getPassport() {
        return passport;
    }

    public void setPassport(String passport) {
        this.passport = passport;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * Переопределен метод equals(), чтобы
     * сравнение объектов класса User происходили
     * по полю passport
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
        User user = (User) o;
        return Objects.equals(passport, user.passport);
    }

    /**
     * Возвращает hashCode объекта User
     * по полю passport
     * @return hashCode
     */
    @Override
    public int hashCode() {
        return Objects.hash(passport);
    }
}