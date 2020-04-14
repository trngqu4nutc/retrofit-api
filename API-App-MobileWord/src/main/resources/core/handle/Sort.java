package core.handle;

import java.util.List;

import core.object.Product;

public class Sort {

	public void byName(List<Product> list, boolean increase) {
		if (increase) {
			list.sort((u, v) -> cmpChar(u.getName().charAt(0), v.getName().charAt(0)));
		} else {
			list.sort((u, v) -> cmpChar(v.getName().charAt(0), u.getName().charAt(0)));
		}
	}

	public static int cmpChar(char ch1, char ch2) {
		return (int) ch1 - (int) ch2;
	}

	public static void main(String[] args) {
		System.out.println(cmpChar('A', 'a'));
	}
	
	public void byPrice(List<Product> list, boolean increase)
	{
		if (increase) {
			list.sort((u, v) -> cmpChar(u.getName().charAt(0), v.getName().charAt(0)));
		} else {
			list.sort((u, v) -> cmpChar(v.getName().charAt(0), u.getName().charAt(0)));
		}
	}

}
