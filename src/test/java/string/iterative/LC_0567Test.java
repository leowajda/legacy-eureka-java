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

public class LC_0567Test {

    private LC_0567 solution;

    @BeforeEach
    void setUp() {
        solution = new LC_0567();
    }

    private static Stream<Arguments> testCheckInclusion() {
        return Stream.of(
                arguments("ab", "eidbaooo", true),
                arguments("ab", "eidboaoo", false)
        );
    }

    @ParameterizedTest
    @MethodSource
    void testCheckInclusion(String a, String b, boolean expected) {
        boolean result = solution.checkInclusion(a, b);
        assertThat(result, is(equalTo(expected)));
    }
}
