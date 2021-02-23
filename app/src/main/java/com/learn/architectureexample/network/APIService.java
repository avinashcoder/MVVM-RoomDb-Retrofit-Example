package com.learn.architectureexample.network;

import com.learn.architectureexample.model.Note;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface APIService {

    @GET("samplejsonarray.html")
    Call<List<Note>> getNotes();

}
