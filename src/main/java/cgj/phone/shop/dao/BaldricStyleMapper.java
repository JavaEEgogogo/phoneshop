package cgj.phone.shop.dao;

import cgj.phone.shop.entity.BaldricStyle;


public interface BaldricStyleMapper {
    int deleteByPrimaryKey(Integer baldricStyleId);

    int insert(BaldricStyle record);

    int insertSelective(BaldricStyle record);

    BaldricStyle selectByPrimaryKey(Integer baldricStyleId);

    int updateByPrimaryKeySelective(BaldricStyle record);

    int updateByPrimaryKey(BaldricStyle record);
}