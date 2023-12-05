package org.delivery.api.account.model;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Builder
public class AccountMeResponse {

    private String name;
    private String email;
    private LocalDateTime registeredAt;
}
