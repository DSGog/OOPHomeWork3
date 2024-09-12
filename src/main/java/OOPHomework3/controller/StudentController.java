package OOPHomework3.controller;

import OOPHomework3.data.Student;
import OOPHomework3.service.StudentService;
import OOPHomework3.view.StudentView;

import java.time.LocalDate;

public class StudentController implements UserController<Student> {

    private final StudentService dataService = new StudentService(); // Логика управления студентами
    private final StudentView studentView = new StudentView(); // Логика отображения студентов

    @Override
    public void create(String firstName, String secondName, String patronymic, LocalDate dateOfBirth) {
        dataService.create(firstName, secondName, patronymic, dateOfBirth);
        studentView.sendOnConsole(dataService.getAll()); // Отображение всех студентов
    }
}
