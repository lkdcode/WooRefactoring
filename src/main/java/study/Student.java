package study;

public class Student {
    private StudnetState state;

    public Student() {
        state = StudnetState.RUN;
    }

    public void run() {
        System.out.println("런 실행");
        state = StudnetState.STUDY;
    }

    public void study() {
        System.out.println("스터디 실행");
        state = StudnetState.TEST;
    }

    public void home() {
        System.out.println("홈 실행");
        state = StudnetState.END;
    }

    public void test() {
        System.out.println("테스트 실행");
        state = StudnetState.FAX;
    }

    public void fax() {
        System.out.println("팩스 실행");
        state = StudnetState.HOME;
    }

    public StudnetState getState() {
        return state;
    }
}
