package at.campus02.bsd;

import java.util.logging.Logger;

public class Calculator {

    Logger log = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);

    public double add(double number1, double number2){
        double result;
        result = number1 + number2;
        log.info("number");
        return result;

    }
    public double minus(double number1, double number2){
        double result;
        result = number1 - number2;
        log.info("number");
        return result;
    }
    public double divide(double number1, double number2){
        double result;
        result = number1 / number2;
        System.out.println(); log.info("number");
        return result;

    }
    public double multiply(double number1, double number2){
        double result;
        result = number1 * number2;
        log.info("number");
        if (number2 == 0){
            log.warning("Nulldivision");
        }
        return result;

    }
    public long faculty(long number1){
        if (number1>1){
           number1 *= faculty(number1-1);
       }
        log.info("number");

        return number1;
    }

}
