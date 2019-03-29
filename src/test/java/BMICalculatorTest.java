import calculate.BMICalculator;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.*;

public class BMICalculatorTest {

    @Test
    public void testCalculate() {
        BMICalculator bmiCalculator = new BMICalculator(170,80);
        Assert.assertEquals("", 27.68166, bmiCalculator.calculate(),0.00001);

    }
    @Test
    public void testInterpret() {
        BMICalculator bmiCalculator = new BMICalculator(170,80);
        Assert.assertEquals("","nadwaga",bmiCalculator.interpret());
    }



}
