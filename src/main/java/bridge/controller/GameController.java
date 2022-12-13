package bridge.controller;

import bridge.model.BridgeGame;

import java.util.ArrayList;
import java.util.List;

public class GameController {
    private final BridgeGame BRIDGE_GAME = new BridgeGame();
    private List<Boolean> result = new ArrayList<>();

    public List<Boolean> playGame(List<String> bridge, List<String> userMove) {
        this.result = BRIDGE_GAME.move(bridge, userMove);
        return this.result;
    }

}
