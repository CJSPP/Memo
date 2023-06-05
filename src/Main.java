import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("1. 입력");
        System.out.println("2. 목록 보기");
        System.out.println("3. 수정");
        System.out.println("4. 삭제");
        System.out.println("5. 종료");

        int num = sc.nextInt();
        switch (num) {
            case 1 : {
                System.out.println("");
            }
            case 2 : {
                System.out.println("");
            }
            case 3 : {
                System.out.println("");
            }
            case 4 : {
                deleteMemo();
                break;
            }
            case 5 : {
                System.out.println("");
            }
        }
    }

    private static void deleteMemo() {
        Scanner sc  = new Scanner(System.in);
        System.out.println("삭제할 글 번호를 입력해주세요.");
        System.out.print("\n여기에 글 번호를 입력해주세요 => ");
        int deleteNumber = sc.nextInt();
        boolean exist = false;
        for (int i = 0; i < MemoList.memolist.size(); i++) {
            if (MemoList.memolist.get(i).getNumber() == deleteNumber) { //삭제할 글이 존재하는 경우
                exist = true;
                System.out.println("해당 글의 비밀번호를 입력하시면 바로 메모가 삭제됩니다.");
                System.out.print("해당 글의 비밀번호를 입력해주세요. =>");
                String pwd = sc.nextLine();
                if(pwd.equals(MemoList.memolist.get(i).getPassword())) {
                    MemoList.memolist.remove(i);
                    break;
                }
            }
        }
        if(!exist) {
            System.out.println("삭제할 글이 존재하지 않습니다.");
        }
    }

}