package connection;

public interface Connection{
    void connect (String host, int port) throws ConnectionException;
    boolean isConnected();
    void sendMessage(String message) throws ConnectionException;
    String receiveMessage() throws ConnectionException;
    void disconnect();
}