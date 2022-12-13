package bridge.controller;

import bridge.model.BridgeView;
import bridge.view.OutputView;

public class ResultController {
    private final OutputView OUTPUT_VIEW = new OutputView();
    private final BridgeView BRIDGE_VIEW = new BridgeView();

    public void resultMove() {
        OUTPUT_VIEW.printResult();
    }
}
