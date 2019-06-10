package net.interlude.account.controller;

import net.interlude.account.domain.Account;
import net.interlude.account.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/account")
public class AccountController {

    @Autowired
    AccountService accountService;

    @ResponseBody
    @RequestMapping(method = RequestMethod.GET)
    public String index() {
        return "..";
    }

    @RequestMapping(method = RequestMethod.POST)
    public void createUser(@RequestBody Account account) {
        accountService.save(account);
    }

}