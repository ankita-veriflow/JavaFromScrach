public class Assignment_Day2 {
    public static void main(String[] args){
        //Largest of 2 numbers
        int a1=10, a2=10, a3=30;
//        if (a2>a1){
//            System.out.println("a2 is largest");
//        }
//        else if(a1>a2){
//            System.out.println("a1 is largest");
//        }
//        else{
//            System.out.println("both are equal");
//        }
        //smallest of 3 numbers
        if (a1<a2 && a1<a3){
            System.out.println("a1 is smallest");
        }
        else if (a2<a1 && a2<a3){
            System.out.println("a2 is smallest");
        }
        else if (a3<a1 && a3<a2){
            System.out.println("a3 is smallest");
        }
        else{
            System.out.println("NA");
        }

        //Print week number based on week name
        String weekName = "Monday";
        switch (weekName){
            case "Sunday" : System.out.println("1");
            break;
            case "Monday" : System.out.println("2");
            break;
            case "Tuesday" : System.out.println("3");
            break;
            case "wednesday" : System.out.println("4");
            break;
            case "thursday" : System.out.println("5");
            break;
            case "friday" : System.out.println("6");
            break;
            case "saturday" : System.out.println("7");
            break;
            case "default" : System.out.println("invalid");
            break;
        }

        //Reverse a number
        int num = 12347;
        int reversed = 0, sum=0;

        System.out.println("Original Number: " + num);

        // Run the loop until the number becomes 0
        while (num != 0) {
            // 1. Extract the last digit
            int digit = num % 10;

            // 2. Append the digit to the reversed number
            reversed = reversed * 10 + digit;
            sum = sum+digit;

            // 3. Remove the last digit from the original number
            num = num/10;
        }

        System.out.println("Reversed Number: " + reversed+ " Sum="+ sum);

        //palindrome number

        int n1 = 121;
        int origNum = n1;
        int p1 = 0;

        System.out.println("Original Number: " + n1);

        // Run the loop until the number becomes 0
        while (n1 != 0) {
            // 1. Extract the last digit
            int digit = n1 % 10;

            // 2. Append the digit to the reversed number
            p1 = p1 * 10 + digit;

            // 3. Remove the last digit from the original number
            n1 = n1/10;
        }

        System.out.println("Reversed Number: " + p1);
        if (p1==origNum){
            System.out.println("palindrome number");
        }
        else{
            System.out.println("not a palindrome number");
        }

        // no of digits in a number

        int n=654847;
        int count=0, even=0, odd=0;
        while (n != 0){
            int d=n%10;
            if (d%2==0){
                even=even+1;
            }
            else{
                odd=odd+1;
            }
            n=n/10;
            count=count+1;
        }
        System.out.println("Total count="+count+" even="+even+" odd="+odd);

    }
}
