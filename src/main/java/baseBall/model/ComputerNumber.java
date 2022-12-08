package baseBall.model;

import camp.nextstep.edu.missionutils.Randoms;

import java.util.ArrayList;
import java.util.List;

public class ComputerNumber {
    private final ValidateComputerNumbers VALIDATE_COMPUTER_NUMBERS = new ValidateComputerNumbers();
    private final int MIN_NUMBER = 1;
    private final int MAX_NUMBER = 9;
    private final int LENGTH = 3;
    private List<Integer> computerNumbers = new ArrayList<>();

    public void makeComputerNumbers() {
        computerNumbers = new ArrayList<>();
        while (computerNumbers.size() < LENGTH) {
            int randomNumber = Randoms.pickNumberInRange(MIN_NUMBER, MAX_NUMBER);
            if (!computerNumbers.contains(randomNumber)) {
                computerNumbers.add(randomNumber);
            }
        }
        validateComputerNumbers();
    }

    private void validateComputerNumbers() {
        VALIDATE_COMPUTER_NUMBERS.validateComputerNumbers(computerNumbers);
    }

    public List<Integer> getComputerNumbers() {
        return computerNumbers;
    }

}
