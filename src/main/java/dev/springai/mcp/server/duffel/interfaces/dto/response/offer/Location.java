package dev.springai.mcp.server.duffel.interfaces.dto.response.offer;

import lombok.Data;

@Data
public class Location {
    private String cityName;
    private String iataCode;
    private double latitude;
    private double longitude;
    private String type;
    private String name;
    private String id;

}
