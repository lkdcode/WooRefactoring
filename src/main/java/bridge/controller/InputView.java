package bridge.controller;

import static camp.nextstep.edu.missionutils.Console.readLine;

/**
 * 사용자로부터 입력을 받는 역할을 한다.
 */
public class InputView {
    private static final InputView INSTANCE = new InputView();
    private static final ValidateInput VALIDATE_INPUT = new ValidateInput();

    private InputView() {
    }

    /**
     * 인스턴스 생성
     */
    public static InputView getInstance() {
        return INSTANCE;
    }

    /**
     * 다리의 길이를 입력받는다.
     */
    public int readBridgeSize() {
        return VALIDATE_INPUT.validateInputBridgeSize(readLine());
    }

    /**
     * 사용자가 이동할 칸을 입력받는다.
     */
    public String readMove() {
        return VALIDATE_INPUT.validateInputMove(readLine());
    }

    /**
     * 사용자가 게임을 다시 시도할지 종료할지 여부를 입력받는다.
     */
    public String readGameCommand() {
        return VALIDATE_INPUT.validateInputCommand(readLine());
    }
}