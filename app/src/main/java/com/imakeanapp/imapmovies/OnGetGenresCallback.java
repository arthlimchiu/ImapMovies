package com.imakeanapp.imapmovies;


import java.util.List;

public interface OnGetGenresCallback {

    void onSuccess(List<Genre> genres);

    void onError();
}
