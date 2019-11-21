import java.util.Arrays;

public class ArrayDocumentStore implements DocumentStore{

    final Header sharedHeader = new Header("National University of Radioelectronics");
    final Footer sharedFooter = new Footer("(c) 2019");
    final String [] titles;

    public ArrayDocumentStore(String[] titles) {
        this.titles = titles;
    }

    public ArrayDocumentStore() {
        this(new String[] {
                "First document",
                "Second document"
        });
    }

    @Override
    public Iterable<String> getAllTitles() {
        return Arrays.asList(titles);
    }

    @Override
    public PrintableDocument getDocument(String title) {
        return new Report(sharedHeader, new Body(title), sharedFooter, title);
    }
}
