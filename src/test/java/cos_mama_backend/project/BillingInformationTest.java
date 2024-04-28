package cos_mama_backend.project;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BillingInformationTest {

    private User user;
    private BillingInformation billingInfo;
    private final String name = "John Doe";
    private final String address = "1234 Main St";
    private final String city = "Anytown";
    private final String state = "State";
    private final String zipCode = "12345";
    private final String country = "Country";

    @BeforeEach
    void setUp() {
        user = new User(); // Assuming User has an appropriate constructor
        billingInfo = new BillingInformation(user, name, address, city, state, zipCode, country);
    }

    @Test
    void testConstructorAndGetter() {
        assertAll("Constructor",
                () -> assertEquals(user, billingInfo.getUser()),
                () -> assertEquals(name, billingInfo.getName()),
                () -> assertEquals(address, billingInfo.getAddress()),
                () -> assertEquals(city, billingInfo.getCity()),
                () -> assertEquals(state, billingInfo.getState()),
                () -> assertEquals(zipCode, billingInfo.getZipCode()),
                () -> assertEquals(country, billingInfo.getCountry())
        );
    }

    @Test
    void testSetters() {
        User newUser = new User(); // Assuming User has an appropriate constructor
        billingInfo.setUser(newUser);
        assertEquals(newUser, billingInfo.getUser());

        String newName = "Jane Doe";
        billingInfo.setName(newName);
        assertEquals(newName, billingInfo.getName());

        String newAddress = "4321 Another St";
        billingInfo.setAddress(newAddress);
        assertEquals(newAddress, billingInfo.getAddress());

        String newCity = "Newtown";
        billingInfo.setCity(newCity);
        assertEquals(newCity, billingInfo.getCity());

        String newState = "New State";
        billingInfo.setState(newState);
        assertEquals(newState, billingInfo.getState());

        String newZipCode = "54321";
        billingInfo.setZipCode(newZipCode);
        assertEquals(newZipCode, billingInfo.getZipCode());

        String newCountry = "New Country";
        billingInfo.setCountry(newCountry);
        assertEquals(newCountry, billingInfo.getCountry());
    }
}