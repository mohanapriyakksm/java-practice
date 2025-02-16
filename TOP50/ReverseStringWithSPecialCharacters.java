public class ReverseStringWithSPecialCharacters {  // keeping the special char at the same place and reversing the alphabets alone
    public static void main(String[] args) {
        String input = "a$#b!c-";  //OP--> c$#b!a-
        String output = reverseString(input);
        System.out.println("Reversed string with swapped special characters: " + output);
    }

    public static String reverseString(String input) {
        char[] chars = input.toCharArray();
        int left = 0;
        int right = chars.length - 1;

        while (left < right) {
            // Move left pointer to the next non-special character
            while (left < right && !Character.isLetterOrDigit(chars[left])) {
                left++;
            }

            // Move right pointer to the next non-special character
            while (left < right && !Character.isLetterOrDigit(chars[right])) {
                right--;
            }

            // Swap characters, including special characters
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;
            left++;
            right--;
        }

        return new String(chars);
    }
} 







// import java.util.ArrayList;
// import java.util.List;
// import java.util.Random;

// public class ReverseStringWithSPecialCharacters {
//     public static void main(String[] args) {
//         String input = "_+a$#b!c";
//         String output = reverseStringWithRandomSpecialCharacters(input);
//         System.out.println("Reversed string with randomly swapped special characters: " + output);
//     }

//     public static String reverseStringWithRandomSpecialCharacters(String input) {
//         char[] chars = input.toCharArray();
//         int left = 0;
//         int right = chars.length - 1;

//         // List to store positions of special characters
//         List<Integer> specialCharPositions = new ArrayList<>();

//         while (left < right) {
//             // Move left pointer to the next non-special character
//             while (left < right && !Character.isLetterOrDigit(chars[left])) {
//                 specialCharPositions.add(left);
//                 left++;
//             }

//             // Move right pointer to the next non-special character
//             while (left < right && !Character.isLetterOrDigit(chars[right])) {
//                 specialCharPositions.add(right);
//                 right--;
//             }

//             // Swap characters, including special characters
//             char temp = chars[left];
//             chars[left] = chars[right];
//             chars[right] = temp;
//             left++;
//             right--;
//         }

//         // Reverse the string
//         String reversedString = new String(chars);

//         // Randomly swap positions of special characters
//         Random random = new Random();
//         for (int i = 0; i < specialCharPositions.size(); i++) {
//             int position1 = specialCharPositions.get(i);
//             int position2 = specialCharPositions.get(random.nextInt(specialCharPositions.size()));
//             char temp = chars[position1];
//             chars[position1] = chars[position2];
//             chars[position2] = temp;
//         }

//         return new String(chars);
//     }
// }