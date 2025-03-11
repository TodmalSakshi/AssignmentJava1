public class Que6 {
    public static void main(String[] args) {
        // Character literals
        char char1 = 'A';
        char char2 = 'B';
        char char3 = 'C';
        
        // String literals
        String str1 = "Hello";
        String str2 = "World";
        
        // Display characters and their ASCII values
        System.out.println("Character: " + char1 + ", ASCII value: " + (int) char1);
        System.out.println("Character: " + char2 + ", ASCII value: " + (int) char2);
        System.out.println("Character: " + char3 + ", ASCII value: " + (int) char3);

        // Display string literals and their ASCII values (character by character)
        System.out.println("\nString: " + str1);
        for (int i = 0; i < str1.length(); i++) {
            System.out.println("Character: " + str1.charAt(i) + ", ASCII value: " + (int) str1.charAt(i));
        }

        System.out.println("\nString: " + str2);
        for (int i = 0; i < str2.length(); i++) {
            Sy
