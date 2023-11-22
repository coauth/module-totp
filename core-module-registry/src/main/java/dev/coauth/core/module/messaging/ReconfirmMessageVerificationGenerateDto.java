package dev.coauth.core.module.messaging;

import lombok.Builder;
import lombok.Data;
import org.infinispan.protostream.annotations.ProtoFactory;
import org.infinispan.protostream.annotations.ProtoField;


@Builder
@Data
public class ReconfirmMessageVerificationGenerateDto {
    @ProtoField(number = 1)
    private String code;
    @ProtoField(number = 2)
    private Integer appId;
    @ProtoField(number = 3)
    private String userId;
    @ProtoField(number = 4)
    private Integer noOfAttempts;
    @ProtoField(number = 5)
    private String codeChallenge;
    @ProtoField(number = 6)
    private String status;
    @ProtoField(number = 7)
    private ReconfirmFields reconfirmFields;
    @ProtoFactory
    public ReconfirmMessageVerificationGenerateDto(String code, Integer appId, String userId, Integer noOfAttempts, String codeChallenge, String status, ReconfirmFields reconfirmFields) {
        this.code = code;
        this.appId = appId;
        this.userId = userId;
        this.noOfAttempts = noOfAttempts;
        this.codeChallenge = codeChallenge;
        this.status = status;
        this.reconfirmFields = reconfirmFields;
    }

    @Data
    @Builder
    public static class ReconfirmFields {

        @ProtoField(number = 1, required = true)
        private String reconfirmValue;

        @ProtoField(number = 2, required = true)
        private Boolean isVisible;

        @ProtoField(number = 3, required = true)
        private String hintMessage;

    }
}
