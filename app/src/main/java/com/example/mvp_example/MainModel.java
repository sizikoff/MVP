package com.example.mvp_example;

public class MainModel implements MainContract.Repository {
    //MODEL
    private static final String TAG = "MainModel";
    @Override
    public String loadMessage() {
        return "Сосисочная";
    }
}
