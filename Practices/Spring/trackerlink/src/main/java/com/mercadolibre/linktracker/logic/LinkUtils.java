package com.mercadolibre.linktracker.logic;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

public class LinkUtils {

    public boolean urlIsValid(final String url) {
        try {
            new URL(url).toURI();
            return true;
        } catch (MalformedURLException | URISyntaxException e) {
            return false;
        }
    }

    public boolean passwordIsValid(final String password) {
        if (password.equals("")) {
            return false;
        } else {
            return true;
        }
    }

}
