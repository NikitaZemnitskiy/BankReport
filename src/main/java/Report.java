import java.util.Optional;

public class Report implements PrintableDocument {

    final Printable header, body, footer;
    final String title;

    public Report(Printable header, Printable body, Printable footer, String title) {
        assert header != null : "header is mandatory";
        assert body != null : "body is mandatory";
        assert footer != null : "footer is mandatory";
        this.header = header;
        this.body = body;
        this.footer = footer;
        this.title = title;
    }

    public String title() {
        return title;
    }

    public String content() {
        return '\n' +header.content() +'\n' + body.content()+'\n'  + footer.content();
    }
}
