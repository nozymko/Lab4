/*
 * The following code needs a lot of TLC. So give it some!
 *
 * 1. Fix all checkstyle errors
 * 2. Determine what it does (it's going to be tough before you finish #1)
 * 3. Improve the name of the methods and variables
 * 4. Add comments and Javadoc comments where needed
 * 5. Remove unnecessary comments as appropriate
 */

/**
 *
 */
public class ReclamationProject {

    /**
     *
     * @param firstWord is a String
     * @param secondWord is a String
     * @return the longest common substring
     */
    public static String containsSameThing(final String firstWord, final String secondWord) {
        String wordOne = firstWord;
        String wordTwo = secondWord;
        //switches two words if word1 is longer than word2
        if (wordOne.length() > wordTwo.length()) {
            String temp = wordOne;
            wordOne = wordTwo;
            wordTwo = temp;
        }
        String longestSubstring = "";
        /*
         * For loop with i
         */
        for (int i = 0; i < wordOne.length(); i++) {
            for (int j = wordOne.length() - i; j > 0; j--) {
                for (int k = 0; k < wordTwo.length() - j; k++) {
                    if (wordOne.regionMatches(i, wordTwo, k, j) && j > longestSubstring.length()) {
                        longestSubstring = wordOne.substring(i, i + j);
                    }
                }
            }
        } return longestSubstring;
    }
}
