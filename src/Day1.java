public class Day1 {
    public static void main(String[] args){
//        String Name = "Ankii";
//        int age = 16;
//        String city = "Gaya";
//        double salary = 500000.555;
//        Boolean empStatus = true;
//        System.out.println(Name);
//        System.out.println(age);
//        System.out.println(city);
//        System.out.println(salary);
//        System.out.println(empStatus);
//
//        byte a = 1;
//        short s = 22;
//        int i = 450;
//        long l = 6777L;
//        float f = 44.8888f;
//        double d = 78.987543124;
//        char c = 'A';
//        boolean b = true;
//        System.out.println(a+" "+s+" "+i+" "+l+"\n"+f+" "+d+" "+c+" "+b);
//
//        double value = 33.99;
//        int val = (int)value;
//        System.out.println(val);
//        char ch = 'p';
//        int v = ch;
//        System.out.println(v);
        int one = 97;
        char c = (char) one;
        System.out.println(c);

        int a=10, b=20;
        int sum = a+b;
        System.out.println(sum);
        System.out.println(sum/2);

        int length = 15;
        double breadth = 10.99;
        double area = length*breadth;
        double perimeter = (length+breadth)*2;
        System.out.println(area+" "+perimeter);

        //Temp converter
        int celcius = 37;
        double F = ((9/5)*celcius)+32;
        System.out.println(F);

        double f1 = 10/3;
        double f2 = 10.0/3;
        double f3 = (double)10/3;
        System.out.println(f1+"\n"+f2+"\n"+f3);

        int f4 = 24, f5=15, f6=0, f7=-8;
//        String s1="even", s2="odd";
        String rem1= (f4%2==0)? "even":"odd";
        String rem2= (f5%2==0)? "even":"odd";
        String rem3= (f6%2==0)? "even":"odd";
        String rem4= (f7%2==0)? "even":"odd";
        System.out.println(rem1+" "+rem2+" "+rem3+" "+rem4);

        //swap 2 num
        int a1=54, a2=79;
        int a3;
        a3=a2;  //a3=79
        a2=a1;  //a2=54
        a1=a3;  //a1=79
        System.out.println(a1+" "+a2);
        int a4=5, a5=10;
        a4=a4+a5; //a4=15, a5=10
        a5=a4-a5; //a5=5, a4=15
        a4=a4-a5; //a4=10, a5=5
        System.out.println(a4+" "+a5);

//now swap without 3rd var


        //logical op
        int age=30;
        int sal=65000;
        boolean b1 = age>18;
        boolean b2= sal>30000;
        System.out.println(b1&&b2);
        System.out.println(b1||b2);
        System.out.println(b1);






    }
}
