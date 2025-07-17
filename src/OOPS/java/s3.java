package OOPS.java;
import java.util.*;

public class s3 {
    public static void main(String[] args) {
        Student x = new Student();

        // Using the setter method to set the value of 'name'
        x.setName("kanishka");

        // Printing the 'name' using the getter method
        System.out.println(x.getName());
    }
    public static class Student {
        private String name;
        private int roll;
        private double percent;

        // Setter and getter methods for 'name', 'roll', and 'percent'
        public void setName(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        // Similarly, you can add set/get methods for 'roll' and 'percent'
        public void setRoll(int roll) {
            this.roll = roll;
        }

        public int getRoll() {
            return roll;
        }

        public void setPercent(double percent) {
            this.percent = percent;
        }

        public double getPercent() {
            return percent;
        }
    }

}
