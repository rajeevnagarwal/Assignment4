/**
 * Created by Rajeev Nagarwal on 4/3/2017.
 */
public class Department extends Blocks {

    public Department(String id)
    {
        super(id,"Department");
        this.no_records = Sizes.no_department/Sizes.department_block;
    }


}
