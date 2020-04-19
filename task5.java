/*
1)Single: Create class Student and inherit it from class Employee.
Add to the Student object scholarship field.
2)Multilevel: Create class ExcellentStudent and inherit it from class Student.
Add to the ExcellentStudent object highScholarship field.
3)Hierarchical: Create class BadStudent, ExcellentStudent and inherit it from class Employee.
Add to the BadStudent object lowScholarship field.
*/

class Employee{
    void University(){
        System.out.println("Astana IT University");
    }
}

class Student extends Employee{
    void Scholarship(){
        System.out.println("Scholarship: 20000tg");
    }
}

class ExcellentStudent extends Student{
    void highScholarship(){
        System.out.println("Highscholarship: 30000tg");
    }
}


class BadStudent extends Employee{
    void lowScholarship(){
        System.out.println("Lowscholarship: 10000tg");
    }
}

class ExcellentStudent2 extends Employee{
    void highScholarship2(){
        System.out.println("HighscholarshipTwo: 40000tg");
    }
}

class Main {

    public static void main(String[] args) {
        Student id = new Student();
        id.University();
        id.Scholarship();
        System.out.println();

        ExcellentStudent id1 = new ExcellentStudent();
        id1.highScholarship();
        System.out.println();

        BadStudent id2 = new BadStudent();
        id2.lowScholarship();
        System.out.println();

        ExcellentStudent2 id3 = new ExcellentStudent2();
        id3.highScholarship2();

    }
}
