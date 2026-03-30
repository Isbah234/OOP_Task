public class Media{
    private final String title;
    private final double fileSize;
    private final double duration;

    public Media(String title, double fileSize, double duration) {
        this.title = title;
        this.fileSize = fileSize;
        this.duration = duration;
    }

    public void pause() {
        System.out.println("Media paused");
    }

    public void stop() {
        System.out.println("Media stopped");
    }

    public void play() {
        System.out.println("Media playing");
    }
    public void display() {
        System.out.println("Title: " + title);
        System.out.println("File Size: " + fileSize);
        System.out.println("Duration: " + duration);
    }

    public String toString() {
        return "Media: " + title;
    }
}

