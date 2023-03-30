package org.example.HomeWork3;

import java.util.List;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        CatsAgeComparator comparator = new CatsAgeComparator();
        TreeSet<Cats> catsSorted = new TreeSet<>(comparator);
        catsSorted.add( new Cats("Василий",18));
        catsSorted.add( new Cats("Пушок",10));
        catsSorted.add( new Cats("Маруся",9));
        catsSorted.add(new Cats("Кузя",17));
        System.out.println(catsSorted);

        ListOfCats  cats = new ListOfCats(List.of(
            new Cats("Василий",18),
            new Cats("Пушок",10),
            new Cats("Маруся",9),
            new Cats("Кузя",17),
            new Cats("симба",12)));
        System.out.println(cats.iterator().next().toString());

    }
}


