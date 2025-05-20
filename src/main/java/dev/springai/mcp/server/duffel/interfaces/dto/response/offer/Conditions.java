package dev.springai.mcp.server.duffel.interfaces.dto.response.offer;

import lombok.Data;

@Data
public class Conditions {

    private Object priorityCheckIn;
    private Object priorityBoarding;
    private Object advanceSeatSelection;
    private ChangeBeforeDeparture changeBeforeDeparture;

}
