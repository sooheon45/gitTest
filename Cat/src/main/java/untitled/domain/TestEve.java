package untitled.domain;

import java.util.*;
import lombok.*;
import untitled.domain.*;
import untitled.infra.AbstractEvent;

@Data
@ToString
public class TestEve extends AbstractEvent {

    private Long id;

    public TestEve(Cat aggregate) {
        super(aggregate);
    }

    public TestEve() {
        super();
    }
}
