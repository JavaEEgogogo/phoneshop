package cgj.phone.shop.dao;

import com.zz.entity.Size;

public interface SizeMapper {
    int deleteByPrimaryKey(Integer sizeId);

    int insert(Size record);

    int insertSelective(Size record);

    Size selectByPrimaryKey(Integer sizeId);

    int updateByPrimaryKeySelective(Size record);

    int updateByPrimaryKey(Size record);
}