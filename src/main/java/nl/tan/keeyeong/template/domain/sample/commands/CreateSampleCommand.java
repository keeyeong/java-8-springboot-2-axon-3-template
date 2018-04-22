package nl.tan.keeyeong.template.domain.sample.commands;

import lombok.Builder;
import lombok.Getter;
import org.axonframework.commandhandling.model.AggregateIdentifier;

import java.util.UUID;

@Builder
@Getter
public class CreateSampleCommand {
    @AggregateIdentifier
    private UUID id;
}
