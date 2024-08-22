package mate.academy.rickandmorty.controller;

import java.util.List;
import lombok.RequiredArgsConstructor;
import mate.academy.rickandmorty.dto.internal.CharacterDto;
import mate.academy.rickandmorty.service.CharacterService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class RickandmortyapiController {
    private final CharacterService characterService;

    @GetMapping("/random")
    public CharacterDto getRandomCharacter() {
        int numberDbRecords = characterService.getAll().size();
        Long randomNumber = (long) (Math.random() * numberDbRecords);

        return characterService.getById(randomNumber);
    }

    @GetMapping("/search/{name}")
    public List<CharacterDto> getCharactersByName(@PathVariable String name) {
        return characterService.findAllByName(name);
    }
}
