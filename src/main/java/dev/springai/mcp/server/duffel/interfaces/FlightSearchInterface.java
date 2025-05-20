package dev.springai.mcp.server.duffel.interfaces;

import dev.springai.mcp.server.duffel.interfaces.dto.request.offer.OfferRequest;
import dev.springai.mcp.server.duffel.interfaces.dto.response.OfferResponse;
import dev.springai.mcp.server.duffel.interfaces.dto.response.OfferResponseData;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import javax.validation.Valid;


@Component
@RequiredArgsConstructor
public class FlightSearchInterface {

    private final RestTemplate restTemplate;

    @Value("${duffel.api-key}")
    String duffel_apikey;

    @Value("${duffel.flight-url}")
    String apiUrl;

    private String CUSTOM_HEADER_DUFFEL_VERSION = "Duffel-Version";

    public OfferResponseData createOfferRequest(OfferRequest request) {
        try {
            HttpEntity<OfferRequest> entity = new HttpEntity<>(request, setHeaders());
            return restTemplate.postForObject(apiUrl, entity, OfferResponseData.class);
        } catch (Exception e) {
            throw e;
        }
    }

    private HttpHeaders setHeaders() {
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.set(HttpHeaders.AUTHORIZATION, "Bearer " + duffel_apikey);
        headers.set(CUSTOM_HEADER_DUFFEL_VERSION, "v2");
        headers.set(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE);
        headers.set(HttpHeaders.ACCEPT, MediaType.APPLICATION_JSON_VALUE);

        return headers;
    }

}
