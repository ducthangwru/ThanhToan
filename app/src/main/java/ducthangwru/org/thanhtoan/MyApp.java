package ducthangwru.org.thanhtoan;

import android.app.Application;
/**
 * Created by DUC THANG on 5/11/2017.
 */

public class MyApp extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        SharedPref.setInstance(getApplicationContext());
    }
}
