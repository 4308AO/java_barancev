package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        double l = 3.0;
        double s = 16.0;
        System.out.println("Площадь прямоугольника со сторонами " + l + " и" + " " + s + " = " + longSquare(l,s) );

    }


    public static double longSquare(double l, double s){
        return l * s;
        }
}

