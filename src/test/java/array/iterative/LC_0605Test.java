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

public class LC_0605Test {

    private LC_0605 solution;

    @BeforeEach
    void setUp() {
        solution = new LC_0605();
    }

    private static Stream<Arguments> testCanPlaceFlowers() {
        return Stream.of(
                arguments(new int[] { 1, 0, 0, 0, 1 },       1, true),
                arguments(new int[] { 1, 0, 0, 0, 1 },       2, false),
                arguments(new int[] { 0, 0, 1, 0, 1 },       1, true),
                arguments(new int[] { 1, 0, 0, 0, 1, 0, 0 }, 2, true)
        );
    }

    @ParameterizedTest
    @MethodSource
    public void testCanPlaceFlowers(int[] flowerbed, int n, boolean expected) {
        boolean result = solution.canPlaceFlowers(flowerbed, n);
        assertThat(result, is(equalTo(expected)));
    }

}
