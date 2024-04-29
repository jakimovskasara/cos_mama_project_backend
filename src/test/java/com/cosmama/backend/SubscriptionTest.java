package com.cosmama.backend;

import com.cosmama.backend.api.model.Subscription;
import com.cosmama.backend.api.model.User;
import com.cosmama.backend.api.utils.JWUtils;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class SubscriptionTest {

    @Test
    void testSubscriptionConstructor() {
        User user = new User(200, "Bruce", "Wayne", "brwayne@gmail.com");
        JWUtils.Plan plan = JWUtils.Plan.BASIC;

        Subscription subscription = new Subscription(user, plan);

        assertEquals(user, subscription.getUser()); // This test will only work if there's a getter for User
        assertEquals(plan, subscription.getPlan()); // This test will only work if there's a getter for Plan
    }
}

