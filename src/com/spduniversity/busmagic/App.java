package com.spduniversity.busmagic;

import com.spduniversity.busmagic.entity.Map;
import com.spduniversity.busmagic.entity.Route;

public class App {
    public static void main(String[] args) {
        Map map = new Map();

        for(Route route: map.getRoutes()) {
            System.out.println(route);
            route.printStops();
        }
    }
}
