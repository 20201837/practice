package music;

import music.Note;

import static net.mindview.util.Print.print;


public class Instrument {
    void play(Note n) {
        print("Instrument.play()" + n);
    }

    String what() {
        return "Instrument";
    }

    void adjust() {
        print("Adjusting Instrument");
    }

    public String toString() {
        return what();
    }
}

