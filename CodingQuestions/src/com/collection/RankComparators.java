package com.collection;

import java.util.Comparator;

public class RankComparators implements Comparator<Player> {

    // Compare players by their rank
    @Override
    public int compare(Player o1, Player o2) {
        return Integer.compare(o1.getRank(), o2.getRank());
    }
}

