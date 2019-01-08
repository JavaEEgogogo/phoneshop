package cgj.phone.shop.dao;

import com.zz.entity.WomanTopStyle;

public interface WomanTopStyleMapper {
    int deleteByPrimaryKey(Integer womanTopStyleId);

    int insert(WomanTopStyle record);

    int insertSelective(WomanTopStyle record);

    WomanTopStyle selectByPrimaryKey(Integer womanTopStyleId);

    int updateByPrimaryKeySelective(WomanTopStyle record);

    int updateByPrimaryKey(WomanTopStyle record);
}