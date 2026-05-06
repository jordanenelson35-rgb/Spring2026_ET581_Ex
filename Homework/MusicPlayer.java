public class MusicPlayer implements Playable {

    // this plays music.
    @Override
    public void play() {
        System.out.println("Playing music...");
    }

    // this pauses music.
    @Override
    public void pause() {
        System.out.println("Pausing music...");
    }

    // this stops music.
    @Override
    public void stop() {
        System.out.println("Stopping music.");
    }
}