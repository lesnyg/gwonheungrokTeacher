package com.lesnyg.myquiz;

import com.lesnyg.myutility.MyUtility;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class MyQuiz {

    static void arrayLengthTest() {
        int[][] array = {
                {95, 86}, {83, 92, 96}, {78, 83, 93, 87, 88}
        };

        System.out.println(array.length);
        System.out.println(array[0].length);
        System.out.println(array[1].length);
        System.out.println(array[2].length);
    }

    static void test5_8() {
        int[][] array = {
                {95, 86}, {83, 92, 96}, {78, 83, 93, 87, 88}
        };
        int sum = 0;
        double avg = 0.0;
        int count = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                sum = sum + array[i][j];
                count++;
            }
        }
        avg = (double) sum / count;
        System.out.println("sum: " + sum);
        System.out.println("avg: " + avg);
    }

    public static int[] makeLottoNumber() {
        int[] lotto = new int[6];
        for (int i = 0; i < 6; i++) {
            lotto[i] = MyUtility.randomInt(45, 1);

            while (true) {
                int same = 0;
                for (int j = 0; j < i; j++) {
                    if (lotto[j] == lotto[i]) {
//                        lotto[i] = MyUtility.randomInt(45, 1);
                        lotto[i] = new Random().nextInt(45)+1;
                        same++;
                    }
                }
                if (same == 0) {
                    System.out.printf(lotto[i] + "  ");
                    break;
                }
            }
        }
        System.out.println();
        return lotto;
    }

    static void forTest(){
        int[] array = {2,7,9,15,88};
        for (int item = 0; item < array.length; item++) {
            System.out.println("for value = "+ array[item]);
        }
        for (int item : array) {
            System.out.println("foreach value = "+ item);
        }
        Student student = new Student("이");
        Student student2 = new Student("김");
        Student student3 = new Student("박");

        List<Student> stlist = new LinkedList<Student>();
        stlist.add(student);
        stlist.add(student2);
        stlist.add(student3);

        for(Student item:stlist){
            System.out.println("name :"+item);
        }
    }
}

class Student{
    String name;
    Student(String name){
        this.name = name;
    }
}
