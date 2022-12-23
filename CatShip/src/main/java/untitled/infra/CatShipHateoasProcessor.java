package untitled.infra;

import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;
import untitled.domain.*;

@Component
public class CatShipHateoasProcessor
    implements RepresentationModelProcessor<EntityModel<CatShip>> {

    @Override
    public EntityModel<CatShip> process(EntityModel<CatShip> model) {
        return model;
    }
}
