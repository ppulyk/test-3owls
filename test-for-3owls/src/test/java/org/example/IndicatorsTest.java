package org.example;

import org.junit.jupiter.api.Test;
import static io.restassured.RestAssured.given;

class IndicatorsTest {

    String baselUrl = "https://52.bex.su/api";

    private void statusCode(int i) {
    }

    @Test
    public void getIndicatorsId() {
        given()
                .when()
                .get(baselUrl + "/indicators/18")
                .prettyPeek()
                .then();
                statusCode(200);
    }

    @Test
    public void getClasses() {
        given()
                .when()
                .get(baselUrl + "/classes/50")
                .prettyPeek()
                .then();
        statusCode(200);
    }

}
