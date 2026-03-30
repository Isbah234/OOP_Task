public class Demo {
    public static void main(String[] args) {
        Media m = new Media("File1", 50.5, 3.2);
        Audio a = new Audio("Song1", 5.0, 2.5, 320, "Artist1");
        Podcast p = new Podcast("Podcast1", 10.0, 30.0, 128, "Artist2", "Host1", 5);
        Video v = new Video("Video1", 100.0, 10.0, 60, 1080);
        LiveStream l = new LiveStream("Stream1", 200.0, 60.0, 60, 1080, true, "Streamer1");

        m.display();
        System.out.println();

        a.display();
        System.out.println();

        p.display();
        System.out.println();

        v.display();
        System.out.println();

        l.display();
    }
}