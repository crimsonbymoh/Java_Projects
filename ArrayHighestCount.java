import java.util.Arrays;

public class ArrayHighestCount{

public static void main(String[]  args){

int highestCount = 0;

int[] number = {1,1,2,3,4};

for(int counter = 0; counter  < 5; counter++){

highestCount = number[counter];
}

int[] output = new int[5];

for (int count = 0; count < 5; count++){

output[count] = highestCount;

}

System.out.println(Arrays.toString(output));




}



}