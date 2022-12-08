package First.onboarding.problemOne;

public class CalNumber {

    public int addNumber(int number) {

        String page = String.valueOf(number);
        String[] array = page.split("");

        int addNumber = 0;
        for (int i = 0; i < array.length; i++) {
            addNumber += Integer.parseInt(String.valueOf(page.charAt(i)));
        }

        return addNumber;

    }

    public int multipleNumber(int number) {
        String page = String.valueOf(number);
        int multipleNumber = 1;
        for (int i = 0; i < page.length(); i++) {
            multipleNumber *= Integer.parseInt(String.valueOf(page.charAt(i)));
        }
        return multipleNumber;
    }

}
