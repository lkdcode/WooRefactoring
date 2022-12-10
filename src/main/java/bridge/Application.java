package bridge;

import bridge.controller.SystemController;

public class Application {
    private static final SystemController PLAY = new SystemController();

    public static void main(String[] args) {

        PLAY.bridgeGame();

    }
}