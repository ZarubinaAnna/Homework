package MyPackage;

public abstract class Translator {



    private String translate;

    public Translator() {
    }

    public Translator(String translate) {

        this.translate = translate;
    }

    public String getTranslate() {
        return "Я переводчик с " + translate;
    }

    public void setTranslate(String translate) {
        this.translate = translate;
    }

    public abstract void saySmth();

    public abstract void translate();
}






