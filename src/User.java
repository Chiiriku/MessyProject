public class User
{
  public int c_id;
  public String c_nam;

  public User(int id, String name)
  {
    c_id = id;
    if ((name.length() <= 0) || (name.length() >= 100)) // Testing length
    {

    }
    c_nam = name;
  }

      public int getId(){ return c_id; }

    public String getName(){ return c_nam; }


    @Override
    public boolean equals(Object o){
        if(o instanceof User u){
            return u.c_nam == c_nam;
        }
        return false;
    }
}
