package core.service;

import core.object.Product;
import core.object.ProductInfo;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface ProductDetailService {
	
	public static final String URL_PRODUCT_INFO = "api/catalog/{id}";
	
	public static final String URL_TECHNICAL_INFO = "api/catalog/technical/{id}";

	
	/**
	 * Giử đi: id của sản phẩm
	 * Nhận về: Thông tin về sản phẩm
	 */
	@GET(URL_PRODUCT_INFO)
	Call<Product> getProductDetail(@Path(value = "id") int id);
	
	
	/**
	 * Giử đi: Mã ID của sản phẩm yêu cầu
	 * Nhận về: Một đối tượng ProductInfo chứa thông tin kỹ thuật của sản phẩm
	 * object: ProductInfo
	 */
	@GET(URL_TECHNICAL_INFO)
	Call<ProductInfo> getTechnicalData(@Path("id") int id);
	
}
