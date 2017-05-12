package ducthangwru.org.thanhtoan.database.models;

/**
 * Created by DUC THANG on 5/11/2017.
 */

public class Member {
    private String UID;
    private String name;
    private String money;

    public String getMoney() {
        return money;
    }

    public String getUID() {
        return UID;
    }

    public String getName() {
        return name;
    }

    public Member(String UID, String name, String money) {
        this.UID = UID;
        this.name = name;
        this.money = money;
    }

    @Override
    public String toString() {
        return "Member{" +
                "UID='" + UID + '\'' +
                ", name='" + name + '\'' +
                ", money='" + money + '\'' +
                '}';
    }
}
