import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class JUnitTest {
    @DisplayName("1 + 1 = 2")
    @Test //Test Method
    public void junitTest() {
        int a = 1;
        int b = 1;
        int sum = 2;
        Assertions.assertEquals(a + b, sum); // 값이 동일한지 확인
    }
    @DisplayName("1 + 2 = 3")
    @Test //Test Method
    public void junitFailedTest() {
        int a = 1;
        int b = 2;
        int sum = 1;
        Assertions.assertEquals(a + b, sum); // 값이 동일한지 확인
    }

}
