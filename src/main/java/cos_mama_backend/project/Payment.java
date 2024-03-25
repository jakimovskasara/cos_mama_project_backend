package cos_mama_backend.project;

// Import statements

@Entity
public class Payment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private User user;

    // Constructors

    public Payment(User user) {
        this.user = user;
    }

    public Payment() {
        this.user = new User();
    }

    // Getters and Setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    // Methods
  
    public void updateUser(User user) {
        this.user = user;
    }

    public boolean isAssociatedWith(User user) {
        return this.user != null && this.user.equals(user);
    }

    // Add any other methods needed
}
