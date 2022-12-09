package hust.soict.dsai.aims.store;

import java.util.ArrayList;
import hust.soict.dsai.aims.media.DigitalVideoDisc;
import hust.soict.dsai.aims.media.Media;

public class Store {
	private ArrayList<Media> itemsInStore = new ArrayList<Media>();

	public Store() {
		super();
	}

	 public boolean addMedia(Media media) {
	        if (itemsInStore.contains(media))
	            return false;
	        itemsInStore.add(media);
	        return true;
	    }

	   public boolean removeMedia(Media media) {
	        if (!itemsInStore.contains(media)) {
	            System.out.println("The media is not in the store. Can't remove!");
	            return false;
	        }
	        itemsInStore.remove(media);
	        return true;
	    }
}