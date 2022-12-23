package untitled.domain;

import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;
import untitled.CatShipApplication;

@Entity
@Table(name = "CatShip_table")
@Data
public class CatShip {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @PostPersist
    public void onPostPersist() {}

    public static CatShipRepository repository() {
        CatShipRepository catShipRepository = CatShipApplication.applicationContext.getBean(
            CatShipRepository.class
        );
        return catShipRepository;
    }
}
