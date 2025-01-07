package ua.stqa.pft.sandbox;


public class Main {
    public static void main(String[] args) {
        Square.area();


        double a = 4.0;
        double b = 6.0;
        System.out.println("Площадь прямоугольника со сторонами " + a + " и " + b + " = " + area(a, b));

    }

    public static double area(double a, double b) {
        return a * b;
    }

}

