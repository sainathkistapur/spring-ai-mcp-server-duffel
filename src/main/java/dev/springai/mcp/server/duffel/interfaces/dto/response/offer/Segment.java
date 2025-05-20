package dev.springai.mcp.server.duffel.interfaces.dto.response.offer;

import lombok.Data;

import java.util.List;

@Data
public class Segment {
    private String originTerminal;
    private String destinationTerminal;
    private Carrier operatingCarrier;
    private Carrier marketingCarrier;
    private String operatingCarrierFlightNumber;
    private List<Object> stops;
    private String marketingCarrierFlightNumber;
    private String distance;
    private List<Passenger> passengers;
    private String duration;
    private Location destination;
    private Location origin;
    private String id;

    // Getters and Setters
}
