package com.glazweq.springapp;

public class RockMusic implements Music {
    private String song = "I wonna Rock!";
@Override
    public String getSong() {
        return song;
    }
}
