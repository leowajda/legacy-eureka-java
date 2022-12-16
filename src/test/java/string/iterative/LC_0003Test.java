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

class LC_0003Test {

    private LC_0003 solution;

    @BeforeEach
    void setUp() {
        solution = new LC_0003();
    }

    private static Stream<Arguments> testLengthOfLongestSubstring() {
        return Stream.of(
                arguments("abcabcbb", 3),
                arguments("bbbbb",    1),
                arguments("pwwkew",   3)
        );
    }

    @ParameterizedTest
    @MethodSource
    void testLengthOfLongestSubstring(String s, int expected) {
        int result = solution.lengthOfLongestSubstring(s);
        assertThat(result, is(equalTo(expected)));
    }
}