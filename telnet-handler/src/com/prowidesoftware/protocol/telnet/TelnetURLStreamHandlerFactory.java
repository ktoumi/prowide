/*
 * Copyright (c) http://www.prowidesoftware.com/, 2008. All rights reserved.
 */
package com.prowidesoftware.protocol.telnet;

import java.net.URLStreamHandler;
import java.net.URLStreamHandlerFactory;

/**
 *
 * @author mgriffa@prowidesoftware.com
 */
public class TelnetURLStreamHandlerFactory implements URLStreamHandlerFactory {

    @Override
    public URLStreamHandler createURLStreamHandler(String protocol) {
        System.out.println("protocol: "+protocol);
        return new TelnetURLStreamHandler();
    }
    
}
