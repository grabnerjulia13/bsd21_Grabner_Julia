package at.campus02.bsd;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SimpleTest {
    public Calculator ca;
    @BeforeEach
    public void setUp(){ ca = new Calculator();}

    double result;
    @Test
    public void add1(){Assertions.assertEquals(5,result = 4+1);}
    @Test
    public void add2(){Assertions.assertEquals(4+1,ca.add(4,1));}
    @Test
    public void minus(){Assertions.assertEquals(7,result = 9-2);}
    @Test
    public void minus2(){Assertions.assertEquals(9-2,ca.minus(9,2));}
    @Test
    public void multi(){Assertions.assertEquals(25,result = 5*5);}
    @Test
    public void multi2(){Assertions.assertEquals(5*5,ca.multiply(5,5));}
    @Test
    public void divi(){Assertions.assertEquals(5,result = 15/3);}
    @Test
    public void divi2(){Assertions.assertEquals(15/3,ca.divide(15,3));}

    @Test
    public void faculty(){Assertions.assertEquals(720,ca.faculty(6));}

    @Test
    public void faculty2(){Assertions.assertEquals(120,ca.faculty(5));}

    @Test
    public void faculty3(){Assertions.assertEquals(5040,ca.faculty(7));}

    @Test
    void exception(){
        Assertions.assertThrows(ArithmeticException.class,() -> ca.divide(2,0));
    }
}
