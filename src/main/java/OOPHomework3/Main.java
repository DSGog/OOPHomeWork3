package OOPHomework3;

import OOPHomework3.controller.UserController;
import OOPHomework3.data.Student;
import OOPHomework3.data.StudentGroup;
import OOPHomework3.data.Stream;
import OOPHomework3.data.Teacher;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        UserController userController = new UserController();

        Student student1 = new Student("Иван", "Иванов", "Иванович", LocalDate.of(2000, 1, 1), 1L);
        Student student2 = new Student("Пётр", "Петров", "Петрович", LocalDate.of(2001, 2, 2), 2L);
        Student student3 = new Student("Владимир", "Владимиров", "Владимирович", LocalDate.of(2002, 3, 3), 3L);


        Teacher teacher = new Teacher("Сершгей", "Сергеев", "Сергеевич", LocalDate.of(1975, 5, 5));


        List<Student> studentList = new ArrayList<>();
        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);

        StudentGroup studentGroup = new StudentGroup(teacher, studentList);


        List<StudentGroup> groupList1 = new ArrayList<>();
        groupList1.add(studentGroup);
        Stream stream1 = new Stream(groupList1);

        List<StudentGroup> groupList2 = new ArrayList<>();
        groupList2.add(studentGroup);
        groupList2.add(studentGroup);
        Stream stream2 = new Stream(groupList2);


        List<Stream> streams = new ArrayList<>();
        streams.add(stream2);
        streams.add(stream1);


        System.out.println("До сортировки:");
        printStreams(streams);


        userController.sortStreams(streams);

        System.out.println("После сортировки:");
        printStreams(streams);
    }

    private static void printStreams(List<Stream> streams) {
        for (Stream stream : streams) {
            System.out.println("Поток:");
            for (StudentGroup group : stream.getStudentGroups()) {
                System.out.println("  Учебная группа:");
                System.out.println("    Учитель: " + group.getTeacher().getFirstName() + " " + group.getTeacher().getSecondName());
                for (Student student : group.getStudents()) {
                    System.out.println("    Студент: " + student.getFirstName() + " " + student.getSecondName() +
                            ", ID: " + student.getStudentId() + ", Дата рождения: " + student.getDateOfBirth());
                }
            }
        }
    }
}
