import java.util.ArrayList;

/**
 * Created by Rajeev Nagarwal on 4/3/2017.
 */
public class Test {
    public static void main(String[] args)
    {
        Layout layout = new Layout();
        ArrayList<Blocks> tables = Layout.tables;
        experiment(tables,"MRU","Employee","Department",10);

    }
    public static void experiment(ArrayList<Blocks> tables,String policy,String R,String S,int Buffer)
    {

        BufferManager.initialize(Buffer);
        PageTable pageTable = new PageTable();
        Experiment.nested_join(tables,R,S,pageTable,policy);
        System.out.println(PageTable.page_fault);
    }


}
