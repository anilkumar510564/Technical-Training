import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {
    @Test
    public void addTest()
    {
        Calculator calculator=new Calculator();
        Assert.assertEquals(6,calculator.add(3,3));
    }

    @Test
    public void subTest()
    {
        Calculator calculator=new Calculator();
        Assert.assertEquals(5,calculator.sub(15,10));
    }

    @Test
    public void mulTest()
    {
        Calculator calculator=new Calculator();
        Assert.assertEquals(4,calculator.mul(2,2));
    }

    @Test
    public void divTest()
    {
        Calculator calculator=new Calculator();
        Assert.assertEquals(1,calculator.div(3,3));
    }
}
