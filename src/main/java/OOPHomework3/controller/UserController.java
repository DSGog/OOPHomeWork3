package OOPHomework3.controller;

import OOPHomework3.data.Stream;
import OOPHomework3.data.Student;
import OOPHomework3.data.Teacher;
import OOPHomework3.data.User;
import OOPHomework3.service.DataService;
import OOPHomework3.service.StudentGroupService;
import OOPHomework3.service.StreamService;
import OOPHomework3.view.UserView;

import java.time.LocalDate;
import java.util.List;

public class UserController {
    private final DataService dataService = new DataService();
    private final StudentGroupService studentGroupService = new StudentGroupService();
    private final StreamService streamService = new StreamService(); // New StreamService
    private final UserView userView = new UserView();

    public void createStudent(String firstName, String secondName, String patronymic, LocalDate dateOfBirth) {
        dataService.create(firstName, secondName, patronymic, dateOfBirth);
        List<User> userList = dataService.getAll();
        userView.sendOnConsole(userList);
    }

    public void createStudentGroup(Teacher teacher, List<Student> students) {
        studentGroupService.createStudentGroup(teacher, students);
    }

    public Student getStudentInStudentGroup(String firstName, String secondName) {
        return studentGroupService.getStudentFromStudentGroup(firstName, secondName);
    }

    public List<Student> getSortedListStudentFromStudentGroup() {
        return studentGroupService.getSortedStudentGroup();
    }

    public List<Student> getSortedListByFIOStudentFromStudentGroup() {
        return studentGroupService.getSortedByFIOStudentGroup();
    }

    public void sortStreams(List<Stream> streams) {
        streamService.sortStreams(streams);
    }
}