package com.torryharris.comparator;

import com.torryharris.model.Movies;

import java.util.Comparator;

public class MoviesCollectionsComparator implements Comparator<Movies> {
    @Override
    public int compare(Movies o1, Movies o2) {
        return o2.getCollections().compareTo(o1.getCollections());
    }
}
