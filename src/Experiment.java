import java.util.ArrayList;
import java.util.List;

/**
 * Created by Rajeev Nagarwal on 4/3/2017.
 */
public class Experiment {
    public static void nested_join(ArrayList<Blocks> tables,String R,String S,PageTable pTable,String policy)
    {
        ArrayList<Blocks> r = (ArrayList<Blocks>)getTable(R,tables);
        ArrayList<Blocks> s = (ArrayList<Blocks>)getTable(S,tables);
        join(r,s,pTable,policy);
    }

    private static void join(ArrayList<Blocks> R, ArrayList<Blocks> S,PageTable pTable,String policy) {
        for (int i = 0; i < R.size(); i++) {
            String address = R.get(i).id;
            //System.out.println(i);
            pTable.pageReference(address,R.get(i).type,policy);
            for (int j = 0; j < S.size(); j++) {
                String address1 = S.get(j).id;
                pTable.pageReference(address1,S.get(j).type,policy);
                for (int k = 0; k < R.get(i).no_records; k++) {
                    pTable.pageReference(address,R.get(i).type,policy);
                    for (int l = 0; l < S.get(j).no_records; l++) {
                        pTable.pageReference(address1,S.get(j).type,policy);

                    }
                }
            }
        }

    }
    private static List<Blocks> getTable(String r, ArrayList<Blocks> tables)
    {
        List<Blocks> result = new ArrayList<Blocks>();
        if(r.equals("Employee"))
        {
            result = new ArrayList<Blocks>(tables.subList(0,Sizes.no_employee));

        }
        else if(r.equals("Department"))
        {
            result = new ArrayList<Blocks>(tables.subList(Sizes.no_employee,Sizes.no_employee+ Sizes.no_department));

        }
        else if(r.equals("Project"))
        {
            result = new ArrayList<Blocks>(tables.subList(Sizes.no_employee+ Sizes.no_department,Sizes.no_employee+Sizes.no_department+Sizes.no_project));

        }

        return result;
    }

}
