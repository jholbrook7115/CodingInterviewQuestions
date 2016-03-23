package com.jholbrook.interviewquestions;

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
