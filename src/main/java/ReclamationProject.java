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

        /* Loops through the first word and the second word
         * until it finds the longest common substring.
         * If not found, returns "".
         */
        //loops through the first word starting at the beginning
        for (int beginningLetter = 0; beginningLetter < wordOne.length(); beginningLetter++) {
            //loops through the first word starting at the end
            for (int endLetter = wordOne.length() - beginningLetter; endLetter > 0; endLetter--) {
                //loops through the second word
                for (int wordTwoLetter = 0; wordTwoLetter < wordTwo.length() - endLetter;
                        wordTwoLetter++) {
                    //checks for a new longest substring
                    if (wordOne.regionMatches(beginningLetter, wordTwo, wordTwoLetter, endLetter)
                            && endLetter > longestSubstring.length()) {
                        longestSubstring = wordOne.substring(beginningLetter,
                                beginningLetter + endLetter);
                    }
                }
            }
        }
        return longestSubstring;
    }
}
