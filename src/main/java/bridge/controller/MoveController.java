package bridge.controller;

import bridge.model.BridgeView;
import bridge.view.MoveState;
import bridge.view.OutputView;

import java.util.ArrayList;
import java.util.List;

public class MoveController {
    private final GameController GAME_CONTROLLER = new GameController();
    private final OutputView OUTPUT_VIEW = new OutputView();
    private final BridgeView BRIDGE_VIEW = new BridgeView();
    private final State state = new State();
    private List<String> bridge = new ArrayList<>();
    private List<String> userMove = new ArrayList<>();
    private List<Boolean> result = new ArrayList<>();
    private int order = 0;

    public void setBridge(List<String> bridge) {
        this.bridge = bridge;
    }

    public void moveHandler() {
        do {
            // 무브
            move();
            // 결과
        } while (state.getState() != MoveState.END); //결과
    }

    private MoveState move() {
        OUTPUT_VIEW.printInputMove();
        String inputMove = InputView.getInstance().readMove();
        this.userMove.add(inputMove);
        playGame();
        moveResult();
        return state.getState();
    }

    private void playGame() {
        this.result = GAME_CONTROLLER.playGame(this.bridge, this.userMove);
        bridgeView();
    }

    private void bridgeView() {
        BRIDGE_VIEW.makeBridgeView(this.userMove, this.result);
        OUTPUT_VIEW.printMap(BRIDGE_VIEW.getUpperBridge(), BRIDGE_VIEW.getLowerBridge());
    }

    private void moveResult() {
        if (isWin()) {
            // 성공
            move();
        }

        if (!isWin()) {
            // 실패
            result.remove(order);
        }
    }

    private boolean isWin() {
        return result.get(order);
    }

}
