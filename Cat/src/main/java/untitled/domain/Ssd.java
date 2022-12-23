package untitled.domain;

import java.util.*;
import lombok.*;
import untitled.domain.*;
import untitled.infra.AbstractEvent;

@Data
@ToString
public class Ssd extends AbstractEvent {

    private Long id;
    private String name;

    public Ssd(Cat aggregate) {
        super(aggregate);
    }

    public Ssd() {
        super();
    }
}
