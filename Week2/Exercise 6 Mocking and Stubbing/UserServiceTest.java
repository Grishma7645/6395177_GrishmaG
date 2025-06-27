
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

public class UserServiceTest {

    @Test
    void testGetUserName_withMock() {
        // Arrange (Mock and Stub)
        UserRepository mockRepo = mock(UserRepository.class);
        when(mockRepo.findUserById("101")).thenReturn(new User("101", "Grishma"));

        UserService service = new UserService(mockRepo);

        // Act
        String name = service.getUserName("101");

        // Assert
        assertEquals("Grishma", name);

        // Verify interaction
        verify(mockRepo, times(1)).findUserById("101");
    }
}
