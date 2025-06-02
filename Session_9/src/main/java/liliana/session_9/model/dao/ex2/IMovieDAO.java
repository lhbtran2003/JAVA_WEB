package liliana.session_9.model.dao.ex2;

import liliana.session_9.model.entity.ex2.Movie;

import java.util.List;

public interface IMovieDAO {
    List<Movie> getAllMovies();
    Movie getMovieById(int id);
}
