package com.ck.usercenter.service;

import com.ck.usercenter.model.domain.Team;
import com.baomidou.mybatisplus.extension.service.IService;
import com.ck.usercenter.model.domain.User;

/**
 *
 */
public interface TeamService extends IService<Team> {

    /**
     * 创建队伍
     * @param team
     * @param loginUser
     * @return
     */
    long addTeam(Team team, User loginUser);


}
