package com.jholbrook.interviewquestions;

import org.junit.Test;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;





public class DuplicateNumberTest {

    @Test
    public void testFindDuplicate(){
//        DuplicateNumber dn = new DuplicateNumber();
        List<Integer> testList = new ArrayList<>();
        for(int i = 1; i <=5; i++){
            testList.add(i);
        }
        testList.add(1);
        Integer expected = 1;
        assertEquals("Input of 123451 should return 1", expected, DuplicateNumber.findDuplicate(testList));
    }
}
