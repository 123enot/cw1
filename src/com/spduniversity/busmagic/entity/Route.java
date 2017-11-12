package com.spduniversity.busmagic.entity;

import java.util.ArrayList;

public class Route {
    private String title;
    private ArrayList<Stop> stops = new ArrayList<>();
    private ArrayList<Bus> buses = new ArrayList<>();

    public Route(String title, String[] stops) {
        this.title = title;
        for(String stop: stops) {
            this.stops.add(new Stop(stop));
        }
    }

    @Override
    public String toString() {
        return "Route " + title;
    }

    public void printStops() {
        System.out.println(stops.toString());
    }

    public void addBus(Bus bus) {
        this.buses.add(bus);
    }
}
