package quiz;

import java.util.*;

class Student {

    String studentName;
    String department;
    int quiz1, quiz2, quiz3;

    Student(String studentName, String department, int quiz1, int quiz2, int quiz3) {
        this.studentName = studentName;
        this.department = department;
        this.quiz1 = quiz1;
        this.quiz2 = quiz2;
        this.quiz3 = quiz3;
    }

    public int getTotal() {
        return quiz1 + quiz2 + quiz3;
    }
}

public class Ranking {

    static List<Student> list = new ArrayList<>();
    static List<String> output = new ArrayList<>();


    // RECORD METHOD
    public static void addRecord(String[] parts) {

        String name = parts[1];
        String department = parts[2];

        int q1 = Integer.parseInt(parts[3]);
        int q2 = Integer.parseInt(parts[4]);
        int q3 = Integer.parseInt(parts[5]);

        list.add(new Student(name, department, q1, q2, q3));

        output.add("Record Added: " + name);
    }


    // TOP QUIZ
    public static void topQuiz(String quiz) {

        int max = Integer.MIN_VALUE;

        for (Student s : list) {

            int score = quiz.equals("Q1") ? s.quiz1 :
                        quiz.equals("Q2") ? s.quiz2 : s.quiz3;

            max = Math.max(max, score);
        }

        for (Student s : list) {

            int score = quiz.equals("Q1") ? s.quiz1 :
                        quiz.equals("Q2") ? s.quiz2 : s.quiz3;

            if (score == max) {
                output.add(s.studentName + " " + score);
            }
        }
    }


    // TOP DEPARTMENT
    public static void topDepartment(String dept) {

        int max = Integer.MIN_VALUE;
        boolean found = false;

        for (Student s : list) {

            if (s.department.equals(dept)) {
                found = true;
                max = Math.max(max, s.getTotal());
            }
        }

        if (!found) {
            output.add("Department Not Found");
            return;
        }

        for (Student s : list) {

            if (s.department.equals(dept) && s.getTotal() == max) {
                output.add(s.studentName + " " + max);
            }
        }
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();

        String commands[] = new String[n];

        // take all input first
        for (int i = 0; i < n; i++) {
            commands[i] = sc.nextLine();
        }

        // process commands
        for (int i = 0; i < n; i++) {

            String[] parts = commands[i].split(" ");

            if (parts[0].equals("Record")) {

                addRecord(parts);

            }

            else if (parts[0].equals("Top")) {

                if (list.isEmpty()) {
                    output.add("No Records Available");
                    continue;
                }

                if (parts[1].startsWith("Q")) {
                    topQuiz(parts[1]);
                }

                else {
                    topDepartment(parts[1]);
                }
            }
        }

        // print output at the end
        for (String s : output) {
            System.out.println(s);
        }
    }
}
