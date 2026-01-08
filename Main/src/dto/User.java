package dto;

public class User {
    private int id;
    private String name;
    private String password;
    private Long money;
    private String phone;

    protected User(){};

    public User(int id, String name, String password, Long money, String phone) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.money = money;
        this.phone = phone;
    }

}
