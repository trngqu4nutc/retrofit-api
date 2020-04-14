package API.App.MobileWord;

import java.util.List;
import java.util.Map;

import core.object.Product;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;
import retrofit2.http.QueryMap;

public interface Service {
	@GET("api/catalog/seach?")
	Call<List<Product>> search(@QueryMap Map<String, String> params);
	
	
	@GET("api/catalog/suggest?")
	Call<List<String>> suggestion(@Query("keyword") String keyword);

}
