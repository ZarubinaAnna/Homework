package MyPackage;

public abstract class Translator {

    private String phrase;

    public Translator() {
    }

    public Translator(String phrase) {

        this.phrase = phrase;
    }

    public String getPhrase() {
        return phrase;
    }

    public void setPhrase(String phrase) {
        this.phrase = phrase;
    }

    public abstract void saySmth();

    public abstract void translate();
}






