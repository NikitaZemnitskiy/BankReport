public class PrintingService {

    final Printer printer;
    final DocumentStore documentStore;

    PrintingService(Printer printer, DocumentStore store) {
        this.printer = printer;
        this.documentStore = store;
    }

    void printReports() {
        for(String documentTitle : documentStore.getAllTitles()) {
            printer.print(documentStore.getDocument(documentTitle));
        }
    }

}
