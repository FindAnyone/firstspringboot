package com.neusoft.firstspringboot.service;

import com.neusoft.firstspringboot.mapper.RoomTypeMapper;
import com.neusoft.firstspringboot.pojo.RoomType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author: wudagai
 * @date: 2021/11/23 10:42
 * @description:
 */
@Service
public class RoomTypeService {

    @Autowired
    private RoomTypeMapper roomTypeMapper;

    public RoomType queryUser(Integer id){
      return  roomTypeMapper.querMsg(id);
    }

    public int insertRoomType(RoomType roomType) {
        int rows=roomTypeMapper.insertMsg(roomType);
        return rows;
    }

    public int updateRoomType(RoomType roomType) {
        int rows=roomTypeMapper.updateMsg(roomType);
        return rows;
    }

    public int deleteRoomType(Integer id) {
        int rows=roomTypeMapper.deleteMsg(id);
        return rows;
    }
}
