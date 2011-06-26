/*
 * Copyright (c) http://www.prowidesoftware.com/, 2008. All rights reserved.
 */
package com.prowidesoftware.protocol.telnet;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.URL;
import java.net.URLConnection;

/**
 *
 * @author mgriffa@prowidesoftware.com
 */
public class TelnetURLConnection extends URLConnection {
    private Socket socket = null;
    
    public TelnetURLConnection(URL url) {
        super(url);
    }

    
    @Override
    public void connect() throws IOException {
        socket = new Socket(getURL().getHost(), getURL().getPort());
    }

    @Override
    public InputStream getInputStream() throws IOException {
        if (socket==null) {
            throw new IllegalStateException("Not connected");
        }
        return socket.getInputStream();
    }

    @Override
    public OutputStream getOutputStream() throws IOException {
        if (socket==null) {
            throw new IllegalStateException("Not connected");
        }
        return socket.getOutputStream();
    }

    
    
}
