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

class LC_0053Test {

    private LC_0053 solution;

    @BeforeEach
    void setUp() {
        solution = new LC_0053();
    }

    private static Stream<Arguments> testMaxSubArray() {
        return Stream.of(
                arguments(new int[] { -2, 1, -3, 4, -1, 2, 1, -5, 4 }, 6),
                arguments(new int[] { 1 },                             1),
                arguments(new int[] { 5, 4, -1, 7, 8 },                23)
        );
    }

    @ParameterizedTest
    @MethodSource
    void testMaxSubArray(int[] nums, int expected) {
        int result = solution.maxSubArray(nums);
        assertThat(result, is(equalTo(expected)));
    }
}