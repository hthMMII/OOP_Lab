package hust.soict.aims.cart;

import java.util.ArrayList;
import hust.soict.aims.media.Media;

public class Cart {
	public static final int MAX_NUMBERS_ORDERED = 20;
	private ArrayList<Media> itemsOrdered = new ArrayList<Media>();
	
	public boolean addMedia(Media media) {
        if (itemsOrdered.size() >= MAX_NUMBERS_ORDERED) {
            return false;
        }
        itemsOrdered.add(media);
        return true;
    }
	public boolean removeMedia(Media media) {
	        if (!itemsOrdered.contains(media)) {
	            System.out.println("Not exist");
	            return false;
	        }
	        itemsOrdered.remove(media);
	        return true;
	    }
	public void displayCart() {
		if(itemsOrdered.size()!=0) {
			int i = 0;
			for(Media x: itemsOrdered) {
				System.out.printf("%d. ", ++i);
				x.printDetail();
			}
		}
		else {
			System.out.println("Cart is empty!");
		}
		
		System.out.println("Total cost: " + totalCost() + "\n\n");
	}
	public double totalCost() {
        double total = 0;
        for (Media media : itemsOrdered) {
            total += media.getCost();
        }
        return total;
    }

	public void print() {
		System.out.println("***********************CART***********************");

		for (int i = 0; i < itemsOrdered.size(); i++)
            System.out.println((i + 1) + ". " + itemsOrdered.get(i).toString());
        System.out.format("Total cost: %.2f$\n", totalCost());

		System.out.println("***************************************************");
	}

	


}