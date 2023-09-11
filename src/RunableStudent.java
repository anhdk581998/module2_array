import java.util.Arrays;

public class RunableStudent {
    public static void main(String[] args) {
        int[] scoreNam = {1,2,3,4};
        Student nam = new Student("nam", 1, scoreNam);
        nam.changeAge(18);
        System.out.println(nam);
        System.out.println("diem trung binh cua nam la: "+ nam.Average());
    }
}
