package com.codedifferently.basic_drills;


public class StringUtilities {
    /**
     * @return `Hello World` as a string
     */
    public static String getHelloWorld() {
        return "Hello World";
    }

    /**
     * @param firstSegment a string to be added to
     * @param secondSegment a string to add
     * @return the concatenation of two strings, `firstSegment`, and `secondSegment`
     */
    public static String concatenation(String firstSegment, String secondSegment){
        return firstSegment + secondSegment;
    }

    /**
     * @param firstSegment a string to be added to
     * @param secondSegment a string to add
     * @return the concatenation of an integer, `firstSegment`, and a String, `secondSegment`
     */
    public static String concatenation(int firstSegment, String secondSegment){
        return firstSegment + secondSegment;
    }

    /**
     * @param input a string to be manipulated
     * @return the first 3 characters of `input`
     */
    public static String getPrefix(String input){
        String result = input.substring(0,3);
        return result;
    }

    /**
     * @param input a string to be manipulated
     * @return the last 3 characters of `input`
     */
    public static String getSuffix(String input){
        int middle = input.length() / 2;
        String result = input.substring(middle);
        return result;
    }

    /**
     * @param inputValue the value to be compared
     * @param comparableValue the value to be compared against
     * @return the equivalence of two strings, `inputValue` and `comparableValue`
     */
    public static Boolean compareTwoStrings(String inputValue, String comparableValue){
        return inputValue.equals(comparableValue);
    }

    /**
     * @param inputValue the value input from user
     * @return the middle character of `inputValue`
     */
    public static Character getMiddleCharacter(String inputValue){
        int len = inputValue.length();
        int c = len / 2;
        char ch[] = inputValue.toCharArray();
        return ch[c];
    }

    /**
     * @param spaceDelimitedString a string, representative of a sentence, containing spaces
     * @return the first sequence of characters
     */
    public static String getFirstWord(String spaceDelimitedString){
        StringBuilder result = new StringBuilder();
        for(int i = 0; i < spaceDelimitedString.length(); i++){
            if(spaceDelimitedString.charAt(i) != ' '){
                result.append(spaceDelimitedString.charAt(i));
            }else{
                break;
            }
        }
        return result.toString();
    }

    /**
     * @param spaceDelimitedString a string delimited by spaces
     * @return the second word of a string delimited by spaces.
     */
    public static String getSecondWord(String spaceDelimitedString){
        String lastWord = spaceDelimitedString.substring(spaceDelimitedString.lastIndexOf(" ")+1);
        return lastWord;
    }

    /**
     * @param stringToReverse
     * @return an identical string with characters in reverse order.
     */
    public static String reverse(String stringToReverse){
        StringBuilder reverseWord = new StringBuilder();
        for(int i = stringToReverse.length()-1; i >= 0; i--){
            reverseWord.append(stringToReverse.charAt(i));
        }
        return reverseWord.toString();
    }
}
