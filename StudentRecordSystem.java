import java.util.ArrayList;
import java.util.Scanner;

class StudentInfo
{
    int rollNo;
    String fullName;
    String department;

    StudentInfo(int rollNo, String fullName, String department) {
        this.rollNo = rollNo;
        this.fullName = fullName;
        this.department = department;
    }

    void showDetails()
    {
        System.out.println("Roll: " + rollNo + " | Name: " + fullName + " | Dept: " + department);
    }
}

public class StudentRecordSystem
{
    public static void main(String[] args)
    {
        ArrayList<StudentInfo> studentDataList = new ArrayList<>();
        Scanner inputReader = new Scanner(System.in);

        studentDataList.add(new StudentInfo(101, "Akshara Tayal", "CSE"));
        studentDataList.add(new StudentInfo(102, "Ananya Singh", "CSE"));

        System.out.println("--- My Student Records ---");
        for (StudentInfo eachStudent : studentDataList) {
            eachStudent.showDetails();
        }

        System.out.println("\nTotal Count: " + studentDataList.size());
        inputReader.close();
    }
}  
