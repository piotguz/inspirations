package org.lobosze;

import okhttp3.*;
import org.lobosze.api.lot.LotApiClient;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.Map;

@Test
public class LotApiTest {

    public void doTell() throws IOException {
        LotApiClient client = new LotApiClient("PL", "EN");

        String token = client.getToken();
        Map connections = client.getConnections(token, "WAW", new String[]{"CDG"}, "22102019", "25112019", 1);

        token.toString();
        connections.toString();




//        RequestBody body = RequestBody.create(MediaType.parse("application/json"), "{ \"params\": { \"cabinClass\": \"E\", \"market\": \"PL\", \"departureDate\": [\"22022019\"], \"returnDate\": \"25022019\", \"origin\": [\"WAW\"], \"tripType\": \"R\", \"adt\": 1, \"destination\": [\"CDG\"] }, \"options\": {\"fromCache\": true,\"fareType\": [\"ALL\"]}}\n");
//
//        Request request = new Request.Builder()
//                .url("https://api.lot.com/flights-dev/v2/booking/availability")
//                .post(body)
//                .addHeader("X-Api-Key", LotApiClient.X_API_KEY)
//                .addHeader("Authorization", "Bearer " + token)
//                .build();
//
//        OkHttpClient xclient = new OkHttpClient();
//
//        Call call = xclient.newCall(request);
//        Response response = call.execute();
//        String string = response.body().string();
//        Assert.assertEquals(response.code(),200);

    }
}
