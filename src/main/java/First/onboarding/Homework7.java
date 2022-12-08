package First.onboarding;

import java.util.Scanner;

class PhoneInfo3 {
    // 필드
    private String name; // 이름
    private String ph; // 번호
    private String birth; // 생일
    int count = 1; // 클래스 변수
    int number = 0;
    Scanner sc = new Scanner(System.in); // 입력
    PhoneInfo3[] st = new PhoneInfo3[100]; // 저장갯수
    // constructor
    public PhoneInfo3(String name, String ph, String birth) {
//        super();
        this.name = name;
        this.ph = ph;
        this.birth = birth;
    }

    public void Save() { // 저장
        System.out.print("이름 : ");
        String name1 = sc.nextLine();
        System.out.print("번호 : ");
        String ph1 = sc.nextLine();
        System.out.print("생일 : ");
        String birth1 = sc.nextLine();

        st[number] = new PhoneInfo3(name1, ph1, birth1);
        st[number].name = name1;
        st[number].ph = ph1;
        st[number].birth = birth1;
        count++;
        number++;
    }

    public void FindInfo() { // 조회
        System.out.println("====입력된 정보 출력====");
        System.out.println("=====================");
        try {
            for (int i = 0; i < count; i++) {
                System.out.println("이름 : " + st[i].name);
                System.out.println("번호 : " + st[i].ph);
                System.out.println("생일 : " + st[i].birth);
                System.out.println();
            }
        } catch (NullPointerException e) {
        }
    }

    public void SeachInfo() { // 검색
        System.out.println("이름 : ");
        String seachName = sc.nextLine();

        for (int i = 0; i <= count; i++) {
            if (seachName.equals(st[i].name)) {
                System.out.println("이름 : " + st[i].name);
                System.out.println("번호 : " + st[i].ph);
                System.out.println("생일 : " + st[i].birth);
                break;
            }
        }
    }
}

public class Homework7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PhoneInfo3 p = new PhoneInfo3(null, null, null);

        int restart = 1; // while문 반복

        while (restart == 1) {
            System.out.println("선택하세요...");
            System.out.println("1. 전화번호부 정보 입력");
            System.out.println("2. 전화번호부 정보 조회");
            System.out.println("3. 이름으로 검색");
            System.out.println("4. 데이터 삭제");
            System.out.println("5. 프로그램 종료");
            int select = sc.nextInt(); // switch문 선택
            System.out.println();

            switch (select) {

                case 1: // 저장
                    p.Save();
                    break;

                case 2: // 조회
                    p.FindInfo();
                    break;

                case 3: // 이름으로 검색
                    p.SeachInfo();
                    break;

                case 4: // 삭제
                    break;

                case 5: // 종료
                    System.out.println("종료");
                    restart = 0; // while 반복종료
                    break;

                default:
                    System.out.println("다시 선택하세요.");
                    break;
            }

        }
    }
}
