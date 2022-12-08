package lotto.view;

import java.util.List;

public class OutputView {
    public void printUserLotto(List<List<Integer>> userLottos) {
        for (int i = 0; i < userLottos.size(); i++) {
            System.out.println(userLottos.get(i));
        }
    }

    public void printInputLottoNumber() {
        System.out.println(MESSAGE.INPUT_NUMBERS.getView());
    }

    public void printInputBonusNumber() {
        System.out.println(MESSAGE.INPUT_BONUS_NUMBERS.getView());
    }
}
