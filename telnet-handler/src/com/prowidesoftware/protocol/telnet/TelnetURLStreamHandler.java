/*
 * Copyright (c) http://www.prowidesoftware.com/, 2008. All rights reserved.
 */
package com.prowidesoftware.protocol.telnet;

import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLStreamHandler;

/**
 *
 * @author mgriffa@prowidesoftware.com
 */
public class TelnetURLStreamHandler extends URLStreamHandler {

    @Override
    protected URLConnection openConnection(URL u) throws IOException {
        return new TelnetURLConnection(u);
    }
    
}
