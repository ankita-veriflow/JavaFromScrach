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

    }
}
