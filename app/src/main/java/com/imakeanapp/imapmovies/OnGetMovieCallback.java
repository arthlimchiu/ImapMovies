package com.imakeanapp.imapmovies;


public interface OnGetMovieCallback {

    void onSuccess(Movie movie);

    void onError();
}
