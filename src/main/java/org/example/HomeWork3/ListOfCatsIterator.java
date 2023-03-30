package org.example.HomeWork3;

import java.util.Iterator;
import java.util.List;

public class ListOfCatsIterator  implements Iterator<Cats>{
        private List<Cats> catsListIterator;
        private int counter;

    public ListOfCatsIterator(List<Cats> catsListIterator) {
        this.catsListIterator = catsListIterator;
        counter = 0;
    }

    @Override
        public  boolean hasNext() {

            return counter < catsListIterator.size()-1;
        }

        @Override
        public Cats next() {
            if(!hasNext()){
                return null;
            }
            counter++;
            return  catsListIterator.get(counter);
        }

}
