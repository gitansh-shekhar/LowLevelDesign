package AdapterDesignPattern;

public class VlcToMp4Adaptar implements IMediaPlayer{
     LegacyVLCplayer legacyVLCplayer;

     VlcToMp4Adaptar(LegacyVLCplayer legacyVLCplayer){
         this.legacyVLCplayer = legacyVLCplayer;
     }

    @Override
    public void  playMP4(String music) {
       String LegacyMusic = legacyVLCplayer.vlcPlayStream(music);

       String mp4 = "Converted to mp4:"+ LegacyMusic;

        System.out.println(mp4);
    }
}
