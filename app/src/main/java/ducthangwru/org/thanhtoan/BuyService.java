package ducthangwru.org.thanhtoan;

import ducthangwru.org.thanhtoan.database.models.Food;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

/**
 * Created by DUC THANG on 5/11/2017.
 */

public interface BuyService {
    @POST("item")
    Call<Void> postBuy(@Body Food food);
}
