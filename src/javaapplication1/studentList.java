package javaapplication1;


public class studentList {
    //mani
    //honest
    public static void main(String[]args){
    Student s1 = new Student("mani","s1");
    Student[] studentList = new Student[3];
    studentList[0] = s1;
    studentList[1] = new Student("abc","s2");
    studentList[1] = new Student("def","s3");

    for(int i=0; i < studentList.length; i++){
        System.out.println(studentList[i].getSname());
    }
    
    
    }
}

