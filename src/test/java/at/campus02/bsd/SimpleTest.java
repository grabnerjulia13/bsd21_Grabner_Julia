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
    public void add1(){Assertions.assertEquals(5,result = 3+2);}
    @Test
    public void add2(){Assertions.assertEquals(3+2,ca.add(3,2));}
    @Test
    public void minus(){Assertions.assertEquals(6,result = 8-2);}
    @Test
    public void minus2(){Assertions.assertEquals(8-2,ca.minus(8,2));}
    @Test
    public void multi(){Assertions.assertEquals(20,result = 5*4);}
    @Test
    public void multi2(){Assertions.assertEquals(5*4,ca.multiply(5,4));}
    @Test
    public void divi(){Assertions.assertEquals(4,result = 12/3);}
    @Test
    public void divi2(){Assertions.assertEquals(12/3,ca.divide(12,3));}

    @Test
    public void faculty(){Assertions.assertEquals(0,ca.faculty(-5));}

    @Test
    public void faculty2(){Assertions.assertEquals(720,ca.faculty(6));}

    @Test
    public void faculty3(){Assertions.assertEquals(40320,ca.faculty(8));}
}
