package com.corejava.sound;

import javax.sound.midi.*;

public class MiniMiniMusicCmdLine {
    public static void main(String[] args) {
        MiniMiniMusicCmdLine mini = new MiniMiniMusicCmdLine();
        if (args.length < 2) {
            System.out.println("Don't forget the instrument and note args");
        } else {
            int instrument = Integer.parseInt(args[0]);
            int note = Integer.parseInt(args[1]);
            mini.play(instrument, note);
        }
    }


    public void play(int instrument, int note) {
        try {
            Sequencer player = MidiSystem.getSequencer();
            player.open();
            Sequencer seq = (Sequencer) new Sequence(Sequence.PPQ, 4);
            Track track = seq.getSequence().createTrack();

            MidiEvent event = null;

            ShortMessage first = new ShortMessage();
            first.setMessage(192, 1, instrument, 0);
            MidiEvent changeInstrument = new MidiEvent(first, 1);
            track.add(changeInstrument);

            ShortMessage a = new ShortMessage();
            a.setMessage(144, 1, note, 100);
            MidiEvent noteOh = new MidiEvent(a, 1);
            track.add(noteOh);

            ShortMessage b = new ShortMessage();
            b.setMessage(128, 1, note, 100);
            MidiEvent noteOff = new MidiEvent(b, 16);
            track.add(noteOff);
            player.setSequence((Sequence) seq);
            player.start();

            Thread.sleep(5000);
            player.close();
            System.exit(0);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
