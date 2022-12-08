package First.onboarding.PhoneBook;

import java.util.ArrayList;
import java.util.List;

public class PhoneInfo {
    private List<String> userNames = new ArrayList<>();
    private List<String> userPhonNumbers = new ArrayList<>();
    private List<String> userBirths = new ArrayList<>();
    private int count = 0;

    public int getCount() {
        return count;
    }

    public void printInfo() {
        // GJHGJHGJHGJH
        System.out.println(MESSAGE.OPEN.view());
        System.out.println(MESSAGE.OPEN_CHOICE_MENU.view());
        System.out.println(MESSAGE.LINE.view());
        System.out.println(MESSAGE.FIRST_MENU.view());
        
        // JHGJGHJK
        System.out.println(MESSAGE.SECOND_MENU.view());
        System.out.println(MESSAGE.THIRD_MENU.view());
        System.out.println(MESSAGE.FOURTH_MENU.view());
        System.out.println(MESSAGE.FIFTH_MENU.view());
        System.out.println(MESSAGE.LINE.view());
    }


    public void save(String name, String phoneNumber, String birth) {
        if (count < 100) {
            userNames.add(name);
            userPhonNumbers.add(phoneNumber);
            userBirths.add(birth);
            count++;
        }
    }

    public void searchUser(String name) {
        for (int i = 0; i < userNames.size(); i++) {
            if (!(userNames.contains(name))) {
                System.out.println();
                System.out.println("없는디");
                System.out.println(MESSAGE.SMALL_LINE.view());
                break;
            }
            if (userNames.get(i).equals(name)) {
                System.out.println();
                System.out.print(MESSAGE.PRINT_NAME.view());
                System.out.println(userNames.get(i));
                System.out.print(MESSAGE.PRINT_PH.view());
                System.out.println(userPhonNumbers.get(i));
                System.out.print(MESSAGE.PRINT_BIRTH.view());
                System.out.println(userBirths.get(i));
                System.out.println(MESSAGE.SMALL_LINE.view());
                break;
            }
        }
    }


    public void searchTotal() {
        System.out.println(MESSAGE.SMALL_LINE.view());
        for (int i = 0; i < userNames.size(); i++) {
            System.out.println(i + 1 + MESSAGE.LIST_USER.view());
            System.out.print(MESSAGE.PRINT_NAME.view());
            System.out.println(userNames.get(i));
            System.out.print(MESSAGE.PRINT_PH.view());
            System.out.println(userPhonNumbers.get(i));
            System.out.print(MESSAGE.PRINT_BIRTH.view());
            System.out.println(userBirths.get(i));
            System.out.println();
        }
    }

    public void delete(String name) {
        for (int i = 0; i < userNames.size(); i++) {
            if (!(userNames.contains(name))) {
                System.out.println();
                System.out.println("없는디");
                System.out.println(MESSAGE.SMALL_LINE.view());
                break;
            }

            if (userNames.get(i).equals(name)) {
                System.out.println(userNames.get(i) + "삭제할 이름");
                System.out.println(userPhonNumbers.get(i) + "삭제할 번호");
                System.out.println(userBirths.get(i) + "삭제할 생일");
                userNames.remove(i);
                userPhonNumbers.remove(i);
                userBirths.remove(i);
                System.out.println("삭제 완료");
                count--;
                break;
            }
        }
    }

}


