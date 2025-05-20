package dev.springai.mcp.server.duffel.interfaces.dto.request.offer;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class OfferData {

    private List<Slice> slices;
    private List<Passenger> passengers;
    private String cabin_class;

}
