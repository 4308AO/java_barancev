package ua.stqa.pft.sandbox;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        double l = 5;
        System.out.println("Площадь квадрата со стороной " + l + " = " + Square.area(l));


        double a = 4.0;
        double b = 6.0;
        System.out.println ("Площадь прямоугольника со сторонами " + a + " и " + b + " = " + Rectangle.area (a, b));

        }
    }

