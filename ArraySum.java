import java.util.Arrays;

public class ArraySum{

public static void main(String[]  args){

int sum = 0;

int[] number = {2,4,5,1,6};

for(int counter = 0; counter  < 5; counter++){

sum+= number[counter];
}

int[] output = new int[5];

for (int count = 0; count < 5; count++){

output[count] = sum - number[count];

}

System.out.println(Arrays.toString(output));




}



}