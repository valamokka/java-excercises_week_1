import org.junit.Assert;
import org.junit.Test;


public class FirstExcerciseTests {

    private int[] arrayWithPositive = new int[]{1,2,2,2,2};
    private int[] arrayWithNegative = new int[]{-1,2,22,2,-2};
    private int[] arrayWithNoOddWithNegatives = new int[]{-4,2,22,2,-2};
    private int[] arrayWithNoOdd = new int[]{4,2,22,2,2};
    private int[] emptyArray = new int[5];
    private FirstExcercise firstExcercise = new FirstExcercise();


    @Test
    public void testWithPositiveIntegers() {
        int result = firstExcercise.findTheOdd(arrayWithPositive);
        Assert.assertEquals(1, result);
    }

    @Test
    public void testWithNegativeIntegers() {
        int result = firstExcercise.findTheOdd(arrayWithNegative);
        Assert.assertEquals(-1, result);
    }

    @Test
    public void testWithEmptyArray() {
        int result = firstExcercise.findTheOdd(emptyArray);
        Assert.assertEquals(0, result);
    }

    @Test
    public void testWithNoOddNumber() {
        int result = firstExcercise.findTheOdd(arrayWithNoOdd);
        Assert.assertEquals(0, result);
    }

    @Test
    public void testWithNoOddNumberWithNegatives() {
        int result = firstExcercise.findTheOdd(arrayWithNoOddWithNegatives);
        Assert.assertEquals(0, result);
    }

}
