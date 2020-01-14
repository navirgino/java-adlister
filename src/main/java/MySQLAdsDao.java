import com.mysql.cj.jdbc.Driver;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MySQLAdsDao implements Ads {
    private Connection connection;

    public MySQLAdsDao() {

        try {
            Config config = new Config();
            DriverManager.registerDriver(new Driver());
            this.connection = DriverManager.getConnection(
                    config.getUrl(),
                    config.getUsername(),
                    config.getPassword()
            );
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    @Override
    public List<Ad> all() throws SQLException {
        List<Ad> output = new ArrayList<>();
        Statement statement = connection.createStatement();
        ResultSet rs = statement.executeQuery("select * from ads");
        while (rs.next()) {
            output.add(
                    new Ad(
                            rs.getLong("id"),
                            rs.getLong("user_id"),
                            rs.getString("title"),
                            rs.getString("description")

                    )
            );
        }
        return output;
    }


    @Override
    public Long insert(Ad ad) throws SQLException {

        String query = "INSERT INTO ads(user_id, title, description) VALUES (1, '" + ad.getTitle() + "','" + ad.getDescription() + "')";
        Statement stmt = connection.createStatement();
        stmt.executeUpdate(query, Statement.RETURN_GENERATED_KEYS);
        ResultSet rs = stmt.getGeneratedKeys();
            if(rs.next())
            {
                System.out.println("New record! new ad!" + rs.getLong(1));
            }

        return rs.getLong(1);
    }


    public static void main(String[] args) throws SQLException {
        MySQLAdsDao dao = new MySQLAdsDao();
        //getting all

        Ad test = new Ad(1,"test", "test");
        List<Ad> ads = dao.all();
        dao.insert(test);
        for(Ad ad : ads){
            System.out.println(ad);
        }
    }

}
