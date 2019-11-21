import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {
    private static final Logger logger = LoggerFactory.getLogger(Main.class);
    public static void main(String[] args) {
        logger.info("Начинаем создавать отчет");
        Printer printer = new LogPrinter();
        DocumentStore documentStore = new ArrayDocumentStore(args);
        PrintingService printingService = new PrintingService(printer, documentStore);
        printingService.printReports();
    }
}
