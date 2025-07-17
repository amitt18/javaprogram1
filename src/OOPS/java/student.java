package OOPS.java;

public class student {
    public static class Student{
        String name;
       private int roll;
        double percent;
    }
    public static class Car{
        String model;
        String name;
        int price;
    }
    public static void fun(Student s){
        System.out.println(s.name);
    }
    public static void change(Student x){
        x.name = "kohli";
        System.out.println(x.name);
        return;
    }
    public static void main(String[] args) {
        Student x = new Student();
        x.name = "amit";
        x.roll = 6;
        x.percent = 60;
//        System.out.println(x.name);
//        change(x);
        System.out.println(x.name);
        System.out.println(x.roll);
        System.out.println(x.percent);
//        fun(x);
//        System.out.println(x.name);
//        System.out.println(x.roll);
//        System.out.println(x.percent);
//        Student y = new Student();
//        y.name = "rohit";
//        System.out.println(y.name);
//        Car car = new Car();
//        car.model = "rgr";
//        car.name = "audi";
//        car.price = 15000000;
//        System.out.println(car.model);
//        System.out.println(car.name);
//        System.out.println(car.price);
//        car.price = 13450000;
//        System.out.println(car.price);
//        int x = 5;
//        System.out.println(x);
//        change(x);
//        System.out.println(x);
    }
}
