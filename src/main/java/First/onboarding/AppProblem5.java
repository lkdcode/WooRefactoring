package First.onboarding;

import java.util.ArrayList;
import java.util.List;

public class AppProblem5 {
    private static final int[] moneys = {50000, 10000, 5000, 1000, 500, 100, 50, 10, 1};
    private static List<Integer> result = new ArrayList<>();

    public static void main(String[] args) {
        int money = 50237;

        while (money > 0) {
            for (int i = 0; i < moneys.length; i++) {
                result.add(money / moneys[i]);
                money %= moneys[i];
            }
        }

        System.out.println(result);

    }
}