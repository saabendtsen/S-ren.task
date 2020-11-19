import java.sql.*;
import java.util.ArrayList;

public class Main {


    public static void main(String[] args) throws SQLException {


        String password = "2881";
        String username = "root";
        String URL = "jdbc:mysql://localhost/world?serverTimezone=UTC";
        PreparedStatement pstmt = null;

        Connection connection = null;
        connection = DriverManager.getConnection(URL, username, password);

        //Task B
        String sql = "SELECT COUNT(*) FROM City";
        pstmt = connection.prepareStatement(sql);
        ResultSet rs = pstmt.executeQuery();
        rs.next();
        System.out.println(rs.getString(1));

        //Task D
        ArrayList<City> cities = new ArrayList<>();

        //Task C
        sql = "SELECT * FROM City WHERE population > 5000000";
        pstmt = connection.prepareStatement(sql);
        rs = pstmt.executeQuery();
        while(rs.next()){
            System.out.println(rs.getString("Name"));
            cities.add(new City(rs.getString("Name"),rs.getInt("population")));
        }
        System.out.println(cities);


        //Task D


        rs.close();
        pstmt.close();




    }
}