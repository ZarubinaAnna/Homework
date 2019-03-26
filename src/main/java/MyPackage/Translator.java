package MyPackage;

public abstract class Translator {



    private String language;

    public Translator() {
    }

    public Translator(String language) {

        this.language = language;
    }

    public String getLanguage() {
        return "Я переводчик с " + language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public abstract void saySmth();

    public abstract void translate();
}






