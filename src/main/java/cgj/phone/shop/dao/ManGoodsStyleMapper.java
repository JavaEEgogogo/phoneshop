package cgj.phone.shop.dao;

import com.zz.entity.ManGoodsStyle;

public interface ManGoodsStyleMapper {
    int deleteByPrimaryKey(Integer manStyleId);

    int insert(ManGoodsStyle record);

    int insertSelective(ManGoodsStyle record);

    ManGoodsStyle selectByPrimaryKey(Integer manStyleId);

    int updateByPrimaryKeySelective(ManGoodsStyle record);

    int updateByPrimaryKey(ManGoodsStyle record);
}