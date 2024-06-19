package com.collection;

import java.util.Set;

import java.util.TreeSet;

public class PlayerClient {
	public static void main(String[] args) {
		Set<Player> set = new TreeSet<>(new RunComparator());
		set.add(new Player(1, "Rohit", 12000));
		set.add(new Player(1, "Virat", 15000));
		set.add(new Player(2, "Sachin", 20000));
		set.add(new Player(3, "Rishabh", 9000));
		set.add(new Player(10, "Yuraj", 11000));
		set.add(new Player(5, "Maxwell", 15000));
		set.add(new Player(6, "Kane", 14000));
		set.add(new Player(9, "Bumraha", 1000));
		set.add(new Player(7, "Ravindra Jadeja", 12000));
		set.add(new Player(8, "MSD", 16000));
		set.add(new Player(4, "ABD", 16000));

		System.out.println("Sorting by Runs");
		for (Player player : set) {
			System.out.println(player);
		}

		Set<Player> set2 = new TreeSet<>(new NameComparator());
		set2.addAll(set);
		System.out.println("-------------------------------------------");
		System.out.println("Sorting by Name");
		for (Player player : set2) {
			System.out.println(player);
		}

		Set<Player> set3 = new TreeSet<>(new RankComparators());
		set3.addAll(set);
		System.out.println("-------------------------------------------");
		System.out.println("Sorting by Rank");
		for (Player player : set3) {
			System.out.println(player);
		}
		
		

	}
}
