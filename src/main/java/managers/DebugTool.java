package managers;

import javax.inject.Named;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DebugTool {

    Logger logger = Logger.getLogger("debugtool");

    public void info(String info) {
        logger.log(Level.INFO, info);
    }

    public void warning(String warning) {
        Logger logger = Logger.getLogger("debugtool");
        logger.log(Level.WARNING, warning);
    }

}