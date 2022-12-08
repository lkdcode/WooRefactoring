package First.onboarding;

public class AppProblem3 {

    public static void main(String[] args) {

        String word = "abc";

        try {
            int number = Integer.parseInt(word);
        } catch (NumberFormatException e) {
            System.out.println("[ERROR] 숫자만 입력해주세요.");
            throw new IllegalArgumentException();
        } catch (Exception e){
            System.out.println("나는 실행 안 됨");
            throw new IllegalArgumentException();
        }
        finally {
            System.out.println("무조건 실행");
        }

        System.out.println("ㅁㄴㅇ러ㅏㅣㅁㄴ어림ㄴ어라ㅣ");
        System.out.println("ㅁㄴㅇ러ㅏㅣㅁㄴ어림ㄴ어라ㅣ");
        System.out.println("ㅁㄴㅇ러ㅏㅣㅁㄴ어림ㄴ어라ㅣ");
        System.out.println("ㅁㄴㅇ러ㅏㅣㅁㄴ어림ㄴ어라ㅣ");
        System.out.println("ㅁㄴㅇ러ㅏㅣㅁㄴ어림ㄴ어라ㅣ");
        System.out.println("ㅁㄴㅇ러ㅏㅣㅁㄴ어림ㄴ어라ㅣ");
        System.out.println("ㅁㄴㅇ러ㅏㅣㅁㄴ어림ㄴ어라ㅣ");
        System.out.println("ㅁㄴㅇ러ㅏㅣㅁㄴ어림ㄴ어라ㅣ");

//        int number = 33;
//        int answer = 0;
//
//        String numbers = "";
//        for (int i = 1; i <= number; i++) {
//            numbers += String.valueOf(i);
//        }
//
//        for (int i = 0; i < numbers.length(); i++) {
//            if (numbers.charAt(i) == '3') {
//                answer++;
//            }
//            if (numbers.charAt(i) == '6') {
//                answer++;
//            }
//            if (numbers.charAt(i) == '9') {
//                answer++;
//            }
//        }

//        System.out.println(answer);


    }

}
