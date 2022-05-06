package com.fun.messages;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class MessageTest {

    @Test
    public void main() {
        String customMessage = "Custom message!";
        Message message = new Message(customMessage);
        String result = message.getMessage();
        assertEquals(result, customMessage);
    }
}
