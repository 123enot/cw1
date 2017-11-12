package com.spduniversity.busmagic;

import com.spduniversity.busmagic.constants.Stops;
import com.spduniversity.busmagic.entity.Map;
import com.spduniversity.busmagic.entity.Route;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        Map map = new Map();

        // Task 01.

        for(Route route: map.getRoutes()) {
            System.out.println(route);
            route.printStops();
        }

        // Task 02.

        String currentStop = Stops.TRADE_HOUSE;

        ArrayList<Route> selectedRoutes = map.getRoutesForStop(currentStop);
        if(!selectedRoutes.isEmpty()) {
            System.out.println(selectedRoutes);
        } else {
            System.out.println("No routes for bus stop: " + currentStop);
        }
    }
}
