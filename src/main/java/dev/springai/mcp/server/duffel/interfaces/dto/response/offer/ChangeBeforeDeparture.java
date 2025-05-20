package dev.springai.mcp.server.duffel.interfaces.dto.response.offer;

import lombok.Data;

@Data
public class ChangeBeforeDeparture {

    private String penaltyCurrency;
    private String penaltyAmount;
    private boolean allowed;

}
