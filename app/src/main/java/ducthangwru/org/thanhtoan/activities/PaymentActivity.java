package ducthangwru.org.thanhtoan.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.util.Random;

import butterknife.BindDimen;
import butterknife.BindView;
import butterknife.ButterKnife;
import ducthangwru.org.thanhtoan.R;
import ducthangwru.org.thanhtoan.SharedPref;
import ducthangwru.org.thanhtoan.database.DbContext;
import ducthangwru.org.thanhtoan.database.models.Food;
import ducthangwru.org.thanhtoan.database.models.Member;

public class PaymentActivity extends AppCompatActivity {
    @BindView(R.id.tv_name)
    TextView tvName;
    @BindView(R.id.tv_money_before)
    TextView tvMoneyBefore;
    @BindView(R.id.tv_money_payment)
    TextView tvMoneyPayment;
    @BindView(R.id.tv_money_after)
    TextView tvMoneyAfter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment);
        setupUI();
    }

    private void setupUI() {
        ButterKnife.bind(this);
    }

    @Override
    protected void onStart() {
        super.onStart();
        String id = SharedPref.instance.getIDMember();
        Member m = DbContext.instance.findMemberWithId(id);
        tvName.setText(m.getName());
        tvMoneyBefore.setText("Số dư: " + m.getMoney());
        //long money = Long.parseLong(m.getMoney()) - moneyRandom;
//        if(money < 0) {
//            tvMoneyPayment.setText("Không đủ để thanh toán");
//            tvMoneyAfter.setText("Số dư: " );
//        }
//        else
//            tvMoneyPayment.setText("Số tiền thanh toán: " + moneyRandom);


    }
}
