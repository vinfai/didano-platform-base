package cn.didano.base.model;

public class Bs_catalog {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column bs_catalog.id
     *
     * @mbg.generated
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column bs_catalog.type_name
     *
     * @mbg.generated
     */
    private String typeName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column bs_catalog.parent_id
     *
     * @mbg.generated
     */
    private Integer parentId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column bs_catalog.is_parent
     *
     * @mbg.generated
     */
    private Boolean isParent;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column bs_catalog.order_no
     *
     * @mbg.generated
     */
    private Integer orderNo;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column bs_catalog.id
     *
     * @return the value of bs_catalog.id
     *
     * @mbg.generated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column bs_catalog.id
     *
     * @param id the value for bs_catalog.id
     *
     * @mbg.generated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column bs_catalog.type_name
     *
     * @return the value of bs_catalog.type_name
     *
     * @mbg.generated
     */
    public String getTypeName() {
        return typeName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column bs_catalog.type_name
     *
     * @param typeName the value for bs_catalog.type_name
     *
     * @mbg.generated
     */
    public void setTypeName(String typeName) {
        this.typeName = typeName == null ? null : typeName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column bs_catalog.parent_id
     *
     * @return the value of bs_catalog.parent_id
     *
     * @mbg.generated
     */
    public Integer getParentId() {
        return parentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column bs_catalog.parent_id
     *
     * @param parentId the value for bs_catalog.parent_id
     *
     * @mbg.generated
     */
    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column bs_catalog.is_parent
     *
     * @return the value of bs_catalog.is_parent
     *
     * @mbg.generated
     */
    public Boolean getIsParent() {
        return isParent;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column bs_catalog.is_parent
     *
     * @param isParent the value for bs_catalog.is_parent
     *
     * @mbg.generated
     */
    public void setIsParent(Boolean isParent) {
        this.isParent = isParent;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column bs_catalog.order_no
     *
     * @return the value of bs_catalog.order_no
     *
     * @mbg.generated
     */
    public Integer getOrderNo() {
        return orderNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column bs_catalog.order_no
     *
     * @param orderNo the value for bs_catalog.order_no
     *
     * @mbg.generated
     */
    public void setOrderNo(Integer orderNo) {
        this.orderNo = orderNo;
    }
}