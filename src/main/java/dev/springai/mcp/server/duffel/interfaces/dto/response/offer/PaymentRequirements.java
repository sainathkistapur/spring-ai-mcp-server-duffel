package dev.springai.mcp.server.duffel.interfaces.dto.response.offer;

import lombok.Data;

@Data
public class PaymentRequirements {
    private String priceGuaranteeExpiresAt;
    private String paymentRequiredBy;
    private boolean requiresInstantPayment;

    // Getters and Setters
}
