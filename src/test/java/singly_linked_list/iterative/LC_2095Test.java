package singly_linked_list.iterative;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import singly_linked_list.ListNode;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.params.provider.Arguments.arguments;
import static singly_linked_list.ListNode.buildList;

public class LC_2095Test {

    private LC_2095 solution;

    @BeforeEach
    public void setUp() {
        solution = new LC_2095();
    }

    private static Stream<Arguments> testDeleteMiddle() {
        return Stream.of(

                arguments(buildList(1,3,4,7,1,2,6), buildList(1,3,4,1,2,6)),
                arguments(buildList(1,2,3,4),       buildList(1,2,4)),
                arguments(buildList(2, 1),          buildList(2))
        );
    }

    @ParameterizedTest
    @MethodSource
    public void testDeleteMiddle(ListNode head, ListNode expected) {
        ListNode result = solution.deleteMiddle(head);
        assertTrue(ListNode.equals(result, expected));
    }


}
