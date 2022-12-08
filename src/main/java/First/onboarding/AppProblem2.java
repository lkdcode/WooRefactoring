package First.onboarding;

import java.util.ArrayList;
import java.util.List;

public class AppProblem2 {
    private static boolean play = true;
    public static void main(String[] args) {

        String result = "abbbaac";

        while (play) {
            List<Integer> skipNumber = skipNumber(result);
            String removeDuplication = removeDuplication(result, skipNumber);
            result = removeDuplication;
            play = validateDuplication(removeDuplication);
        }
        System.out.println(result);
    }
    private static List<Integer> skipNumber(String result) {
        List<Integer> skipNumber = new ArrayList<>();
        for (int i = 0; i < result.length() - 1; i++) {
            if (result.charAt(i) == result.charAt(i + 1)) {
                skipNumber.add(i);
                skipNumber.add(i + 1);
            }
        }
        return skipNumber;
    }

    private static String removeDuplication(String result, List<Integer> skip) {
        String removeDuplication = "";
        for (int i = 0; i < result.length(); i++) {
            if (!(skip.contains(i))) {
                removeDuplication += result.charAt(i);
            }
        }
        return removeDuplication;
    }

    private static boolean validateDuplication(String result) {
        for (int i = 0; i < result.length() - 1; i++) {
            if (result.charAt(i) == result.charAt(i + 1)) {
                return true;
            }
        }
        return false;
    }

}
