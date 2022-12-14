package hust.soict.aims;

import java.util.Scanner;

import hust.soict.aims.cart.Cart;
import hust.soict.aims.exception.PlayerException;
import hust.soict.aims.media.Book;
import hust.soict.aims.media.CompactDisc;
import hust.soict.aims.media.DigitalVideoDisc;
import hust.soict.aims.media.Media;
import hust.soict.aims.media.Track;
import hust.soict.aims.store.Store;

public class Aims {
	private static Cart cart = new Cart();
	private static Store store = new Store();
	public static Scanner scanner = new Scanner(System.in);

	public static int showMenu() {
		System.out.println("AIMS: ");
		System.out.println("--------------------------------");
		System.out.println("1. View store");
		System.out.println("2. Update store");
		System.out.println("3. See current cart");
		System.out.println("0. Exit");
		System.out.println("--------------------------------");
		System.out.println("Please choose a number: 0-1-2-3");
		return scanner.nextInt();
	}

	public static void storeMenu() {
		System.out.println("Options: ");
		System.out.println("--------------------------------");
		System.out.println("1. See a media’s details");
		System.out.println("2. Add a media to cart");
		System.out.println("3. Play a media");
		System.out.println("4. See current cart");
		System.out.println("0. Back");
		System.out.println("--------------------------------");
		System.out.println("Please choose a number: 0-1-2-3-4");
	}

	public static void mediaDetailsMenu() {
		System.out.println("Options: ");
		System.out.println("--------------------------------");
		System.out.println("1. Add to cart");
		System.out.println("2. Play");
		System.out.println("0. Back");
		System.out.println("--------------------------------");
		System.out.println("Please choose a number: 0-1-2");
	}

	public static void cartMenu() {
		System.out.println("Options: ");
		System.out.println("--------------------------------");
		System.out.println("1. Filter medias in cart");
		System.out.println("2. Sort medias in cart");
		System.out.println("3. Remove media from cart");
		System.out.println("4. Play a media");
		System.out.println("5. Place order");
		System.out.println("0. Back");
		System.out.println("--------------------------------");
		System.out.println("Please choose a number: 0-1-2-3-4-5");
	}

	public static void main(String[] args) {

		scanner.close();
	}

	public static void selectInMenu() {
		int choice = 1;

		do {
			Aims.showMenu();
			choice = scanner.nextInt();

			switch (choice) {
				case 0:
					System.exit(0);
				case 1: {
					store.showMedia();
					selectInStoreMenu();
					break;
				}
				case 2: {
					System.out.println("Enter 'a'(Add) or 'r'(Remove)");
					String select = scanner.nextLine();

					if (select.compareTo("r") == 0) {
						System.out.println("Enter title of media");
						String title = scanner.nextLine();
						Media x = store.searchByTitle(title);
						store.removeMedia(x);
					} else if (select.compareTo("a") == 0) {
						System.out.println("Id: ");
						int id = scanner.nextInt();
						System.out.println("Title: ");
						String title = scanner.nextLine();
						System.out.println("Category: ");
						String category = scanner.nextLine();
						System.out.println("Cost: ");
						float cost = scanner.nextFloat();
						System.out.println("Choose book-cd-dvd!");
						String secl = scanner.nextLine();
						if (secl.compareTo("book") == 0) {
							Book x = new Book(id, title, category, cost);
							// add author
							System.out.println("Enter authors and \"stop\" at the end!");
							String author;

							do {
								author = scanner.nextLine();
								if (author.compareTo("stop") == 0)
									continue;
								x.addAuthor(author);
							} while (author.compareTo("stop") != 0);
							store.addMedia(x);
						} else if (secl.compareTo("cd") == 0) {
							System.out.println("Name of artist?");
							String artist = scanner.nextLine();
							System.out.println("Director?");
							System.out.println("Length?");
							CompactDisc x = new CompactDisc();
							x.setArtist(artist);
							// add track
							System.out.println("Enter track information and \"stop\" at the end!");
							String choose;
							do {
								choose = scanner.nextLine();
								if (choose.compareTo("stop") == 0)
									continue;
								Track intrack = new Track();
								System.out.println("Information of track.\n Title: ");
								intrack.setTitle(scanner.nextLine());
								System.out.println("Length of track: ");
								intrack.setLength(scanner.nextInt());
								x.addTrack(intrack);
							} while (choose.compareTo("stop") != 0);

							store.addMedia(x);

						} else if (secl.compareTo("dvd") == 0) {
							System.out.println("Director?");
							String director = scanner.nextLine();
							System.out.println("Length?");
							int length = scanner.nextInt();
							DigitalVideoDisc x = new DigitalVideoDisc(id, title, category, cost, director, length);
							store.addMedia(x);

						}
					}
					break;

				}
				case 3: {
					cart.displayCart();
					selectInCartMenu();
					break;
				}
				default:
					System.out.println("Invalid Choice!");
			}
		} while (choice != 0);
	}

	public static void selectInStoreMenu() {
		int choice = 1;

		do {
			Aims.storeMenu();
			choice = scanner.nextInt();
			switch (choice) {
				case 0:
					selectInMenu();
					break;
				case 1: {
					System.out.println("Enter title: ");
					String title = scanner.nextLine();
					Media x = store.searchByTitle(title);
					if (x != null) {
						System.out.println(x.toString());
						selectInMediaDetailsMenu(x);
					} else
						System.out.println("not found!");

					break;
				}
				case 2: {
					System.out.println("Title of media:");
					String title = scanner.nextLine();
					Media x = store.searchByTitle(title);
					cart.addMedia(x);
					break;
				}
				case 3: {
					System.out.println("Title of media:");
					break;
				}
				default:
					System.out.println("Invalid Choice");
			}
		} while (choice != 0);
	}

	/**
	 * @param x
	 */
	public static void selectInMediaDetailsMenu(Media x) {
		int choice = 1;
		do {
			Aims.mediaDetailsMenu();
			choice = scanner.nextInt();
			switch (choice) {
				case 0:
					Aims.selectInStoreMenu();
					break;
				case 1:
					if (cart.addMedia(x) == true) {
						System.out.println("total in cart: " + cart.totalCost() + " $");
						selectInMediaDetailsMenu(x);
					} else {
						System.out.println("Cart full!");
						selectInMediaDetailsMenu(x);
					}
					break;
				case 2:
					if (x instanceof DigitalVideoDisc) {
						DigitalVideoDisc x_dvd = (DigitalVideoDisc) x;
						try {
							x_dvd.play();
						} catch (Exception e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					} else if (x instanceof CompactDisc) {
						CompactDisc x_cd = (CompactDisc) x;
						try {
							x_cd.play();
						} catch (PlayerException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					} else
						System.out.println("Book cannot play! Try again!");
					selectInStoreMenu();
					break;
				default:
					System.out.println("Invalid Choice!");
					selectInMediaDetailsMenu(x);
					break;
			}
		} while (choice != 0);
	}

	public static void selectInCartMenu() {
		int select = 1;
		do {
			Aims.cartMenu();
			select = scanner.nextInt();
			switch (select) {
				case 0:

			}
		} while (select != 0);
	}
}