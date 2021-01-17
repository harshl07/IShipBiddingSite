package com.demo.bean;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Item {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO) 
	private int itemID;
	private String itemName;
	private float width;
	private float height;
	private float weight;
	private String image;
	
	@ManyToOne
	@JoinColumn(name="shippingLoadID")
	private ShippingLoad shippingLoad;

	public Item() {
		super();
	}

	public Item(int itemID, String itemName, float width, float height, float weight, String image,
			ShippingLoad shippingLoad) {
		super();
		this.itemID = itemID;
		this.itemName = itemName;
		this.width = width;
		this.height = height;
		this.weight = weight;
		this.image = image;
		this.shippingLoad = shippingLoad;
	}

	

	public int getItemID() {
		return itemID;
	}

	public void setItemID(int itemID) {
		this.itemID = itemID;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public float getWidth() {
		return width;
	}

	public void setWidth(float width) {
		this.width = width;
	}

	public float getHeight() {
		return height;
	}

	public void setHeight(float height) {
		this.height = height;
	}

	public float getWeight() {
		return weight;
	}

	public void setWeight(float weight) {
		this.weight = weight;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public ShippingLoad getShippingLoad() {
		return shippingLoad;
	}

	public void setShippingLoad(ShippingLoad shippingLoad) {
		this.shippingLoad = shippingLoad;
	}

	@Override
	public String toString() {
		return "Item [itemID=" + itemID + ", itemName=" + itemName + ", width=" + width + ", height=" + height
				+ ", weight=" + weight + ", image=" + image + ", shippingLoad=" + shippingLoad + "]";
	}
	
	
}
