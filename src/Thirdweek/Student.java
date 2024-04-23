package Thirdweek;

public class Student {

    private String name ;
    private int korean;
    private int english ;
    private int math ;


    public Student(String name, int korean, int english, int math) {
        this.name = name;
        this.korean = korean;
        this.english = english;
        this.math = math;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getKorean() {
        return korean;
    }

    public void setKorean(int korean) {
        this.korean = korean;
    }

    public int getEnglish() {
        return english;
    }

    public void setEnglish(int english) {
        this.english = english;
    }

    public int getMath() {
        return math;
    }

    public void setMath(int math) {
        this.math = math;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", korean=" + korean +
                ", english=" + english +
                ", math=" + math +
                '}';
    }

    // 평균 구하는 메소드
    public double getAvg(){
        return(this.korean + this.english + this.math) / 3.0;

    }

}
