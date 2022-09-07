package com.ck.usercenter.service;

import com.ck.usercenter.model.domain.Team;
import com.baomidou.mybatisplus.extension.service.IService;
import com.ck.usercenter.model.domain.User;
import com.ck.usercenter.model.dto.TeamQuery;
import com.ck.usercenter.model.request.TeamJoinRequest;
import com.ck.usercenter.model.request.TeamUpdateRequest;
import com.ck.usercenter.model.vo.TeamUserVO;

import java.util.List;

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
    /**
     * 搜索队伍
     * @param teamQuery
     * @param isAdmin
     * @return
     */
    List<TeamUserVO> listTeams(TeamQuery teamQuery, boolean isAdmin);

    /**
     * 更新队伍
     * @param teamUpdateRequest
     * @param loginUser
     * @return
     */
    boolean updateTeam(TeamUpdateRequest teamUpdateRequest, User loginUser);

    /**
     * 加入队伍
     * @param teamJoinRequest
     * @param loginUser
     * @return
     */
    boolean joinTeam(TeamJoinRequest teamJoinRequest, User loginUser);


    }
