package com.neusoft.firstspringboot.contoller;

import com.neusoft.firstspringboot.pojo.RoomType;
import com.neusoft.firstspringboot.service.RoomTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: wudagai
 * @date: 2021/11/23 10:36
 * @description:
 */
@RestController
@RequestMapping("/roomType")
public class RoomTypeContoller {

    @Autowired
    private RoomTypeService roomTypeService;

    @Value("${server.servlet.context-path}")
    private String contextPathj;

    @RequestMapping("/query")
    public RoomType query(Integer id){
        return roomTypeService.queryUser(id);
    }
    @RequestMapping("/insert")
    public int insert(RoomType roomType){
        return roomTypeService.insertRoomType(roomType);
    }
    @RequestMapping("/update")
    public int update(RoomType roomType){
        return roomTypeService.updateRoomType(roomType);
    }

    @RequestMapping("/delete")
    public int delete(Integer id){
        return roomTypeService.deleteRoomType(id);
    }
}
