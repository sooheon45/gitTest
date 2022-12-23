package untitled.external;

import java.util.Date;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "CatShip", url = "${api.url.CatShip}")
public interface CatShipService {
    @RequestMapping(method = RequestMethod.POST, path = "/catShips")
    public void catReceivce(@RequestBody CatShip catShip);
}
