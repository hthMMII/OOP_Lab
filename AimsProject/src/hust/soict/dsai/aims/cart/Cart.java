package hust.soict.dsai.aims.cart;

import hust.soict.dsai.aims.disc.DigitalVideoDisc;

public class Cart {
	public static final int MAX_NUMBERS_ORDERED = 20;
	private int qtyOrdered = 0;
	private DigitalVideoDisc itemsOrdered[] = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];

	public void addDigitalVideoDisc(DigitalVideoDisc disc) {
		if (qtyOrdered < MAX_NUMBERS_ORDERED) {
			itemsOrdered[qtyOrdered] = disc;
			qtyOrdered++;
			System.out.println("The disc has been added");
		} else {
			System.out.println("The cart is almost full");
		}
	}

	public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
		for (int i = 0; i < qtyOrdered; i++) {

			if (itemsOrdered[i] == disc) {

				for (int j = i; j < qtyOrdered; j++) {
					itemsOrdered[j] = itemsOrdered[j + 1];
				}
				i--;
				qtyOrdered--;
				System.out.println("The disc has been removed");
			}
		}
	}

	public float totalCost() {

		float totalCost = 0;
		for (int i = 0; i < qtyOrdered; i++) {
			totalCost += itemsOrdered[i].getCost();
		}
		return totalCost;
	}

	public void addDigitalVideoDisc(DigitalVideoDisc[] dvdList) {
		for (int i = 0; i < dvdList.length; ++i) {
			addDigitalVideoDisc(dvdList[i]);
		}
	}

	public void addDigitalVideoDisc(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2) {
		addDigitalVideoDisc(dvd1);
		addDigitalVideoDisc(dvd2);
	}

	public void print() {
		System.out.println("***********************CART***********************");

		if (qtyOrdered != 0) {
			for (int i = 0; i < qtyOrdered; ++i) {
				System.out.println((i + 1) + ". DVD " + itemsOrdered[i].toString());
			}
		} else {
			System.out.println("Cart is empty! Please add DVD to Cart!");
		}

		System.out.println("Total cost: " + totalCost());
		System.out.println("***************************************************");
	}

	public void search(String title) {
		int check = 0;
		for (int i = 0; i < qtyOrdered; ++i) {
			if (itemsOrdered[i].isMatch(title)) {
				check = 1;
				System.out.println(itemsOrdered[i].toString());
			}
		}

		if (check == 0) {
			System.out.println("DVD not found");
		}
	}

	public void search(int id) {
		int check = 0;
		for (int i = 0; i < qtyOrdered; ++i) {
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