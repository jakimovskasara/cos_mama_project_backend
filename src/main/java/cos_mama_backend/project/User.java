package cos_mama_backend.project;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String firstName;

    @Column(nullable = false)
    private String lastName;

    @Column(nullable = false, unique = true)
    private String email;

    @Column(nullable = false)
    private String password;

    @Column(nullable = true)
    private String phone;

    @Column(nullable = true)
    private String address;

    @Column(nullable = true)
    private String postalCode;

    @Column(nullable = true)
    private LocalDateTime forgotPasswordExpiration;

    @Column(nullable = true)
    private String forgotPasswordToken;

    public User() {}

    public User(String firstName, String lastName, String email, String password) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
    }

    // forgot password functionality
    public void forgotPassword(String token, LocalDateTime expiration) {
        this.forgotPasswordToken = token;
        this.forgotPasswordExpiration = expiration;
    }

    public void resetPassword(String newPassword) {
        this.password = newPassword;
        this.forgotPasswordToken = null;
        this.forgotPasswordExpiration = null;
    }

    // edit user information
    public void editUserInfo(String firstName, String lastName, String email, String phone, String address, String postalCode) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phone = phone;
