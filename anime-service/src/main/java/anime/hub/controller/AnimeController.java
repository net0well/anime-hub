package anime.hub.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import java.util.List;

@RestController
@RequestMapping("v1")
public class AnimeController {

    @GetMapping("animes")
    public List<String> listAll()
    {
        return List.of("Dragon Ball", "Naruto");
    }


}
