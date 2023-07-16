package TryCatch;

public class T1 {

    public static void main(String[] args)  {

        //-------TRY CATCH--------

        int[] numbers = {1, 2, 3, 4, 5, 6};

        try {
            System.out.println(numbers[7]);
        } catch (Exception e) {

            e.printStackTrace();
        }
        System.out.println("You entered a false value");
    }

//selam


}
