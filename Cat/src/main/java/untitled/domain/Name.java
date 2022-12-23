package untitled.domain;

import java.util.*;
import lombok.*;
import untitled.domain.*;
import untitled.infra.AbstractEvent;

@Data
@ToString
public class Name extends AbstractEvent {

    private Long id;
    private String nameTes;

    public Name(Cat aggregate) {
        super(aggregate);
    }

    public Name() {
        super();
    }
}
