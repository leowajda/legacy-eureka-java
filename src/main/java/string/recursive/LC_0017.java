package string.recursive;

import java.util.*;

public class LC_0017 {
    private static final Map<Character, List<String>> phone = Map.of(
            '2', List.of("a", "b", "c"),
            '3', List.of("d", "e", "f"),
            '4', List.of("g", "h", "i"),
            '5', List.of("j", "k", "l"),
            '6', List.of("m", "n", "o"),
            '7', List.of("p", "q", "r", "s"),
            '8', List.of("t", "u", "v"),
            '9', List.of("w", "x", "y", "z")
    );

    public List<String> letterCombinations(String digits) {
        List<String> combinations = new ArrayList<>();
        helper(digits, 0, new ArrayDeque<>(), combinations);
        return digits.isEmpty() ? List.of() : combinations;
    }

    private void helper(String digits, int pos, Deque<String> deque, List<String> result) {

        if (pos == digits.length()) {
            var combination = String.join("", deque);
            result.add(combination);
            return;
        }

        char c = digits.charAt(pos);
        for (var letter : phone.get(c)) {
            deque.addLast(letter);
            helper(digits, pos + 1, deque, result);
            deque.removeLast();
        }

    }
}
