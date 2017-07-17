package com.kbds.wcyyxh.service;

import com.kbds.wcyyxh.dao.UsersMapper;
import com.kbds.wcyyxh.entity.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Chris on 2017-07-17.
 */
@Service
public class UserService {

    @Autowired
    private UsersMapper usersMapper;

    public Users getAll(Integer id) {
        return usersMapper.selectByPrimaryKey(id);
    }
}
