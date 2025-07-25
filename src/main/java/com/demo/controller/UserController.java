
@RestController
@RequestMapping("/api/users")
@CrossOrigin("*")
public class UserController {
    @Autowired private UserRepository repo;

    @GetMapping
    public List<User> getUsers() {
        return repo.findAll();
    }

    @PostMapping
    public User createUser(@RequestBody User user) {
        return repo.save(user);
    }
}
