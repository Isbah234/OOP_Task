class Audio extends Media {
    private final int bitrate;
    private final String artist;

    public Audio(String title, double fileSize, double duration, int bitrate, String artist) {
        super(title, fileSize, duration);
        this.bitrate = bitrate;
        this.artist = artist;
    }

    public void display() {
        super.display();
        System.out.println("Bitrate: " + bitrate);
        System.out.println("Artist: " + artist);
    }

    public String toString() {
        return "Audio by " + artist;
    }
}