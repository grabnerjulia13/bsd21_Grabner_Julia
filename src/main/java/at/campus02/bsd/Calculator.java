package at.campus02.bsd;

public class Calculator {
    public double add(double number1, double number2){
        double result;
        result = number1 + number2;
        return result;
    }
    public double minus(double number1, double number2){
        double result;
        result = number1 - number2;
        return result;
    }
    public double divide(double number1, double number2){
        double result;
        result = number1 / number2;
        return result;

    }
    public double multiply(double number1, double number2){
        double result;
        result = number1 * number2;
        return result;

    }
    public long faculty(long number1){
        if (number1>1){
           number1*= faculty(number1-1);
       }

        return 0;
    }
}
