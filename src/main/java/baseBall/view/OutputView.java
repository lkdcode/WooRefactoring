package baseBall.view;

public class OutputView {
    private final int STRIKE_COUNT = 3;

    public void printStart() {
        System.out.println(MESSAGE.START.getView());
    }

    public void printInput() {
        System.out.printf("%n" + MESSAGE.INPUT_NUMBER.getView());
    }

    public void printResult(int strike, int ball) {
        printNothig(strike, ball);
        printStrike(strike);
        printBall(ball);
    }

    public void printCommand() {
        System.out.println(MESSAGE.COMMAND.getView());
    }

    public void printQuit() {
        System.out.println(MESSAGE.QUIT.getView());
    }

    private void printNothig(int strike, int ball) {
        if (strike == 0
          && ball == 0) {
            System.out.print(MESSAGE.NOTHING.getView());
        }
    }

    private void printStrike(int strike) {
        if (strike != 0) {
            System.out.print(strike + MESSAGE.STRIKE.getView());
        }
        if (strike == STRIKE_COUNT) {
            printWin();
        }
    }

    private void printBall(int ball) {
        if (ball != 0) {
            System.out.print(ball + MESSAGE.BALL.getView());
        }
    }

    private void printWin() {
        System.out.printf("%n" + MESSAGE.WIN.getView() + "%n");
    }
}
