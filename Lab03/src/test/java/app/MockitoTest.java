package app;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

import static org.mockito.Mockito.*;

import messenger.MalformedRecipientException;
import app.Messenger;
import messenger.SendingStatus;
import messenger.MessageService;

public class MockitoTest {
	
	private Messenger messenger;
	private MessageService messageService;
	
	private String VALID_HOST = "www.wp.pl";
	private String INVALID_HOST = "www.wp.eu";
	private String VALID_MESSAGE = "Heres the news";
	private String INVALID_MESSAGE = "xx";
		
	@Before
	public void setUp() {
		messageService = mock(MessageService.class);
		messenger = new Messenger(messageService);
	}
			
	@Test
    public void SendMessageForValidHostValidMessage() throws MalformedRecipientException {
        when(messageService.send(VALID_HOST, VALID_MESSAGE)).thenReturn(SendingStatus.SENT);
        assertEquals(0, messenger.sendMessage(VALID_HOST, VALID_MESSAGE));
    }
	
    @Test
    public void SendMessageForValidHostInvalidMessage() throws MalformedRecipientException {
        when(messageService.send(VALID_HOST, INVALID_MESSAGE)).thenThrow(new MalformedRecipientException());
        assertEquals(2, messenger.sendMessage(VALID_HOST, INVALID_MESSAGE));
    }

    @Test
    public void SendMessageForInvalidHostValidMessage() throws MalformedRecipientException {
        when(messageService.send(INVALID_HOST, VALID_MESSAGE)).thenReturn(SendingStatus.SENDING_ERROR);
        assertEquals(1, messenger.sendMessage(INVALID_HOST, VALID_MESSAGE));
    }

    @Test
    public void SendMessageForInvalidHostInvalidMessage() throws MalformedRecipientException {
        when(messageService.send(INVALID_HOST, INVALID_MESSAGE)).thenThrow(new MalformedRecipientException());
        assertEquals(2, messenger.sendMessage(INVALID_HOST, INVALID_MESSAGE));
    }
}
	
	
	
	
	
	
	
