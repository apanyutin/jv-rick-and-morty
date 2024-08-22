package mate.academy.rickandmorty.dto.external;

import java.util.List;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RickandmortyapiResponseDataDto {
    private RickandmortyapiInfoDto info;
    private List<RickandmortyapiCharacterDto> results;
}
