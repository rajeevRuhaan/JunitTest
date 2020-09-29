package ee.sdatest.unit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SalaryCalculatorTest {
@Test
    public void calculateFor12MonthsSalaryTest(){
    //When
    SalaryCalculator salaryCalculator = new SalaryCalculator();
    //Given
    double result = salaryCalculator.calculateFor12Months(1000, 200);
   //then, Junit
    Assertions.assertEquals(12200, result);
    Assertions.assertTrue(result < 14000);
   //AssertJ
   org.assertj.core.api.Assertions
           .assertThat(result)
           .isEqualTo(12200)
           .isLessThan(14000);

}
}
