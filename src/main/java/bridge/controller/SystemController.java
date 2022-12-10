package bridge.controller;

/**
 *  메인 컨트롤러
 */

import bridge.view.MESSAGE;

public class SystemController {

    public void bridgeGame() {
        // 다리 생성
        makeBridge();

        // 이동 선택
        choiceMove();

        // 이동 결과 출력
        viewBridge();

        //
        choiceCommand();
        // 최종 결과
        result();
    }

    /**
     * 다리 생성하는 역할

     */
    private void makeBridge() {
        MESSAGE.START.print();
        MESSAGE.INPUT_BRIDGE_SIZE.print();
        int bridgeSize = InputView.getInstance().readBridgeSize();
        System.out.println(bridgeSize);
    }
    /**
     * 다리 생성하는 역할
     */
    private void choiceMove() {
        MESSAGE.INPUT_MOVE.print();
        String move = InputView.getInstance().readMoving();
        System.out.println(move);
    }

    private void viewBridge() {

    }

    private void choiceCommand() {
        MESSAGE.INPTU_COMMAND.print();
        String command = InputView.getInstance().readGameCommand();
        System.out.println(command);
    }

    private void result() {
        MESSAGE.SUCCESS_OR_NOT.print();
        MESSAGE.SUCCESS.print();
        MESSAGE.TOTAL_TRY.print();
    }
}
