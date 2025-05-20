package dev.springai.mcp.server.duffel.mcp.tooling.flight;


import dev.springai.mcp.server.duffel.interfaces.dto.response.OfferResponseData;
import dev.springai.mcp.server.duffel.service.flights.FlightService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.ai.tool.annotation.Tool;
import org.springframework.ai.tool.annotation.ToolParam;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
@RequiredArgsConstructor
public class FlightServiceTool {

    private final FlightService flightService;

    @Tool(name = "getFlightOffer", description = "Get the flights from a origin to destination on a date.")
    public OfferResponseData getFlightOffer(@ToolParam(description = "From city name to IATA code mapping") String origin,
                                            @ToolParam(description = "To city name to IATA code mapping") String destination,
                                            @ToolParam(description = "Departure or Travel data") String departureDate) {
        log.info("Reached getFlightOffer");
        log.info("origin: {}", origin);
        log.info("destination: {}", destination);
        log.info("departureDate: {}", departureDate);
        return flightService.getFlightOffers(origin, destination, departureDate);
    }
}
