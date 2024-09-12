package OOPHomework3.service;

import OOPHomework3.data.Student;
import OOPHomework3.data.User;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class DataService {
    private List<User> users;

    public DataService() {
        this.users = new ArrayList<>();
    }

    public List<User> getAll(){
        return this.users; // Логика только для работы с общими пользователями
    }
    // Логика создания студентов удалена
}
