package domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LinkedStackTest {

    @Test
    void test() {
        LinkedStack linkedStack = new LinkedStack();
        try {
            for (int i = 0; i < 10; i++) {
                int value = util.Utility.random(30);
                System.out.println("Value ["+value+"] pushed");
                linkedStack.push(value);
            }
            System.out.println(linkedStack);
            System.out.println(linkedStack); //llamo de nuevo al toString

        }catch(StackException ex){
            System.out.println(ex.getMessage());
        }
    }
}