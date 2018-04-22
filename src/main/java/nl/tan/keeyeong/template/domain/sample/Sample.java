package nl.tan.keeyeong.template.domain.sample;

import nl.tan.keeyeong.template.domain.sample.commands.CreateSampleCommand;
import nl.tan.keeyeong.template.domain.sample.events.SampleCreatedEvent;
import org.axonframework.commandhandling.CommandHandler;
import org.axonframework.commandhandling.model.AggregateIdentifier;
import org.axonframework.commandhandling.model.AggregateLifecycle;
import org.axonframework.eventsourcing.EventSourcingHandler;
import org.axonframework.spring.stereotype.Aggregate;

import java.util.UUID;

@Aggregate
public class Sample {
    @AggregateIdentifier
    private UUID id;

    @CommandHandler
    public Sample(final CreateSampleCommand command) {
        AggregateLifecycle.apply(SampleCreatedEvent.builder().id(command.getId()).build());
    }

    @EventSourcingHandler
    public void on(final SampleCreatedEvent event) {
        this.id = event.getId();
    }
}
