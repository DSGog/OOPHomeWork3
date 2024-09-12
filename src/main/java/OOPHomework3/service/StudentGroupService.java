package OOPHomework3.service;

import OOPHomework3.data.Student;
import OOPHomework3.data.StudentGroup;
import OOPHomework3.data.Teacher;
import OOPHomework3.data.UserComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentGroupService {
    private StudentGroup studentGroup;

    public void createStudentGroup(Teacher teacher, List<Student> students) {
        this.studentGroup = new StudentGroup(teacher, students);
    }

    public StudentGroup getStudentGroup() {
        return studentGroup;
    }

    public Student getStudentFromStudentGroup(String firstName, String secondName) {
        List<Student> students = studentGroup.getStudents();
        for (Student student : students) {
            if (student.getFirstName().equalsIgnoreCase(firstName) &&
                    student.getSecondName().equalsIgnoreCase(secondName)) {
                return student; // Возвращаем найденного студента
            }
        }
        throw new IllegalStateException(
                String.format("Студент с именем %s и фамилией %s не найден", firstName, secondName)
        );
    }

    public List<Student> getSortedStudentGroup() {
        List<Student> students = new ArrayList<>(studentGroup.getStudents());
        Collections.sort(students); // Сортировка по умолчанию через Comparable
        return students;
    }

    public List<Student> getSortedByFIOStudentGroup() {
        List<Student> students = new ArrayList<>(studentGroup.getStudents());
        students.sort(new UserComparator<>()); // Используем UserComparator для сортировки по ФИО
        return students;
    }
}
