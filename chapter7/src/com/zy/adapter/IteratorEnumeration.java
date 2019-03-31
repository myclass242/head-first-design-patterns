package com.zy.adapter;

import java.util.*;

public class IteratorEnumeration implements Enumeration {
    private Iterator ite;
    public IteratorEnumeration(Iterator ite) {
        this.ite = ite;
    }

    @Override
    public boolean hasMoreElements() {
        return ite.hasNext();
    }
    @Override
    public Object nextElement() {
        return ite.next();
    }

    public Enumeration asEnumeration() {
        return new Enumeration() {
            @Override
            public boolean hasMoreElements() {
                return ite.hasNext();
            }
            @Override
            public Object nextElement() {
                return ite.next();
            }
        };
    }
}
