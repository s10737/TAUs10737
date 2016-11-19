package app;

import static org.easymock.EasyMock.*;
import static org.junit.Assert.*;

import org.easymock.EasyMockRule;
import org.easymock.EasyMockSupport;
import org.easymock.Mock;
import org.easymock.TestSubject;
import org.junit.After;
import org.junit.Rule;
import org.junit.Test;

import messenger.MessageService;
import messenger.ConnectionStatus;
import messenger.MalformedRecipientException;
import messenger.SendingStatus;

import static org.hamcrest.CoreMatchers.is;

public class EasyMockTest extends EasyMockSupport {

	private String VALID_HOST = "www.wp.pl";
	private String INVALID_HOST = "www.wp.eu";
	private String VALID_MESSAGE = "Heres the news";
	private String INVALID_MESSAGE = "xx";
	
	@Rule
    public EasyMockRule rule = new EasyMockRule(this);
	
	@Mock
    private MessageService messageService;
	
	@TestSubject
    private EasyMock messenger = new EasyMock();
    
	@After
    public void verifyMock() {
        verifyAll();
    }
	
	@Test
    public void TestConnectionWithValidAdress() {
        expect(messageService.checkConnection(VALID_HOST)).andReturn(ConnectionStatus.SUCCESS);
        replay(messageService);
        assertThat(messenger.testConnection(VALID_HOST), is(0));
    }
	
	@Test
	public void TestConnectionWithInvalidAdress() {
        expect(messageService.checkConnection(INVALID_HOST)).andReturn(ConnectionStatus.FAILURE);
        replay(messageService);
        assertThat(messenger.testConnection(INVALID_HOST), is(1));
    }
	
	@Test
    public void SendMessageForValidHostValidMessage() throws MalformedRecipientException {
        expect(messageService.send(VALID_HOST, VALID_MESSAGE)).andReturn(SendingStatus.SENT);
        replay(messageService);
        assertEquals(0, messenger.sendMessage(VALID_HOST, VALID_MESSAGE));
    }
	
    @Test
    public void SendMessageForValidHostInvalidMessage() throws MalformedRecipientException {
        expect(messageService.send(VALID_HOST, INVALID_MESSAGE)).andThrow(new MalformedRecipientException());
        replay(messageService);
        assertEquals(2, messenger.sendMessage(VALID_HOST, INVALID_MESSAGE));
    }

    @Test
    public void SendMessageForInvalidHostValidMessage() throws MalformedRecipientException {
        expect(messageService.send(INVALID_HOST, VALID_MESSAGE)).andReturn(SendingStatus.SENDING_ERROR);
        replay(messageService);
        assertEquals(1, messenger.sendMessage(INVALID_HOST, VALID_MESSAGE));
    }

    @Test
    public void SendMessageForInvalidHostInvalidMessage() throws MalformedRecipientException {
        expect(messageService.send(INVALID_HOST, INVALID_MESSAGE)).andThrow(new MalformedRecipientException());
        replay(messageService);
        assertEquals(2, messenger.sendMessage(INVALID_HOST, INVALID_MESSAGE));
        
    }
}

