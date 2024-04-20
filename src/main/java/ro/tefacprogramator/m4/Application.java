package ro.tefacprogramator.m4;

public class Application {

    public static void main(String[] args) {
        System.out.println("New program");

        double rezPow = Calculator.pow(5, 4);
        System.out.println("rez pow = " + rezPow);

        int rezAdd = Calculator.add(100, 45);
        System.out.println("rez = " + rezAdd);

        int rezSubstract = Calculator.substract(100, 45);
        System.out.println("rez = " + rezSubstract);

        double rezDivide = Calculator.divide(100, 45);
        System.out.println("rez = " + rezDivide);
    }
}
