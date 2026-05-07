package madala.learning.oop.masterclassone.demo;

import madala.learning.oop.masterclassone.model.LPAStudent;
import madala.learning.oop.masterclassone.model.Student;

public class LPAStudentDemo {
    public static void main(String[] args) {
       
        for (int i = 1; i <= 5; i++) {

            LPAStudent s = new LPAStudent("S9080" + i,
                    switch (i){
                        case 1 -> "John Doe";
                        case 2 -> "Jane Doe";
                        case 3 -> "Jack Doe";
                        case 4 -> "Jill Doe";
                        case 5 -> "James Doe";
                        default -> "Unknown";

                    }, "05/11/1987","Java Masterclass");
            System.out.println(s);
        }
    }
}
