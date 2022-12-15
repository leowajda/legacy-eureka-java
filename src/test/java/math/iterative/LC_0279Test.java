package math.iterative;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class LC_0279Test {

    private LC_0279 solution;

    @BeforeEach
    void setUp() {
        solution = new LC_0279();
    }

    private static Stream<Arguments> testFindPeakElement() {
        return Stream.of(
                arguments(12, 3),
                arguments(13, 2),
                arguments(6,  3)
        );
    }

    @ParameterizedTest
    @MethodSource
    public void testFindPeakElement(int n, int expected) {
        int result = solution.numSquares(n);
        assertThat(result, is(equalTo(expected)));
    }
}
