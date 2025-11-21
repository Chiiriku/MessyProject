import java.io.IOException;
import java.util.ArrayList;

public class Main
{
  public static void main(String[] args) throws IOException
  {
    User u1 = new User(10, "Bob");
    User u2 = new User(20, "Alice");
    User u3 = new User(30, "Carl");

    ArrayList<User> list = new UserList();
    list.add(u1);
    list.add(u2);
    list.add(u3);

    System.out.println(((UserList) list).getUsers(new User(10, "Bob")));

    Persister.save(list);
  }
}
