package array.iterative;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertIterableEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class LC_0015Test {

    private LC_0015 solution;

    @BeforeEach
    public void setUp() {
        solution = new LC_0015();
    }

    private static Stream<Arguments> testThreeSum() {
        return Stream.of(
                arguments(new int[] { -1, 0, 1, 2, -1, -4 }, List.of(List.of(-1, -1, 2), List.of(-1, 0, 1))),
                arguments(new int[] { 0, 1, 1 },             List.of()),
                arguments(new int[] { 0, 0, 0 },             List.of(List.of(0, 0, 0)))
        );
    }

    @ParameterizedTest
    @MethodSource
    public void testThreeSum(int[] nums, List<List<Integer>> expected) {
        List<List<Integer>> result = solution.threeSum(nums);
        assertIterableEquals(result, expected);
    }


}
