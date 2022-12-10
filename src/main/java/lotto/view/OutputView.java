package lotto.view;

import java.text.DecimalFormat;
import java.util.List;

// 3자릿 수 마다 쉼표 추가
public class OutputView {
    private final String EA = "개";
    private final String RATE = "%%입니다.";
    private final DecimalFormat PRIZE_FORMAT = new DecimalFormat("###,###");

    public void printTickets(int tickets) {
        System.out.printf("%n" + tickets + MESSAGE.TICKETS.getView() + "%n");
    }

    public void printUserLotto(List<List<Integer>> userLottos) {
        for (int i = 0; i < userLottos.size(); i++) {
            System.out.println(userLottos.get(i));
        }
    }

    public void printInputLottoNumber() {
        System.out.printf("%n" + MESSAGE.INPUT_NUMBERS.getView() + "%n");
    }

    public void printInputBonusNumber() {
        System.out.printf("%n" + MESSAGE.INPUT_BONUS_NUMBERS.getView() + "%n");
    }

    public void printPrizeResult(int[] prizeResult) {
        System.out.printf("%n" + MESSAGE.RATE.getView() + "%n");
        System.out.println(MESSAGE.LINE.getView());
        System.out.println(MESSAGE.THREE_CONTAINS.getView() + prizeResult[4] + EA);
        System.out.println(MESSAGE.FOUR_CONTAINS.getView() + prizeResult[3] + EA);
        System.out.println(MESSAGE.FIVE_CONTAINS.getView() + prizeResult[2] + EA);
        System.out.println(MESSAGE.FIVE_BONUS_CONTAINS.getView() + prizeResult[1] + EA);
        System.out.println(MESSAGE.SIX_CONTAINS.getView() + prizeResult[0] + EA);
    }

    public void printTotalRate(long totalPrize, int pay) {
        // 소수점 둘째자리 반올림 추가
        
        double rate = ((double) totalPrize / (double) pay) * 100;
        System.out.printf(MESSAGE.TOTAL_RATE.getView() + PRIZE_FORMAT.format(rate) + RATE);
    }
}
