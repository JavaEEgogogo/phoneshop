package cgj.phone.shop.dao;

import com.zz.entity.Color;

public interface ColorMapper {
    int deleteByPrimaryKey(Integer colorId);

    int insert(Color record);

    int insertSelective(Color record);

    Color selectByPrimaryKey(Integer colorId);

    int updateByPrimaryKeySelective(Color record);

    int updateByPrimaryKey(Color record);
}