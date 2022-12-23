package untitled.infra;

import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;
import untitled.domain.*;

@Component
public class CatHateoasProcessor
    implements RepresentationModelProcessor<EntityModel<Cat>> {

    @Override
    public EntityModel<Cat> process(EntityModel<Cat> model) {
        return model;
    }
}
