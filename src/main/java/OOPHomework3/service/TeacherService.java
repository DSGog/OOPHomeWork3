package OOPHomework3.service;

import OOPHomework3.data.Teacher;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class TeacherService implements UserService<Teacher> {

    private final List<Teacher> teachers;

    public TeacherService() {
        this.teachers = new ArrayList<>();
    }

    @Override
    public List<Teacher> getAll() {
        return teachers;
    }

    @Override
    public void create(String firstName, String secondName, String patronymic, LocalDate dateOfBirth) {
        Long countMaxId = 0L;
        for (Teacher teacher : teachers) {
            if (teacher.getTeacherId() > countMaxId) {
                countMaxId = teacher.getTeacherId();
            }
        }
        countMaxId++;
        Teacher teacher = new Teacher(firstName, secondName, patronymic, dateOfBirth);
        teacher.setTeacherId(countMaxId);
        teachers.add(teacher);
    }

    public void updateTeacher(Long teacherId, String newFirstName, String newSecondName, String newPatronymic, LocalDate newDateOfBirth) {
        for (Teacher teacher : teachers) {
            if (teacher.getTeacherId().equals(teacherId)) {
                teacher.setFirstName(newFirstName);
                teacher.setSecondName(newSecondName);
                teacher.setPatronymic(newPatronymic);
                teacher.setDateOfBirth(newDateOfBirth);
            }
        }
    }
}
