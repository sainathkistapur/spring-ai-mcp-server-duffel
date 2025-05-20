package dev.springai.mcp.server.duffel.interfaces.dto.response.offer;


import lombok.Data;

@Data
public class Owner {

    private String logoSymbolUrl;
    private String logoLockupUrl;
    private String conditionsOfCarriageUrl;
    private String iataCode;
    private String name;
    private String id;

}
