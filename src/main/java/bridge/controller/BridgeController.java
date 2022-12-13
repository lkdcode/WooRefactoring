package bridge.controller;

import bridge.model.bridge.Bridge;
import bridge.view.OutputView;

import java.util.List;

public class BridgeController {
    private final OutputView OUTPUT_VIEW = new OutputView();
    private final Bridge BRIDGE = new Bridge();

    public List<String> bridge() {
        OUTPUT_VIEW.printStart();
        int size = InputView.getInstance().readBridgeSize();
        return BRIDGE.makeBridge(size);
    }

}