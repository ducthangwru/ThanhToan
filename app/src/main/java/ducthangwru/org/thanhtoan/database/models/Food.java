package ducthangwru.org.thanhtoan.database.models;

/**
 * Created by DUC THANG on 5/11/2017.
 */

public class Food {
    private String name;
    private double money;

    public Food(String name, double money) {
        this.name = name;
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    @Override
    public String toString() {
        return "Food{" +
                "name='" + name + '\'' +
                ", money=" + money +
                '}';
    }
}
