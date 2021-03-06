package net.interlude.account.service;

import net.interlude.account.domain.Account;
import net.interlude.account.domain.Auth;
import org.springframework.stereotype.Service;

@Service
public interface AccountService {
    void create(Auth auth);
    Iterable<Account> findAll();
    void removeById(int id);
    void updateAccount(int id, Account account);
}