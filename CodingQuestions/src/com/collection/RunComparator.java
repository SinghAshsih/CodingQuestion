package com.collection;

import java.util.Comparator;

public class RunComparator implements Comparator<Player> {

    @Override
    public int compare(Player o1, Player o2) {
        return Long.compare(o1.getRuns(), o2.getRuns());
    }
}
