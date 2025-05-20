package dev.springai.mcp.server.duffel.service.flights;

import dev.springai.mcp.server.duffel.interfaces.FlightSearchInterface;
import dev.springai.mcp.server.duffel.interfaces.dto.request.offer.*;
import dev.springai.mcp.server.duffel.interfaces.dto.response.OfferResponse;
import dev.springai.mcp.server.duffel.interfaces.dto.response.OfferResponseData;
import dev.springai.mcp.server.duffel.interfaces.dto.response.offer.Offer;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
@Slf4j
public class FlightService {

    private final FlightSearchInterface flightSearchInterface;
    public OfferResponseData getFlightOffers(String origin, String destination, String departureDate) {
        log.info("In FlightService:getFlightOffers");
        OfferRequest offerRequest = OfferRequest.builder()
                .data(OfferData.builder()
                        .slices(List.of(
                                Slice.builder()
                                        .origin(origin)
                                        .destination(destination)
                                        .departure_date(departureDate)
                                        .build()
                        ))
                        .passengers(List.of(
                                Passenger.builder()
                                        .type(PassengerType.adult)
                                        .build()
                        ))
                        .build())

                .build();

        OfferResponseData offerResponseData = flightSearchInterface.createOfferRequest(offerRequest);
        OfferResponse offerResponse = offerResponseData.getOfferResponse();
        offerResponse.setOffers(offerResponse.getOffers().stream().limit(2).collect(Collectors.toList()));
        offerResponseData.setOfferResponse(offerResponse);
        return offerResponseData;
    }

}
