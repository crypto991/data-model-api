package crypto.org.springrestclientexample.services;

import crypto.org.api.domain.User;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.List;

public interface ApiService {



    List<User> getUsers(Integer limit);

    Flux<User> getUsers(Mono<Integer> limit);



}
