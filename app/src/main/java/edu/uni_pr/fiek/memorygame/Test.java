package edu.uni_pr.fiek.memorygame;

public class Test {
    public static void main(String[] args) {
        for (int i = 1; i<21; i++)
        System.out.println("card" + i + " = (ImageButton) findViewById(R.id.card" + i + ");");
    }
}
