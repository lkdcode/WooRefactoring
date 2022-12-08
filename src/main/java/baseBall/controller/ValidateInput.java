package baseBall.controller;

import baseBall.view.MESSAGE;

public class ValidateInput {
    private final int COMMAND_LENGTH = 1;
    private final int NUMBER_LENGTH = 3;
    private final int FIRST = 0;
    private final int SECOND = 1;
    private final int THIRD = 2;
    private final String ONLY_COMMAND = "^[1-2]*$";
    private final String ONLY_NUMBERS = "^[0-9]*$";

    public void validateInputNumber(String inputNumber) {
        validateLength(inputNumber);
        validateNumber(inputNumber);
        validateZero(inputNumber);
        validateDuplication(inputNumber);
    }

    public void validateInputCommand(String inputCommand) {
        validateCommandLength(inputCommand);
        validateCommandNumber(inputCommand);
    }

    private void validateCommandNumber(String inputCommand) {
        if (!(inputCommand.matches(ONLY_COMMAND))) {
            System.out.println(MESSAGE.ERROR_NUMBER.getView());
            throw new IllegalArgumentException();
        }
    }

    private void validateCommandLength(String inputCommand) {
        if (inputCommand.length() != COMMAND_LENGTH) {
            System.out.println(MESSAGE.ERROR_COMMAND.getView());
            throw new IllegalArgumentException();
        }
    }

    private void validateLength(String inputNumber) {
        if (inputNumber.length() != NUMBER_LENGTH) {
            System.out.println(MESSAGE.ERROR_NUMBER_LENGTH.getView());
            throw new IllegalArgumentException();
        }
    }

    private void validateNumber(String inputNumber) {
        if (!(inputNumber.matches(ONLY_NUMBERS))) {
            System.out.println(MESSAGE.ERROR_NUMBER.getView());
            throw new IllegalArgumentException();
        }
    }

    private void validateZero(String inputNumber) {
        if (inputNumber.contains("0")) {
            System.out.println(MESSAGE.ERROR_ZERO_NUMBER.getView());
            throw new IllegalArgumentException();
        }
    }

    private void validateDuplication(String inputNumber) {
        if (inputNumber.charAt(FIRST) == inputNumber.charAt(SECOND) ||
          inputNumber.charAt(FIRST) == inputNumber.charAt(THIRD) ||
          inputNumber.charAt(SECOND) == inputNumber.charAt(THIRD)) {
            System.out.println(MESSAGE.ERROR_DUPLICATION_NUMBER.getView());
            throw new IllegalArgumentException();
        }
    }

}