package ru.job4j.collection;

import com.sun.source.util.Trees;
import org.junit.Test;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class UserTest {

    @Test
    public void whenAsc() {
        User user1 = new User("Ivan", 45);
        User user2 = new User("Petr", 25);
        User user3 = new User("Igor", 35);
        Set<User> treeSet = new TreeSet<>(Arrays.asList(user1, user2, user3));
        Iterator<User> it = treeSet.iterator();
        assertThat(it.next(), is(new User("Igor", 35)));
        assertThat(it.next(), is(new User("Ivan", 45)));
    }

    @Test
    public void whenComparePertVSIvan() {
        int rsl = new User("Petr", 32)
                .compareTo(new User("Ivan", 31));
        assertThat(rsl, greaterThan(0));
    }
}