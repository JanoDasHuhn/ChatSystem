package login;

import userProfile.UserProfile;

public interface Login{
    void setUsername(String name);
    String getUsername();
    UserProfile createUserProfile();
}
