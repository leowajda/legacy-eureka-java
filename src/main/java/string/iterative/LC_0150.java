package string.iterative;

import java.util.ArrayDeque;
import java.util.Map;
import java.util.function.BiFunction;

import static java.lang.Integer.parseInt;

public class LC_0150 {

    public static final Map<String, BiFunction<Integer, Integer, Integer>> ops = Map.of(
            "+", (a, b) -> a + b,
            "-", (a, b) -> a - b,
            "*", (a, b) -> a * b,
            "/", (a, b) -> a / b
    );

    public int evalRPN(String[] tokens) {

        ArrayDeque<Integer> stack = new ArrayDeque<>();

        for (var token : tokens)
            if (ops.containsKey(token)) {
                BiFunction<Integer, Integer, Integer> function = ops.get(token);
                int b = stack.pop(), a = stack.pop();
                stack.push(function.apply(a, b));
            }
            else stack.push(parseInt(token));

        return stack.pop();
    }
}
