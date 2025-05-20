package dev.springai.mcp.server.duffel.interfaces.dto.response;

import lombok.Data;

@Data
public class Slice {

    private String destinationType;
    private String originType;
    private String departureDate;
    private Location destination;
    private Location origin;

}
