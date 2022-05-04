import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

public class KthLargestTest {


      @Test
        public void minMaxAvekthLargestMHappyPath() {
            int[] get3 = {4, 3, 7, 12, 5, 2, 9, 4, 12};
            int k = 3;
    
            int expectedResult = 9;

            KthLargest kl = new KthLargest();
            int actualResult = KthLargest.kthLargest(get3, k);

          Assertions.assertEquals(expectedResult, actualResult);




    }

}
