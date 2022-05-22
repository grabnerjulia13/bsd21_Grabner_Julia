package at.campus02.bsd;

import org.apache.logging.log4j.core.impl.Log4jContextFactory;

import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.LoggingPermission;

public class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        System.out.println(calc.add(2,5));
        System.out.println(calc.minus(8,5));
        System.out.println(calc.divide(15,2));
        System.out.println(calc.multiply(15,2));

        Logger log = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);

        log.setLevel(Level.ALL);

        log.info("Das ist die Info");
        log.warning("Das ist eine Warunung");

    }
}
