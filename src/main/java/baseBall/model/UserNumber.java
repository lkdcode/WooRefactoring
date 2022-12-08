package baseBall.model;

import java.util.ArrayList;
import java.util.List;

public class UserNumber {
    private List<Integer> userNumbers = new ArrayList<>();

    public void makeUserNumbers(String inputNumber) {
        userNumbers = new ArrayList<>();
        for (int i = 0; i < inputNumber.length(); i++) {
            userNumbers.add(Integer.parseInt(String.valueOf(inputNumber.charAt(i))));
        }
    }

    public List<Integer> getUserNumbers() {
        return userNumbers;
    }

}
