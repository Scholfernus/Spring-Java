package paul.test.Pawel.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class DataBaseConnection {
    @Value("localHost")
    private String host;
    @Value("Paul")
    private  String userName;
    @Value("test")
    private String password;

    public DataBaseConnection(String host, String userName, String password) {
        this.host = host;
        this.userName = userName;
        this.password = password;
    }

    public void addUserToDataBase(String name){
        System.out.println("User added do db1");
    }

}
