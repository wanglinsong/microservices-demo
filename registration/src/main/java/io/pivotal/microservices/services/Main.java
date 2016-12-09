package io.pivotal.microservices.services;

import io.pivotal.microservices.services.registration.RegistrationServer;

/**
 * Allow the servers to be invoked from the command-line. The jar is built with
 * this as the <code>Main-Class</code> in the jar's <code>MANIFEST.MF</code>.
 *
 * @author Paul Chapman
 */
public class Main {

    public static void main(String[] args) {
        RegistrationServer.main(args);
    }

    protected static void usage() {
        System.out.println("Usage: java -jar ... <server-name> [server-port]");
        System.out.println(
            "     where server-name is 'reg', 'registration', " + "'accounts' or 'web' and server-port > 1024");
    }
}
