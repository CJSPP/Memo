public class Memo {
    private int number;
    private String name;
    private String password;
    private String memo;
    private String date;

    Memo() {}

    Memo(int number, String name, String pwd, String memo, String date) {
        this.number = number;
        this.name = name;
        this.password = pwd;
        this.memo = memo;
        this.date = date;
    }
    
    public int getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public String getMemo() {
        return memo;
    }

    public String getDate() {
        return date;
    }
}
