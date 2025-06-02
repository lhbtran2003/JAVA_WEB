package liliana.session_9.model.service.ex2;

import liliana.session_9.model.dao.ex2.MovieDAOImpl;
import liliana.session_9.model.entity.ex2.Movie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class MovieServiceImpl implements IMovieService {
    @Autowired
    MovieDAOImpl movieDAO;
    @Override
    public List<Movie> getAllMovies() {
        return movieDAO.getAllMovies();
    }

    @Override
    public Movie getMovieById(int id) {
        return movieDAO.getMovieById(id);
    }


}
