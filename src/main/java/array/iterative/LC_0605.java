package array.iterative;

public class LC_0605 {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {

        int m = flowerbed.length, spots = 0;
        for (int i = 0; i < m; i++)
            if (flowerbed[i] == 0 && (i - 1 == -1 || flowerbed[i - 1] == 0) && (i + 1 == m || flowerbed[i + 1] == 0)) {
                flowerbed[i] = 1;
                spots++;
            }


        return spots >= n;
    }
}
