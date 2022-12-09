package hust.soict.dsai.aims.media;

import java.util.ArrayList;
import java.util.List;

public class CompactDisc extends Disc implements Playable{

	private String artist;
	private List<Track> tracks = new ArrayList<Track>();
	public CompactDisc() {
		
	}
	public CompactDisc(int id, String title, String category, double cost, String director, String artist) {
	        super(id, title, category, cost, director);
	        this.artist = artist;
	}
	
	public String getArtist() {
		return artist;
	}
	public boolean addTrack(Track track) {
        if (tracks.contains(track)) {
            System.out.println("Track already exists in CD!");
            return false;
        }
        tracks.add(track);
        return true;
    }
	 
	public boolean removeTrack(Track track) {
	        if (!tracks.contains(track)) {
	            System.out.println("Track doesn't exist in CD!");
	            return false;
	        }
	        tracks.remove(track);
	        return true;
	    }
	public int getLength() {
        int length = 0;
        for (Track track : tracks)
            length += track.getLength();
        return length;
    }	
	@Override
	public void play() {
			System.out.println("Playing CD: " + this.getTitle());
			System.out.println("CD length: " + this.getLength());	
			for (Track track : tracks)
	            track.play();
	}
}
