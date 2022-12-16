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

class LC_0045Test {

    private LC_0045 solution;

    @BeforeEach
    void setUp() {
        solution = new LC_0045();
    }

    private static Stream<Arguments> testJump() {
        return Stream.of(
                arguments(new int[] { 2, 3, 1, 1, 4 }, 2),
                arguments(new int[] { 2, 3, 0, 1, 4 }, 2)
        );
    }
    @ParameterizedTest
    @MethodSource
    void testJump(int[] nums, int expected) {
        int result = solution.jump(nums);
        assertThat(result, is(equalTo(expected)));
    }
}