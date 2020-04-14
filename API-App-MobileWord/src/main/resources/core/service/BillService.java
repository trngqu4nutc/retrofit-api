package core.service;

import java.util.List;

import core.object.Order;
import retrofit2.Call;
import retrofit2.http.GET;

public interface BillService {
	public static final String URL_BILL = "api/user/purchase/";
	
	/**
	 * Giử cho khách hàng tất cả thông tin về các sản phầm đã đặt hàng trước đó
	 * 
	 * @Status
	 * Đơn hàng đã nhận
	 * Đơn hàng đang vận chuyển
	 * 
	 * @return
	 */
	@GET(URL_BILL)
	Call<List<Order>> loadBill();
	
	
}
