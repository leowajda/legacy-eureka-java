package string.iterative;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class LC_0139Test {

    private LC_0139 solution;

    @BeforeEach
    void setUp() {
        solution = new LC_0139();
    }

    private static Stream<Arguments> testWordBreak() {
        return Stream.of(
                arguments("leetcode",     List.of("leet", "code"),                      true),
                arguments("applepenapple",List.of("apple", "pen"),                      true),
                arguments("catsandog",    List.of("cats", "dog", "sand", "and", "cat"), false)
        );
    }

    @ParameterizedTest
    @MethodSource
    void testWordBreak(String s, List<String> wordDict, boolean expected) {
        boolean result = solution.wordBreak(s, wordDict);
        assertThat(result, is(equalTo(expected)));
    }

}
