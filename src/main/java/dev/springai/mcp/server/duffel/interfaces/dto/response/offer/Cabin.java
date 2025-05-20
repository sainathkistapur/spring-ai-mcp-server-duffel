package dev.springai.mcp.server.duffel.interfaces.dto.response.offer;


import lombok.Data;

@Data
public class Cabin {
    private Amenities amenities;
    private String marketingName;
    private String name;

}
