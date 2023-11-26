public class FOR_COUNT_GREATER_ODD_OR_EVEN {
    public static void main(String[] args) {
        int count_even = 0;
        int count_odd = 0;
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                count_even=count_even+i;
                System.out.println(i + "is even number");
            } else {
                count_odd=count_odd+i;
                System.out.println(i + "is odd number");
            }
        }
        if(count_even>count_odd){
            System.out.println("Number of Even is greater");
        }else if(count_odd>count_even){
            System.out.println("Number of Odd is greater");
        }else{
            System.out.println("Number of odd and even is equal");
        }
    }
}
