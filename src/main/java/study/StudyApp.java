package study;

public class StudyApp {

    private static final Student student = new Student();

    public static void main(String[] args) {

        StudnetState studnetState;

        do {
            studnetState = handler();
        }
        while (studnetState != studnetState.END);
    }

    public static StudnetState handler() {
        StudnetState studnetState = student.getState();
        switch (studnetState) {
            case RUN:
                student.run();
                break;
            case TEST:
                student.test();
                break;
            case HOME:
                student.home();
                break;
            case FAX:
                student.fax();
                break;
            case STUDY:
                student.study();
                break;
        }
        return student.getState();
    }
}
