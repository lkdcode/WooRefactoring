package bridge.model.bridge;

import java.util.List;

public class Bridge {
    private final BridgeRandomNumberGenerator BRIDGE_RANDOM_NUMBER_GENERATOR = new BridgeRandomNumberGenerator();
    private final BridgeMaker BRIDGE_MAKER = new BridgeMaker(BRIDGE_RANDOM_NUMBER_GENERATOR);

    public List<String> makeBridge(int size) {
        return BRIDGE_MAKER.makeBridge(size);
    }

}