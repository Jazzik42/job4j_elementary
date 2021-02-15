package ru.job4j.collection;

import org.junit.Test;

import java.util.*;

import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.Matchers.lessThan;
import static org.junit.Assert.*;

public class JobSorterTest {

    @Test
    public void cmpCombNP() {
        Comparator<Job> cmpNamePriority = new JobNameComparator()
                .thenComparing(new JobPriorityComparator());
        int rsl = cmpNamePriority.compare(
                new Job("Programmer", 3),
                new Job("Lead", 5));
        assertThat(rsl, greaterThan(0));
    }

    @Test
    public void cmpCombNLnNamePriority() {
        Comparator<Job> cmpNamePriority = new JobNameLnComparator()
                .thenComparing(new JobNameComparator())
                .thenComparing(new JobPriorityComparator());
        int rsl = cmpNamePriority.compare(
                new Job("Programmer", 3),
                new Job("Programmer", 5));
        assertThat(rsl, lessThan(0));
    }

    @Test
    public void cmpCombNLnNamePriorityReverse() {
        Comparator<Job> cmpNamePriority = new JobNameLnComparatorReverse()
                .thenComparing(new JobNameComparatorReverse())
                .thenComparing(new JobPriorityComparatorReverse());
        int rsl = cmpNamePriority.compare(
                new Job("Nrogrammer", 3),
                new Job("Programmer", 5));
        assertThat(rsl, greaterThan(0));
    }

    @Test
    public void cmpName() {
        Comparator<Job> cmpName = new JobNameComparator();
        int rsl = cmpName.compare(
                new Job("Jober", 3),
                new Job("Programmer", 5));
        assertThat(rsl, lessThan(0));
    }

    @Test
    public void cmpNameLn() {
        Comparator<Job> cmpNameLn = new JobNameLnComparator();
        int rsl = cmpNameLn.compare(
                new Job("Programmer", 3),
                new Job("Jober", 5));
        assertThat(rsl, greaterThan(0));
    }

    @Test
    public void cmpPriority() {
        Comparator<Job> cmpPriority = new JobPriorityComparator();
        int rsl = cmpPriority.compare(
                new Job("Programmer", 3),
                new Job("Jober", 5));
        assertThat(rsl, lessThan(0));
    }

    @Test
    public void cmpNameReverse() {
        Comparator<Job> cmpNameReverse = new JobNameComparatorReverse();
        int rsl = cmpNameReverse.compare(
                new Job("Jober", 3),
                new Job("Programmer", 5));
        assertThat(rsl, greaterThan(0));
    }

    @Test
    public void cmpNameLnReverse() {
        Comparator<Job> cmpNameLnReverse = new JobNameLnComparatorReverse();
        int rsl = cmpNameLnReverse.compare(
                new Job("Programmer", 3),
                new Job("Jober", 5));
        assertThat(rsl, lessThan(0));
    }

    @Test
    public void cmpPriorityReverse() {
        Comparator<Job> cmpPriorityReverse = new JobPriorityComparatorReverse();
        int rsl = cmpPriorityReverse.compare(
                new Job("Programmer", 3),
                new Job("Jober", 5));
        assertThat(rsl, greaterThan(0));
    }
}