package binary_tree.recursive;

import binary_tree.TreeNode;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static binary_tree.TreeNode.deserialize;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.params.provider.Arguments.arguments;
import static org.hamcrest.Matchers.is;

public class LC_0110Test {

    private LC_0110 solution;

    @BeforeEach
    void setUp() {
        solution = new LC_0110();
    }

    private static Stream<Arguments> testIsBalanced() {
        return Stream.of(
                arguments(deserialize(3, 9, 20, null, null, 15, 7),      true),
                arguments(deserialize(1, 2, 2, 3, 3, null, null, 4, 4), false),
                arguments(deserialize(),                                        true)
        );
    }

    @ParameterizedTest
    @MethodSource
    public void testIsBalanced(TreeNode root, boolean expected) {
        boolean result = solution.isBalanced(root);
        assertThat(result, is(expected));
    }


}
