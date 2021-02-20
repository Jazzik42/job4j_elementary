package ru.job4j.collection;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import static org.hamcrest.Matchers.is;

import static org.junit.Assert.*;

public class OrderConvertTest {

    @Test
    public void process() {
        Order order1 = new Order("1213", "Papa");
        Order order2 = new Order("12131", "Mama");
        List<Order> list = new ArrayList<>(Arrays.asList(order1, order2));
        HashMap<String, Order> map = new HashMap<>();
        map.put(order1.getNumber(), order1);
        map.put(order2.getNumber(), order2);
        assertThat(OrderConvert.process(list),
                is(map));
    }
}