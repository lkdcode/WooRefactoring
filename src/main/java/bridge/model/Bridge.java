package bridge.model;

import java.util.ArrayList;
import java.util.List;

public class Bridge {
    private final BridgeRandomNumberGenerator BRIDGE_RANDOM_NUMBER_GENERATOR = new BridgeRandomNumberGenerator();
    private final BridgeMaker BRIDGE_MAKER = new BridgeMaker(BRIDGE_RANDOM_NUMBER_GENERATOR);
    private List<String> bridge = new ArrayList<>();

    public void makeBridge(int size) {
        bridge = BRIDGE_MAKER.makeBridge(size);
    }

    public List<String> getBridge() {
        return bridge;
    }

}
