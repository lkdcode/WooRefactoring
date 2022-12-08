package lotto.model;

import lotto.view.MESSAGE;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/*
 * 입력받은 로또 당첨 번호를 검증하는 클래스
 */

public class Lotto {
    private final List<Integer> numbers;

    public Lotto(List<Integer> numbers) {
        validate(numbers);
        this.numbers = numbers;
    }

    private void validate(List<Integer> numbers) {
        validateLength(numbers);
        validateDuplication(numbers);
    }

    private void validateLength(List<Integer> numbers) {
        if (numbers.size() != 6) {
            System.out.println(MESSAGE.ERROR_LENGTH.getView());
            throw new IllegalArgumentException();
        }
    }

    private void validateDuplication(List<Integer> numbers) {
        Set<Integer> validateDuplications = new HashSet<>();
        validateDuplications.addAll(numbers);
        if (validateDuplications.size() != 6) {
            System.out.println(MESSAGE.ERROR_DUPLICATION.getView());
            throw new IllegalArgumentException();
        }
    }

    public List<Integer> getNumbers() {
        return numbers;
    }


}
