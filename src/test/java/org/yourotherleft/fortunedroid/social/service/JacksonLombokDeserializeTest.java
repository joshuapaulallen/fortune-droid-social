package org.yourotherleft.fortunedroid.social.service;

import static org.assertj.core.api.Assertions.assertThat;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;
import org.yourotherleft.fortunedroid.social.AbstractFortuneDroidSocialTest;
import org.yourotherleft.fortunedroid.social.service.type.Fortune;

import java.io.IOException;

public class JacksonLombokDeserializeTest extends AbstractFortuneDroidSocialTest {

    private static final ObjectMapper OBJECT_MAPPER = new ObjectMapper();

    @Test
    public void deserializeIntoLombokObject() throws IOException {
        final String fortuneAsJson = "{\"text\":\"You will have a long and unpleasant discussion with your supervisor.\"}";
        final Fortune deserializedFortune = OBJECT_MAPPER.readValue(fortuneAsJson, Fortune.class);
        assertThat(deserializedFortune).isEqualTo(Fortune.builder().text("You will have a long and unpleasant discussion with your supervisor.").build());
    }

}
