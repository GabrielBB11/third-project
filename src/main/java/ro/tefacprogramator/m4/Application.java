package ro.tefacprogramator.m4;

public class Application {

    public static void main(String[] args) {
        System.out.println("New program");

        double rezPow = Calculator.pow(5, 4);
        System.out.println("rezult pow = " + rezPow);

        int rezAdd = Calculator.add(100, 45);
        System.out.println("rezult add= " + rezAdd);

        int rezSubstract = Calculator.substract(100, 45);
        System.out.println("rezult substract= " + rezSubstract);

        double rezDivide = Calculator.divide(100, 45);
        System.out.println("rezult divide= " + rezDivide);

        double rezMultiply = Calculator.multiply(56, 7);
        System.out.println("rez multiply= " + rezMultiply);

        int rezDouble = Calculator.doubleNumber(10);
        System.out.println("rez double= " + rezDouble);
    }
}
