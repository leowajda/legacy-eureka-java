package math.iterative;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.params.provider.Arguments.arguments;
import static org.hamcrest.Matchers.is;


public class LC_0509Test {

    private LC_0509 solution;

    @BeforeEach
    public void setUp() {
        solution = new LC_0509();
    }

    private static Stream<Arguments> testFib() {
        return Stream.of(
                arguments(2, 1),
                arguments(3, 2),
                arguments(4, 3)
        );
    }

    @ParameterizedTest
    @MethodSource
    public void testFib(int n, int expected) {
        int result = solution.fib(n);
        assertThat(result, is(expected));
    }



}
