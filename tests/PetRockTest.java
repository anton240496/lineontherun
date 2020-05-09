import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PetRockTest {

    @Test
    void getName() {
        PetRock a = new PetRock("apple");
   assertEquals("apple",a.getInputString());

    }

    @Test
    void test() {
        PetRock a = new PetRock("откопать");
        System.out.println(a.getResult());
        assertNotEquals("откопать", a.getResult());
    }


    @Test
    void test1() {
        PetRock a = new PetRock("шалаш");
        System.out.println(a.getResult());
        assertNotEquals("шалаш", a.getResult());
    }


    @Test
    void test2() {
        PetRock a = new PetRock("Среденеуральск");
        System.out.println(a.getResult());
        assertNotEquals("Среденеуральск", a.getResult());
    }

    @Test
    void test3() {
        PetRock a = new PetRock("CПБГУ");
        System.out.println(a.getResult());
        assertNotEquals("CПБГУ", a.getResult());
    }

    @Test
    void test4() {
        PetRock a = new PetRock("123456789");
        System.out.println(a.getResult());
        assertNotEquals("123456789", a.getResult());
    }

    @Test
    void test5() {
        PetRock a = new PetRock("杯叛岐羌黦之怵帑胥灶室");
        System.out.println(a.getResult());
        assertNotEquals("杯叛岐羌黦之怵帑胥灶室", a.getResult());
    }

    @Test
    void test6() {
        PetRock a = new PetRock("فقصؤرلاى");
        System.out.println(a.getResult());
        assertNotEquals("فقصؤرلاى", a.getResult());
    }

    @Test
    void test7() {
        PetRock a = new PetRock("ф杯اىa");
        System.out.println(a.getResult());
        assertNotEquals("ф杯اىa", a.getResult());

    }

    @Test
    void test8() {
        PetRock a = new PetRock("ф杯اىa321");
        System.out.println(a.getResult());
        assertNotEquals("ф杯اىa321", a.getResult());
    }

}