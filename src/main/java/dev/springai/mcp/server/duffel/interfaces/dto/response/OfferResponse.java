package dev.springai.mcp.server.duffel.interfaces.dto.response;

import dev.springai.mcp.server.duffel.interfaces.dto.response.offer.Offer;
import lombok.Data;

import java.util.List;


@Data
public class OfferResponse {

    private String id;

    private List<Offer> offers;

    private List<Slice> slices;

    private List<Passenger> passengers;

    private String createdAt;

    private String  cabinClass;

   private boolean liveMode;

   private String clientKey;


}
