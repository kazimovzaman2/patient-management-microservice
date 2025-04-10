package tech.zamankazimov.billingservice.grpc;

import billing.BillingServiceGrpc.BillingServiceImplBase;
import billing.BillingRequest;
import billing.BillingResponse;
import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@GrpcService
public class BillingGrpcService extends BillingServiceImplBase {

    private static final Logger log = LoggerFactory.getLogger(BillingGrpcService.class);

    @Override
    public void createBillingAccount(BillingRequest billingRequest, StreamObserver<BillingResponse> responseObserver) {

        log.info("createBillingAccount request received: {}", billingRequest.toString());

        // Business logic to create a billing account would go here

        BillingResponse response = BillingResponse.newBuilder().setAccountId(billingRequest.getPatientId()).setStatus("ACTIVE").build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();

    }

}
