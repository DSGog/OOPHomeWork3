package OOPHomework3.controller;

import OOPHomework3.data.Teacher;
import OOPHomework3.service.TeacherService;
import OOPHomework3.view.TeacherView;
import java.time.LocalDate;
import java.util.List;

public class TeacherController implements UserController<Teacher> {

    private final TeacherService teacherService = new TeacherService();
    private final TeacherView teacherView = new TeacherView();

    @Override
    public void create(String firstName, String secondName, String patronymic, LocalDate dateOfBirth) {
        teacherService.create(firstName, secondName, patronymic, dateOfBirth);
        teacherView.sendOnConsole(teacherService.getAll());
    }

    public void editTeacher(Long teacherId, String newFirstName, String newSecondName, String newPatronymic, LocalDate newDateOfBirth) {
        teacherService.updateTeacher(teacherId, newFirstName, newSecondName, newPatronymic, newDateOfBirth);
        teacherView.sendOnConsole(teacherService.getAll());
    }

    public void showAllTeachers() {
        List<Teacher> teachers = teacherService.getAll();
        teacherView.sendOnConsole(teachers);
    }
}
