package untitled.external;

import org.springframework.stereotype.Service;

@Service
public class CatShipServiceImpl implements CatShipService {

    /**
     * Fallback
     */
    public CatShip getCatShip(Long id) {
        CatShip catShip = new CatShip();
        return catShip;
    }
}
