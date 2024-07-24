package org.micro.stockpricemonitoring.users;

import org.micro.stockpricemonitoring.users.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import reactor.core.publisher.Mono;
import java.util.List;
import java.util.stream.Collectors;
@RestController
public class UserController {
    private static final String API_URL = "https://jsonplaceholder.typicode.com/users";
    private final RestTemplate restTemplate = new RestTemplate();
    @GetMapping("/users")
    public Mono<List<User>> getUsers(
            @RequestParam(required = false) Integer id,
            @RequestParam(required = false) String name,
            @RequestParam(required = false) String email) {
        // Fetch data from the API
        User[] response = restTemplate.getForObject(API_URL, User[].class);
        // Convert array to list for easier processing
        List<User> users = List.of(response);
        // Filter users based on query parameters
        List<User> filteredUsers = users.stream()
                .filter(u -> id == null || u.getId() == id)
                .filter(u -> name == null || u.getName().toLowerCase().contains(name.toLowerCase()))
                .filter(u -> email == null || u.getEmail().toLowerCase().contains(email.toLowerCase()))
                .collect(Collectors.toList());
        return Mono.just(filteredUsers);
    }
}

