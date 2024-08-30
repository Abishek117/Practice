//package com.main;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Scanner;
//import java.util.Comparator;
//import java.util.stream.*;
//import java.util.*;
//
//class Student {
//    private int id ;
//    private String name ;
//    private double CGPA ;
//
//    public Student() {
//        super();
//    }
//
//    public Student(int id, String name, double cgpa) {
//        this.id = id;
//        this.name = name;
//        this.CGPA = cgpa;
//    }
//
//    public int getId() {
//        return this.id;
//    }
//
//    public String getName() {
//        return this.name;
//    }
//
//    public double getCGPA() {
//        return this.CGPA;
//    }
//
//
//    @Override
//    public String toString() {
//        return "Student{" +
//                "id=" + id +
//                ", name='" + name + '\'' +
//                ", CGPA=" + CGPA +
//                '}';
//    }
//
//}
//
//class Priorities {
//
//    public List<Student> getStudents(List<String> events) {
//
//        PriorityQueue<Student> studentQueue = new PriorityQueue<>(Comparator
//                .comparingDouble(Student::getCGPA).reversed()
//                .thenComparing(Student::getName)
//                .thenComparingInt(Student::getId));
//
//        for (String str : events) {
//            System.out.println(str);
//            if (str.startsWith("ENTER")) {
//                String enter = "ENTER";
//                int len = enter.length();
//                String strVal = str.substring(len).trim();
//                String[] studInfo = strVal.split("\\s");
//                //System.out.println(Arrays.toString(studInfo));
//                int intValue = 0;
//                String stringValue = "";
//                double doubleValue = 0.0;
//                for (String str1 : studInfo) {
//                    try {
//                        intValue = Integer.parseInt(str1);
//                    } catch (NumberFormatException e1) {
//                        try {
//                            doubleValue = Double.parseDouble(str1);
//                        } catch (NumberFormatException e2) {
//                            stringValue = str1;
//                        }
//                    }
//                }
//                Student student = new Student(intValue,stringValue,doubleValue);
//                studentQueue.offer(student);
//                System.out.println(studentQueue);
//            }
//            else if(str.startsWith("SERVED")) {
//                studentQueue.poll();
//                System.out.println(studentQueue);
//            }
//        }
//        System.out.println(studentQueue.toString());
//        //List<Student> studentList = studentQueue.stream().collect(Collectors.toList());
//        while (!studentQueue.isEmpty()) {
//            studentList.add(studentQueue.poll()); // Collect remaining students in priority order
//        }
//        return studentList;
//    }
//}
//
//public class Main {
//    private final static Scanner scan = new Scanner(System.in);
//    private final static Priorities priorities = new Priorities();
//
//    public static void main(String[] args) {
//        int totalEvents = Integer.parseInt(scan.nextLine());
//        List<String> events = new ArrayList<>();
//
//        while (totalEvents-- != 0) {
//            String event = scan.nextLine();
//            events.add(event);
//        }
//
//        List<Student> students = priorities.getStudents(events);
//
//        if (students.isEmpty()) {
//            System.out.println("EMPTY");
//        } else {
//            for (Student st: students) {
//                System.out.println(st.getName());
//            }
//        }
//    }
//}


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Comparator;
import java.util.stream.*;
import java.util.*;
/*
 * Create the Student and Priorities classes here.
 */
class Student {
    private int id ;
    private String name ;
    private double CGPA ;

    public Student() {
        super();
    }

    public Student(int id, String name, double cgpa) {
        this.id = id;
        this.name = name;
        this.CGPA = cgpa;
    }

    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public double getCGPA() {
        return this.CGPA;
    }

    public void setId(int id){
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCGPA(double cgpa) {
        this.CGPA = cgpa;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", CGPA=" + CGPA +
                '}';
    }
}

class Priorities {

    public List<Student> getStudents(List<String> events) {
        PriorityQueue<Student> studentQueue = new PriorityQueue<>(Comparator
                .comparingDouble(Student::getCGPA).reversed()
                .thenComparing(Student::getName)
                .thenComparingInt(Student::getId));

        List<Student> studentList = new ArrayList<>();

        for (String str : events) {
            System.out.println(str);
            if (str.startsWith("ENTER")) {
                String[] studInfo = str.substring(6).trim().split("\\s");
                Student student = new Student(Integer.parseInt(studInfo[2]), studInfo[0], Double.parseDouble(studInfo[1]));
                studentQueue.offer(student);
                System.out.println(studentQueue);
            } else if (str.startsWith("SERVED")) {
                studentQueue.poll(); // Remove the student with the highest priority
                System.out.println(studentQueue);
            }
        }
        System.out.println("final : " + studentQueue);
        while (!studentQueue.isEmpty()) {
            studentList.add(studentQueue.poll()); // Collect remaining students in priority order
        }

        return studentList;
    }}

public class Main {
    private final static Scanner scan = new Scanner(System.in);
    private final static Priorities priorities = new Priorities();

    public static void main(String[] args) {
        int totalEvents = Integer.parseInt(scan.nextLine());
        List<String> events = new ArrayList<>();

        while (totalEvents-- != 0) {
            String event = scan.nextLine();
            events.add(event);
        }

        List<Student> students = priorities.getStudents(events);

        if (students.isEmpty()) {
            System.out.println("EMPTY");
        } else {
            for (Student st: students) {
                System.out.println(st.getName());
            }
        }
    }
}
/*
TEST DATA:

12
ENTER John 3.75 50
ENTER Mark 3.8 24
ENTER Shafaet 3.7 35
SERVED
SERVED
ENTER Samiha 3.85 36
SERVED
ENTER Ashley 3.9 42
ENTER Maria 3.6 46
ENTER Anik 3.95 49
ENTER Dan 3.95 50
SERVED
 */