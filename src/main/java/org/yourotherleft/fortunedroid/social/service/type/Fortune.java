package org.yourotherleft.fortunedroid.social.service.type;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import lombok.Builder;
import lombok.Data;

/**
 * A pojo representing a fortune.
 *
 * In order to play nicely with Jackson deserialization but maintain immutability and builder functionality, we must explicitly define the class of the builder. We merely need to name it, Lombok fills in the details.
 */
@Data
@Builder(builderClassName = "FortuneBuilder")
@JsonDeserialize(builder = Fortune.FortuneBuilder.class)
public class Fortune {

    private final String text;

    @JsonPOJOBuilder(withPrefix = "")
    public static class FortuneBuilder {
        // Lombok will add constructor, setters, build method
    }

}
