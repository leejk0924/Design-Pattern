package structure.adapter._02_after.security;

public interface UserDetailsService {
    UserDetails loadUser(String username);


}
