package com.mukunda.java.oops;


class Scorer{
	private int score = 0;

	public int getScore() {
		return score;
	}

	public void addRuns(int score) {
		this.score = this.score +score;
	}
	
	public void six() {
		addRuns(6);
	}
	
	public void four() {
		addRuns(4);
	}
	
	public void printScore() {
		System.out.println("Score is: "+score);
	}
}
public class EncapsulationExample {

	public static void main(String[] args) {

		Scorer scorer = new Scorer();
		scorer.addRuns(2);
		scorer.addRuns(4);
		scorer.addRuns(4);
		scorer.six();
		scorer.four();
		
		scorer.printScore();
	}

}
