import java.util.HashMap;

/**
 * Created by Rajeev Nagarwal on 4/4/2017.
 */
public class PageTable {
    public static int seed;
    public static int last;
    public static int page_fault;
    public HashMap<String,Buffer> pageTable;
    public PageTable()
    {
        pageTable = new HashMap<String,Buffer>();
        seed = last = 0;
        page_fault = 0;

    }
    public void pageReference(String address,String type,String policy)
    {
        last++;
        if(!pageTable.containsKey(address))
        {
            PageTable.page_fault++;
            if(BufferManager.hasCapacity())
            {
                pageTable.put(address,new Buffer(BufferManager.list.size()-1+""));
                pageTable.get(address).last_used = last;
            }
            else {
                if (policy.equals("LRU")) {


                } else if (policy.equals("MRU")) {
                    

                }
            }


        }
        else
        {
            pageTable.get(address).last_used = last;
        }
    }


}
