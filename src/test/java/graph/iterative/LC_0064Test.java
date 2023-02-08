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

public class LC_0064Test {

    private LC_0064 solution;

    @BeforeEach
    public void setUp() {
        solution = new LC_0064();
    }

    private static Stream<Arguments> testMinPathSum() {
        return Stream.of(
                arguments(new int[][] {{1, 3, 1}, {1, 5, 1}, {4, 2, 1}}, 7),
                arguments(new int[][] {{1, 2, 3}, {4, 5,6 }},           12)
        );
    }

    @ParameterizedTest
    @MethodSource
    public void testMinPathSum(int[][] grid, int expected) {
        int result = solution.minPathSum(grid);
        assertThat(result, is(equalTo(expected)));
    }
}
