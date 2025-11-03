package chatSession;

import connection.Connection;
import userInterface.UserInterface;
import login.Login;

public interface ChatSession {
    void init (Login login, Connection connection, UserInterface  ui);
    void start ( String host, int port);
    void sendMessage(String text);
    void handleIncomingMessage(String remoteText);
    void stop();
}