package liliana.session_9.model.entity.ex2;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class Movie {
    private int id;
    private String title;
    private String director;
    private String genre;
    private String description;
    private Integer duration;
    private String language;

}
