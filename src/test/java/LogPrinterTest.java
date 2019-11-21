import static org.junit.jupiter.api.Assertions.*;

class LogPrinterTest {

    Printer printer = new LogPrinter();

    @org.junit.jupiter.api.Test
    void printTest() {
        PrintableDocument doc = new PrintableDocument() {
            public String title() {
                return "TestTitle";
            }

            public String content() {
                return "Test\nContent";
            }
        };
        printer.print(doc);
    }
}