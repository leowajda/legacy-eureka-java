package string.iterative;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class LC_0150Test {

    private LC_0150 solution;

    @BeforeEach
    void setUp() {
        solution = new LC_0150();
    }

    private static Stream<Arguments> testEvalRPN() {
        return Stream.of(
                arguments(new String[] { "10", "6", "9", "3", "+", "-11", "*", "/", "*", "17", "+", "5", "+" } , 22),
                arguments(new String[] { "2", "1", "+", "3", "*" } ,                                              9),
                arguments(new String[] { "4", "13", "5", "/", "+" } ,                                             6)
        );
    }

    @ParameterizedTest
    @MethodSource
    void testEvalRPN(String[] tokens, int expected) {
        int result = solution.evalRPN(tokens);
        assertThat(result, is(equalTo(expected)));
    }
}
