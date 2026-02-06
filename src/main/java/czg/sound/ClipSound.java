package czg.sound;

import czg.util.Sounds;

import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.DataLine;
import javax.sound.sampled.LineUnavailableException;
import java.io.IOException;

/**
 * {@link BaseSound}-Implementierung mithilfe von {@link Clip}
 */
public class ClipSound extends BaseSound {

    /**
     * Der als Backend verwendete {@code Clip}
     */
    private final Clip clip;

    /**
     * Pfad zur Audio-Datei. Wird von {@link #toString()} verwendet.
     */
    private final String audioFilePath;

    /**
     * Wiedergabezustand
     */
    private boolean isPlaying;

    /**
     * Lädt die angegebene Datei
     * @param audioPath Pfad zur Audio-Datei
     * @throws RuntimeException Wenn ein Fehler auftritt
     */
    public ClipSound(String audioPath) {
        try {
            clip = AudioSystem.getClip();
            clip.open(Sounds.getInputStream(audioFilePath = audioPath));
        } catch (IOException | LineUnavailableException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    protected DataLine getLine() {
        return clip;
    }

    @Override
    protected void setPlayingActual(boolean playing) {
        if(isPlaying()) {
            clip.start();
        } else {
            clip.stop();
        }
    }

    @Override
    protected boolean isPlayingActual() {
        return isPlaying;
    }

    @Override
    protected void seekActual(float position) {
        clip.setMicrosecondPosition((long) (clip.getMicrosecondLength() * position));
    }

    @Override
    public String toString() {
        return getClass().getTypeName()+"["+audioFilePath+"]";
    }
}
