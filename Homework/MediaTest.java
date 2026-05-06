public class MediaTest {
    public static void main(String[] args) {

        // creating array of playable objects.
        Playable[] players = new Playable[4];

        players[0] = new MusicPlayer();
        players[1] = new VideoPlayer();
        players[2] = new MusicPlayer();
        players[3] = new VideoPlayer();

        // using for-each loop to test all media players.
        for (Playable p : players) {

            System.out.println("---- Media Player ----");

            p.play();
            p.pause();
            p.stop();

            System.out.println();
        }
    }
}