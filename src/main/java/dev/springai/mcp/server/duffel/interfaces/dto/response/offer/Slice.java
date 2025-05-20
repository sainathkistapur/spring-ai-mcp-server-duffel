package dev.springai.mcp.server.duffel.interfaces.dto.response.offer;

import lombok.Data;

import java.util.List;

@Data
public class Slice {
    private String comparisonKey;
    private int ngsShelf;
    private String destinationType;
    private String originType;
    private String fareBrandName;
    private List<Segment> segments;
    private Conditions conditions;
    private String duration;
    private Location destination;
    private Location origin;
    private String id;

    // Getters and Setters
}
