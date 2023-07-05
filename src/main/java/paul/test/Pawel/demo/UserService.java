package paul.test.Pawel.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserService {
    private DataBaseConnection dataBaseConnection;
    @Autowired
    public UserService(DataBaseConnection dataBaseConnection){
        this.dataBaseConnection = dataBaseConnection;
    }
    public void registerUser(String name){
        dataBaseConnection.addUserToDataBase(name);
    }
}
