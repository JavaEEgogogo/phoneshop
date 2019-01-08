package cgj.phone.shop.dao;

import com.zz.entity.WearStyle;

public interface WearStyleMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(WearStyle record);

    int insertSelective(WearStyle record);

    WearStyle selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(WearStyle record);

    int updateByPrimaryKey(WearStyle record);
}