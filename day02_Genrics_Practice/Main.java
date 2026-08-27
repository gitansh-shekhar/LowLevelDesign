package day02_Genrics_Practice;
public class Main {
    public static void main(String[] args) {
        GenricsCache<Integer , String> cache1 = new GenricsCache<>(3);
        cache1.add(1 , "Gitansh");
        cache1.add(2 , "Shekahr");
        cache1.add(3 , "Chatgpt");
        cache1.add(4 , "Gemini");
        cache1.getValue(1);
        cache1.getValue(3);

    }
}
