package dev.springai.mcp.server.duffel.interfaces.dto.response.offer;

import lombok.Data;

import java.util.List;

@Data
public class Passenger {
    private String type;
    private String id;
    private Cabin cabin;
    private List<Baggage> baggages;

}
