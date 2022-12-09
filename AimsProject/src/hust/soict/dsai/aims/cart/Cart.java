package hust.soict.dsai.aims.cart;

import java.util.ArrayList;
import java.util.Collections;

import hust.soict.dsai.aims.media.Media;

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

	public void search(String title) {
		int check = 0;
		for (int i = 0; i < itemsOrdered.size(); ++i) {
			if (itemsOrdered.get(i).toString().isMatch(title)) {
				check = 1;
				System.out.println(itemsOrdered.get(i).toString());
			}
		}

		if (check == 0) {
			System.out.println("DVD not found");
		}
	}

	public void search(int id) {
		int check = 0;
		for (int i = 0; i < itemsOrdered; ++i) {
			if (itemsOrdered[i].isMatch(id)) {
				check = 1;
				System.out.println(itemsOrdered[i].toString());
				break;
			}
		}

		if (check == 0) {
			System.out.println("DVD not found");
		}

	}
}