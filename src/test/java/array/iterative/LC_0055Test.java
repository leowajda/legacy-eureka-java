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

class LC_0055Test {

    private LC_0055 solution;

    @BeforeEach
    void setUp() {
        solution = new LC_0055();
    }

    private static Stream<Arguments> testCanJump() {
        return Stream.of(
                arguments(new int[] { 2, 3, 1, 1, 4 }, true),
                arguments(new int[] { 3, 2, 1, 0, 4 }, false)
        );
    }
    @ParameterizedTest
    @MethodSource
    void testCanJump(int[] nums, boolean expected) {
        boolean result = solution.canJump(nums);
        assertThat(result, is(equalTo(expected)));
    }
}