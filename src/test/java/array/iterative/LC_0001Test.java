package array.iterative;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.stream.Stream;

import static array.iterative.LC_0001.twoSum;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.arrayContainingInAnyOrder;
import static org.hamcrest.Matchers.is;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class LC_0001Test {

    private static Stream<Arguments> testTwoSum() {
        return Stream.of(

                arguments(new int[] { 2,7,11,15 }, 9,   new Integer[]{ 1,0 }),
                arguments(new int[] { 3,2,4 },     6,   new Integer[]{ 2,1 }),
                arguments(new int[] { 3,3 },       6,   new Integer[]{ 1,0 })

        );
    }

    @ParameterizedTest
    @MethodSource
    public void testTwoSum(int[] nums, int target, Integer[] expected) {
        var result = Arrays.stream(twoSum(nums, target)).boxed().toArray(Integer[]::new);
        assertThat(result, is(arrayContainingInAnyOrder(expected)));
    }

}