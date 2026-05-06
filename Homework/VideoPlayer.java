public class VideoPlayer implements Playable {

    // this plays video.
    @Override
    public void play() {
        System.out.println("Playing video...");
    }

    // this pauses video.
    @Override
    public void pause() {
        System.out.println("Pausing video...");
    }

    // this stops video.
    @Override
    public void stop() {
        System.out.println("Stopping video.");
    }
}