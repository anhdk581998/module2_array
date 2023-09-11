import java.util.Arrays;

public class Student {
    public String name;
    public int age;


    public int[] score;

    public Student(String nameInput, int ageInput, int[] scoreInput) {
        this.name = nameInput;
        this.age = ageInput;
        this.score = scoreInput;
    }

    public String changeName(String namechange) {
        return this.name = namechange;
    }

    public int changeAge(int agechange) {
        return this.age = agechange;
    }
    public int[] scoreChange(int[] scoreChange){
        return this.score = scoreChange;
    }
    public double Average(){
        double sum = 0;
        int count = 0;
        for (int i = 0; i < score.length; i++) {
            sum += score[i];
            count++;
        }
        return sum/count;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", score=" + Arrays.toString(score) +
                '}';
    }
}
