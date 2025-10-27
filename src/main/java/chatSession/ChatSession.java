package chatSession;

import connection.Connection;
import userInterface.UserInterface;
import userProfile.UserProfile;

public interface ChatSession {
    void init (UserProfile localUser, Connection connection, UserInterface  ui);
    void start ( String host, int port);
    void sendMessage(String text);
    void handleIncomingMessage(String remoteText);
    void stop();
}