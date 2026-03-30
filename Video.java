class Video extends Media {
    private final int frameRate;
    private final int resolution;

    public Video(String title, double fileSize, double duration, int frameRate, int resolution) {
        super(title, fileSize, duration);
        this.frameRate = frameRate;
        this.resolution = resolution;
    }

    public void display() {
        super.display();
        System.out.println("Frame Rate: " + frameRate);
        System.out.println("Resolution: " + resolution);
    }
}
