package hust.soict.dsai.test.disc;

import hust.soict.dsai.aims.disc.DigitalVideoDisc;

public class TestPassingParameter {
	public static void swap(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2) {
		String tmp = dvd1.getTitle();
		dvd1.setTitle(dvd2.getTitle());
		dvd2.setTitle(tmp);
	}

	public static void main(String[] args) {
		// create dvd1,dvd2
		DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
		DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star War", "Science Fiction", "George Lucas", 87, 24.95f);

		System.out.println("Before swap: ");
		System.out.println("Title of dvd1: " + dvd1.getTitle());
		System.out.println("Title of dvd2: " + dvd2.getTitle());

		swap(dvd1, dvd2);

		System.out.println("After swap: ");
		System.out.println("Title of dvd1: " + dvd1.getTitle());
		System.out.println("Title of dvd2: " + dvd2.getTitle());

	}

}
