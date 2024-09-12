package OOPHomework3.view;

import OOPHomework3.data.StudentGroup;
import java.util.logging.Logger;

public class StudentViewGroup {

    Logger logger = Logger.getLogger(StudentViewGroup.class.getName());

    public void sendOnConsole(StudentGroup studentGroup) {
        logger.info(studentGroup.toString()); // Отображаем информацию о группе студентов
    }
}
