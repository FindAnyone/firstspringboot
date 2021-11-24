package com.neusoft.firstspringboot.mapper;

import com.neusoft.firstspringboot.pojo.RoomType;
import org.apache.ibatis.annotations.Mapper;


/**
 * @author: wudagai
 * @date: 2021/11/23 16:21
 * @description:
 */
@Mapper
public interface RoomTypeMapper {

    public RoomType querMsg(Integer id);
//添加
    public int insertMsg(RoomType roomType);
    //修改
    public int updateMsg(RoomType roomType);

    //修改
    public int deleteMsg(Integer id);
}
