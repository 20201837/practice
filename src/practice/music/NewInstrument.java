package music;
import music.Note;

class NewInstrument extends Instrument {
    void play(Note note) {
        System.out.println("newIns.play()" + note);
    }
}


