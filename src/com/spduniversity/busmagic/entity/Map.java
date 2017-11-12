package com.spduniversity.busmagic.entity;

import com.spduniversity.busmagic.constants.Stops;

import java.util.ArrayList;

public class Map {
    private ArrayList<Route> routes = new ArrayList<>();
    private ArrayList<Stop> stops = new ArrayList<>();
    private ArrayList<Bus> buses = new ArrayList<>();

    public Map() {
        initData();
    }

    public void initData() {
        createRoutes();
    }

    private void createRoutes() {
        routes.add(new Route("30", new String[] {
                Stops.CHEMIST_PARK,
                Stops.CINEMA_PEACE,
                Stops.PASTEROVSKA,
                Stops.CHMELNITSKY_SQUARE,
                Stops.TRADE_HOUSE,
                Stops.CENTRAL_STADIUM
        }));

        Route route30 = routes.get(0);
        route30.addBus(new Bus(1, Stops.CINEMA_PEACE));
        route30.addBus(new Bus(2, Stops.CHMELNITSKY_SQUARE));
        route30.addBus(new Bus(3, Stops.CENTRAL_STADIUM));

        routes.add(new Route("31", new String[] {
                Stops.CHEMIST_PARK,
                Stops.CINEMA_PEACE,
                Stops.PASTEROVSKA,
                Stops.CHMELNITSKY_SQUARE,
                Stops.TRADE_HOUSE,
                Stops.KAZBET,
                Stops.UNIVERSITY,
                Stops.PINE_FOREST_PARK,
                Stops.POLYCLINIC
        }));

        Route route31 = routes.get(1);
        route31.addBus(new Bus(111, Stops.CHEMIST_PARK));
        route31.addBus(new Bus(112, Stops.PASTEROVSKA));
        route31.addBus(new Bus(113, Stops.TRADE_HOUSE));
        route31.addBus(new Bus(114, Stops.UNIVERSITY));
    }

    public ArrayList<Route> getRoutes() {
        return routes;
    }

    public ArrayList<Bus> getBuses() {
        return buses;
    }

    public ArrayList<Stop> getStops() {
        return stops;
    }
}
