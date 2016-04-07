package com.jholbroook.StringManipulation;

/*
   Cracking the Coding Interview 5th Edition
    Chapter 1: Arrays and Strings
    Question: 1.6
    Description: Given an Image represented by an NxN matrix, where each pixel in the image
    is 4 bytes, write a method to rotate the image by 90 degrees. Can you do it in place?

    Immediate concerns:
        - how can you do it in place?
            you could use one buffer to act as the swap?
                Whenever you do a rotate you would rotate 4 pixels in sequential order
                    i.e. given a 4x4 matrix you would

                    - start at [0,0]
                    - put value of [0,0] in the buffer
                    - replace [0,0] with value at [N,0]
                    - replace [N,0] with value at [N,N]
                    - replace [N,N] with value at [0,N]
                    - replace [0,N] with value in buffer

                    - Then go [0,1]
                    - put value of [0, 1] into the buffer
                    - replace [0,1] with value at [N-1, 0]
                    - replace [N-1,0] with value at [N-1, N]
                    - replace [N-1,N] with value at [1,N]
                    - replace [1,N] with value in buffer

                    - Continue this in a for-loop N-1 times

                    Then start at [1,1] and

        - problem does not say clockwise or counter-clockwise?
            start with clockwise first i guess
            do counter-clockwise later

 */
public class ImageManipulation {

    public static int[][] rotate(int[][] matrix){
        int n = matrix.length;
        for(int layer = 0; layer < n/2; ++layer){
            int first = layer;
            int last = n-1-layer;

            for(int i = first; i < last; ++i){
                int offset = i - first;
                int top = matrix[first][i];

                matrix[first][i] = matrix[last-offset][first];
                matrix[last-offset][first] = matrix[last][last-offset];
                matrix[last][last - offset] = matrix[i][last];
                matrix[i][last] = top;
            }
        }
        return matrix;
    }
}

