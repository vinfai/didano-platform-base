package cn.didano.base.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;

import cn.didano.base.model.Bs_trade;
import cn.didano.base.model.Bs_tradeExample;

public interface Bs_tradeMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bs_trade
     *
     * @mbg.generated
     */
    long countByExample(Bs_tradeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bs_trade
     *
     * @mbg.generated
     */
    int deleteByExample(Bs_tradeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bs_trade
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bs_trade
     *
     * @mbg.generated
     */
    int insert(Bs_trade record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bs_trade
     *
     * @mbg.generated
     */
    int insertSelective(Bs_trade record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bs_trade
     *
     * @mbg.generated
     */
    List<Bs_trade> selectByExample(Bs_tradeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bs_trade
     *
     * @mbg.generated
     */
    Bs_trade selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bs_trade
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") Bs_trade record, @Param("example") Bs_tradeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bs_trade
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") Bs_trade record, @Param("example") Bs_tradeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bs_trade
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(Bs_trade record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bs_trade
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(Bs_trade record);
}