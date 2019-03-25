package MyPackage;

public class TranslateInheritance {
    public static void main(String[] args) {
        EnglishTranslator englishTranslator = new EnglishTranslator("Я переводчик с английского");
        System.out.println(englishTranslator.getPhrase());
    }

}
