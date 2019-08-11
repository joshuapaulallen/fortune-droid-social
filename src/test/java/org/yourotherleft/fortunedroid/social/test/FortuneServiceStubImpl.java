package org.yourotherleft.fortunedroid.social.test;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
import org.yourotherleft.fortunedroid.social.service.FortuneService;
import org.yourotherleft.fortunedroid.social.service.type.Fortune;

/**
 * A stubbed implementation of {@link FortuneDroidClient} which returns the same fortune every time. Overrides all other implementations when running tests.
 */
@Primary
@Service
public class FortuneServiceStubImpl implements FortuneService {

    private static final Fortune FORTUNE = Fortune.builder().text("Just for a moment, let's be still.").build();

    @Override
    public Fortune getFortune() {
        return FORTUNE;
    }

}
