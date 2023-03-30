package org.example.HomeWork3;
import java.util.Comparator;

public class CatsAgeComparator implements Comparator<Cats> {
    @Override
    public int compare(Cats cats1, Cats cats2) {
        if (cats1.getAge() > cats2.getAge()){
            return 1;
        }else if (cats1.getAge() < cats2.getAge()){
            return -1;
        }else {
            return 0;
        }
    }
}
