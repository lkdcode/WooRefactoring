package bridge.view;

/**
 * 사용자에게 보여줄 메시지를 관리하는 클래스
 */
public enum MESSAGE {
    START("다리 건너기 게임을 시작합니다.%n"),
    INPUT_BRIDGE_SIZE("%n다리의 길이를 입력해주세요.%n"),
    INPUT_MOVE("%n이동할 칸을 선택해주세요. (위: U, 아래: D)%n"),
    INPTU_COMMAND("%n게임을 다시 시도할지 여부를 입력해주세요. (재시도: R, 종료: Q)%n"),
    SUCCESS_OR_NOT("%n게임 성공 여부: "),
    SUCCESS("성공%n"),
    NOT("실패%n"),
    TOTAL_TRY("총 시도한 횟수: ");
    private final String view;

    MESSAGE(String view) {
        this.view = view;
    }

    public void print() {
        System.out.printf(view);
    }
}
