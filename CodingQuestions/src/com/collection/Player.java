package com.collection;

public class Player {
	private int rank;
	String name;
	private long runs;

	@Override
	public String toString() {
		return "Player [rank=" + rank + ", name=" + name + ", runs=" + runs + "]";
	}

	public Player(int rank, String name, long runs) {
		super();
		this.rank = rank;
		this.name = name;
		this.runs = runs;
	}

	public int getRank() {
		return rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getRuns() {
		return runs;
	}

	public void setRuns(long runs) {
		this.runs = runs;
	}

}
