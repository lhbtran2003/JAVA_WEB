package liliana.session_9.model.dao.ex2;

import liliana.session_9.configs.DBConnection;
import liliana.session_9.model.entity.ex2.Movie;
import org.springframework.stereotype.Repository;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
@Repository
public class MovieDAOImpl implements IMovieDAO {
    private final String GET_ALL = "{CALL get_all_movies()}";
    private final String GET_BY_ID = "{CALL get_movie_by_id(?)}";

    @Override
    public List<Movie> getAllMovies() {
        Connection conn = DBConnection.getConnection();
        try {
            CallableStatement cstmt = conn.prepareCall(GET_ALL);
            ResultSet rs = cstmt.executeQuery();
            List<Movie> movies = new ArrayList<>();
            while (rs.next()) {
                Movie m = new Movie(
                   rs.getInt("id"),
                        rs.getString("title"),
                        rs.getString("director"),
                        rs.getString("genre"),
                        rs.getString("description"),
                        rs.getInt("duration"),
                        rs.getString("language")
                );
                movies.add(m);
            }
            return movies;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public Movie getMovieById(int id) {
        Connection conn = DBConnection.getConnection();
        try {
            CallableStatement cstmt = conn.prepareCall(GET_BY_ID);
            cstmt.setInt(1, id);
            ResultSet rs = cstmt.executeQuery();
            while (rs.next()) {
                return new Movie(
                     rs.getInt("id"),
                        rs.getString("title"),
                        rs.getString("director"),
                        rs.getString("genre"),
                        rs.getString("description"),
                        rs.getInt("duration"),
                        rs.getString("language")


                );
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return null;
    }
}
