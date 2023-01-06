package hust.soict.test.store;

import hust.soict.aims.media.DigitalVideoDisc;
import hust.soict.aims.store.Store;

public class StoreTest {

	public static void main(String[] args) {
		// create a store
		Store store1 = new Store();

		// Create new dvd objects and add them to the store
		DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
		store1.addDVD(dvd1);

		DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star War", "Science Fiction", "George Lucas", 87, 24.95f);
		store1.addDVD(dvd2);

		DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin", "Animation", 18.99f);
		store1.addDVD(dvd3);

		store1.removeDVD(dvd1);

	}

}