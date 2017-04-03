import java.util.ArrayList;

/**
 * Created by Rajeev Nagarwal on 4/3/2017.
 */
public class Experiment {
    public static void nested_join(ArrayList<Blocks> tables,String R,String S)
    {
        ArrayList<Blocks> r = getTable(R,tables);
        ArrayList<Blocks> s = getTable(S,tables);
        join(r,s);
    }

    private static void join(ArrayList<Blocks> R, ArrayList<Blocks> S) {
        for (int i = 0; i < R.size(); i++) {
            String address = R.get(i).id;
            for (int j = 0; j < S.size(); j++) {
                String address1 = S.get(j).id;
                for (int k = 0; k < R.get(i).no_records; k++) {
                    for (int l = 0; l < S.get(j).no_records; j++) {

                    }
                }
            }
        }

    }
    private static ArrayList<Blocks> getTable(String r,ArrayList<Blocks> tables)
    {
        ArrayList<Blocks> result = new ArrayList<Blocks>();
        if(r.equals("Employee"))
        {
            result = (ArrayList<Blocks>)tables.subList(0,Sizes.no_employee);

        }
        else if(r.equals("Department"))
        {
            result = (ArrayList<Blocks>)tables.subList(Sizes.no_employee,Sizes.no_employee+ Sizes.no_department);

        }
        else if(r.equals("Project"))
        {
            result = (ArrayList<Blocks>)tables.subList(Sizes.no_employee+ Sizes.no_department,Sizes.no_employee+Sizes.no_department+Sizes.no_project);

        }

        return result;
    }

}
