package baseBall.controller;

import static camp.nextstep.edu.missionutils.Console.readLine;

/*
 *  사용자로부터 입력을 받는 클래스
 */
public class InputView {
    private final ValidateInput VALIDATE_INPUT = new ValidateInput();
    private final String RETRY_COMMAND = "1";
    private String inputCommand;
    private String inputNumber;

    public void readNumber() {
        inputNumber = readLine();
        VALIDATE_INPUT.validateInputNumber(inputNumber);
    }

    public String getInputNumber() {
        return inputNumber;
    }

    public void readCommand() {
        inputCommand = readLine();
        VALIDATE_INPUT.validateInputCommand(inputCommand);
    }

    public boolean getRetry() {
        if (inputCommand.equals(RETRY_COMMAND)) {
            return true;
        }
        return false;
    }

}
