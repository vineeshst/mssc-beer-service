package guru.springframework.msscbeerservice.web.repositories;

import guru.springframework.msscbeerservice.web.domain.Beer;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface BeerRepository extends CrudRepository<Beer, UUID> {
}
