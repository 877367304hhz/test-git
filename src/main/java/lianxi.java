/**
 * Created by Administrator on 2018/7/11 0011.
 */
public class lianxi {
    private String name;
    private String password;



    public lianxi() {
    }

    @Override
    public String toString() {
        return "lianxi{" +
                "name='" + name + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public lianxi(String name, String password) {

        this.name = name;
        this.password = password;
    }
}
