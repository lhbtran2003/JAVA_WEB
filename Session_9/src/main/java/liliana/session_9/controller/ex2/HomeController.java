package liliana.session_9.controller.ex2;

import liliana.session_9.model.service.ex2.MovieServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {
    @Autowired
    MovieServiceImpl movieService;
    @GetMapping("/home")
    public String home(Model model) {
        model.addAttribute("list", movieService.getAllMovies());
        System.out.println(movieService.getAllMovies());
        return "ex2/home";
    }

    @GetMapping("/detailMovie")
    public String detailMovie(@RequestParam("id") int movieId, Model model) {
        model.addAttribute("movie", movieService.getMovieById(movieId));
        return "ex2/detailMovie";
    }
}
