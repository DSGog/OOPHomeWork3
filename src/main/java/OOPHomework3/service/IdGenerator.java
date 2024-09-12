package OOPHomework3.service;

import OOPHomework3.data.Student;
import OOPHomework3.data.Teacher;
import OOPHomework3.data.User;

import java.util.List;

public class IdGenerator {

    public <T extends User> Long generateId(List<T> users) {
        Long maxId = 0L;
        for (T user : users) {
            if (user instanceof Student) {
                maxId = Math.max(maxId, ((Student) user).getStudentId());
            } else if (user instanceof Teacher) {
                maxId = Math.max(maxId, ((Teacher) user).getTeacherId());
            }
        }
        return maxId + 1;
    }
}
