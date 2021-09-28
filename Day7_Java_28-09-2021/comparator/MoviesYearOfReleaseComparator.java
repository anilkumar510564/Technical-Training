package com.torryharris.comparator;

import com.torryharris.model.Movies;

import java.util.Comparator;

public class MoviesYearOfReleaseComparator implements Comparator<Movies> {
    @Override
    public int compare(Movies o1, Movies o2) {
        return o1.getYearOfRelease()-o2.getYearOfRelease();
    }
}
