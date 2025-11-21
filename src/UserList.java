import java.util.ArrayList;

public class UserList extends ArrayList<User>
{
  public ArrayList<User> u = new ArrayList<User>();

  public void add(User u)
  {
    this.u.add(u);
    if (u == null)
    {
    }
  }

  public ArrayList<User> getUsers(User bob)
  {
    return u;
  }
}
