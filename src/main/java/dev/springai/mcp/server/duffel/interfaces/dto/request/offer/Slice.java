package dev.springai.mcp.server.duffel.interfaces.dto.request.offer;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Slice {

    private String origin;
    private String destination;
    private String departure_date;
}
