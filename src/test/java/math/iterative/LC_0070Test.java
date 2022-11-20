package math.iterative;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class LC_0070Test {

    private LC_0070 solution;

    @BeforeEach
    public void setUp() {
        solution = new LC_0070();
    }

    private static Stream<Arguments> testClimbStairs() {
        return Stream.of(
                arguments(2, 2),
                arguments(3, 3)
        );
    }

    @ParameterizedTest
    @MethodSource
    public void testClimbStairs(int n, int expected) {
        int result = solution.climbStairs(n);
        assertThat(result, is(expected));
    }


}
