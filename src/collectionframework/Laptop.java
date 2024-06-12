package collectionframework;

import java.util.Comparator;

// implementation of this program is in ArrayList_Comparator program
public class Laptop {
	String brand,model;
	int price,rating;
	Laptop(String brand,String model,int price, int rating){
		this.brand=brand;
		this.model=model;
		this.price=price;
		this.rating=rating;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	@Override
	public String toString() {
		return "Laptop [brand=" + brand + ", model=" + model + ", price=" + price + ", rating=" + rating + "]";
	}
	public int compareTo(Laptop l) {
		return this.price - l.price;
	}
}

class RatingComparator implements Comparator<Laptop>{

	@Override
	public int compare(Laptop o1, Laptop o2) {
		// TODO Auto-generated method stub
		return (o1.rating<o2.rating)? -1 : (o1.rating>o2.rating)? 1: 0;
	}
}
