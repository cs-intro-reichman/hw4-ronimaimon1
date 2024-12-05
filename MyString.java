public class MyString {
    public static void main(String[] args) {
        System.out.println("Testing lowercase:");
        System.out.println("UnHappy : " + lowerCase("UnHappy"));
        System.out.println("This costs 15 Sheksls : " + lowerCase("This costs 15 Sheksls"));
        System.out.println("TLV : " + lowerCase("TLV"));
        System.out.println("lowercase : " + lowerCase("lowercase"));

        System.out.println("Testing contains:");
        System.out.println(contains("unhappy", "happy")); // true
        System.out.println(contains("happy", "unhappy")); // false
        System.out.println(contains("historical", "story")); // false
        System.out.println(contains("psychology", "psycho")); // true
        System.out.println(contains("personality", "son")); // true
        System.out.println(contains("personality", "dad")); // false
        System.out.println(contains("resignation", "sign")); // true
    }

    /** Returns the lowercase version of the given string. */
    public static String lowerCase(String str) {
        String lowCase = "";
        for (int i=0; i<str.length(); i++){
            if (str.charAt(i)<91 && (str.charAt(i)>64)) //check if the i's character is capital by its ascii
                lowCase+="" +(char) (str.charAt(i) + 32); //if its capital, convert to the lower case by its ascii
            else
                lowCase+=str.charAt(i);
        }
        return lowCase;
    }

    /** If str1 contains str2, returns true; otherwise returns false. */
    public static boolean contains(String str1, String str2) {
        // If str2 is an empty string, it is always "contained" in str1
       // If str2 is empty, it is always contained in str1
       if (str2.isEmpty()) {
        return true;
        }

    // Loop through str1 and check substrings of the length of str2
        for (int i = 0; i <= str1.length() - str2.length(); i++) {
        // Check if substring from i matches str2
            if (str1.substring(i, i + str2.length()).equals(str2)) {
                return true;
        }
    }

    // Return false if no match was found
    return false;
    
    }
}
