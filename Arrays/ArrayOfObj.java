


class Student  {
    String name;
    int rollno;
    int marks;
}

public class ArrayOfObj {

    public static void main(String[] args) {
        Student s1= new Student();
        s1.name="Fouad";
        s1.rollno=1;
        s1.marks=90;

        Student s2= new Student();
        s2.name="Adam";
        s2.rollno=2;
        s2.marks=80;

        Student s3= new Student();
        s3.name="Karim";
        s3.rollno=3;
        s3.marks=70;

        Student students[] =new Student[3];
        students[0]=s1;
        students[1]=s2;
        students[2]=s3;
        for(int i =0;i<students.length;i++){
            System.out.println(students[i].name + " : " + students[i].marks);
        }
    }
}
