package tryPack;

import java.lang.reflect.Array;
import java.util.Arrays;

public class tryPack {
    public static void main (String [] args){
        int[] myContent = new int[3];
       try {
           for ( int i = 0; i <3;i++){
               myContent[i] = i;
           }
       } catch (Exception e){
           System.out.println(e);
       }
        System.out.println(Arrays.toString(myContent));
    }
}
