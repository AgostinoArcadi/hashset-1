import java.util.HashSet;

public class Main {
    public static void main(String[] args) {

        for(Object word : setWords()){
            System.out.println(word);
        }

        System.out.println(setWords().size());
    }

    public static HashSet setWords() {
        HashSet<String> words = new HashSet<>();
        words.add("ciao");
        words.add("come");
        words.add("stai");

        return words;
    }
}