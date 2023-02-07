public class ThreeFive {
    private static void print_threefile_fn(Integer number){
        int count_if = 0;
        if( number % 3 == 0) {
            System.out.print("Three");
            count_if++;
        }
        if (number % 5 == 0) {
            System.out.print("five");
            count_if++;
        }
        if(count_if == 0){
            System.out.print(number);
        }
        System.out.println();
    }
    private static void threefive_fn(){
        for( int i = 1; i <= 100; i++){
            print_threefile_fn(i);
        }

    }
    public static void main(String args[]){
        threefive_fn();
    }
}
