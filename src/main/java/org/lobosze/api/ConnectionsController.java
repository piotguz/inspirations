package org.lobosze.api;

import org.lobosze.api.data.ConnectionsInput;
import org.lobosze.api.lot.LotApiClient;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.Map;

@RestController
@CrossOrigin
public class ConnectionsController {
    @RequestMapping(value = "/connections", method = RequestMethod.POST)
    public Map getConnections(ConnectionsInput input) throws IOException {
        LotApiClient client = new LotApiClient(input.getMarket(), input.getLanguage());

        String token = client.getToken();

        return client.getConnections(
                token,
                input.getFromCity(),
                input.getTargetCities(),
                input.getDepartureDate(),
                input.getReturnDate(),
                input.getPassengers()
        );
    }
}
