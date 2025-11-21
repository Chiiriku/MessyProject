import java.io.*;
import java.util.*;

public class Persister
{
  public static void save(ArrayList<User> u) throws IOException
  {
    File file = new File("users.txt"); // Creates file object
    FileWriter fw = new FileWriter(file); // Creates file
    BufferedWriter bw = new BufferedWriter(fw); // Create BufferedWriter
    for (int x = 0; x <= u.size(); x++) // Create a loops
    {
      bw.write(u.get(x).c_nam); // Write first thing
      bw.write(u.get(x).getId()); // Write second thin

      bw.close();
    }
  }
}
