package com.patrikfo.screen;

import asciiPanel.AsciiPanel;

import java.awt.event.KeyEvent;

public class PlayScreen implements Screen {

    @Override
    public void displayOutput(AsciiPanel terminal) {
        terminal.write("You are having fun and all that.",1,1);
        terminal.writeCenter("-- press [Escape] to lose or [enter] to win.",22);
    }

    public Screen respondToUserInput(KeyEvent key) {
        switch (key.getKeyCode()){
            case KeyEvent.VK_ESCAPE: return  new LoseScreen();
            case KeyEvent.VK_ENTER: return new WinScreen();
        }
        return this;
    }
}
