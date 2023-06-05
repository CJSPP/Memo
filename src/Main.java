import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("1. 입력");
            System.out.println("2. 목록 보기");
            System.out.println("3. 수정");
            System.out.println("4. 삭제");
            System.out.println("5. 종료");


            int num = sc.nextInt();
            if (num == 5)
                break;
            switch (num) {
                case 1:
                    //입력 메서드를 만들어서 호출하면 될거 같습니다.
                    memo_input();

                    break;
                case 2:
                    //목록보기 메서드를 만들어서 호출하면 될거 같습니다.
                    break;
                case 3:
                    //수정 메서드를 만들어서 호출하면 될거 같습니다.
                    break;
                case 4:
                    //삭제 메서드를 만들어서 호출하면 될거 같습니다.
                    break;
            }
        }
    }

    //입력 메서드
    private static void memo_input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("이름을 입력해주세요.");
        String name = sc.nextLine();

        System.out.println("비밀번호를 입력해주세요.");
        String password = sc.nextLine();

        System.out.println("메모를 입력해주세요.");
        String memo = sc.nextLine();

        Memo memoclass = new Memo(name, password, memo);
        MemoList.memolist.add(memoclass);
    }
}