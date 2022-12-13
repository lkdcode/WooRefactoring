package bridge.model;

import bridge.view.BRIDGE_SHAPE;

import java.util.List;

public class BridgeView {
    private final String USER_UP_MOVE = "U";
    private final String USER_DOWN_MOVE = "D";
    private String upperBridge;
    private String lowerBridge;

    public void makeBridgeView(List<String> userMove, List<Boolean> result) {
        settingBridge();
        for (int i = 0; i < result.size(); i++) {
            successMove(userMove.get(i), result.get(i));
            failMove(userMove.get(i), result.get(i));
        }
    }

    private void settingBridge() {
        upperBridge = "";
        lowerBridge = "";
    }

    private void successMove(String userMove, boolean userMoveResult) {
        if (userMoveResult) {
            if (userMove.equals(USER_UP_MOVE)) {
                upperSuccess();
            }
            if (userMove.equals(USER_DOWN_MOVE)) {
                lowerSuccess();
            }
        }
    }

    private void upperSuccess() {
        upperBridge += BRIDGE_SHAPE.RIGHT_MOVE.shape();
        lowerBridge += BRIDGE_SHAPE.BRIDGE.shape();
    }

    private void lowerSuccess() {
        upperBridge += BRIDGE_SHAPE.BRIDGE.shape();
        lowerBridge += BRIDGE_SHAPE.RIGHT_MOVE.shape();
    }

    private void failMove(String userMove, boolean userMoveResult) {
        if (!(userMoveResult)) {
            if (userMove.equals(USER_UP_MOVE)) {
                upperFail();
            }
            if (userMove.equals(USER_DOWN_MOVE)) {
                lowerFail();
            }
        }
    }

    private void upperFail() {
        upperBridge += BRIDGE_SHAPE.WRONG_MOVE.shape();
        lowerBridge += BRIDGE_SHAPE.BRIDGE.shape();
    }

    private void lowerFail() {
        upperBridge += BRIDGE_SHAPE.BRIDGE.shape();
        lowerBridge += BRIDGE_SHAPE.WRONG_MOVE.shape();
    }

    public String getUpperBridge() {
        return upperBridge;
    }

    public String getLowerBridge() {
        return lowerBridge;
    }
}
