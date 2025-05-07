package anime.hub.controller;

import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Locale;

@RestController
@RequestMapping("v1/heroes")
public class HeroController {

    private static final List<String> HEROES = List.of("Guts", "Kakashi", "Goku");

    @GetMapping
    public List<String> listAllHeroes()
    {
        return HEROES;
    }

    @GetMapping("filter")
    public List<String> listAllHeroesParam(@RequestParam String name)
    {
        return HEROES.stream().filter(n -> n.equalsIgnoreCase(name)).toList();
    }

}
