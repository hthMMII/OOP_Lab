package hust.soict.aims.store;

import java.util.ArrayList;

import hust.soict.aims.media.Media;

public class Store {
	private ArrayList<Media> itemsInStore = new ArrayList<Media>();

	public Store() {
		super();
	}

	public void addMedia(Media media) {
		itemsInStore.add(media);
	}	
	public void removeMedia(Media media) {
		if(itemsInStore.contains(media)) {
			itemsInStore.remove(media);
		}
	}
	public Media searchByTitle(String title) {
		for(Media m: itemsInStore) {
			int check = m.getTitle().compareTo(title);
			if(check==0) return m;
		}
		return null;
	}
	public void showMedia() {
		for(Media x: itemsInStore) {
			x.printDetail();
		}
	}
}