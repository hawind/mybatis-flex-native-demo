/**
 * Copyright (c) 2022-2023, Mybatis-Flex (fuhai999@gmail.com).
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.mybatisflex.admin.controller;

import com.mybatisflex.admin.mapper.AccountMapper;
import com.mybatisflex.admin.model.Account;
import jakarta.annotation.Resource;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

@RestController
public class AccountController {

    @Resource
    private AccountMapper accountMapper;

    @GetMapping("/")
    List<Account> index() {
        return accountMapper.selectAll();
    }

    @GetMapping("/save")
    @Transactional(rollbackFor = Exception.class)
    public void save() {
        Account account2 = new Account();
        account2.setUserName("用户");
        account2.setAge(1);
        account2.setBirthday(new Date());
        accountMapper.insert(account2);
    }
}
