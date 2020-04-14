package core.handle;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

import core.object.Order;

public class APIhandler {

	/**
	 * Tính tổng số tiền có trong danh sách sản phẩm
	 * @param list
	 * @return
	 */
	public static Long getTotalMoney(List<Order> list) {
		LongStream stream = list.stream().mapToLong(Order::getTotalMoney);
		return stream.sum();
	}
	
	/**
	 * Tính tổng số lượng hàng hóa
	 * @param list
	 * @return
	 */
	public static int getTotalAmount(List<Order> list) {
		IntStream stream = list.stream().mapToInt(Order::getAmount);
		return stream.sum();
	}
	
	
	/**
	 * Lấy tổng số sản phầm được chọn
	 * @param list
	 * @return
	 */
	public static List<Order> getProductSeleted(List<Order> list){
		List<Order> newList = new ArrayList<Order>(100);
		list.stream().filter(Order::isSelect).forEach(newList::add);
		return newList;
	}
	
	
	/**
	 * Lấy tổng giá tiền của những sản phẩm được chọn
	 * @param list
	 * @return
	 */
	public static long getTotalMoneySelected(List<Order> list) {
		Stream<Order> stream = list.stream().filter(Order::isSelect);
		return stream.mapToLong(Order::getTotalMoney).sum();
	}
	
	

}
