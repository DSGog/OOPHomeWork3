package OOPHomework3.view;

import OOPHomework3.data.User;
import java.util.List;

public interface UserView<T extends User> {
    void sendOnConsole(List<T> list);
}
