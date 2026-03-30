class LiveStream extends Video {
    private final boolean isLive;
    private final String streamerName;

    public LiveStream(String title, double fileSize, double duration, int frameRate, int resolution, boolean isLive, String streamerName) {
        super(title, fileSize, duration, frameRate, resolution);
        this.isLive = isLive;
        this.streamerName = streamerName;
    }

    public void display() {
        super.display();
        System.out.println("Is Live: " + isLive);
        System.out.println("Streamer: " + streamerName);
    }
}