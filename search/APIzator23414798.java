package com.stackoverflow.api;

/**
 * What is the difference between up-casting and down-casting with respect to class variable
 *
 * @author APIzator
 * @see <a href="https://stackoverflow.com/a/23414798">https://stackoverflow.com/a/23414798</a>
 */
public class APIzator23414798 {

  public static void be() throws RuntimeException {
    Animal animal = new Dog();
    Dog castedDog = (Dog) animal;
    Animal animal = new Animal();
    Dog notADog = (Dog) animal;
    // Maybe a Dog? Maybe a Cat? Maybe an Animal?
    Animal animal = getAnimal();
    if (animal instanceof Dog) {
      // Guaranteed to succeed, barring classloader shenanigans
      Dog castedDog = (Dog) animal;
    }
  }
}
