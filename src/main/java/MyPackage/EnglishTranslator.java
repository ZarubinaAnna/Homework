package MyPackage;

public class EnglishTranslator extends Translator{

  public EnglishTranslator(String phrase){
      super(phrase);

  }

    public EnglishTranslator() {
        super("Я переводчик с английского");
    }


    @Override
    public void saySmth() {
       System.out.println("Good morning");
    }

    @Override
    public void translate() {
        System.out.println("Доброе утро");

    }



    }

