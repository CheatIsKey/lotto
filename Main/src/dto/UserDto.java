package dto;

public class UserDto {
    private int id;
    private String name;
    private Long money;
    private String phone;

    protected UserDto(){};

    public UserDto(int id, String name, Long money, String phone) {
        this.id = id;
        this.name = name;
        this.money = money;
        this.phone = phone;
    }
}
