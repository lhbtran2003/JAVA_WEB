package liliana.session_9.model.service.ex2;

import liliana.session_9.model.entity.ex2.Movie;

import java.util.List;

public interface IMovieService {
    List<Movie> getAllMovies();
    Movie getMovieById(int id);
}
