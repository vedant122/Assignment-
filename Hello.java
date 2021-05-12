package samplePackage;

public class Hello {
    public static void main(String[] args) {
        int a=1;
        float b=2.2123333444232323323f;
        double v,d=3.423445672344447434;
        v=a+b+d;
        char c='w';
        boolean f=(a==b);
        String name="My name is Vedant";
        System.out.println("Hello World");
        System.out.println(name);
        System.out.println("Sum of a,b,c is : "+v);
        System.out.println("a is equals to b : "+f);
        System.out.println("b is greater than d :"+(b>d));
        System.out.println("b is smaller than d :"+(b<d));
    }
}