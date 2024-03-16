package cos_mama_backend.project;

import jakarta.persistence.*;

@Entity
public class BillingInformation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    @JoinColumn(name = "user_id")
    private User user;

    private String name;
    private String address;
    private String city;
    private String state;
    private String zipCode;
    private String country;

    // Getters and setters for all fields

    public BillingInformation(User user, String name, String address, String city, String state, String zipCode, String country) {
        this.user = user;
        this.name = name;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
        this.country = country;
    }

    // Add any additional methods you need for your BillingInformation class here
}
