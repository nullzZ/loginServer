package com.server.db.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserRecordExample {
    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database table t_users
     * @mbggenerated
     */
    protected String orderByClause;
    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database table t_users
     * @mbggenerated
     */
    protected boolean distinct;
    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database table t_users
     * @mbggenerated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table t_users
     * @mbggenerated
     */
    public UserRecordExample() {
	oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table t_users
     * @mbggenerated
     */
    public void setOrderByClause(String orderByClause) {
	this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table t_users
     * @mbggenerated
     */
    public String getOrderByClause() {
	return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table t_users
     * @mbggenerated
     */
    public void setDistinct(boolean distinct) {
	this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table t_users
     * @mbggenerated
     */
    public boolean isDistinct() {
	return distinct;
    }

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table t_users
     * @mbggenerated
     */
    public List<Criteria> getOredCriteria() {
	return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table t_users
     * @mbggenerated
     */
    public void or(Criteria criteria) {
	oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table t_users
     * @mbggenerated
     */
    public Criteria or() {
	Criteria criteria = createCriteriaInternal();
	oredCriteria.add(criteria);
	return criteria;
    }

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table t_users
     * @mbggenerated
     */
    public Criteria createCriteria() {
	Criteria criteria = createCriteriaInternal();
	if (oredCriteria.size() == 0) {
	    oredCriteria.add(criteria);
	}
	return criteria;
    }

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table t_users
     * @mbggenerated
     */
    protected Criteria createCriteriaInternal() {
	Criteria criteria = new Criteria();
	return criteria;
    }

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table t_users
     * @mbggenerated
     */
    public void clear() {
	oredCriteria.clear();
	orderByClause = null;
	distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator. This class corresponds to the database table t_users
     * @mbggenerated
     */
    protected abstract static class GeneratedCriteria {
	protected List<Criterion> criteria;

	protected GeneratedCriteria() {
	    super();
	    criteria = new ArrayList<Criterion>();
	}

	public boolean isValid() {
	    return criteria.size() > 0;
	}

	public List<Criterion> getAllCriteria() {
	    return criteria;
	}

	public List<Criterion> getCriteria() {
	    return criteria;
	}

	protected void addCriterion(String condition) {
	    if (condition == null) {
		throw new RuntimeException("Value for condition cannot be null");
	    }
	    criteria.add(new Criterion(condition));
	}

	protected void addCriterion(String condition, Object value, String property) {
	    if (value == null) {
		throw new RuntimeException("Value for " + property + " cannot be null");
	    }
	    criteria.add(new Criterion(condition, value));
	}

	protected void addCriterion(String condition, Object value1, Object value2, String property) {
	    if (value1 == null || value2 == null) {
		throw new RuntimeException("Between values for " + property + " cannot be null");
	    }
	    criteria.add(new Criterion(condition, value1, value2));
	}

	public Criteria andUserIdIsNull() {
	    addCriterion("userId is null");
	    return (Criteria) this;
	}

	public Criteria andUserIdIsNotNull() {
	    addCriterion("userId is not null");
	    return (Criteria) this;
	}

	public Criteria andUserIdEqualTo(Long value) {
	    addCriterion("userId =", value, "userId");
	    return (Criteria) this;
	}

	public Criteria andUserIdNotEqualTo(Long value) {
	    addCriterion("userId <>", value, "userId");
	    return (Criteria) this;
	}

	public Criteria andUserIdGreaterThan(Long value) {
	    addCriterion("userId >", value, "userId");
	    return (Criteria) this;
	}

	public Criteria andUserIdGreaterThanOrEqualTo(Long value) {
	    addCriterion("userId >=", value, "userId");
	    return (Criteria) this;
	}

	public Criteria andUserIdLessThan(Long value) {
	    addCriterion("userId <", value, "userId");
	    return (Criteria) this;
	}

	public Criteria andUserIdLessThanOrEqualTo(Long value) {
	    addCriterion("userId <=", value, "userId");
	    return (Criteria) this;
	}

	public Criteria andUserIdIn(List<Long> values) {
	    addCriterion("userId in", values, "userId");
	    return (Criteria) this;
	}

	public Criteria andUserIdNotIn(List<Long> values) {
	    addCriterion("userId not in", values, "userId");
	    return (Criteria) this;
	}

	public Criteria andUserIdBetween(Long value1, Long value2) {
	    addCriterion("userId between", value1, value2, "userId");
	    return (Criteria) this;
	}

	public Criteria andUserIdNotBetween(Long value1, Long value2) {
	    addCriterion("userId not between", value1, value2, "userId");
	    return (Criteria) this;
	}

	public Criteria andSdkCannelIsNull() {
	    addCriterion("sdkCannel is null");
	    return (Criteria) this;
	}

	public Criteria andSdkCannelIsNotNull() {
	    addCriterion("sdkCannel is not null");
	    return (Criteria) this;
	}

	public Criteria andSdkCannelEqualTo(Integer value) {
	    addCriterion("sdkCannel =", value, "sdkCannel");
	    return (Criteria) this;
	}

	public Criteria andSdkCannelNotEqualTo(Integer value) {
	    addCriterion("sdkCannel <>", value, "sdkCannel");
	    return (Criteria) this;
	}

	public Criteria andSdkCannelGreaterThan(Integer value) {
	    addCriterion("sdkCannel >", value, "sdkCannel");
	    return (Criteria) this;
	}

	public Criteria andSdkCannelGreaterThanOrEqualTo(Integer value) {
	    addCriterion("sdkCannel >=", value, "sdkCannel");
	    return (Criteria) this;
	}

	public Criteria andSdkCannelLessThan(Integer value) {
	    addCriterion("sdkCannel <", value, "sdkCannel");
	    return (Criteria) this;
	}

	public Criteria andSdkCannelLessThanOrEqualTo(Integer value) {
	    addCriterion("sdkCannel <=", value, "sdkCannel");
	    return (Criteria) this;
	}

	public Criteria andSdkCannelIn(List<Integer> values) {
	    addCriterion("sdkCannel in", values, "sdkCannel");
	    return (Criteria) this;
	}

	public Criteria andSdkCannelNotIn(List<Integer> values) {
	    addCriterion("sdkCannel not in", values, "sdkCannel");
	    return (Criteria) this;
	}

	public Criteria andSdkCannelBetween(Integer value1, Integer value2) {
	    addCriterion("sdkCannel between", value1, value2, "sdkCannel");
	    return (Criteria) this;
	}

	public Criteria andSdkCannelNotBetween(Integer value1, Integer value2) {
	    addCriterion("sdkCannel not between", value1, value2, "sdkCannel");
	    return (Criteria) this;
	}

	public Criteria andSdk_uidIsNull() {
	    addCriterion("sdk_uid is null");
	    return (Criteria) this;
	}

	public Criteria andSdk_uidIsNotNull() {
	    addCriterion("sdk_uid is not null");
	    return (Criteria) this;
	}

	public Criteria andSdk_uidEqualTo(String value) {
	    addCriterion("sdk_uid =", value, "sdk_uid");
	    return (Criteria) this;
	}

	public Criteria andSdk_uidNotEqualTo(String value) {
	    addCriterion("sdk_uid <>", value, "sdk_uid");
	    return (Criteria) this;
	}

	public Criteria andSdk_uidGreaterThan(String value) {
	    addCriterion("sdk_uid >", value, "sdk_uid");
	    return (Criteria) this;
	}

	public Criteria andSdk_uidGreaterThanOrEqualTo(String value) {
	    addCriterion("sdk_uid >=", value, "sdk_uid");
	    return (Criteria) this;
	}

	public Criteria andSdk_uidLessThan(String value) {
	    addCriterion("sdk_uid <", value, "sdk_uid");
	    return (Criteria) this;
	}

	public Criteria andSdk_uidLessThanOrEqualTo(String value) {
	    addCriterion("sdk_uid <=", value, "sdk_uid");
	    return (Criteria) this;
	}

	public Criteria andSdk_uidLike(String value) {
	    addCriterion("sdk_uid like", value, "sdk_uid");
	    return (Criteria) this;
	}

	public Criteria andSdk_uidNotLike(String value) {
	    addCriterion("sdk_uid not like", value, "sdk_uid");
	    return (Criteria) this;
	}

	public Criteria andSdk_uidIn(List<String> values) {
	    addCriterion("sdk_uid in", values, "sdk_uid");
	    return (Criteria) this;
	}

	public Criteria andSdk_uidNotIn(List<String> values) {
	    addCriterion("sdk_uid not in", values, "sdk_uid");
	    return (Criteria) this;
	}

	public Criteria andSdk_uidBetween(String value1, String value2) {
	    addCriterion("sdk_uid between", value1, value2, "sdk_uid");
	    return (Criteria) this;
	}

	public Criteria andSdk_uidNotBetween(String value1, String value2) {
	    addCriterion("sdk_uid not between", value1, value2, "sdk_uid");
	    return (Criteria) this;
	}

	public Criteria andChannelIsNull() {
	    addCriterion("channel is null");
	    return (Criteria) this;
	}

	public Criteria andChannelIsNotNull() {
	    addCriterion("channel is not null");
	    return (Criteria) this;
	}

	public Criteria andChannelEqualTo(String value) {
	    addCriterion("channel =", value, "channel");
	    return (Criteria) this;
	}

	public Criteria andChannelNotEqualTo(String value) {
	    addCriterion("channel <>", value, "channel");
	    return (Criteria) this;
	}

	public Criteria andChannelGreaterThan(String value) {
	    addCriterion("channel >", value, "channel");
	    return (Criteria) this;
	}

	public Criteria andChannelGreaterThanOrEqualTo(String value) {
	    addCriterion("channel >=", value, "channel");
	    return (Criteria) this;
	}

	public Criteria andChannelLessThan(String value) {
	    addCriterion("channel <", value, "channel");
	    return (Criteria) this;
	}

	public Criteria andChannelLessThanOrEqualTo(String value) {
	    addCriterion("channel <=", value, "channel");
	    return (Criteria) this;
	}

	public Criteria andChannelLike(String value) {
	    addCriterion("channel like", value, "channel");
	    return (Criteria) this;
	}

	public Criteria andChannelNotLike(String value) {
	    addCriterion("channel not like", value, "channel");
	    return (Criteria) this;
	}

	public Criteria andChannelIn(List<String> values) {
	    addCriterion("channel in", values, "channel");
	    return (Criteria) this;
	}

	public Criteria andChannelNotIn(List<String> values) {
	    addCriterion("channel not in", values, "channel");
	    return (Criteria) this;
	}

	public Criteria andChannelBetween(String value1, String value2) {
	    addCriterion("channel between", value1, value2, "channel");
	    return (Criteria) this;
	}

	public Criteria andChannelNotBetween(String value1, String value2) {
	    addCriterion("channel not between", value1, value2, "channel");
	    return (Criteria) this;
	}

	public Criteria andLastServerIdIsNull() {
	    addCriterion("lastServerId is null");
	    return (Criteria) this;
	}

	public Criteria andLastServerIdIsNotNull() {
	    addCriterion("lastServerId is not null");
	    return (Criteria) this;
	}

	public Criteria andLastServerIdEqualTo(String value) {
	    addCriterion("lastServerId =", value, "lastServerId");
	    return (Criteria) this;
	}

	public Criteria andLastServerIdNotEqualTo(String value) {
	    addCriterion("lastServerId <>", value, "lastServerId");
	    return (Criteria) this;
	}

	public Criteria andLastServerIdGreaterThan(String value) {
	    addCriterion("lastServerId >", value, "lastServerId");
	    return (Criteria) this;
	}

	public Criteria andLastServerIdGreaterThanOrEqualTo(String value) {
	    addCriterion("lastServerId >=", value, "lastServerId");
	    return (Criteria) this;
	}

	public Criteria andLastServerIdLessThan(String value) {
	    addCriterion("lastServerId <", value, "lastServerId");
	    return (Criteria) this;
	}

	public Criteria andLastServerIdLessThanOrEqualTo(String value) {
	    addCriterion("lastServerId <=", value, "lastServerId");
	    return (Criteria) this;
	}

	public Criteria andLastServerIdLike(String value) {
	    addCriterion("lastServerId like", value, "lastServerId");
	    return (Criteria) this;
	}

	public Criteria andLastServerIdNotLike(String value) {
	    addCriterion("lastServerId not like", value, "lastServerId");
	    return (Criteria) this;
	}

	public Criteria andLastServerIdIn(List<String> values) {
	    addCriterion("lastServerId in", values, "lastServerId");
	    return (Criteria) this;
	}

	public Criteria andLastServerIdNotIn(List<String> values) {
	    addCriterion("lastServerId not in", values, "lastServerId");
	    return (Criteria) this;
	}

	public Criteria andLastServerIdBetween(String value1, String value2) {
	    addCriterion("lastServerId between", value1, value2, "lastServerId");
	    return (Criteria) this;
	}

	public Criteria andLastServerIdNotBetween(String value1, String value2) {
	    addCriterion("lastServerId not between", value1, value2, "lastServerId");
	    return (Criteria) this;
	}

	public Criteria andLoginTimestampIsNull() {
	    addCriterion("loginTimestamp is null");
	    return (Criteria) this;
	}

	public Criteria andLoginTimestampIsNotNull() {
	    addCriterion("loginTimestamp is not null");
	    return (Criteria) this;
	}

	public Criteria andLoginTimestampEqualTo(Date value) {
	    addCriterion("loginTimestamp =", value, "loginTimestamp");
	    return (Criteria) this;
	}

	public Criteria andLoginTimestampNotEqualTo(Date value) {
	    addCriterion("loginTimestamp <>", value, "loginTimestamp");
	    return (Criteria) this;
	}

	public Criteria andLoginTimestampGreaterThan(Date value) {
	    addCriterion("loginTimestamp >", value, "loginTimestamp");
	    return (Criteria) this;
	}

	public Criteria andLoginTimestampGreaterThanOrEqualTo(Date value) {
	    addCriterion("loginTimestamp >=", value, "loginTimestamp");
	    return (Criteria) this;
	}

	public Criteria andLoginTimestampLessThan(Date value) {
	    addCriterion("loginTimestamp <", value, "loginTimestamp");
	    return (Criteria) this;
	}

	public Criteria andLoginTimestampLessThanOrEqualTo(Date value) {
	    addCriterion("loginTimestamp <=", value, "loginTimestamp");
	    return (Criteria) this;
	}

	public Criteria andLoginTimestampIn(List<Date> values) {
	    addCriterion("loginTimestamp in", values, "loginTimestamp");
	    return (Criteria) this;
	}

	public Criteria andLoginTimestampNotIn(List<Date> values) {
	    addCriterion("loginTimestamp not in", values, "loginTimestamp");
	    return (Criteria) this;
	}

	public Criteria andLoginTimestampBetween(Date value1, Date value2) {
	    addCriterion("loginTimestamp between", value1, value2, "loginTimestamp");
	    return (Criteria) this;
	}

	public Criteria andLoginTimestampNotBetween(Date value1, Date value2) {
	    addCriterion("loginTimestamp not between", value1, value2, "loginTimestamp");
	    return (Criteria) this;
	}

	public Criteria andCreateTimeIsNull() {
	    addCriterion("createTime is null");
	    return (Criteria) this;
	}

	public Criteria andCreateTimeIsNotNull() {
	    addCriterion("createTime is not null");
	    return (Criteria) this;
	}

	public Criteria andCreateTimeEqualTo(Date value) {
	    addCriterion("createTime =", value, "createTime");
	    return (Criteria) this;
	}

	public Criteria andCreateTimeNotEqualTo(Date value) {
	    addCriterion("createTime <>", value, "createTime");
	    return (Criteria) this;
	}

	public Criteria andCreateTimeGreaterThan(Date value) {
	    addCriterion("createTime >", value, "createTime");
	    return (Criteria) this;
	}

	public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
	    addCriterion("createTime >=", value, "createTime");
	    return (Criteria) this;
	}

	public Criteria andCreateTimeLessThan(Date value) {
	    addCriterion("createTime <", value, "createTime");
	    return (Criteria) this;
	}

	public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
	    addCriterion("createTime <=", value, "createTime");
	    return (Criteria) this;
	}

	public Criteria andCreateTimeIn(List<Date> values) {
	    addCriterion("createTime in", values, "createTime");
	    return (Criteria) this;
	}

	public Criteria andCreateTimeNotIn(List<Date> values) {
	    addCriterion("createTime not in", values, "createTime");
	    return (Criteria) this;
	}

	public Criteria andCreateTimeBetween(Date value1, Date value2) {
	    addCriterion("createTime between", value1, value2, "createTime");
	    return (Criteria) this;
	}

	public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
	    addCriterion("createTime not between", value1, value2, "createTime");
	    return (Criteria) this;
	}
    }

    /**
     * This class was generated by MyBatis Generator. This class corresponds to the database table t_users
     * @mbggenerated
     */
    public static class Criterion {
	private String condition;
	private Object value;
	private Object secondValue;
	private boolean noValue;
	private boolean singleValue;
	private boolean betweenValue;
	private boolean listValue;
	private String typeHandler;

	public String getCondition() {
	    return condition;
	}

	public Object getValue() {
	    return value;
	}

	public Object getSecondValue() {
	    return secondValue;
	}

	public boolean isNoValue() {
	    return noValue;
	}

	public boolean isSingleValue() {
	    return singleValue;
	}

	public boolean isBetweenValue() {
	    return betweenValue;
	}

	public boolean isListValue() {
	    return listValue;
	}

	public String getTypeHandler() {
	    return typeHandler;
	}

	protected Criterion(String condition) {
	    super();
	    this.condition = condition;
	    this.typeHandler = null;
	    this.noValue = true;
	}

	protected Criterion(String condition, Object value, String typeHandler) {
	    super();
	    this.condition = condition;
	    this.value = value;
	    this.typeHandler = typeHandler;
	    if (value instanceof List<?>) {
		this.listValue = true;
	    } else {
		this.singleValue = true;
	    }
	}

	protected Criterion(String condition, Object value) {
	    this(condition, value, null);
	}

	protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
	    super();
	    this.condition = condition;
	    this.value = value;
	    this.secondValue = secondValue;
	    this.typeHandler = typeHandler;
	    this.betweenValue = true;
	}

	protected Criterion(String condition, Object value, Object secondValue) {
	    this(condition, value, secondValue, null);
	}
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table t_users
     *
     * @mbggenerated do_not_delete_during_merge
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }
}