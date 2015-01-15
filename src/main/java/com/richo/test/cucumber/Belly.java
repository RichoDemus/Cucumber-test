package com.richo.test.cucumber;

public class Belly {
	int cukesEaten = 0;
	public void eat(int cukes) {
		cukesEaten += cukes;
	}

	public boolean isFull() {
		return cukesEaten > 10;
	}
}