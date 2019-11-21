import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LogPrinter implements Printer {
    private static final Logger logger = LoggerFactory.getLogger(LogPrinter.class);

    public void print(PrintableDocument document) {
        logger.info("Printing: {} to printer {}", document.title(), this);
        logger.info(document.content());
    }

    @Override
    public String toString() {
        return "LogPrinter";
    }

}
