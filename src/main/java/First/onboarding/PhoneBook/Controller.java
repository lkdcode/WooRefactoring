package First.onboarding.PhoneBook;

import java.util.Scanner;

public class Controller {
    private final Scanner scan = new Scanner(System.in);
    private int menu;
    private String name;
    private String phoneNumber;
    private String birth;

    private void inputMenuMessage() {
        System.out.println(MESSAGE.LINE.view());
        System.out.println(MESSAGE.WRONG_INPUT.view());
        System.out.println(MESSAGE.LINE.view());
        System.out.println(MESSAGE.FIRST_MENU.view());
        System.out.println(MESSAGE.SECOND_MENU.view());
        System.out.println(MESSAGE.THIRD_MENU.view());
        System.out.println(MESSAGE.FOURTH_MENU.view());
        System.out.println(MESSAGE.FIFTH_MENU.view());
        System.out.println(MESSAGE.LINE.view());
    }

    public void inputMenu() {
        String menu = scan.nextLine();
        try {
            this.menu = Integer.parseInt(menu);
        } catch (NumberFormatException e) {
            inputMenuMessage();
            inputMenu();
        }
        if (!(this.menu >= 1 && this.menu <= 5)) {
            inputMenuMessage();
            inputMenu();
        }
    }

    public void inputSearchName() {
        this.name = scan.nextLine();
    }

    public int getMenu() {
        return menu;
    }


    public void inputName() {
        name = scan.nextLine();
    }

    public void inputPhoneNumber() {
        phoneNumber = scan.nextLine();
    }

    public void inputBirth() {
        birth = scan.nextLine();
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getBirth() {
        return birth;
    }


}
