package com.f2b2c.eco.dao.market;

import com.f2b2c.eco.model.market.BConditionsFreeDeliveryModel;

public interface BConditionsFreeDeliveryDao {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table b_conditions_free_delivery
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table b_conditions_free_delivery
     *
     * @mbggenerated
     */
    int insert(BConditionsFreeDeliveryModel record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table b_conditions_free_delivery
     *
     * @mbggenerated
     */
    int insertSelective(BConditionsFreeDeliveryModel record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table b_conditions_free_delivery
     *
     * @mbggenerated
     */
    BConditionsFreeDeliveryModel selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table b_conditions_free_delivery
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(BConditionsFreeDeliveryModel record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table b_conditions_free_delivery
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(BConditionsFreeDeliveryModel record);
}