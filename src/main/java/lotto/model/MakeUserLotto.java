package lotto.model;

import camp.nextstep.edu.missionutils.Randoms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MakeUserLotto {
    //✨feat : 유저의 로또 번호를 생성하는 클래스

    private List<List<Integer>> userLottos = new ArrayList<>();

    public void userLotto(int tickets) {
        for (int i = 0; i < tickets; i++) {
            userLottos.add(Randoms.pickUniqueNumbersInRange(1, 45, 6));
            Collections.sort(userLottos.get(i));
        }
    }

    public List<List<Integer>> getUserLottos() {
        return userLottos;
    }
}
