import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;

public class SpellingBee {

    private static char[] letters;
    private static char mustUse;

    public SpellingBee(char[] letters, char mustUse) {
        this.letters = letters;
        this.mustUse = mustUse;
    }

    public static boolean checkWord(String word) {
        int count;
        if((word.length()<4)||(word.indexOf(mustUse)==-1)){
            return false;
        }
        for(int i = 0; i<word.length(); i++){
            count = 0;
            for(int x = 0; x< letters.length; x++){
                if(word.charAt(i)==letters[x]){
                    count++;
                }
            }
            if(count==0){
                return false;
            }
        }
        return true;
    }

    /**
     * Loads the contents of file "filename" as a String.
     * 
     * @param filename the file to load
     * @return the contents of file "filename"
     */
    public static String loadFile(String filename) {
        String contents = "";
        Path path = Paths.get(filename);
        try {
            path = Path.of(ClassLoader.getSystemResource(filename).toURI());
            contents = Files.readString(path);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }
        return contents;
    }

    /**
     * @param args
     */
    public static void main(String[] args) {
        String[] words = loadFile("words_dropped.txt").split("\n");
        System.out.println("Loaded " + words.length + " words");
        
        SpellingBee bee = new SpellingBee("ranglty".toCharArray(), 'y');
        for(String check: words){
            if(checkWord(check)){
                System.out.println(check);
            }
        }


        Arrays.sort(words);
        int n =0;
        for(String word: words){
            if(word.equals("search")){
                System.out.println("Found search at: "+n);
            }
            n++;
        }

        String findMe = "search";

        int begin = 0;
        int end = words.length -1;
        int guess = (begin + end)/2;
        int check = words[guess].compareTo(findMe);
        System.out.println("word is "+words[guess]);
        System.out.println("check is "+check);

        while(check != 0) {
            if (check < 0){
                begin = guess;
            } 
            else if(check > 0){
               end = guess; 
            }
            guess = (begin + end)/2;
            check = words[guess].compareTo(findMe);
            System.out.println("word is "+words[guess]);
            System.out.println("check is "+check);
        break;
        }


    }
}
