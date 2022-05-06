package structure.adapter._02_after;

import structure.adapter._02_after.security.LoginHandler;
import structure.adapter._02_after.security.UserDetailsService;

public class App {
    public static void main(String[] args) {
        AccountService accountService = new AccountService();
        UserDetailsService userDetailsService = new AccountUserDetailsService(accountService);
        LoginHandler loginHandler = new LoginHandler(userDetailsService);
        String login = loginHandler.login("jk", "jk");
        System.out.println(login);
    }
}
