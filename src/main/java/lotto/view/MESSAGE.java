package lotto.view;

//✨feat : 메시지 출력 이넘 클래스
public enum MESSAGE {
    INPUT_MONEY("구입금액을 입력해주세요."),
    TICKETS("개를 구매했습니다."),
    INPUT_NUMBERS("당첨 번호를 입력해주세요."),
    INPUT_BONUS_NUMBERS("보너스 번호를 입력해주세요."),
    RATE("당첨 통계"),
    LINE("---"),
    THREE_CONTAINS("3개 일치 (5,000원) - "),
    FOUR_CONTAINS("4개 일치 (50,000원) - "),
    FIVE_CONTAINS("5개 일치 (1,500,000원) - "),
    FIVE_BONUS_CONTAINS("5개 일치, 보너스 볼 일치 (30,000,000원) - "),
    SIX_CONTAINS("6개 일치 (2,000,000,000원) - "),
    TOTAL_RATE("총 수익률은 "),
    ERROR_PAY("[ERROR] 숫자만 입력해주세요"),
    ERROR_RANGE("[ERROR] 1부터 45까지의 숫자만 입력해주세요."),
    ERROR_LENGTH("[ERROR] 6개의 숫자를 입력해주세요."),
    ERROR_DUPLICATION("[ERROR] 중복된 번호없이 숫자를 입력해주세요."),
    ERROR_PAY_MIN("[ERROR] 최소 구매금은 1,000원 입니다."),
    ERROR_PAY_MAX("[ERROR] 최대 구매금은 10억원 입니다."),
    ERROR_PAY_UNIT("[ERROR] 구매금의 최소 단위는 1,000원 입니다."),
    ERROR_DUPLICATION_BONUS("[ERROR] 당첨 번호와 중복된 번호는 입력하실 수 없습니다.");

    private final String view;

    MESSAGE(String view) {
        this.view = view;
    }

    public String getView() {
        return view;
    }
}
