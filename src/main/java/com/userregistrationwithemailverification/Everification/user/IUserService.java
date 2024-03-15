package com.userregistrationwithemailverification.Everification.user;

import com.userregistrationwithemailverification.Everification.registration.RegistrationRequest;
import com.userregistrationwithemailverification.Everification.registration.token.VerificationToken;
import jakarta.servlet.Registration;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

public interface IUserService {
    List<User> getUsers();
    User registerUser(RegistrationRequest request);
    Optional<User> findByEmail(String email);

    void saveUserVerificationToken(User theUser, String verificationToken);

    String validateToken(String theToken);
}
