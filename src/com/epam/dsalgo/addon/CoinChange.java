package com.epam.dsalgo.addon;

import java.util.Arrays;

/**
 * Created by Kunal Mukherjee on 16-11-2022.
 * Kunal_Mukherjee@epam.com
 * EPAM System
 */
public class CoinChange {

    static int[] coinCache;

    public static void main(String[] args) {
        int target = 18;
        int[] arr = new int[]{7, 5, 1};
        coinCache = new int[target + 1];
        Arrays.fill(coinCache, -1);
        System.out.println(minCoinRequire(target, arr));
    }

    public static int minCoinRequire(int target, int[] input) {
        if (target == 0) return 0;
        int ans = Integer.MAX_VALUE;
        for (int coin : input) {
            if (target - coin >= 0) {
                int subAns = coinCache[target - coin];
                if (subAns == -1)
                    subAns = minCoinRequire(target - coin, input);
                ans = Math.min(ans, subAns + 1);
            }
        }
        coinCache[target] = ans;
        return ans;
    }
}
