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

public class LC_1014Test {

    private LC_1014 solution;

    @BeforeEach
    void setUp() {
        solution = new LC_1014();
    }

    private static Stream<Arguments> testMaxScoreSightseeingPair() {
        return Stream.of(
                arguments(new int[] { 8, 1, 5, 2, 6 }, 11),
                arguments(new int[] { 1, 2 },           2)
        );
    }
    @ParameterizedTest
    @MethodSource
    void testMaxScoreSightseeingPair(int[] values, int expected) {
        int result = solution.maxScoreSightseeingPair(values);
        assertThat(result, is(equalTo(expected)));
    }
}
