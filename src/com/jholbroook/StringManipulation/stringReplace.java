package com.jholbroook.StringManipulation;

/*
    The goal of this class is to replace the spaces in a char[] with "%20"
 */
class StringReplace {

    /*
        corner cases:
            if a space is at the end of the string?
                to handle it: check if number of spaces at the end is odd
            if the input is a blank char[]?
                should return a blank char[]

     */
    static char[] replaceSpaces(char[] input){
        int length = input.length-1;
        int i;
        for(i = length; i > 0; i--){
            if(input[i] != ' '){
                break;
            }
        }
        //if-statement to handle edge case where there is a trailing space
        if((length - i)%2 == 1){
            i++;
        }
        for(int j = 0; j < length-1; j++){
            if(input[i] != ' '){
                input[length-j] = input[i];
            } else {
                input[length-j] = '0';
                j++;
                input[length-j] = '2';
                j++;
                input[length-j] = '%';
            }
            i--;
        }
        return input;
    }

}
