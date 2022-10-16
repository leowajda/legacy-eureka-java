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

class LC_0002Test {

    private LC_0002 solution;

    @BeforeEach
    public void setUp() {
        solution = new LC_0002();
    }

    private static Stream<Arguments> testAddTwoNumbers() {
        return Stream.of(

                arguments(buildList(2,4,3),         buildList(5,6,4),   buildList(7,0,8)),
                arguments(buildList(0),             buildList(0),       buildList(0)),
                arguments(buildList(9,9,9,9,9,9,9), buildList(9,9,9,9), buildList(8,9,9,9,0,0,0,1))

        );
    }

    @ParameterizedTest
    @MethodSource
    public void testAddTwoNumbers(ListNode a, ListNode b, ListNode expected) {
        ListNode result = solution.addTwoNumbers(a, b);
        assertTrue(ListNode.equals(result, expected));
    }
}