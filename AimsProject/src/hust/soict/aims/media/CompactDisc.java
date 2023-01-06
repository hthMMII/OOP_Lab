package hust.soict.aims.media;

import java.util.ArrayList;
import java.util.List;
import hust.soict.aims.exception.*;

public class CompactDisc extends Disc implements Playable {

	private String artist;
	private List<Track> tracks = new ArrayList<Track>();

	public CompactDisc() {

	}

	public CompactDisc(int id, String title, String category, double cost, String director, String artist) {
		super(id, title, category, cost, director);
		this.artist = artist;
	}

	public void setArtist(String artist) {
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
	public void play() throws PlayerException {
		if (this.getLength() > 0) {
			java.util.Iterator<Track> iter = tracks.iterator();
			Track nextTrack;
			while (iter.hasNext()) {
				nextTrack = (Track) iter.next();
				try {
					nextTrack.play();
				} catch (PlayerException e) {
					throw e;
				}
			}
		} else {
			throw new PlayerException("ERROR: CD length is non-positive!");
		}
	}
}
