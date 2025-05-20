package dev.springai.mcp.server.duffel.interfaces.dto.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class OfferResponseData {

    @JsonProperty("data")
    private OfferResponse offerResponse;
}
