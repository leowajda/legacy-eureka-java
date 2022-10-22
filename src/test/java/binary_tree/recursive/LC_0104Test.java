package binary_tree.recursive;

import binary_tree.TreeNode;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static binary_tree.TreeNode.deserialize;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class LC_0104Test {

    private LC_0104 solution;

    @BeforeEach
    void setUp() {
        solution = new LC_0104();
    }

    private static Stream<Arguments> testMaxDepth() {
        return Stream.of(
                arguments(deserialize(3, 9, 20, null, null, 15, 7), 3),
                arguments(deserialize(1, null, 2), 2)
        );
    }

    @ParameterizedTest
    @MethodSource
    public void testMaxDepth(TreeNode root, int expected) {
        int result = solution.maxDepth(root);
        assertThat(result, is(expected));
    }


}
