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

public class LC_0042Test {
    private LC_0042 solution;

    @BeforeEach
    void setUp() {
        solution = new LC_0042();
    }

    private static Stream<Arguments> testMaxSubArray() {
        return Stream.of(
                arguments(new int[] { 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 }, 6),
                arguments(new int[] { 4, 2, 0, 3, 2, 5 },                   9)
        );
    }

    @ParameterizedTest
    @MethodSource
    void testMaxSubArray(int[] height, int expected) {
        int result = solution.trap(height);
        assertThat(result, is(equalTo(expected)));
    }
}
