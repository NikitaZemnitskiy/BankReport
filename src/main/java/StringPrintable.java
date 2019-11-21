import java.util.logging.Logger;

public abstract class StringPrintable implements Printable {
    final String content;

    @Override
    public String content() {
        return content;
    }


    public StringPrintable(String content){
        this.content = content;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + " {" + content + '}';
    }
}
