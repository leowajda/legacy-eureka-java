package math.iterative;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class LC_0746Test {
    private LC_0746 solution;

    @BeforeEach
    public void setUp() {
        solution = new LC_0746();
    }

    private static Stream<Arguments> testMinCostClimbingStairs() {
        return Stream.of(
                arguments(new int[] { 10, 15, 20 },                         15),
                arguments(new int[] { 1, 100, 1, 1, 1, 100, 1, 1, 100, 1 }, 6)
        );
    }

    @ParameterizedTest
    @MethodSource
    public void testMinCostClimbingStairs(int[] cost, int expected) {
        int result = solution.minCostClimbingStairs(cost);
        assertThat(result, is(expected));
    }


}
