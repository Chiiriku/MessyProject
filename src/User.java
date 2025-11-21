public class User
{
    public int c_id;
    public String c_nam;


    public User(int id, String name){
        c_id = id;
        if(name.length() < 0 || name.length() > 100) // Testing length
        {
            return; //If string is invalid, we dont try to store it
        }
        c_nam = name;
    }

    public void setC_nam(String n)
    {
        if(n.length() < 0)
        {
            return; //If string is invalid, we dont try to store it
        }
        c_nam = n;
    }

      public int geti(){ return c_id; }

    public String getn(){ return c_nam; }


    @Override
    public boolean equals(Object o){
        if(o instanceof User u){
            return u.c_nam == c_nam;
        }
        return false;
    }
}
