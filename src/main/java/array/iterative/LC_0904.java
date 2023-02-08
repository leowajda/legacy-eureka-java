package array.iterative;

import java.util.HashMap;
import java.util.Map;

import static java.lang.Math.max;

public class LC_0904 {
    public int totalFruit(int[] fruits) {

        Map<Integer, Integer> map = new HashMap<>();
        int left = 0, maxFruits = 0;

        for (int right = 0; right < fruits.length; right++) {

            int newFruit = fruits[right];
            map.merge(newFruit, 1, Integer::sum);

            while (map.size() > 2) {
                int prevFruit = fruits[left];
                map.merge(prevFruit, -1, Integer::sum);
                if (map.get(prevFruit) == 0)
                    map.remove(prevFruit);
                left++;
            }

            maxFruits = max(right - left + 1, maxFruits);
        }

        return maxFruits;
    }
}
