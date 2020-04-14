package core.service;

import java.util.List;
import java.util.Map;

import core.object.ItemList;
import core.object.Product;
import retrofit2.Call;
import retrofit2.http.FieldMap;
import retrofit2.http.GET;
import retrofit2.http.Url;

public interface LoadProductService {
	
	public static final String URL_HOME_PAGE = "api/catalog/home/";
	
	public static final String URL_SMARTPHONE_PAGE = "api/catalog/mobile/";
	
	public static final String URL_LAPTOP_PAGE = "api/catalog/laptop/";
	/**
	 * @Body - Gửi các đối tượng Java dưới dạng thân yêu cầu.
	 * @Url - sử dụng URL động.
	 * 
	 * @Query () và tên tham số truy vấn, mô tả loại. Để URL mã hóa một truy vấn sử dụng mẫu:
	 * @Field- gửi dữ liệu dưới dạng urlencoding. Điều này đòi hỏi một
	 * @FormUrlEncodedchú thích kèm theo phương pháp. Các 
	 * @Fieldtham số chỉ hoạt
	 *                    động với một POST
	 */

	/**
	 *  Lấy về dữ liệu thông tin sản phẩm cho trang chủ
	 * @return
	 *title = ALL /SAN PHAM MOI NHAT
	 *offset = hs * sosp
	 *Limit
	@GET(URL_HOME_PAGE)
	Call<ItemList> loadHomePage(@QueryMap Map);

	/**
	 *  Lấy dữ liệu thông tin sản phầm cho trang View Smartphone
	 * @return
	 */
	@GET(URL_SMARTPHONE_PAGE)
	Call<List<ItemList>> loadSmartphonePage();

	/**
	 *  Lấy dữ liệu thông tin sản phầm cho trang View Laptop
	 * @return
	 */
	@GET(URL_LAPTOP_PAGE)
	Call<ItemList> loadLaptopPage();
	

	/**
	 *  Tải thêm sản phẩm khi được yêu cầu
	 *  Index: cung cấp vị trí đã tải trước đó
	 *  
	 *  Param: 
	 *  	title: nhãn sản phẩm cần tải
	 *  	page: trang sản phẩm
	 *  	index: thứ tự cần tải
	 * @param url
	 * @param index
	 * @return
	 */
	@GET
	Call<List<Product>> loadIndex(@Url String url, @FieldMap Map<String, String> params );

}
