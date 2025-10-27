package userInterface;

import userProfile.UserProfile;

public interface UserInterface {
    void setSessionListener(SessionListener listener);
    void showConnectionInfo(String infoText);
    void showIncomingMessage(UserProfile from, String messageText);
    void showError(String errorText);
    void startUI();
    void closeUI();
    interface SessionListener {
        void onUserMessageEntered(String messageText);
        void onUserQuitRequested();
    }
}