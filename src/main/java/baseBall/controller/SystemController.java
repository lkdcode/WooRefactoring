package baseBall.controller;

import baseBall.model.ComputerNumber;
import baseBall.model.Referee;
import baseBall.model.UserNumber;
import baseBall.view.OutputView;

public class SystemController {
    private final OutputView OUTPUT_VIEW = new OutputView();
    private final InputView INPUT_VIEW = new InputView();
    private final UserNumber USER_NUMBER = new UserNumber();
    private final ComputerNumber COMPUTER_NUMBER = new ComputerNumber();
    private final Referee REFEREE = new Referee();
    private final int WIN_COUNT = 3;

    public void joinTheGame() {
        play();
        OUTPUT_VIEW.printQuit();
    }

    private void play() {
        playComputer();
        playUser();
        retry();
    }

    private void playComputer() {
        computer();
    }

    private void computer() {
        COMPUTER_NUMBER.makeComputerNumbers();
        OUTPUT_VIEW.printStart();
    }

    private void playUser() {
        user();
        referee();
        result();
    }

    private void retry() {
        OUTPUT_VIEW.printCommand();
        INPUT_VIEW.readCommand();
        if (INPUT_VIEW.getRetry()) {
            play();
        }
    }

    private void user() {
        OUTPUT_VIEW.printInput();
        INPUT_VIEW.readNumber();
        USER_NUMBER.makeUserNumbers(INPUT_VIEW.getInputNumber());
    }

    private void referee() {
        REFEREE.playBaseBall(USER_NUMBER.getUserNumbers(), COMPUTER_NUMBER.getComputerNumbers());
        OUTPUT_VIEW.printResult(REFEREE.getStrike(), REFEREE.getBall());
    }

    private void result() {
        if (REFEREE.getStrike() != WIN_COUNT) {
            playUser();
        }
    }

}
