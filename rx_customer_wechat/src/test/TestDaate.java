import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Administrator on 2017/7/4.
 */
public class TestDaate {
    public static void main(String []args){
        String strDate = "30-06-2017";
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        java.util.Date date = null;
            try {
                date = sdf.parse(strDate);

            } catch (ParseException e) {
                e.printStackTrace();
            }
        java.sql.Date date1 = new java.sql.Date(date.getTime());
        System.out.println(date1);
    }
}
