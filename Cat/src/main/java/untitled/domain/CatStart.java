package untitled.domain;

import java.util.*;
import lombok.*;
import untitled.domain.*;
import untitled.infra.AbstractEvent;

@Data
@ToString
public class CatStart extends AbstractEvent {

    private Long id;

    public CatStart(Cat aggregate) {
        super(aggregate);
    }

    public CatStart() {
        super();
    }
}
