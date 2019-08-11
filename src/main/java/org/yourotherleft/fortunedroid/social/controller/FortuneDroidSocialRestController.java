package org.yourotherleft.fortunedroid.social.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.yourotherleft.fortunedroid.social.service.FortuneService;
import org.yourotherleft.fortunedroid.social.service.type.Fortune;

@RestController
@RequestMapping("/fortune")
public class FortuneDroidSocialRestController {

    private final static Logger logger = LoggerFactory.getLogger(FortuneDroidSocialRestController.class);

    private final FortuneService fortuneService;

    @Autowired
    public FortuneDroidSocialRestController(final FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @RequestMapping(method = RequestMethod.GET)
    public Fortune getFortune() {
        final Fortune fortune = fortuneService.getFortune();

        logger.info("fortune requested, fetched from fortune-droid {}", fortune);

        return fortune;
    }

}
