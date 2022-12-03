package graph.iterative;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class LC_0304Test {

    private LC_0304 solution;
    private final int[][] matrix = new int[][] {
        {3, 0, 1, 4, 2},
        {5, 6, 3, 2, 1},
        {1, 2, 0, 1, 5},
        {4, 1, 0, 1, 7},
        {1, 0, 3, 0, 5}
    };

    @BeforeEach
    public void setUp() {
        solution = new LC_0304(matrix);
    }

    private static Stream<Arguments> testSumRegion() {
        return Stream.of(
                arguments(2, 1, 4, 3, 8),
                arguments(1, 1, 2, 2, 11),
                arguments(1, 2, 2, 4, 12)
        );
    }

    @ParameterizedTest
    @MethodSource
    public void testSumRegion(int rowMin, int colMin, int rowMax, int colMax, int expected) {
        int result = solution.sumRegion(rowMin, colMin, rowMax, colMax);
        assertThat(result, is(equalTo(expected)));
    }


}