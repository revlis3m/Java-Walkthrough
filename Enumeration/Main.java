package Enumeration;

public class Main {
    public enum Language{
        Java ("Language JAVA"),
        C ("Language C"),
        Cplus ("Language Cplus"),
        PHP ("Language PHP"),
        Csharp ("Language Csharp");

        private String name = "";

        Language(String name){
            this.name = name;
        }

        public String toString() {
            return name;
        }
    }

    public static void main(String[] args) {
        for (Language lang : Language.values()) {
            if (Language.C.equals(lang)) {
                System.out.println("I like " + lang.toString());
            }
            else{
                System.out.println(lang.toString());
            }
        }
    }
}
