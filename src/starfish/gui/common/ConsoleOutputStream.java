package starfish.gui.common;

import java.awt.*;

public interface ConsoleOutputStream {

    void printMessage(String msg);
    void printErrorMessage(String msg);
    void printMessage(String msg, Color color);

}
