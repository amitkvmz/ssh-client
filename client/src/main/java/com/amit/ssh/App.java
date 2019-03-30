package com.amit.ssh;

import org.apache.sshd.client.SshClient;
import org.apache.sshd.client.session.ClientSession;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args )
    {
        SshClient sshClient = SshClient.setUpDefaultClient();
        String user = "amit";
        String host = "";
        int port = 22;
//
//        // using the client for multiple sessions...
//        try (ClientSession session = sshClient.connect(user, host, port).verify(...timeout...).getSession()) {
//        session.addPasswordIdentity(...password..); // for password-based authentication
//        // or
//        session.addPublicKeyIdentity(...key-pair...); // for password-less authentication
//        // Note: can add BOTH password AND public key identities - depends on the client/server security setup
//
//        session.auth().verify(...timeout...);
//        // start using the session to run commands, do SCP/SFTP, create local/remote port forwarding, etc...
//    }
//
//        // NOTE: this is just an example - one can open multiple concurrent sessions using the same client.
//        //      No need to close the previous session before establishing a new one
//        try (ClientSession anotherSession = client.connect(otherUser, otherHost, port)
//                .verify(...timeout...)
//                    .getSession()) {
//        anotherSession.addPasswordIdentity(...password..); // for password-based authentication
//        anotherSession.addPublicKeyIdentity(...key-pair...); // for password-less authentication
//        anotherSession.auth().verify(...timeout...);
//        // start using the session to run commands, do SCP/SFTP, create local/remote port forwarding, etc...
//    }
//
//        // exiting in an orderly fashion once the code no longer needs to establish SSH session
//        // NOTE: this can/should be done when the application exits.
//        client.stop();
        System.out.println( "Hello World!" );
    }



}
