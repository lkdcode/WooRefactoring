package First.onboarding.problemOne;

public class ValidateNumber {
    private final int START = 1;
    private final int LAST = 399;

    public int startOrLast(int leftNumber) {
        if (leftNumber == START || leftNumber == LAST) {
            return -1;
        }
        return 0;
    }

    public int oddNumber(int leftNumber) {
        if (leftNumber % 2 == 0) {
            return -1;
        }
        return 0;
    }

    public int evenNumber(int rightNumber) {
        if (rightNumber % 2 != 0) {
            return -1;
        }
        return 0;
    }

    public int stepNumber(int leftNumber, int rightNumber) {
        if ((leftNumber + 1) != rightNumber) {
            return -1;
        }
        return 0;
    }

}
