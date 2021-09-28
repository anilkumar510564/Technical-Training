package com.torryharris.comparator;

import com.torryharris.model.Movies;

import java.util.Comparator;

public class MoviesImdbRatingComparator implements Comparator<Movies> {
    @Override
    public int compare(Movies o1, Movies o2) {
        return o2.getImdbRating().compareTo(o1.getImdbRating());
    }
}
