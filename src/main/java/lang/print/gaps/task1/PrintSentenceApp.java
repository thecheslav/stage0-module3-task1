package lang.print.gaps.task1;

public class PrintSentenceApp {

        public static void main(String[] args) {
            String str = "This is my first java program";
            String[] words = str.split(" ");
            for (String word : words) {
                System.out.println(word);
            }
        }
    }

