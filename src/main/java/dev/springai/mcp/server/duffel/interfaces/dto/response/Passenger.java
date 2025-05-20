package dev.springai.mcp.server.duffel.interfaces.dto.response;

import lombok.Data;

import java.util.List;

@Data
public class Passenger {

    private String fareType;
    private List<String> loyaltyProgrammeAccounts;
    private String familyName;
    private String givenName;
    private Integer age;
    private String type;
    private String id;

}
