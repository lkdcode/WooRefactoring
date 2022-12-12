package bridge.model;

import java.util.ArrayList;
import java.util.List;

public class MakeBridge {
    private final BridgeRandomNumberGenerator BRIDGE_RANDOM_NUMBER_GENERATOR = new BridgeRandomNumberGenerator();
    private final BridgeMaker BRIDGE_MAKER = new BridgeMaker(BRIDGE_RANDOM_NUMBER_GENERATOR);
    private List<String> bridge = new ArrayList<>();

    public List<String> makeBridge(int size) {
        bridge = BRIDGE_MAKER.makeBridge(size);
        return bridge;
    }

}
