package lotto.model;

import lotto.view.PRIZE;

import java.util.ArrayList;
import java.util.List;

public class Inquiry {
    private List<Integer> lotto = new ArrayList<>();
    private List<List<Integer>> userLottos = new ArrayList<>();
    private int bonusNumber;
    private int[] prizeResult = new int[5];
    // {0,0,0,0,0}
    private long totalPrize;

    public void result(List<Integer> lotto, int bonusNumber, List<List<Integer>> userLottos) {
        deliteUserLotto(lotto, userLottos);
        this.lotto = lotto;
        this.bonusNumber = bonusNumber;
        lottery();
    }

    public int[] getPrizeResult() {
        return prizeResult;
    }

    public long getTotalPrize() {
        return totalPrize;
    }

    private void deliteUserLotto(List<Integer> lotto, List<List<Integer>> userLottos) {
        for (int i = 0; i < userLottos.size(); i++) {
            removeUserLotto(lotto, userLottos.get(i));
        }
    }

    private void removeUserLotto(List<Integer> lotto, List<Integer> userLotto) {
        int count = 0;
        for (int i = 0; i < userLotto.size(); i++) {
            if (lotto.contains(userLotto.get(i))) {
                count++;
            }
        }
        if (count >= PRIZE.FIFTH.getWin()) {
            this.userLottos.add(userLotto);
        }
    }

    private void lottery() {
        secondPrize();
        totalPrize();
    }

    private void totalPrize() {
        for (int i = 0; i < userLottos.size(); i++) {
            prizeResult(prizeCount(userLottos.get(i)));
        }
    }

    private int prizeCount(List<Integer> userLotto) {
        int count = 0;
        for (int i = 0; i < userLotto.size(); i++) {
            if (lotto.contains(userLotto.get(i))) {
                count++;
            }
        }
        return count;
    }

    private void prizeResult(int count) {
        highPrize(count);
        lowPrize(count);
    }

    private void highPrize(int count) {
        if (count == PRIZE.FIRST.getWin()) {
            prizeResult[0]++;
            totalPrize += PRIZE.FIRST.getPrizeMoney();
        }
        if (count == PRIZE.THIRD.getWin()) {
            prizeResult[2]++;
            totalPrize += PRIZE.THIRD.getPrizeMoney();
        }
    }

    private void lowPrize(int count) {
        if (count == PRIZE.FOURTH.getWin()) {
            prizeResult[3]++;
            totalPrize += PRIZE.FOURTH.getPrizeMoney();
        }
        if (count == PRIZE.FIFTH.getWin()) {
            prizeResult[4]++;
            totalPrize += PRIZE.FIFTH.getPrizeMoney();
        }
    }

    private void secondPrize() {
        for (int i = 0; i < userLottos.size(); i++) {
            if (userLottos.get(i).contains(bonusNumber)) {
                secondPrizeResult(userLottos.get(i));
            }
        }
    }

    private void secondPrizeResult(List<Integer> userLotto) {
        int count = 0;
        for (int i = 0; i < userLotto.size(); i++) {
            if (lotto.contains(userLotto.get(i))) {
                count++;
            }
        }
        if (count == PRIZE.SECOND.getWin()) {
            prizeResult[1]++;
            totalPrize += PRIZE.SECOND.getPrizeMoney();
            userLottos.remove(userLotto);
        }
    }


}
