package com.jholbrook.interviewquestions;

import org.junit.Test;
import static org.junit.Assert.*;


public class PermutationIndexSearchTest {

    @Test
    public void testFindPermIndex(){
        //test to see if the algorithm work at its most basic level
        assertEquals("For all Permutations of ABCD the index 3 should be BCA", "BCA", PermutationIndexSearch.findPermIndex("ABC", 3));
    }
}
