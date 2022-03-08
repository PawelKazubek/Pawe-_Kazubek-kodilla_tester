package com.kodilla.collections.sets.homework;

import java.util.HashSet;
import java.util.Set;

public class StampsApplication {
    public static void main(String[] args) {
        Set<Stamp> stamps = new HashSet<>();
        stamps.add(new Stamp("Dar Pomorza", 2.0, 3.5));
        stamps.add(new Stamp("Żbik", 2.1, 3.4));
        stamps.add(new Stamp("Kuropatwa", 1.8, 3.0));
        stamps.add(new Stamp("Żbik", 2.1, 3.4));
        stamps.add(new Stamp("Kaczka", 1.5, 3.0));

        System.out.println(stamps.size());
        for (Stamp stamp : stamps)
            System.out.println(stamp.getStampName() + " " + stamp.getStampSize() + " cm2 " + stamp.isStamped());
    }
}
