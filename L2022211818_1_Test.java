import org.junit.Assert;
import org.junit.Test;

/**
 * 测试类设计说明：
 * 等价类划分：
 *  1. 分子为 0：分子为 0 时，输出应为 "0"。
 *  2. 分子能整除分母：分子可以整除分母，输出应为整数。
 *  3. 分子不能整除分母且结果为有限小数：应正确输出有限小数。
 *  4. 分子不能整除分母且结果为循环小数：应正确检测并输出循环部分。
 * 边界值分析：
 *  1. 大值、负值等极端情况测试。
 *  2. 符号组合：正/负分子与分母的不同组合。
 */
public class L2022211818_1_Test {

    // 测试目的：验证分子为 0 的情况。
    // 测试用例：numerator = 0, denominator = 1，期望输出："0"
    @Test
    public void testNumeratorZero() {
        Solution1 solution = new Solution1();
        Assert.assertEquals("0", solution.fractionToDecimal(0, 1));
    }

    // 测试目的：验证分子能整除分母的情况。
    // 测试用例：numerator = 4, denominator = 2，期望输出："2"
    @Test
    public void testExactDivision() {
        Solution1 solution = new Solution1();
        Assert.assertEquals("2", solution.fractionToDecimal(4, 2));
    }

    // 测试目的：验证有限小数输出的正确性。
    // 测试用例：numerator = 1, denominator = 2，期望输出："0.5"
    @Test
    public void testFiniteDecimal() {
        Solution1 solution = new Solution1();
        Assert.assertEquals("0.5", solution.fractionToDecimal(1, 2));
    }

    // 测试目的：验证循环小数输出的正确性。
    // 测试用例：numerator = 4, denominator = 333，期望输出："0.(012)"
    @Test
    public void testRepeatingDecimal() {
        Solution1 solution = new Solution1();
        Assert.assertEquals("0.(012)", solution.fractionToDecimal(4, 333));
    }

    // 测试目的：验证分子分母符号不同时的情况。
    // 测试用例：numerator = -1, denominator = 2，期望输出："-0.5"
    @Test
    public void testNegativeResult() {
        Solution1 solution = new Solution1();
        Assert.assertEquals("-0.5", solution.fractionToDecimal(-1, 2));
    }

    // 测试目的：验证分子和分母同为负数的情况（结果应为正数）。
    // 测试用例：numerator = -1, denominator = -2，期望输出："0.5"
    @Test
    public void testBothNegative() {
        Solution1 solution = new Solution1();
        Assert.assertEquals("0.5", solution.fractionToDecimal(-1, -2));
    }

    // 测试目的：验证大整数的处理情况，避免溢出。
    // 测试用例：numerator = Integer.MAX_VALUE, denominator = 1，期望输出："2147483647"
    @Test
    public void testLargeNumbers() {
        Solution1 solution = new Solution1();
        Assert.assertEquals("2147483647", solution.fractionToDecimal(Integer.MAX_VALUE, 1));
    }

    // 测试目的：验证较大数除以小数的情况，输出应为循环小数。
    // 测试用例：numerator = 1, denominator = 3，期望输出："0.(3)"
    @Test
    public void testRepeatingDecimalSmallNumbers() {
        Solution1 solution = new Solution1();
        Assert.assertEquals("0.(3)", solution.fractionToDecimal(1, 3));
    }
}
