import org.testng.annotations.Test;

public class NegativeOneTheRightTest {

    @Test
    public void negativeOneTheRightHappyPath(){
        int[]aaaa = {4, -3, 7, -12, 5, -2, 9, 4, 12};

        int[] expectedResult = {4,7,5,9,4,12,-3,-12,-2};

        NegativeOneTheRight nr = new NegativeOneTheRight();
        int[] actualResult = nr.negativeOnTheRightAlgorithm(aaaa);

        Assertions.assertArrayEquals(expectedResult,actualResult);
    }
}
