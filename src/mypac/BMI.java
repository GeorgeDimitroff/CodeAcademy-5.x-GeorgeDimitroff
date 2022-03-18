package mypac;

// Направете програма BMI с която да изчислите вашият Body Mass Index.

public class BMI {
    public static void main(String[] args) {
        double mass = 73.5;
        double height = 1.80;
        System.out.println("BMI: " + mass/(height*height));
    }
}
