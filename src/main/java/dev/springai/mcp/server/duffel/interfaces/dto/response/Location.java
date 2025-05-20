package dev.springai.mcp.server.duffel.interfaces.dto.response;

import lombok.Data;

import java.util.List;

@Data
public class Location {

    private String cityName;
    private String icaoCode;
    private String iataCityCode;
    private String iataCountryCode;
    private String iataCode;
    private Double latitude;
    private Double longitude;
    private String timeZone;
    private String type;
    private String name;
    private String id;
    private List<Airport> airports;

}
