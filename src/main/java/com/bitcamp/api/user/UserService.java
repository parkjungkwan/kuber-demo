package com.bitcamp.api.user;

import java.util.List;
import com.bitcamp.api.common.command.CommandService;
import com.bitcamp.api.common.query.QueryService;

public interface UserService extends CommandService, QueryService{
    // command  
    String updatePassword(User user);
    // query
    List<?> findUsersByName(String name);
    List<?> findUsersByJob(String job);

}
