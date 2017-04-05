import java.util.ArrayList;

/**
 * Created by Rajeev Nagarwal on 4/3/2017.
 */
public class Test {
    public static void main(String[] args)
    {
        Layout layout = new Layout();
        ArrayList<Blocks> tables = layout.tables;
        BufferManager.initialize(100);
        PageTable pageTable = new PageTable();
        Experiment.nested_join(tables,"Employee","Department",pageTable,"LRU");
        System.out.println(PageTable.page_fault);

    }

}
