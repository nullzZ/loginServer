package com.server.db.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Date;

public class ServerRecordExample {
    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database table t_servers
     * @mbggenerated
     */
    protected String orderByClause;
    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database table t_servers
     * @mbggenerated
     */
    protected boolean distinct;
    /**
     * This field was generated by MyBatis Generator. This field corresponds to the database table t_servers
     * @mbggenerated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table t_servers
     * @mbggenerated
     */
    public ServerRecordExample() {
	oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table t_servers
     * @mbggenerated
     */
    public void setOrderByClause(String orderByClause) {
	this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table t_servers
     * @mbggenerated
     */
    public String getOrderByClause() {
	return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table t_servers
     * @mbggenerated
     */
    public void setDistinct(boolean distinct) {
	this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table t_servers
     * @mbggenerated
     */
    public boolean isDistinct() {
	return distinct;
    }

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table t_servers
     * @mbggenerated
     */
    public List<Criteria> getOredCriteria() {
	return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table t_servers
     * @mbggenerated
     */
    public void or(Criteria criteria) {
	oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table t_servers
     * @mbggenerated
     */
    public Criteria or() {
	Criteria criteria = createCriteriaInternal();
	oredCriteria.add(criteria);
	return criteria;
    }

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table t_servers
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
     * This method was generated by MyBatis Generator. This method corresponds to the database table t_servers
     * @mbggenerated
     */
    protected Criteria createCriteriaInternal() {
	Criteria criteria = new Criteria();
	return criteria;
    }

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table t_servers
     * @mbggenerated
     */
    public void clear() {
	oredCriteria.clear();
	orderByClause = null;
	distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator. This class corresponds to the database table t_servers
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

	public Criteria andUidIsNull() {
	    addCriterion("uid is null");
	    return (Criteria) this;
	}

	public Criteria andUidIsNotNull() {
	    addCriterion("uid is not null");
	    return (Criteria) this;
	}

	public Criteria andUidEqualTo(Integer value) {
	    addCriterion("uid =", value, "uid");
	    return (Criteria) this;
	}

	public Criteria andUidNotEqualTo(Integer value) {
	    addCriterion("uid <>", value, "uid");
	    return (Criteria) this;
	}

	public Criteria andUidGreaterThan(Integer value) {
	    addCriterion("uid >", value, "uid");
	    return (Criteria) this;
	}

	public Criteria andUidGreaterThanOrEqualTo(Integer value) {
	    addCriterion("uid >=", value, "uid");
	    return (Criteria) this;
	}

	public Criteria andUidLessThan(Integer value) {
	    addCriterion("uid <", value, "uid");
	    return (Criteria) this;
	}

	public Criteria andUidLessThanOrEqualTo(Integer value) {
	    addCriterion("uid <=", value, "uid");
	    return (Criteria) this;
	}

	public Criteria andUidIn(List<Integer> values) {
	    addCriterion("uid in", values, "uid");
	    return (Criteria) this;
	}

	public Criteria andUidNotIn(List<Integer> values) {
	    addCriterion("uid not in", values, "uid");
	    return (Criteria) this;
	}

	public Criteria andUidBetween(Integer value1, Integer value2) {
	    addCriterion("uid between", value1, value2, "uid");
	    return (Criteria) this;
	}

	public Criteria andUidNotBetween(Integer value1, Integer value2) {
	    addCriterion("uid not between", value1, value2, "uid");
	    return (Criteria) this;
	}

	public Criteria andNameIsNull() {
	    addCriterion("name is null");
	    return (Criteria) this;
	}

	public Criteria andNameIsNotNull() {
	    addCriterion("name is not null");
	    return (Criteria) this;
	}

	public Criteria andNameEqualTo(String value) {
	    addCriterion("name =", value, "name");
	    return (Criteria) this;
	}

	public Criteria andNameNotEqualTo(String value) {
	    addCriterion("name <>", value, "name");
	    return (Criteria) this;
	}

	public Criteria andNameGreaterThan(String value) {
	    addCriterion("name >", value, "name");
	    return (Criteria) this;
	}

	public Criteria andNameGreaterThanOrEqualTo(String value) {
	    addCriterion("name >=", value, "name");
	    return (Criteria) this;
	}

	public Criteria andNameLessThan(String value) {
	    addCriterion("name <", value, "name");
	    return (Criteria) this;
	}

	public Criteria andNameLessThanOrEqualTo(String value) {
	    addCriterion("name <=", value, "name");
	    return (Criteria) this;
	}

	public Criteria andNameLike(String value) {
	    addCriterion("name like", value, "name");
	    return (Criteria) this;
	}

	public Criteria andNameNotLike(String value) {
	    addCriterion("name not like", value, "name");
	    return (Criteria) this;
	}

	public Criteria andNameIn(List<String> values) {
	    addCriterion("name in", values, "name");
	    return (Criteria) this;
	}

	public Criteria andNameNotIn(List<String> values) {
	    addCriterion("name not in", values, "name");
	    return (Criteria) this;
	}

	public Criteria andNameBetween(String value1, String value2) {
	    addCriterion("name between", value1, value2, "name");
	    return (Criteria) this;
	}

	public Criteria andNameNotBetween(String value1, String value2) {
	    addCriterion("name not between", value1, value2, "name");
	    return (Criteria) this;
	}

	public Criteria andChannelIdIsNull() {
	    addCriterion("channelId is null");
	    return (Criteria) this;
	}

	public Criteria andChannelIdIsNotNull() {
	    addCriterion("channelId is not null");
	    return (Criteria) this;
	}

	public Criteria andChannelIdEqualTo(String value) {
	    addCriterion("channelId =", value, "channelId");
	    return (Criteria) this;
	}

	public Criteria andChannelIdNotEqualTo(String value) {
	    addCriterion("channelId <>", value, "channelId");
	    return (Criteria) this;
	}

	public Criteria andChannelIdGreaterThan(String value) {
	    addCriterion("channelId >", value, "channelId");
	    return (Criteria) this;
	}

	public Criteria andChannelIdGreaterThanOrEqualTo(String value) {
	    addCriterion("channelId >=", value, "channelId");
	    return (Criteria) this;
	}

	public Criteria andChannelIdLessThan(String value) {
	    addCriterion("channelId <", value, "channelId");
	    return (Criteria) this;
	}

	public Criteria andChannelIdLessThanOrEqualTo(String value) {
	    addCriterion("channelId <=", value, "channelId");
	    return (Criteria) this;
	}

	public Criteria andChannelIdLike(String value) {
	    addCriterion("channelId like", value, "channelId");
	    return (Criteria) this;
	}

	public Criteria andChannelIdNotLike(String value) {
	    addCriterion("channelId not like", value, "channelId");
	    return (Criteria) this;
	}

	public Criteria andChannelIdIn(List<String> values) {
	    addCriterion("channelId in", values, "channelId");
	    return (Criteria) this;
	}

	public Criteria andChannelIdNotIn(List<String> values) {
	    addCriterion("channelId not in", values, "channelId");
	    return (Criteria) this;
	}

	public Criteria andChannelIdBetween(String value1, String value2) {
	    addCriterion("channelId between", value1, value2, "channelId");
	    return (Criteria) this;
	}

	public Criteria andChannelIdNotBetween(String value1, String value2) {
	    addCriterion("channelId not between", value1, value2, "channelId");
	    return (Criteria) this;
	}

	public Criteria andServerIdIsNull() {
	    addCriterion("serverId is null");
	    return (Criteria) this;
	}

	public Criteria andServerIdIsNotNull() {
	    addCriterion("serverId is not null");
	    return (Criteria) this;
	}

	public Criteria andServerIdEqualTo(String value) {
	    addCriterion("serverId =", value, "serverId");
	    return (Criteria) this;
	}

	public Criteria andServerIdNotEqualTo(String value) {
	    addCriterion("serverId <>", value, "serverId");
	    return (Criteria) this;
	}

	public Criteria andServerIdGreaterThan(String value) {
	    addCriterion("serverId >", value, "serverId");
	    return (Criteria) this;
	}

	public Criteria andServerIdGreaterThanOrEqualTo(String value) {
	    addCriterion("serverId >=", value, "serverId");
	    return (Criteria) this;
	}

	public Criteria andServerIdLessThan(String value) {
	    addCriterion("serverId <", value, "serverId");
	    return (Criteria) this;
	}

	public Criteria andServerIdLessThanOrEqualTo(String value) {
	    addCriterion("serverId <=", value, "serverId");
	    return (Criteria) this;
	}

	public Criteria andServerIdLike(String value) {
	    addCriterion("serverId like", value, "serverId");
	    return (Criteria) this;
	}

	public Criteria andServerIdNotLike(String value) {
	    addCriterion("serverId not like", value, "serverId");
	    return (Criteria) this;
	}

	public Criteria andServerIdIn(List<String> values) {
	    addCriterion("serverId in", values, "serverId");
	    return (Criteria) this;
	}

	public Criteria andServerIdNotIn(List<String> values) {
	    addCriterion("serverId not in", values, "serverId");
	    return (Criteria) this;
	}

	public Criteria andServerIdBetween(String value1, String value2) {
	    addCriterion("serverId between", value1, value2, "serverId");
	    return (Criteria) this;
	}

	public Criteria andServerIdNotBetween(String value1, String value2) {
	    addCriterion("serverId not between", value1, value2, "serverId");
	    return (Criteria) this;
	}

	public Criteria andHostIsNull() {
	    addCriterion("host is null");
	    return (Criteria) this;
	}

	public Criteria andHostIsNotNull() {
	    addCriterion("host is not null");
	    return (Criteria) this;
	}

	public Criteria andHostEqualTo(String value) {
	    addCriterion("host =", value, "host");
	    return (Criteria) this;
	}

	public Criteria andHostNotEqualTo(String value) {
	    addCriterion("host <>", value, "host");
	    return (Criteria) this;
	}

	public Criteria andHostGreaterThan(String value) {
	    addCriterion("host >", value, "host");
	    return (Criteria) this;
	}

	public Criteria andHostGreaterThanOrEqualTo(String value) {
	    addCriterion("host >=", value, "host");
	    return (Criteria) this;
	}

	public Criteria andHostLessThan(String value) {
	    addCriterion("host <", value, "host");
	    return (Criteria) this;
	}

	public Criteria andHostLessThanOrEqualTo(String value) {
	    addCriterion("host <=", value, "host");
	    return (Criteria) this;
	}

	public Criteria andHostLike(String value) {
	    addCriterion("host like", value, "host");
	    return (Criteria) this;
	}

	public Criteria andHostNotLike(String value) {
	    addCriterion("host not like", value, "host");
	    return (Criteria) this;
	}

	public Criteria andHostIn(List<String> values) {
	    addCriterion("host in", values, "host");
	    return (Criteria) this;
	}

	public Criteria andHostNotIn(List<String> values) {
	    addCriterion("host not in", values, "host");
	    return (Criteria) this;
	}

	public Criteria andHostBetween(String value1, String value2) {
	    addCriterion("host between", value1, value2, "host");
	    return (Criteria) this;
	}

	public Criteria andHostNotBetween(String value1, String value2) {
	    addCriterion("host not between", value1, value2, "host");
	    return (Criteria) this;
	}

	public Criteria andWaiHostIsNull() {
	    addCriterion("waiHost is null");
	    return (Criteria) this;
	}

	public Criteria andWaiHostIsNotNull() {
	    addCriterion("waiHost is not null");
	    return (Criteria) this;
	}

	public Criteria andWaiHostEqualTo(String value) {
	    addCriterion("waiHost =", value, "waiHost");
	    return (Criteria) this;
	}

	public Criteria andWaiHostNotEqualTo(String value) {
	    addCriterion("waiHost <>", value, "waiHost");
	    return (Criteria) this;
	}

	public Criteria andWaiHostGreaterThan(String value) {
	    addCriterion("waiHost >", value, "waiHost");
	    return (Criteria) this;
	}

	public Criteria andWaiHostGreaterThanOrEqualTo(String value) {
	    addCriterion("waiHost >=", value, "waiHost");
	    return (Criteria) this;
	}

	public Criteria andWaiHostLessThan(String value) {
	    addCriterion("waiHost <", value, "waiHost");
	    return (Criteria) this;
	}

	public Criteria andWaiHostLessThanOrEqualTo(String value) {
	    addCriterion("waiHost <=", value, "waiHost");
	    return (Criteria) this;
	}

	public Criteria andWaiHostLike(String value) {
	    addCriterion("waiHost like", value, "waiHost");
	    return (Criteria) this;
	}

	public Criteria andWaiHostNotLike(String value) {
	    addCriterion("waiHost not like", value, "waiHost");
	    return (Criteria) this;
	}

	public Criteria andWaiHostIn(List<String> values) {
	    addCriterion("waiHost in", values, "waiHost");
	    return (Criteria) this;
	}

	public Criteria andWaiHostNotIn(List<String> values) {
	    addCriterion("waiHost not in", values, "waiHost");
	    return (Criteria) this;
	}

	public Criteria andWaiHostBetween(String value1, String value2) {
	    addCriterion("waiHost between", value1, value2, "waiHost");
	    return (Criteria) this;
	}

	public Criteria andWaiHostNotBetween(String value1, String value2) {
	    addCriterion("waiHost not between", value1, value2, "waiHost");
	    return (Criteria) this;
	}

	public Criteria andPortIsNull() {
	    addCriterion("port is null");
	    return (Criteria) this;
	}

	public Criteria andPortIsNotNull() {
	    addCriterion("port is not null");
	    return (Criteria) this;
	}

	public Criteria andPortEqualTo(Integer value) {
	    addCriterion("port =", value, "port");
	    return (Criteria) this;
	}

	public Criteria andPortNotEqualTo(Integer value) {
	    addCriterion("port <>", value, "port");
	    return (Criteria) this;
	}

	public Criteria andPortGreaterThan(Integer value) {
	    addCriterion("port >", value, "port");
	    return (Criteria) this;
	}

	public Criteria andPortGreaterThanOrEqualTo(Integer value) {
	    addCriterion("port >=", value, "port");
	    return (Criteria) this;
	}

	public Criteria andPortLessThan(Integer value) {
	    addCriterion("port <", value, "port");
	    return (Criteria) this;
	}

	public Criteria andPortLessThanOrEqualTo(Integer value) {
	    addCriterion("port <=", value, "port");
	    return (Criteria) this;
	}

	public Criteria andPortIn(List<Integer> values) {
	    addCriterion("port in", values, "port");
	    return (Criteria) this;
	}

	public Criteria andPortNotIn(List<Integer> values) {
	    addCriterion("port not in", values, "port");
	    return (Criteria) this;
	}

	public Criteria andPortBetween(Integer value1, Integer value2) {
	    addCriterion("port between", value1, value2, "port");
	    return (Criteria) this;
	}

	public Criteria andPortNotBetween(Integer value1, Integer value2) {
	    addCriterion("port not between", value1, value2, "port");
	    return (Criteria) this;
	}

	public Criteria andCreateDateIsNull() {
	    addCriterion("createDate is null");
	    return (Criteria) this;
	}

	public Criteria andCreateDateIsNotNull() {
	    addCriterion("createDate is not null");
	    return (Criteria) this;
	}

	public Criteria andCreateDateEqualTo(Date value) {
	    addCriterion("createDate =", value, "createDate");
	    return (Criteria) this;
	}

	public Criteria andCreateDateNotEqualTo(Date value) {
	    addCriterion("createDate <>", value, "createDate");
	    return (Criteria) this;
	}

	public Criteria andCreateDateGreaterThan(Date value) {
	    addCriterion("createDate >", value, "createDate");
	    return (Criteria) this;
	}

	public Criteria andCreateDateGreaterThanOrEqualTo(Date value) {
	    addCriterion("createDate >=", value, "createDate");
	    return (Criteria) this;
	}

	public Criteria andCreateDateLessThan(Date value) {
	    addCriterion("createDate <", value, "createDate");
	    return (Criteria) this;
	}

	public Criteria andCreateDateLessThanOrEqualTo(Date value) {
	    addCriterion("createDate <=", value, "createDate");
	    return (Criteria) this;
	}

	public Criteria andCreateDateIn(List<Date> values) {
	    addCriterion("createDate in", values, "createDate");
	    return (Criteria) this;
	}

	public Criteria andCreateDateNotIn(List<Date> values) {
	    addCriterion("createDate not in", values, "createDate");
	    return (Criteria) this;
	}

	public Criteria andCreateDateBetween(Date value1, Date value2) {
	    addCriterion("createDate between", value1, value2, "createDate");
	    return (Criteria) this;
	}

	public Criteria andCreateDateNotBetween(Date value1, Date value2) {
	    addCriterion("createDate not between", value1, value2, "createDate");
	    return (Criteria) this;
	}
    }

    /**
     * This class was generated by MyBatis Generator. This class corresponds to the database table t_servers
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
     * This class corresponds to the database table t_servers
     *
     * @mbggenerated do_not_delete_during_merge
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }
}