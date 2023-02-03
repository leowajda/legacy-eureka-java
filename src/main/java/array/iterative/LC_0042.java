package array.iterative;

import static java.lang.Math.max;
import static java.lang.Math.min;

public class LC_0042 {
    public int trap(int[] height) {

        int[] leftBoundaries = new int[height.length];
        for (int i = 0, boundary = 0; i < height.length; i++) {
            leftBoundaries[i] = boundary;
            boundary = max(height[i], boundary);
        }

        int[] rightBoundaries = new int[height.length];
        for (int i = height.length - 1, boundary = 0; i >= 0; i--) {
            rightBoundaries[i] = boundary;
            boundary = max(height[i], boundary);
        }

        int trappedWater = 0;
        for (int i = 0; i < height.length; i++)
            trappedWater += max(min(leftBoundaries[i], rightBoundaries[i]) - height[i], 0);

        return trappedWater;
    }
}
