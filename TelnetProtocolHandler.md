# Java Telnet Protocol Handler #

This module contains classes that enable using the telnet: protocol in java urls. telnet is not a registered protocol, and if you attempt to create a url like [telnet://host:port](telnet://host:port) you will get an error for the unregistered protocol.

# What this provides in 1 minute #

  * Register the protocol
> > URL.setURLStreamHandlerFactory(new TelnetURLStreamHandlerFactory());

  * Example usage:
> > new URL("[telnet://google.com:80](telnet://google.com:80)").openConnection();
> > // connect, you may cast the connection class and use input and output streams