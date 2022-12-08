package First.onboarding;

public class AppProblem3_1 {

    public static void main(String[] args) {

        int number = 33;

        // 1의 자리는 prev 0
        // 10의 자리는 prev 3
        // 100의 자리는 prev 60

        System.out.println(test(33, 2, 3));


    }

    public static int test(int value, int len, int prev) {
        int digits = (int) Math.pow(10, len - 1);
        int div = value / digits;
        return (div * prev) + (div / 3) * digits + prev;
    }

}
