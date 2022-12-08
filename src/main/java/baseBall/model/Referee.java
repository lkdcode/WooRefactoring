package baseBall.model;

import java.util.List;

public class Referee {
    private int strike = 0;
    private int ball = 0;

    public void playBaseBall(List<Integer> userNumbers, List<Integer> computerNumbers) {
        setupPlay();
        rule(userNumbers, computerNumbers);
    }

    public int getStrike() {
        return strike;
    }

    public int getBall() {
        return ball;
    }

    private void rule(List<Integer> userNumbers, List<Integer> computerNumbers) {
        strikeRule(userNumbers, computerNumbers);
        ballRule(userNumbers, computerNumbers);
    }

    private void setupPlay() {
        strike = 0;
        ball = 0;
    }

    private void strikeRule(List<Integer> userNumbers, List<Integer> computerNumbers) {
        for (int i = 0; i < userNumbers.size(); i++) {
            if (userNumbers.get(i) == computerNumbers.get(i)) {
                strike++;
            }
        }
    }

    private void ballRule(List<Integer> userNumbers, List<Integer> computerNumbers) {
        for (int i = 0; i < userNumbers.size(); i++) {
            if (userNumbers.get(i) != computerNumbers.get(i)
              && computerNumbers.contains(userNumbers.get(i))) {
                ball++;
            }
        }
    }

}
