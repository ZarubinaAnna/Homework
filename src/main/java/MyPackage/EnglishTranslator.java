package MyPackage;

public class EnglishTranslator extends Translator{

  public EnglishTranslator(String language){
      super(language);

  }

    public EnglishTranslator() {
        super("английского");
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

