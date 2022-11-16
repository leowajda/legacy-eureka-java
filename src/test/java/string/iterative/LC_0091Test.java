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

class LC_0091Test {

    private LC_0091 solution;

    @BeforeEach
    void setUp() {
        solution = new LC_0091();
    }

    private static Stream<Arguments> testNumDecodings() {
        return Stream.of(

                arguments("12",  2),
                arguments("226", 3),
                arguments("06",  0),
                arguments("481023", 2)

        );
    }

    @ParameterizedTest
    @MethodSource
    void testNumDecodings(String s, int expected) {
        int result = solution.numDecodings(s);
        assertThat(result, is(equalTo(expected)));
    }

}