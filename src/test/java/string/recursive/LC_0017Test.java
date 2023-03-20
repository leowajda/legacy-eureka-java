package string.recursive;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

public class LC_0017Test {

    private LC_0017 solution;

    @BeforeEach
    void setUp() {
        solution = new LC_0017();
    }

    private static Stream<Arguments> testLetterCombinations() {
        return Stream.of(
                arguments("23", List.of("ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf")),
                arguments("2",  List.of("a", "b", "c")),
                arguments("",   List.of())
        );
    }

    @ParameterizedTest
    @MethodSource
    public void testLetterCombinations(String digits, List<String> expected) {
        List<String> result = solution.letterCombinations(digits);
        Assertions.assertIterableEquals(expected, result);
    }

}
