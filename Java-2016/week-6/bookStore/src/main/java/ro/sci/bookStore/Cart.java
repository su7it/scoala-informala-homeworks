package ro.sci.bookStore;

public class Cart {
	private String list;
	private float totalPrice;

	public Cart(String list, float totalPrice) {
		this.list = list;
		this.totalPrice = totalPrice;
	}

	public String getList() {
		return list;
	}

	public void setList(String list) {
		this.list = list;
	}

	public float getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(float totalPrice) {
		this.totalPrice = totalPrice;
	}

}
