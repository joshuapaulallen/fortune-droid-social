package org.yourotherleft.fortunedroid.social.service.connector;

import org.springframework.web.client.RestTemplate;
import org.yourotherleft.fortunedroid.social.service.type.Fortune;

import java.net.URI;
import java.net.URISyntaxException;

/**
 * Interacts with a single Fortune Droid API at a predetermined location.
 *
 * @author josh
 */
public class FortuneDroidClient {

    private final RestTemplate client;
    private final URI getFortuneUri;

    public FortuneDroidClient(final URI fortuneDroidBaseUri) throws URISyntaxException {
        this.client = new RestTemplate();
        this.getFortuneUri = new URI(fortuneDroidBaseUri + "/fortune");
    }

    public Fortune getFortune() {
        return client.getForObject(getFortuneUri, Fortune.class);
    }

}
