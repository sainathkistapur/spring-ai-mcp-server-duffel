package dev.springai.mcp.server.duffel.controller;

import dev.springai.mcp.server.duffel.interfaces.dto.response.OfferResponse;
import dev.springai.mcp.server.duffel.interfaces.dto.response.OfferResponseData;
import dev.springai.mcp.server.duffel.service.flights.FlightService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/springai/mcp/server/duffel")
@Slf4j
public class ServiceTestController {

    private final FlightService flightService;

    @GetMapping(produces = "application/json")
    public OfferResponseData getOffers(@RequestParam String origin,
                                   @RequestParam String destination,
                                   @RequestParam String departureDate) {
        OfferResponseData OfferResponseData = flightService.getFlightOffers(origin, destination, departureDate);
        log.info(OfferResponseData.getOfferResponse().getId());
        return OfferResponseData;
    }
}
