package com.vodafone.endpoint;

import com.vodafone.model.FejlecTipus;
import com.vodafone.model.Keres;
import com.vodafone.model.Valasz;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class ValidationEndpoint {

    private static final String NAMESPACE_URI = "http://idomsoft.hu/szazig/v1";
    public static Boolean isValid = true;

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "Keres")
    @ResponsePayload
    public Valasz isValid(@RequestPayload Keres request) {

        Valasz response = new Valasz();

        FejlecTipus header = new FejlecTipus();
        header.setSzervkod("SZEMAZ");
        header.setTranzakcioKod(request.getFejlec().getTranzakcioKod());
        header.setIdo(request.getFejlec().getIdo());

        if (isValid) {
            response.setLekerValasz("A személyazonosság igazolására alkalmas hatósági igazolvany a megadott adatokkal érvényes.");
        } else {
            response.setLekerValasz("A megadott adatokkal nincs érvényes személyazonosság igazolására alkalmas hatósági igazolvány.");
        }
        response.setFejlec(header);

        return response;
    }
}
