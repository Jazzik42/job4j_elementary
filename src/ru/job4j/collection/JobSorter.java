package ru.job4j.collection;

import java.util.*;

public class JobSorter {
    public static void main(String[] args) {
        List<Job> jobs = new ArrayList<>(Arrays.asList(
                new Job("Fix bug", 1),
                new Job("Fix bug", 4),
                new Job("Fix bug", 2),
                new Job("X task", 0)
        ));
        Comparator<Job> combReverse = new JobNameLnComparatorReverse()
                .thenComparing(new JobNameComparatorReverse())
                .thenComparing(new JobPriorityComparatorReverse());
        Comparator<Job> comb = new JobNameLnComparator()
                .thenComparing(new JobNameComparator())
                .thenComparing(new JobPriorityComparator());
         Collections.sort(jobs, comb);
         Collections.sort(jobs, combReverse);
        }
    }

