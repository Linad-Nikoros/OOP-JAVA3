package org.example.HomeWork3;

import java.util.Iterator;
import java.util.List;

public class ListOfCats implements Iterable<Cats>{

    private List<Cats> catList;

    @Override
    public Iterator<Cats> iterator() {

        return new ListOfCatsIterator(catList);
    }

    public ListOfCats(List<Cats> catList) {
        this.catList = catList;
    }
}