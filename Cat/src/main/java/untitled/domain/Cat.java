package untitled.domain;

import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;
import untitled.CatApplication;
import untitled.domain.CatStart;
import untitled.domain.Name;
import untitled.domain.Ssd;
import untitled.domain.TestEve;

@Entity
@Table(name = "Cat_table")
@Data
public class Cat {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;

    private String tt;

    private String ad;

    @PostPersist
    public void onPostPersist() {
        //Following code causes dependency to external APIs
        // it is NOT A GOOD PRACTICE. instead, Event-Policy mapping is recommended.

        untitled.external.CatShip catShip = new untitled.external.CatShip();
        // mappings goes here
        CatApplication.applicationContext
            .getBean(untitled.external.CatShipService.class)
            .catReceivce(catShip);

        CatStart catStart = new CatStart(this);
        catStart.publishAfterCommit();

        Ssd ssd = new Ssd(this);
        ssd.publishAfterCommit();

        Name name = new Name(this);
        name.publishAfterCommit();

        TestEve testEve = new TestEve(this);
        testEve.publishAfterCommit();
    }

    public static CatRepository repository() {
        CatRepository catRepository = CatApplication.applicationContext.getBean(
            CatRepository.class
        );
        return catRepository;
    }
}
