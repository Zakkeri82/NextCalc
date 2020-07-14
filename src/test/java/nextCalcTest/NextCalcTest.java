package nextCalcTest;


import org.testng.Assert;
import org.testng.annotations.Test;

public class NextCalcTest {


    @Test(dataProvider = "testForAdd", dataProviderClass = Provider.class)
    void addition(int a, int b, int c) {
        Assert.assertEquals(a, b + c);
    }

    @Test(dataProvider = "testForSub", dataProviderClass = Provider.class)
    void subtraction(int a, int b, int c) {
        Assert.assertEquals(a, b - c);
    }

    @Test(dataProvider = "testForMulti", dataProviderClass = Provider.class)
    void multiplication(int a, int b, int c) {
        Assert.assertEquals(a, b * c);
    }

    @Test(dataProvider = "testForDiv", dataProviderClass = Provider.class)
    void division(int a, int b, int c) {
        Assert.assertEquals(a, b / c);
    }

    @Test(dataProvider = "testForAddNot", dataProviderClass = Provider.class)
    void addition2(int a, int b, int c) {
        Assert.assertNotEquals(a, b + c);
    }

    @Test(dataProvider = "testForSubNot", dataProviderClass = Provider.class)
    void subtraction2(int a, int b, int c) {
        Assert.assertNotEquals(a, b - c);
    }

    @Test(dataProvider = "testForMultiNot", dataProviderClass = Provider.class)
    void multiplication2(int a, int b, int c) {
        Assert.assertNotEquals(a, b * c);
    }

    @Test(dataProvider = "testForDivNot", dataProviderClass = Provider.class)
    void division2(int a, int b, int c) {
        Assert.assertNotEquals(a, b / c);
    }

    @Test(expectedExceptions = ArithmeticException.class)
    void division0() {
        Assert.assertNotEquals(3, 3 / 0);
    }
}
