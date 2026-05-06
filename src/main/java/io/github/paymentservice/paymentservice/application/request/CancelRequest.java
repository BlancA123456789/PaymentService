package io.github.paymentservice.paymentservice.application.request;

import jakarta.validation.constraints.NotBlank;

public record CancelRequest (
        @NotBlank (message = "결제 ID를 입력하셔야 합니다.")
        String paymentId

){
}
