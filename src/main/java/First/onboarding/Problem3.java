package First.onboarding;

public class Problem3 {
    public static int solution(int number) {
        int answer = 0;

        String numbers = "";

        for (int i = 1; i <= number; i++) {
            numbers += String.valueOf(i);
        }

        for (int i = 0; i < numbers.length(); i++) {
            if (numbers.charAt(i) == '3') {
                answer++;
            }
            if (numbers.charAt(i) == '6') {
                answer++;
            }
            if (numbers.charAt(i) == '9') {
                answer++;
            }
        }

        return answer;
    }
}
