package com.spduniversity.busmagic.entity;

public class Stop {
    private String title;

    public Stop(String title){
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return title;
    }
}
