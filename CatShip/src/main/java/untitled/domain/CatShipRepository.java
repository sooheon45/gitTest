package untitled.domain;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import untitled.domain.*;

@RepositoryRestResource(collectionResourceRel = "catShips", path = "catShips")
public interface CatShipRepository
    extends PagingAndSortingRepository<CatShip, Long> {}
