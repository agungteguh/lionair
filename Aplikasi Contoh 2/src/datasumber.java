import javax.sql.DataSource;
import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
/**
 *
 * @author agungteguh
 */
public class datasumber {   
    public static DataSource getMySQLDataSource()
    {
        MysqlDataSource mysqlDS=null;
        try 
        {
            mysqlDS = new MysqlDataSource();
            mysqlDS.setURL("jdbc:mysql://localhost:80/lionair");
            mysqlDS.setUser("");
            mysqlDS.setPassword("");
          //System.out.println("koneksi berhasil;");
        } 
        catch (Exception e) 
        {
            e.printStackTrace();
            //System.err.println("koneksi gagal" +e.getMessage());
        }
        return mysqlDS;
    }
}
