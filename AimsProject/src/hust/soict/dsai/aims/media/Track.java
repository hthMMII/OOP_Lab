package hust.soict.dsai.aims.media;

public class Track implements Playable {
	private String title;
	private int length;

	public Track() {
		
	}

	public String getTitle() {
		return title;
	}

	public int getLength() {
		return length;
	}

	@Override
	public void play() {
			System.out.println("Playing track: " + this.getTitle());
			System.out.println("Track length: " + this.getLength());
	}
	public boolean equals(Object obj) {
        if (!(obj instanceof Track))
            return false;
        return this.title.equalsIgnoreCase(((Track) obj).title) && this.length == ((Track) obj).length;
    }
}
