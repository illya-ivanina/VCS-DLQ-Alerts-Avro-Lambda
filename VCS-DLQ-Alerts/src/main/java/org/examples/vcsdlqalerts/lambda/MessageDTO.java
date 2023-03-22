package org.examples.vcsdlqalerts.lambda;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class MessageDTO {
    private String topic;
    private int partition;
    private long offset;
    private String message;
}
