package nextCalcTest;

import org.testng.annotations.DataProvider;

public class Provider {
    @DataProvider
    public Object[][] testForAdd() {
        return new Object[][]{
                {-2, Integer.MAX_VALUE, Integer.MAX_VALUE},
                {0, Integer.MIN_VALUE, Integer.MIN_VALUE},
                {8, 4, 4},
                {-1, 0, -1},
                {-5, -2, -3}
        };
    }

    @DataProvider
    public Object[][] testForSub() {
        return new Object[][]{
                {0, Integer.MAX_VALUE, Integer.MAX_VALUE},
                {0, Integer.MIN_VALUE, Integer.MIN_VALUE},
                {-42, 4, 46},
                {10, 0, -10},
                {28, -2, -30}
        };
    }

    @DataProvider
    public Object[][] testForMulti() {
        return new Object[][]{
                {1, Integer.MAX_VALUE, Integer.MAX_VALUE},
                {0, Integer.MIN_VALUE, Integer.MIN_VALUE},
                {16, 4, 4},
                {0, 0, -1},
                {-180, -2, 90}
        };
    }

    @DataProvider
    public Object[][] testForDiv() {
        return new Object[][]{
                {1, Integer.MAX_VALUE, Integer.MAX_VALUE},
                {1, Integer.MIN_VALUE, Integer.MIN_VALUE},
                {4, 16, 4},
                {0, 0, -1},
        };
    }

    @DataProvider
    public Object[][] testForAddNot() {
        return new Object[][]{
                {32, Integer.MAX_VALUE, Integer.MAX_VALUE},
                {2, Integer.MIN_VALUE, Integer.MIN_VALUE},
                {123, 4, 4},
                {-55, 0, -1},
                {-17, -2, -3}
        };
    }

    @DataProvider
    public Object[][] testForSubNot() {
        return new Object[][]{
                {3, Integer.MAX_VALUE, Integer.MAX_VALUE},
                {1, Integer.MIN_VALUE, Integer.MIN_VALUE},
                {-45, 4, 46},
                {102, 0, -10},
                {34, -2, -30}
        };
    }

    @DataProvider
    public Object[][] testForMultiNot() {
        return new Object[][]{
                {2, Integer.MAX_VALUE, Integer.MAX_VALUE},
                {34, Integer.MIN_VALUE, Integer.MIN_VALUE},
                {17, 4, 4},
                {8, 0, -1},
                {-175, -2, 90}
        };
    }

    @DataProvider
    public Object[][] testForDivNot() {
        return new Object[][]{
                {4, Integer.MAX_VALUE, Integer.MAX_VALUE},
                {6, Integer.MIN_VALUE, Integer.MIN_VALUE},
                {5, 16, 4},
                {100, 0, -1},
        };
    }
}
