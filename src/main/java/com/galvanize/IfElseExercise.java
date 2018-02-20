package com.galvanize;

public class IfElseExercise {

    boolean isActive(String status) {

        if(status.equals("active")){
            return true;
        } else {
            return false;
        }

    }

    String grade(int input){

        if(input >= 90){
            return "A";
        } else if (input >= 80 && input < 90) {
            return "B";
        } else if (input >= 70 && input < 80) {
            return "C";
        } else if (input >= 60 && input < 70) {
            return "D";
        } else {
            return "F";
        }

    }

    public static void main(String[] args) {

        IfElseExercise thing = new IfElseExercise();

        System.out.println(thing.isActive("active"));
        System.out.println(thing.grade(60));

    }

}