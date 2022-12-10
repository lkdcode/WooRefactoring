package bridge.controller;

import bridge.view.ERROR_MESSAGE;

/**
 * 사용자로부터 입력을 받는 값을 검증하는 역할을 한다.
 */
public class ValidateInput {
    private final int MAX_SIZE = 20;
    private final int MIN_SIZE = 3;
    private final String UP = "U";
    private final String DOWN = "D";
    private final String RETRY = "R";
    private final String QUIT = "Q";
    private int bridgeSize;
    private String command;
    private String move;

    /**
     * 입력받은 다리의 길이를 검증한다.
     */
    public int validateInputBridgeSize(String inputBridgeSize) {
        try {
            this.bridgeSize = validateNumber(inputBridgeSize);
            validateSizeLength(bridgeSize);
        } catch (IllegalArgumentException e) {
            System.out.println(ERROR_MESSAGE.SIZE.getView());
            InputView.getInstance().readBridgeSize();
        }
        return bridgeSize;
    }

    /**
     * 입력받은 다리 길이가 숫자로 이루어져 있는지 검증
     */
    private int validateNumber(String inputBridgeSize) throws IllegalArgumentException {
        try {
            return Integer.parseInt(inputBridgeSize);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException();
        }
    }

    /**
     * 입력받은 다리 길이가 3 - 20 사이인지 검증
     */
    private void validateSizeLength(int bridgeSize) throws IllegalArgumentException {
        if (!(bridgeSize >= MIN_SIZE && bridgeSize <= MAX_SIZE)) {
            throw new IllegalArgumentException();
        }
    }


    /**
     * 입력받은 이동할 칸을 검증한다.
     */
    public String validateInputMove(String inputMove) {
        try {
            validateInputMoving(inputMove);
            this.move = inputMove;
        } catch (IllegalArgumentException e) {
            System.out.println(ERROR_MESSAGE.MOVE.getView());
            InputView.getInstance().readMoving();
        }
        return move;
    }

    private void validateInputMoving(String inputMove) throws IllegalArgumentException {
        if (!(inputMove.equals(UP) || inputMove.equals(DOWN))) {
            throw new IllegalArgumentException();
        }
    }


    /**
     * 입력받은 재시도 값을 검증한다.
     */
    public String validateInputCommand(String inputCommand) {
        try {
            validateCommand(inputCommand);
            this.command = inputCommand;
        } catch (IllegalArgumentException e) {
            System.out.println(ERROR_MESSAGE.COMMAND.getView());
            InputView.getInstance().readGameCommand();
        }
        return command;
    }

    private void validateCommand(String inputCommand) {
        if (!(inputCommand.equals(RETRY) || inputCommand.equals(QUIT))) {
            throw new IllegalArgumentException();
        }
    }
}