package First.onboarding.PhoneBook;

public enum MESSAGE {
    LINE("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━"),
    SMALL_LINE("───────────────────────"),
    OPEN("전화번호부를 실행합니다."),
    OPEN_CHOICE_MENU("원하시는 매뉴 번호를 입력해주세요."),
    FIRST_MENU("1. 사용자 전화번호 등록 ✅"),
    SECOND_MENU("2. 등록된 번호 전체 조회 📂"),
    THIRD_MENU("3. 사용자 이름으로 번호 검색 🔎"),
    FOURTH_MENU("4. 사용자 이름으로 번호 삭제 ✂"),
    FIFTH_MENU("5. 전화번호부를 종료합니다 ❌"),
    INPUT_START("전화번호 등록을 시작합니다."),
    INPUT_CLOSE("전화번호 등록을 완료하였습니다."),
    INPUT_MAX("전화번호부가 가득 찼습니다."),
    INPUT_NAME("이름을 입력해주세요. : "),
    INPUT_PHONNUMBER("번호를 입력해주세요. : "),
    INPUT_BIRTH("생일을 입력해주세요. : "),
    SEARCH_USER("전화번호부 전체 조회를 시작하겠습니다."),
    LIST_USER("번째 등록된 사용자의 정보"),
    PRINT_NAME("이름 : "),
    PRINT_PH("번호 : "),
    PRINT_BIRTH("생일 : "),
    SEARCH_NAME_START("사용자 이름으로 번호를 검색합니다."),
    DELETE_USER("사용자 이름으로 번호를 삭제합니다."),
    CLOSE("전화번호부를 종료합니다."),
    WRONG_INPUT("[ERROR] 잘 못 입력하셨습니다. 1-5 숫자만 입력해주세요."),
    START ("야구 게임을 시작합니다.");

    private final String view;

    MESSAGE(String view) {
        this.view = view;
    }

    public String view() {
        return view;
    }
}
