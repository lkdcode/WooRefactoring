package baseBall;

import baseBall.controller.SystemController;

public class Application {
    private static final SystemController BASE_BALL = new SystemController();

    public static void main(String[] args) {

        BASE_BALL.joinTheGame();

    }
}