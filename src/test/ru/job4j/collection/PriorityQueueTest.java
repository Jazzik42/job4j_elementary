package ru.job4j.collection;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.hamcrest.Matchers.is;

public class PriorityQueueTest {

    @Test
    public void whenHigherPriority() {
        PriorityQueue pq = new PriorityQueue();
        pq.put(new Task("low", 5));
        pq.put(new Task("ugrent", 1));
        pq.put(new Task("midle", 3));
        Task result = pq.take();
        assertThat(result.getDesc(), is("ugrent"));
    }
}