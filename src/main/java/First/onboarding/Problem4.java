package First.onboarding;

public class Problem4 {
    public static String solution(String word) {
        char[] dup = word.toCharArray();

        String answer = "";
        for (int i = 0; i < dup.length; i++) {
            if (Character.isUpperCase(dup[i])) {
                answer += (char) (Math.abs((dup[i] - 65) - 25) + 65);
            }

            if (Character.isLowerCase(dup[i])) {
                answer += (char) (Math.abs((dup[i] - 97) - 25) + 97);
            }

            if (!(Character.isUpperCase(dup[i])) && !(Character.isLowerCase(dup[i]))) {
                answer += String.valueOf(dup[i]);
            }
        }

        return answer;
    }
}
