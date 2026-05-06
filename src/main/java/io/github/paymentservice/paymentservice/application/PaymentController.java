package io.github.paymentservice.paymentservice.application;

import io.github.paymentservice.paymentservice.application.request.CancelRequest;
import io.github.paymentservice.paymentservice.application.response.CancelResponse;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/payments")
@RequiredArgsConstructor
public class PaymentController {

    private final PaymentService paymentService;

    @PostMapping("/cancel")
    @ResponseStatus(HttpStatus.OK)
    public CancelResponse cancel(@Valid @RequestBody CancelRequest request){
        return paymentService.cancelPayment(request);
    }
}
