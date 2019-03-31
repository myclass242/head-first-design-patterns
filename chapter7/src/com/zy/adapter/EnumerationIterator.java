package com.zy.adapter;


import java.util.*;

public class EnumerationIterator implements Iterator {
    private Enumeration em;
    public EnumerationIterator(Enumeration em) {
        this.em = em;
    }
    @Override
    public boolean hasNext() {
        return em.hasMoreElements();
    }
    @Override
    public Object next() {
        return em.nextElement();
    }
    @Override
    public void remove() {
        throw new UnsupportedOperationException();
    }

    public Iterator asIterator() {
        return new Iterator() {
            @Override
            public boolean hasNext() {
                return em.hasMoreElements();
            }

            @Override
            public Object next() {
                return em.nextElement();
            }

            @Override
            public void remove() {
                throw new UnsupportedOperationException();
            }
        };
    }
}
