package com.jholbrook.interviewquestions;
/*
    Currently pending, most of the work is finished on my other computer but is not found here yet because I am a silly
    person who forgot to commit and push my changes.  As my friend Sri would say, I am a "numpty".
    As a result this is incomplete right now and I am aware that this will not pass its unit test in its current state.
 */
import java.util.ArrayList;
import java.util.List;

class PermutationIndexSearch {

    private static List<Character> output = new ArrayList<>();

    static String findPermIndex(String str, int index){

        int binSize = 1;
        for(int i = 1; i <= str.length(); i++){
            binSize = binSize * i;
        }

        System.out.println("bin size: " + binSize);

        int bin = binSize/index;
        output.add(str.charAt(bin));
        if(bin != 1){
            //recurse
            System.out.println("gotta complete this");
        } else{
            return output.toString();
        }


        return null;
    }


}
