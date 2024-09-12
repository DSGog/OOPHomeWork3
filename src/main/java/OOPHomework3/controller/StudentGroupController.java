package OOPHomework3.controller;

import OOPHomework3.data.Student;
import OOPHomework3.data.Teacher;
import OOPHomework3.service.StudentGroupService;
import OOPHomework3.view.StudentView;

import java.util.Collections;
import java.util.List;


public class StudentGroupController {

    private final StudentGroupService studentGroupService = new StudentGroupService(); // Логика работы с группами студентов
    private final StudentView studentView = new StudentView(); // Логика отображения студентов

    public void createStudentGroup(Teacher teacher, List<Student> students) {
        studentGroupService.createStudentGroup(teacher, students);
        studentView.sendOnConsoleUserGroup(studentGroupService.getStudentGroup()); // Отображение группы студентов
    }

    public void getStudentInStudentGroup(String firstName, String secondName) {
        Student student = studentGroupService.getStudentFromStudentGroup(firstName, secondName);
        studentView.sendOnConsole(Collections.singletonList(student)); // Отображение найденного студента
    }

    public void getSortedListStudentFromStudentGroup() {
        List<Student> students = studentGroupService.getSortedStudentGroup();
        studentView.sendOnConsole(students); // Отображение отсортированного списка студентов
    }

    public void getSortedListByFIOStudentFromStudentGroup() {
        List<Student> students = studentGroupService.getSortedByFIOStudentGroup();
        studentView.sendOnConsole(students); // Отображение отсортированного списка по ФИО
    }
}
