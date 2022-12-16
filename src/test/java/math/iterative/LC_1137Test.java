package math.iterative;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.params.provider.Arguments.arguments;
import static org.hamcrest.Matchers.is;


public class LC_1137Test {

    private LC_1137 solution;

    @BeforeEach
    public void setUp() {
        solution = new LC_1137();
    }

    private static Stream<Arguments> testTribonacci() {
        return Stream.of(
                arguments(4,        4),
                arguments(25, 1389537)
        );
    }

    @ParameterizedTest
    @MethodSource
    public void testTribonacci(int n, int expected) {
        int result = solution.tribonacci(n);
        assertThat(result, is(expected));
    }



}
