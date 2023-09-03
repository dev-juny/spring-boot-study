import org.junit.jupiter.api.*;

public class JUnitCycleTest {
    @BeforeAll //전체 테스트 시작전 1회 실행함 따라서 메서드는 static 으로 선언
    static void beforeAll() {
        System.out.println("@BeforeAll 어노테이션");
    }
    @BeforeEach //테스트 케이스를 시작하기 전마다 실행
    public void beforeEach() {
        System.out.println("@BeforeEach 어노테이션");
    }
    @Test
    public void JUnitTest1(){
        System.out.println("@Test - JUnitTest1");
    }
    @Test
    public void JUnitTest2(){
        System.out.println("@Test - JUnitTest2");
    }
    @Test
    public void JUnitTest3(){
        System.out.println("@Test - JUnitTest3");
    }
    @AfterAll //전체 테스트 종료전 1회 실행함 따라서 메서드는 static 으로 선언
    static void afterAll() {
        System.out.println("@AfterAll 어노테이션");
    }
    @AfterEach
    public void afterEach() {
        System.out.println("@AfterEach 어노테이션");
    }
}
