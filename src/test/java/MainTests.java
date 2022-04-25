import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

public class MainTests {
    Main sut;

    @BeforeEach
    public void init() {
        System.out.println("test started");
        sut = new Main();
    }

    @BeforeAll
    public static void started() {
        System.out.println("tests started");
    }

    @AfterEach
    public void finished() {
        System.out.println("test completed");
    }

    @AfterAll
    public static void finishedAll() {
        System.out.println("tests completed");
    }

    @Test
    public void calcProfitTaxTest() {
        //arrange
        int a = 100, expected = 6;

        //act
        int result = sut.calcProfitTax(a);

        //assert
        assertEquals(expected, result);
    }

    @Test
    public void calcDiffTaxThrowTest() {
        //assert
        assertDoesNotThrow(() -> sut.calcDiffTax(0));
    }

    @Test
    public void calcDiffTaxNotZeroTest() {
        //arrange
        int a = 10, unexpected = 0;

        //act
        int result = sut.calcDiffTax(a);

        //assert
        assertNotEquals(result, unexpected);
    }

}
