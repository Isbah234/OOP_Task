class Podcast extends Audio {
    private final String hostName;
    private final int episodeNumber;

    public Podcast(String title, double fileSize, double duration, int bitrate, String artist, String hostName, int episodeNumber) {
        super(title, fileSize, duration, bitrate, artist);
        this.hostName = hostName;
        this.episodeNumber = episodeNumber;
    }

    public void display() {
        super.display();
        System.out.println("Host: " + hostName);
        System.out.println("Episode: " + episodeNumber);
    }

    public String toString() {
        return "Podcast hosted by " + hostName;
    }
}