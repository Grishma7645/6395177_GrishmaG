

public class UserService {
    private UserRepository userRepo;

    public UserService(UserRepository repo) {
        this.userRepo = repo;
    }

    public String getUserName(String userId) {
        User user = userRepo.findUserById(userId);
        return user != null ? user.getName() : "Unknown";
    }
}
