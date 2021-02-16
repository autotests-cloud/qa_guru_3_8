import org.junit.jupiter.api.Test;

import static io.qameta.allure.Allure.step;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SimpleTests {
    @Test
    void successTest() {
        assertEquals(2 * 2, 4);
    }

    @Test
    void successHamcrestTest() {
        assertThat(2 * 2, is(4));
    }

    @Test
    void successHamcrestStepTest() {
        step("assert that 2 * 2 is 4", () ->
                assertThat(2 * 2, is(4)));
    }

    @Test
    void negativeTest() {
        assertEquals(2 * 2, 5);

    }

    @Test
    void negativeHamcrestTest() {
        step("assert that 2 * 2 is 4", () ->
                assertThat(2 * 2, is(5)));
    }

    @Test
    void negativeHamcrestStepTest() {
        assertThat(2 * 2, is(5));
    }
}
