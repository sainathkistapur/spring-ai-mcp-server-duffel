package dev.springai.mcp.server.duffel.interfaces.dto.request.offer;


import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Passenger {

    private PassengerType type;
    private Integer age;

}
