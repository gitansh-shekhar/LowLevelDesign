package AdapterDesignPattern;

public class Main {
    public static void main(String[] args) {
        String music = "Tum mere ho mere rehna.";

        LegacyVLCplayer legacyVLCplayer = new LegacyVLCplayer();
        IMediaPlayer mediaPlayer = new VlcToMp4Adaptar(legacyVLCplayer);
        mediaPlayer.playMP4(music);

    }
}
