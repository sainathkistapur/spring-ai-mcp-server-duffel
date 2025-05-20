package dev.springai.mcp.server.duffel.interfaces.dto.request.offer;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class OfferRequest {

    @JsonProperty("data")
    private OfferData data;

}