package org.imsjapan.sample.clicker;

import org.imsglobal.aspect.LtiKeySecretService;
import org.springframework.stereotype.Service;

@Service
public class MockKeyService implements LtiKeySecretService {

    @Override
    public String getSecretForKey(final String key) {
        return "secret";
    }

}
