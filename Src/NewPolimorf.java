public class NewPolimorf {
    public static void main(String[] args) {

        MusicStyles popBand = new PopMusic();
        MusicStyles rockBand = new RockMusic();
        MusicStyles classicBand = new ClassicMusic();

        MusicStyles[] musicBands = {popBand, rockBand, classicBand};
        for (MusicStyles band:musicBands) {
            band.playMusic();
        }
    }
}
