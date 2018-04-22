package nl.tan.keeyeong.template.domain.sample.events;

import lombok.Builder;
import lombok.Value;

import java.util.UUID;

@Value
@Builder
public class SampleCreatedEvent {
    private UUID id;
}
