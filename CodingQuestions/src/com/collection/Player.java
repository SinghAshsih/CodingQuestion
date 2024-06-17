package com.collection;

import java.util.Objects;

class Player {
	private int rank;
	private String name;
	private long runs;

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

	@Override
	public int hashCode() {
		return Objects.hash(name, rank, runs);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Player other = (Player) obj;
		return Objects.equals(name, other.name) && rank == other.rank && runs == other.runs;
	}

	@Override
	public String toString() {
		return "Player [rank=" + rank + ", name=" + name + ", runs=" + runs + "]";
	}

}