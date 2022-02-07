

import java.util.Arrays;

public class Activity2 {
    public static void main(String[] args) {
        //Initialize array
        int[] numArr={10,77,10,54,-11,10};
        System.out.println("Original array: "+ Arrays.toString(numArr));

        int findNum=10;
        int sumCount=30;
        boolean res=checkSum(numArr,findNum,sumCount);
        System.out.println("Result: "+res);
    }

    public static boolean checkSum(int[] numbers, int findNum, int sumNum){
        int temp_sum = 0;

        for(int num: numbers){
            if(num == findNum){
                temp_sum += findNum;
            }
            if(temp_sum > sumNum){
                break;
            }

        }
        if(temp_sum==sumNum){
            return true;
        }
        else{
            return false;
        }

    }
}
