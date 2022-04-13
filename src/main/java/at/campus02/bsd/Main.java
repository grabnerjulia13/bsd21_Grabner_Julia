package at.campus02.bsd;

public class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        System.out.println(calc.add(2,5));
        System.out.println(calc.minus(8,5));
        System.out.println(calc.divide(15,2));
        System.out.println(calc.multiply(15,2));

    }
}
