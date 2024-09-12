package OOPHomework3.service;

import OOPHomework3.data.Teacher;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class TeacherService implements UserService<Teacher> {
    private final List<Teacher> teachers;
    private final IdGenerator idGenerator;

    public TeacherService() {
        this.teachers = new ArrayList<>();
        this.idGenerator = new IdGenerator();
    }

    @Override
    public List<Teacher> getAll() {
        return teachers;
    }

    @Override
    public void create(String firstName, String secondName, String patronymic, LocalDate dateOfBirth) {
        Long newId = idGenerator.generateId(teachers); // Генерация идентификатора через отдельный класс
        Teacher teacher = new Teacher(firstName, secondName, patronymic, dateOfBirth);
        teacher.setTeacherId(newId);
        teachers.add(teacher);
    }

    public void updateTeacher(Long teacherId, String newFirstName, String newSecondName, String newPatronymic, LocalDate newDateOfBirth) {
        // Логика обновления данных учителя
    }
}
