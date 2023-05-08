import java.sql.*;
import java.util.ArrayList;
import java.util.List;



public class MySQLAdsDao implements Ads  {

    private Connection connection;
    public MySQLAdsDao(Config config) {
        try {
            String url = config.getURL();
            String username = config.getUsername();
            String password = config.getPassword();
            connection = DriverManager.getConnection(url, username, password);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<Ad> all() {
        List<Ad> ads = new ArrayList<>();
        try {
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM ads");
            while(rs.next()) {
                Ad ad = new Ad(
                        rs.getLong("id"),
                        rs.getString("title"),
                        rs.getString("description")
                );
                ads.add(ad);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return ads;
    }

    @Override
    public Long insert(Ad ad) {
        try{
            Statement stmt = connection.createStatement();
            stmt.executeUpdate("INSERT INTO ads (title, description) VALUES('07 Tundra', '$20')");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return null;
    }
}