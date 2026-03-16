package czg.objects.music_loop_object;

import czg.sound.BaseSound;

/**
 * Ein Eintrag für {@link MusicLoopObject}
 * @param time Zeit in Millisekunden, zu welcher {@link #next} zu spielen beginnen soll
 * @param next Nächster Track
 * @see BaseSound#getPositionMicroseconds()
 */
public record SegmentChangeMarker(long time, BaseSound next) {}
