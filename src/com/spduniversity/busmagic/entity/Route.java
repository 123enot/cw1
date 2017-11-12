package com.spduniversity.busmagic.entity;

import java.util.ArrayList;

public class Route {
    private String title;
    private ArrayList<Stop> stops = new ArrayList<>();
    private ArrayList<String> stopsTitles = new ArrayList<>();
    private ArrayList<Bus> buses = new ArrayList<>();

    public Route(String title, String[] stops) {
        this.title = title;
        for(String stop: stops) {
            Stop newStop = new Stop(stop);
            this.stops.add(newStop);
            this.stopsTitles.add(newStop.getTitle());
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

    public boolean hasStop(String selectedStop) {
        return stopsTitles.indexOf(selectedStop) > -1;
    }

    /*private int getBusCurrentPosition() {
        for(Bus bus: buses) {

        }
    }*/
}
