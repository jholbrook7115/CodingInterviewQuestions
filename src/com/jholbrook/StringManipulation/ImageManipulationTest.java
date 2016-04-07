package com.jholbrook.StringManipulation;

import static org.junit.Assert.*;
import org.junit.Test;

public class ImageManipulationTest {

    @Test
    public void testRotate90Degrees_two_by_two(){
        int[][] expectedImage = new int[2][2];

        int input1 = 1;
        int input2 = 2;
        int input3 = 3;
        int input4 = 4;


        int[][] inputImage={{input1, input2}, {input3, input4}};



        expectedImage[0][0] = input3; //3
        expectedImage[0][1] = input1; //1

        expectedImage[1][0] = input4; //4
        expectedImage[1][1] = input2; //2


        int[][] actualImage = ImageManipulation.rotate(inputImage);
        for(int i = 0; i < inputImage.length; i++){
            for(int j = 0; j < inputImage.length; j++){
                assertEquals("should be equal at cell[" + i + "][" + j + "]", expectedImage[i][j], actualImage[i][j]);
            }
        }
    }

    @Test
    public void testImageManipulation_three_by_three(){
        int[][] expectedImage= new int[3][3];

        int input1 = 1;
        int input2 = 2;
        int input3 = 3;
        int input4 = 4;
        int input5 = 5;
        int input6 = 6;
        int input7 = 7;
        int input8 = 8;
        int input9 = 9;

        int[][] inputImage={{input1, input2, input3}, {input4, input5, input6}, {input7, input8, input9}};

        expectedImage[0][0] = input7; //7
        expectedImage[0][1] = input4; //4
        expectedImage[0][2] = input1; //1
        expectedImage[1][0] = input8; //8
        expectedImage[1][1] = input5; //5
        expectedImage[1][2] = input2; //2
        expectedImage[2][0] = input9; //9
        expectedImage[2][1] = input6; //6
        expectedImage[2][2] = input3; //3


        int[][] actualImage = ImageManipulation.rotate(inputImage);

        for(int i =0; i < actualImage.length; i++){
            for(int j =0; j < actualImage.length;j++){
                assertEquals("should be equal at cell[" + i + "][" + j + "]", expectedImage[i][j], actualImage[i][j]);
            }
        }
    }

    @Test
    public void testImageManipulation_four_by_four(){
        int[][] expectedImage= new int[4][4];

        int input1 = 1;
        int input2 = 2;
        int input3 = 3;
        int input4 = 4;
        int input5 = 5;
        int input6 = 6;
        int input7 = 7;
        int input8 = 8;
        int input9 = 9;
        int input10 = 10;
        int input11 = 11;
        int input12 = 12;
        int input13 = 13;
        int input14 = 14;
        int input15 = 15;
        int input16 = 16;

        int[][] inputImage={{input1, input2, input3, input4}, {input5, input6, input7, input8}, {input9, input10, input11, input12}, {input13, input14, input15, input16}};

        expectedImage[0][0] = input13; //12
        expectedImage[0][1] = input9; //9
        expectedImage[0][2] = input5; //5
        expectedImage[0][3] = input1; //1

        expectedImage[1][0] = input14; //14
        expectedImage[1][1] = input10; //10
        expectedImage[1][2] = input6; //6
        expectedImage[1][3] = input2; //2

        expectedImage[2][0] = input15; //15
        expectedImage[2][1] = input11; //11
        expectedImage[2][2] = input7; //7
        expectedImage[2][3] = input3; //3

        expectedImage[3][0] = input16; //16
        expectedImage[3][1] = input12; //12
        expectedImage[3][2] = input8; //8
        expectedImage[3][3] = input4; //4


        int[][] actualImage = ImageManipulation.rotate(inputImage);

        for(int i =0; i < actualImage.length; i++){
            for(int j =0; j < actualImage.length;j++){
                assertEquals("should be equal at cell[" + i + "][" + j + "]", expectedImage[i][j], actualImage[i][j]);
            }
        }
    }
}
