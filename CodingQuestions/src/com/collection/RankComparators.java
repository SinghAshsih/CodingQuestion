package com.collection;

import java.util.Comparator;

public class RankComparators implements Comparator<Player> {

	// Rank
	@Override
	public int compare(Player o1, Player o2) {
		// TODO Auto-generated method stub
		if (o1.getRank() == o2.getRank())
			return 0;
		else if (o1.getRank() > o2.getRank())
			return 1;
		else
			return -1;
	}

}

class RunComparator implements Comparator<Player> {

	@Override
	public int compare(Player o1, Player o2) {
		// TODO Auto-generated method stub
		if (o1.getRuns() == o2.getRuns())
			return 0;
		else if (o1.getRuns() > o2.getRuns())
			return 1;
		else
			return -1;
	}

}

class NameComparator implements Comparator<Player> {

	@Override
	public int compare(Player o1, Player o2) {
		// TODO Auto-generated method stub
		return o1.name.compareTo(o2.name);  
	}

}