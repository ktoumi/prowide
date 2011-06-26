/*
 * Copyright (c) http://www.prowidesoftware.com/, 2008. All rights reserved.
 */
package com.prowidesoftware.protocol.telnet;

import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;

/**
 *
 * @author mgriffa@prowidesoftware.com
 */
public class TelnetProtocol {
 
    public static void registerTelnetProtocol() {
        URL.setURLStreamHandlerFactory(new TelnetURLStreamHandlerFactory());
    }
    
    public static void main(String[]args) throws Exception {
        registerTelnetProtocol();
        URL u = new URL("telnet://google.com:80");
        TelnetURLConnection conn = (TelnetURLConnection) u.openConnection();
        conn.connect();
        conn.getOutputStream().write("GET / HTTP/1.0\r\n\r\n".getBytes());
        InputStream is = conn.getInputStream();
        int c;
        while ((c=is.read())!=-1) {
            System.out.print((char)c);
        }
        
    }
}
