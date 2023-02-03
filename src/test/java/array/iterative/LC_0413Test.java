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

public class LC_0413Test {

    private LC_0413 solution;

    @BeforeEach
    void setUp() {
        solution = new LC_0413();
    }

    private static Stream<Arguments> testFindPeakElement() {
        return Stream.of(
                arguments(new int[] { 1, 2, 3, 4 }, 3),
                arguments(new int[] { 1 },          0)
        );
    }

    @ParameterizedTest
    @MethodSource
    public void testFindPeakElement(int[] nums, int expected) {
        int result = solution.numberOfArithmeticSlices(nums);
        assertThat(result, is(equalTo(expected)));
    }
}
