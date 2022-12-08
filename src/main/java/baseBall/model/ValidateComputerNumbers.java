package baseBall.model;

import baseBall.view.MESSAGE;

import java.util.ArrayList;
import java.util.List;

public class ValidateComputerNumbers {
    private final int ZERO = 0;
    private final int FIRST = 0;
    private final int SECOND = 1;
    private final int THIRD = 2;
    private final int LENGTH = 3;
    private List<Integer> computerNumbers = new ArrayList<>();

    public void validateComputerNumbers(List<Integer> computerNumbers) {
        this.computerNumbers = computerNumbers;
        validateLength();
        validateZero();
        validateDuplication();
    }

    private void validateLength() {
        if (computerNumbers.size() != LENGTH) {
            System.out.println(MESSAGE.ERROR_COMPUTER_LENGTH.getView());
            throw new IllegalArgumentException();
        }
    }

    private void validateZero() {
        if (computerNumbers.contains(ZERO)) {
            System.out.println(MESSAGE.ERROR_COMPUTER_ZERO.getView());
            throw new IllegalArgumentException();
        }
    }

    private void validateDuplication() {
        if (computerNumbers.get(FIRST) == computerNumbers.get(SECOND)
          || computerNumbers.get(FIRST) == computerNumbers.get(THIRD)
          || computerNumbers.get(SECOND) == computerNumbers.get(THIRD)) {
            System.out.println(MESSAGE.ERROR_COMPUTER_DUPLICATION.getView());
            throw new IllegalArgumentException();
        }
    }
}
