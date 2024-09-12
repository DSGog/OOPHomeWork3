package OOPHomework3.service;

import OOPHomework3.data.Student;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class StudentService implements UserService<Student> {
    private final List<Student> students;
    private final IdGenerator idGenerator; // Ссылка на IdGenerator для генерации идентификаторов

    public StudentService() {
        this.students = new ArrayList<>();
        this.idGenerator = new IdGenerator(); // Инициализация IdGenerator
    }

    @Override
    public List<Student> getAll() {
        return students; // Возвращаем список всех студентов
    }

    @Override
    public void create(String firstName, String secondName, String patronymic, LocalDate dateOfBirth) {
        Long newId = idGenerator.generateId(students); // Используем IdGenerator для генерации нового идентификатора
        Student student = new Student(firstName, secondName, patronymic, dateOfBirth, newId);
        students.add(student); // Добавляем нового студента в список
    }
}
