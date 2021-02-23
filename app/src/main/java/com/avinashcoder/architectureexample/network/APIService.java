package com.avinashcoder.architectureexample.network;

import com.avinashcoder.architectureexample.model.Note;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface APIService {

    @GET("samplejsonarray.html")
    Call<List<Note>> getNotes();

}
