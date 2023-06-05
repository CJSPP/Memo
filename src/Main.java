import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        memolist = new MemoList();
        
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
                case 1 :
                    //입력 메서드를 만들어서 호출하면 될거 같습니다.
                    break;
                case 2 :
                    printMemolist();
                    break;
                case 3 :
                    //수정 메서드를 만들어서 호출하면 될거 같습니다.
                    break;
                case 4 :
                    //삭제 메서드를 만들어서 호출하면 될거 같습니다.
                    break;
            }
        }
    }
    
    private static void printMemolist() {
        System.out.println("[\u001B[34m MemoList \u001B[0m]");
        List<Memo> list = memolist.getMemolist();
        list.forEach((Memo m) -> {
            System.out.println(m.getNumber + m.getName + m.getDate); 
        })
        System.out.println("\n");
    }
}