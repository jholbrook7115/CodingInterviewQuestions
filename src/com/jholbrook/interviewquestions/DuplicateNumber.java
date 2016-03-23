package com.jholbrook.interviewquestions;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class DuplicateNumber {

//    public DuplicateNumber(){ }

    static Integer findDuplicate(List<Integer> numberList){

        Collections.sort(numberList);
        Integer prevInteger = numberList.get(0) + 10;
        for(Integer elem : numberList){
            if(elem.equals(prevInteger)){
                return elem;
            } else {
                prevInteger = elem;
            }
        }

        return null;
    }
    public static void main(){

    }
}
