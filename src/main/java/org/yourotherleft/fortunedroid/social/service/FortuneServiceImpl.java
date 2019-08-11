package org.yourotherleft.fortunedroid.social.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.yourotherleft.fortunedroid.social.service.connector.FortuneDroidClient;
import org.yourotherleft.fortunedroid.social.service.type.Fortune;

import java.net.URI;
import java.net.URISyntaxException;

@Service
public class FortuneServiceImpl implements FortuneService {

    private final FortuneDroidClient fortuneDroidClient;

    public FortuneServiceImpl(@Value("${fortune.droid.base.url}") final String fortuneDroidBaseUrl) throws URISyntaxException {
        this.fortuneDroidClient = new FortuneDroidClient(new URI(fortuneDroidBaseUrl));
    }

    @Override
    public Fortune getFortune() {
        return fortuneDroidClient.getFortune();
    }

}
