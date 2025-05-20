package dev.springai.mcp.server.duffel.interfaces.dto.response;

import lombok.Data;

@Data
public class Airport {

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

}
