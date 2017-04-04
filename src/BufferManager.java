import java.util.ArrayList;

/**
 * Created by Rajeev Nagarwal on 4/4/2017.
 */
public class BufferManager {
    public static int size;
    public static ArrayList<Blocks> list;

    public static Boolean hasCapacity()
    {
        if(list.size()==size)
        {
            return false;
        }
        else
            return true;
    }
    public void add(String address, String type)
    {
        list.add(new Blocks(address,type));
    }



}

