package array.iterative;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class LC_0904Test {

    private LC_0904 solution;

    @BeforeEach
    void setUp() {
        solution = new LC_0904();
    }

    private static Stream<Arguments> testTotalFruit() {
        return Stream.of(
                arguments(new int[] { 1, 2, 3, 2, 2 },  4),
                arguments(new int[] { 1, 2, 1 },        3),
                arguments(new int[] { 0, 1, 2, 2 },     3)
        );
    }

    @ParameterizedTest
    @MethodSource
    public void testTotalFruit(int[] fruits, int expected) {
        int result = solution.totalFruit(fruits);
        assertThat(result, is(equalTo(expected)));
    }
}
