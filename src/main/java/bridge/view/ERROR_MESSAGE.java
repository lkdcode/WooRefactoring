package bridge.view;

/*
 *  사용자에게 보여줄 에러 메시지를 관리하는 클래스
 * */
public enum ERROR_MESSAGE {
    SIZE("[ERROR] 다리 길이는 3부터 20 사이의 숫자여야 합니다."),
    MOVE("[ERROR] 이동할 칸은 위: U, 아래: D 대문자로 입력해야 합니다."),
    COMMAND("[ERROR] 재시도는 R, 종료는 Q 대문자로 입력해야 합니다.");

    private final String view;

    ERROR_MESSAGE(String view) {
        this.view = view;
    }

    public String getView() {
        return view;
    }
}
