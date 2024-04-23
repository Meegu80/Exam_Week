package Thirdweek;

import java.util.ArrayList;

public class StudentMain {
    public static void main(String[] args) {
        // raw data
        String[] names = {"김정민", "조수만", "백금열"};
        int[] korean = {82, 74, 90};
        int[] english = {90, 88, 85};
        int[] math = {70, 83, 94};

        // 학생 객체 저장용 ArrayList
        ArrayList<Student> students = new ArrayList<>();

        // Student 객체 생성
        for (int i = 0; i < names.length; i++) {
            Student student = new Student(names[i], korean[i], english[i], math[i]);
            students.add(student);
        }

        for (Student student : students) {
            System.out.println(student);
        }
        System.out.println();

        System.out.println("학생명 \t 국어 \t 영어 \t 수학 \t  평균");
        for (Student s : students) {
            System.out.println(s.getName() + "\t" + s.getKorean() + "\t" + s.getEnglish() + "\t" + s.getMath() + "\t" + s.getAvg());
        }
    }
}