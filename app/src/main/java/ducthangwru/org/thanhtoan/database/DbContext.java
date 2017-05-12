package ducthangwru.org.thanhtoan.database;

import java.util.Date;
import java.util.List;
import java.util.Vector;

import ducthangwru.org.thanhtoan.database.models.Food;
import ducthangwru.org.thanhtoan.database.models.Member;

/**
 * Created by DUC THANG on 5/11/2017.
 */

public class DbContext {
    public static final DbContext instance = new DbContext();
    private List<Member> members;
    private List<Food> foods;

    private Date date;
    private DbContext() {
        members = new Vector<>();
        foods = new Vector<>();
        addDumData();
    }

    public List<Food> getFoods() {
        return foods;
    }

    public void addDumData() {
        Member member1 = new Member("846AC9470C4002E0", "Hoàng Trần Hảo", "1000000");
        Member member2 = new Member("2570C9470C4002E0", "Trần Hán Hiếu", "500000");
        Member member3 = new Member("4D70C9470C4002E0", "Bùi Quang Minh", "10000");
        Member member4 = new Member("2D72C9470C4002E0", "Tạ Thanh Lan", "10000");
        members.add(member1);
        members.add(member2);
        members.add(member3);
        members.add(member4);

        foods.add(new Food("Kem", 20000));
        foods.add(new Food("Chuối", 15000));
        foods.add(new Food("Mít", 25000));
        foods.add(new Food("Bưởi", 30000));
    }

    public Member findMemberWithId(String id) {
        for (int i = 0; i < members.size(); i++) {
            if (members.get(i).getUID().equalsIgnoreCase(id)) {
                return members.get(i);
            }
        }
        return null;
    }

    public static DbContext getInstance() {
        return instance;
    }

    public List<Member> getMembers() {
        return members;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
