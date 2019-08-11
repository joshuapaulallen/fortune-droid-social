package org.yourotherleft.fortunedroid.social.integration;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.test.web.servlet.MockMvc;
import org.yourotherleft.fortunedroid.social.AbstractFortuneDroidSocialTest;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@AutoConfigureMockMvc
public class FortuneDroidSocialIntegrationTest extends AbstractFortuneDroidSocialTest {

    @Autowired
    private MockMvc mvc;

    @Test
    public void testGetFortune() throws Exception {
        mvc.perform(get("/fortune"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.text").exists());
    }

}
