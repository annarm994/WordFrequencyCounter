import java.util.*;

public class WordFrequencyCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter text (type 'exit' to finish):");

        Map<String, Integer> wordFrequency = new HashMap<>();

        while (true) {
            String input = scanner.nextLine();
            if ("exit".equalsIgnoreCase(input.trim())) {
                break;
            }

            String[] words = input.toLowerCase().replaceAll("[^a-zA-Z\\s]", "").split("\\s+");
            for (String word : words) {
                if (!word.isEmpty()) {
                    wordFrequency.put(word, wordFrequency.getOrDefault(word, 0) + 1);
                }
            }
        }

        TreeMap<String, Integer> sortedMap = new TreeMap<>(wordFrequency);

        System.out.println("Word Frequencies:");
        for (Map.Entry<String, Integer> entry : sortedMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        scanner.close();
    }
}
