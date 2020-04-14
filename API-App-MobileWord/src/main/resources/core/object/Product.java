package core.object;

import java.io.Serializable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Product implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + ", image=" + image + ", description="
				+ description + ", categoryid=" + categoryid + ", slmax=" + slmax + "]";
	}

	@SerializedName("id")
	@Expose
	private int id;
	@SerializedName("name")
	@Expose
	private String name;
	@SerializedName("price")
	@Expose
	private Integer price;
	@SerializedName("image")
	@Expose
	private String image;
	@SerializedName("description")
	@Expose
	private String description;
	@SerializedName("categoryid")
	@Expose
	private int categoryid;
	@SerializedName("slmax")
	@Expose
	private int slmax;

	public Product(int id, String name, Integer price, String image, String description, int categoryid) {
		this.id = id;
		this.name = name;
		this.price = price;
		this.image = image;
		this.description = description;
		this.categoryid = categoryid;
	}

	private boolean isSmartphone() {
		return categoryid == 1;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getCategoryid() {
		return categoryid;
	}

	public void setCategoryid(int categoryid) {
		this.categoryid = categoryid;
	}
}
