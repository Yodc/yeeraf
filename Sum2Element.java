import java.util.Scanner;
public class Sum2Element {

    public static int sum_2_element_fn(Integer[] arr, Integer sum)
    {

        for( int i = 0; i < arr.length; i++ ){
            for( int j = i+1; j < arr.length; j++ ){
                if( arr[i] + arr[j] == sum){
                    System.out.println("Output: "+i +","+ j);
                    System.out.println("Because: nums["+i+"] + nums["+j+"] = "+ sum);
                    return 1;
                }
            }
        }

        System.out.println("No Output");
        System.out.println("The are no two numbers that add up to "+ sum);
        return 2;
    }
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("number of inputs");
        Integer n = scanner.nextInt();

        Integer[] arr_inputs = new Integer[n];
        System.out.println("input numbers");
        for(int i = 0; i<n; i++){
            arr_inputs[i] = scanner.nextInt();
        }

        System.out.println("sum");
        Integer sum = scanner.nextInt();

        int out_put = sum_2_element_fn(arr_inputs,sum);
    }
}
