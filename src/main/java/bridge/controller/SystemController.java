package bridge.controller;

/**
 * 메인 컨트롤러
 */

import bridge.model.BridgeGame;
import bridge.view.MESSAGE;

public class SystemController {
    private final BridgeGame BRIDGEGAME = new BridgeGame();
    private boolean moveResult;

    public void bridgeGame() {
        // 다리 생성
        bridge();

        // 이동 선택
        choiceMove();

        // 이동 결과 출력
        viewBridge();

        // 재시도, 종료 여부
        choiceCommand();

        // 최종 결과
        result();
    }

    /**
     * 다리 생성하는 역할
     */
    private void bridge() {
        MESSAGE.START.print();
        MESSAGE.INPUT_BRIDGE_SIZE.print();
        int size = InputView.getInstance().readBridgeSize();
        BRIDGEGAME.move(size);
    }

    /**
     * 건널 다리를 선택
     */
    private void choiceMove() {
        MESSAGE.INPUT_MOVE.print();
        String move = InputView.getInstance().readMoving();
        moveResult(move);
    }

    private void moveResult(String move) {
        moveResult = BRIDGEGAME.move(move);
        if (moveResult) {
            choiceMove();
        }
    }

    private void viewBridge() {

    }

    private void choiceCommand() {
        MESSAGE.INPTU_COMMAND.print();
        System.out.println("ㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇ음?");
        String command = InputView.getInstance().readGameCommand();
        System.out.println(command);
    }

    private void result() {
        MESSAGE.SUCCESS_OR_NOT.print();
        MESSAGE.SUCCESS.print();
        MESSAGE.TOTAL_TRY.print();
    }

}
