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

class LC_0152Test {

    private LC_0152 solution;

    @BeforeEach
    void setUp() {
        solution = new LC_0152();
    }

    private static Stream<Arguments> testCanJump() {
        return Stream.of(
                arguments(new int[] { 2, 3, -2, 4 }, 6),
                arguments(new int[] {-2, 0, -1 },    0)
        );
    }
    @ParameterizedTest
    @MethodSource
    void testCanJump(int[] nums, int expected) {
        int result = solution.maxProduct(nums);
        assertThat(result, is(equalTo(expected)));
    }
}