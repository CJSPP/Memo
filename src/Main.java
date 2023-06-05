import java.util.Scanner;
import java.util.List;

public class Main {

    static MemoList memolist = new MemoList();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
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
                    printMemolist();
                    break;
                case 3:
                    //수정 메서드를 만들어서 호출하면 될거 같습니다.
                    break;
                case 4:
                    deleteMemo();
                    break;
            }
        }
    }

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

    private static void printMemolist() {
        System.out.println("[\u001B[34m MemoList \u001B[0m]");
        List<Memo> list = memolist.getMemolist();
        list.forEach((Memo m) -> {
            System.out.println((memolist.getMemolist().indexOf(m)+1) + ". " + m.getName() + "\t" + m.getDate());
        });
        System.out.println("\n");
    }


    private static void deleteMemo() { // 삭제 기능
        Scanner sc = new Scanner(System.in);
        System.out.println("삭제할 글 번호를 입력해주세요.");
        System.out.print("\n여기에 글 번호를 입력해주세요 => ");
        int deleteNumber = sc.nextInt();
        boolean exist = false;
        for (int i = 0; i < memolist.memolist.size(); i++) {
            if ( i+1 == deleteNumber ) { //삭제할 글의 번호와 deleteNumber이 일치하는 글
                exist = true;
                System.out.println("해당 글의 비밀번호를 입력하시면 바로 메모가 삭제됩니다.");
                System.out.print("해당 글의 비밀번호를 입력해주세요. => ");
                String pwd = sc.next();
                if (pwd.equals(memolist.getMemolist().get(i).getPassword())) {
                    memolist.getMemolist().remove(i);
                    System.out.println("해당 메모를 삭제했습니다.");
                    break;
                }
            }
        }
        if (!exist) {
            System.out.println("삭제할 글이 존재하지 않습니다.");
        }
    }

}