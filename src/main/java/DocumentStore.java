public interface DocumentStore {

    Iterable<String> getAllTitles();
    PrintableDocument getDocument(String title);
}
