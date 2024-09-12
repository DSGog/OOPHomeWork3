package OOPHomework3.data;

import java.util.Comparator;

public class TeacherComparator implements Comparator<Teacher> {
    @Override
    public int compare(Teacher t1, Teacher t2) {
        return t1.getTeacherId().compareTo(t2.getTeacherId()); // Сравнение по ID учителя
    }
}
