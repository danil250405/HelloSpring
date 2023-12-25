package com.glazweq.springapp;

public class ClassicalMusic implements Music {
    private String song = "Bohem rapsody";
@Override
    public String getSong() {
        return song;
    }
}
