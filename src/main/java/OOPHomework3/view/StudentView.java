package OOPHomework3.view;

import OOPHomework3.data.Student;
import OOPHomework3.data.StudentGroup;
import java.util.List;
import java.util.logging.Logger;

public class StudentView implements UserView<Student> {

    Logger logger = Logger.getLogger(StudentView.class.getName());

    @Override
    public void sendOnConsole(List<Student> students) {
        for (Student student : students) {
            logger.info(student.toString()); // Выводим информацию о каждом студенте
        }
    }
    public void sendOnConsoleUserGroup(StudentGroup studentGroup) {
        logger.info(studentGroup.toString()); // Выводим информацию о группе студентов
    }
}
