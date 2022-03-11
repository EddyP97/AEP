package edu.berkeley.aep;

//Understands the backwards of a word
public class StringReverse {

    public StringReverse() {
    }

    public String reverse(String string) {
        if (string.isEmpty()) {return "";}
        char firstLetter = string.charAt(0);
        String reverseString = reverse(string.substring(1));
        return reverseString + firstLetter;
    }
}
