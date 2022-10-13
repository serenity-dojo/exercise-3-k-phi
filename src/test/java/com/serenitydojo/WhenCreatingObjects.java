package com.serenitydojo;

import org.junit.Assert;
import org.junit.Test;

public class WhenCreatingObjects {

    @Test
    public void creating_a_dog() {
        Dog fido = new Dog("Fido", "Bone", 5);
        Assert.assertEquals(fido.getName(), "Fido");
        Assert.assertEquals(fido.getFavoriteToy(), "Bone");
        Assert.assertEquals(fido.getAge(), 5);
    }

    @Test
    public void makeNoise_returns_woof() {
        Dog fido = new Dog("Fido", "Bone", 5);
        Assert.assertEquals("Woof", fido.makeNoise());
    }

    @Test
    public void feed_sets_isFed_to_true() {
        Dog fido = new Dog("Fido", "Bone", 5);
        Assert.assertFalse(fido.isFed);
        fido.feed();
        Assert.assertTrue(fido.isFed);
    }
}
