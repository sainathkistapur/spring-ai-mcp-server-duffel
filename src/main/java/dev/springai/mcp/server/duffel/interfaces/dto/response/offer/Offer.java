package dev.springai.mcp.server.duffel.interfaces.dto.response.offer;

import lombok.Data;

import java.util.List;

@Data
public class Offer {
    private String totalEmissionsKg;
    private PaymentRequirements paymentRequirements;
    private List<String> supportedPassengerIdentityDocumentTypes;
    private boolean passengerIdentityDocumentsRequired;
    private String taxCurrency;
    private String baseCurrency;
    private String baseAmount;
    private List<String> supportedLoyaltyProgrammes;
    private List<Object> privateFares;
    private String taxAmount;
    private String totalCurrency;
    private String createdAt;
    private boolean liveMode;
    private String totalAmount;
    private List<Slice> slices;
    private List<Passenger> passengers;
    private Conditions conditions;
    private String updatedAt;
    private String expiresAt;
    private boolean partial;
    private Owner owner;
    private String id;

    // Getters and Setters
}