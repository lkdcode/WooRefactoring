package lotto.controller;

import lotto.model.Inquiry;
import lotto.model.MakeUserLotto;
import lotto.view.MESSAGE;
import lotto.view.OutputView;

public class SystemController {
    //✨feat : 로또 메인 컨트롤러
    private final InputView INPUT_VIEW = new InputView();
    private final OutputView OUTPUT_VIEW = new OutputView();
    private final MakeUserLotto MAKE_USER_LOTTO = new MakeUserLotto();
    private final Inquiry INQUIRY = new Inquiry();

    public void store() {

        // 구매금 입력
        buyLotto();

        // 로또 번호 생성
        userLotto();

        // 당첨 번호 입력
        inputLottoNumber();

        // 보너스 번호 입력
        inputBonusNumber();

        // 당첨 통계 출력
        result();
    }

    private void buyLotto() {
        // outputView 적용
        System.out.println(MESSAGE.INPUT_MONEY.getView());
        INQUIRY.result(INPUT_VIEW.inputPay());
        System.out.printf("%n" + INPUT_VIEW.getTickets() + "개를 구매했습니다." + "%n");
    }

    private void userLotto() {
        MAKE_USER_LOTTO.userLotto(INPUT_VIEW.getTickets());
        OUTPUT_VIEW.printUserLotto(MAKE_USER_LOTTO.getUserLottos());
    }

    private void inputLottoNumber() {
        OUTPUT_VIEW.printInputLottoNumber();
        INPUT_VIEW.inputLottoNumbers();
    }

    private void inputBonusNumber() {
        OUTPUT_VIEW.printInputBonusNumber();
        INPUT_VIEW.inputBonusNumber();
    }

    private void result() {


    }

}
