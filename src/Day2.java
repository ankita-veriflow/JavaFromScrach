import javax.swing.plaf.synth.SynthTextAreaUI;

public class Day2 {
    public static void main(String[] args){
        int age=15;
        if (age>=18){
            System.out.println("Eligble to vote");
        }
        else {
            System.out.println("Not Eligible");
        }
        //Even-Odd
        int num=15;
        if (num%2==0){
            System.out.println("Even");
        }
        else {
            System.out.println("Odd");
        }

        //Positive neg or zero
        int n1=-1;
        if (n1>0){
            System.out.println("Positive");
        }
        else if (n1<0){
            System.out.println("Negetive");
        }
        else{
            System.out.println("Zero");
        }

        //Largest of 3 numbers
        int a=29, b=21, c=-33;
        if (a>b && a>c){
            System.out.println("a is largest");
        }
        else if ((b>a) && (b>c)){
            System.out.println("b is largest");
        }
        else{
            System.out.println("c is largest");
        }

        //Boolean values
        if(false){
            System.out.println("2");
        }
        else {
            System.out.println("3");
        }

        //nested loop
        if(false){
            if(false){
                System.out.println("abc");
            }
            else{
                System.out.println("bcd");
            }
        }
        else{
            System.out.println("def");
        }
        int weekNo=9;
        if (weekNo==1){
            System.out.println("Sunday");
        }
        else if (weekNo==2){
            System.out.println("mon");
        }
        else if (weekNo==3){
            System.out.println("tues");
        }
        else if (weekNo==4){
            System.out.println("Wed");
        }
        else if (weekNo==5){
            System.out.println("Thus");
        }
        else if (weekNo==6){
            System.out.println("Fri");
        }
        else if (weekNo==7){
            System.out.println("Sat");
        }
        else {
            System.out.println("Invalid");
        }

        //SwitchCase
        int weekNumber=4;
        switch(weekNumber){
            case 1: System.out.println("Sunday"); break;
            case 2: System.out.println("Monday"); break;
            case 3: System.out.println("Tuesday"); break;
            case 4: System.out.println("Wednesday"); break;
            case 5: System.out.println("Thusday"); break;
            case 6: System.out.println("Friday"); break;
            case 7: System.out.println("Saturday"); break;
            default: System.out.println("Invalid"); break;



        }
        //Looping Statements:

        int q=1;                     //initialization
        while(q<=5){                 //condition
            System.out.println(q);
            q++;                     //inc
        }
        //example: print hello 10 time
//        int i=1;
//        while(i<=10){
//            System.out.println("Hello world");
//            i++;
//        }
        //print odd numbers between 1 to 10
        int j=1;
//        while(j<=10){
//            System.out.println(j);
//            j=j+2;
//        }
        //Or
        while (j<=10){
            if (j%2==0)
            {
                System.out.println(j);
            }
            j++;
        }

        //Do while loop
        int i=11;
        do{
            System.out.println(i);
            i++;
        }while(i<=20);

        //For loop--print even odd
        for (int q1=1; q1<=10; q1++) {
            if (q1%2==0) {
                System.out.println(q1+ " is even");
            }
            else{
                System.out.println(q1+ " is odd");
            }
        }

    }
}
