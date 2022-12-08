package First.onboarding.PhoneBook;

public class PhoneBook {
    private static final PhoneInfo phoneInfo = new PhoneInfo();
    private static final Controller controller = new Controller();

    public static void main(String[] args) {
        while (true) {
            phoneInfo.printInfo();
            controller.inputMenu();
            firstMenu();
            secondMenu();
            thirdMenu();
            fourthMenu();
            if (controller.getMenu() == 5) {
                fifthMenu();
                break;
            }
        }
    }

    private static void firstMenu() {
        if (controller.getMenu() == 1 && phoneInfo.getCount() >= 3) {
            System.out.println(MESSAGE.INPUT_MAX.view() + " (" + phoneInfo.getCount() + " / " + "3" + ")");
        }
        if (controller.getMenu() == 1 && phoneInfo.getCount() < 3) {
            System.out.println();
            System.out.println(MESSAGE.INPUT_START.view());
            System.out.println();
            System.out.print(MESSAGE.INPUT_NAME.view());
            controller.inputName();
            System.out.print(MESSAGE.INPUT_PHONNUMBER.view());
            controller.inputPhoneNumber();
            System.out.print(MESSAGE.INPUT_BIRTH.view());
            controller.inputBirth();
            phoneInfo.save(controller.getName(), controller.getPhoneNumber(), controller.getBirth());
            System.out.println(MESSAGE.INPUT_CLOSE.view() + " (" + phoneInfo.getCount() + " / " + "3" + ")");
            System.out.println(MESSAGE.SMALL_LINE.view());
            System.out.println();
        }
    }

    private static void secondMenu() {
        if (controller.getMenu() == 2) {
            System.out.println(MESSAGE.LINE.view());
            System.out.println(MESSAGE.SEARCH_USER.view());
            phoneInfo.searchTotal();
        }
    }

    private static void thirdMenu() {
        if (controller.getMenu() == 3) {
            System.out.println(MESSAGE.SMALL_LINE.view());
            System.out.println(MESSAGE.SEARCH_NAME_START.view());
            System.out.print(MESSAGE.INPUT_NAME.view());
            controller.inputSearchName();
            phoneInfo.searchUser(controller.getName());
        }
    }

    private static void fourthMenu() {
        if (controller.getMenu() == 4) {
            System.out.println("이름입력해주세요");
            controller.inputSearchName();
            phoneInfo.delete(controller.getName());
        }
    }

    private static void fifthMenu() {
        System.out.println(MESSAGE.LINE.view());
        System.out.println(MESSAGE.CLOSE.view());
    }
}
