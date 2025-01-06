package Main.stqa.pft.sandbox;

public class MyFirstProgram {
    public static void main(String[] args) {
        hello("Artem");
        hello("Snega");
        hello("Oleg ");
        double var = 5.0;
        double l = 3.0;
        double s = 16.0;
        System.out.println("Площадь квадрата со стороной  " + var + " =  " + square(var) );
        System.out.println("Площадь прямоугольника со сторонами " + l + " и" + " " + s + " = " + longSquare(l,s) );
    }

    public static void hello(String w){
        System.out.println("hello " + w);
    }

    public static double square(double l){
        return l * l;
    }

    public static double longSquare(double l, double s){
        return l * s;
    }
}