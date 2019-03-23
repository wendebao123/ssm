package com.itheima.controller;

import com.itheima.domain.Account;
import com.itheima.service.IAccountService;
import com.itheima.service.impl.AccountServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

@Controller
@RequestMapping("/account")
public class AccountController {

    @Autowired
    private IAccountService accountService;

    @RequestMapping("/findAll")
    public String testFindAll(Model model){
        System.out.println("表现层:查询所有账户...");
        List<Account> accounts = accountService.findAll();
        model.addAttribute("accounts",accounts);
        return "success";
    }
    @RequestMapping("/save")
    public String testSave(Account account){
        accountService.saveAccount(account);
        return "redirect:/account/findAll";
    }
}
