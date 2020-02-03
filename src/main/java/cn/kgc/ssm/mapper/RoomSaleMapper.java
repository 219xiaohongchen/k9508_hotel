package cn.kgc.ssm.mapper;

import cn.kgc.ssm.entity.RoomSale;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

/*
* 房屋销售记录mapper代理对象
* */

public interface RoomSaleMapper extends BaseMapper<RoomSale>{

    //查询房间的销售金额,返回List
    @Select("SELECT room_num,SUM(sale_price) as saleprices from roomsale GROUP BY room_num")
    List<Map<String,Object>> selPriceByRoomNum() throws Exception;
}