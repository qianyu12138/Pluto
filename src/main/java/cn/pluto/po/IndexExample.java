package cn.pluto.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class IndexExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public IndexExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

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

        public Criteria andIidIsNull() {
            addCriterion("iid is null");
            return (Criteria) this;
        }

        public Criteria andIidIsNotNull() {
            addCriterion("iid is not null");
            return (Criteria) this;
        }

        public Criteria andIidEqualTo(Integer value) {
            addCriterion("iid =", value, "iid");
            return (Criteria) this;
        }

        public Criteria andIidNotEqualTo(Integer value) {
            addCriterion("iid <>", value, "iid");
            return (Criteria) this;
        }

        public Criteria andIidGreaterThan(Integer value) {
            addCriterion("iid >", value, "iid");
            return (Criteria) this;
        }

        public Criteria andIidGreaterThanOrEqualTo(Integer value) {
            addCriterion("iid >=", value, "iid");
            return (Criteria) this;
        }

        public Criteria andIidLessThan(Integer value) {
            addCriterion("iid <", value, "iid");
            return (Criteria) this;
        }

        public Criteria andIidLessThanOrEqualTo(Integer value) {
            addCriterion("iid <=", value, "iid");
            return (Criteria) this;
        }

        public Criteria andIidIn(List<Integer> values) {
            addCriterion("iid in", values, "iid");
            return (Criteria) this;
        }

        public Criteria andIidNotIn(List<Integer> values) {
            addCriterion("iid not in", values, "iid");
            return (Criteria) this;
        }

        public Criteria andIidBetween(Integer value1, Integer value2) {
            addCriterion("iid between", value1, value2, "iid");
            return (Criteria) this;
        }

        public Criteria andIidNotBetween(Integer value1, Integer value2) {
            addCriterion("iid not between", value1, value2, "iid");
            return (Criteria) this;
        }

        public Criteria andPanaltextIsNull() {
            addCriterion("panaltext is null");
            return (Criteria) this;
        }

        public Criteria andPanaltextIsNotNull() {
            addCriterion("panaltext is not null");
            return (Criteria) this;
        }

        public Criteria andPanaltextEqualTo(String value) {
            addCriterion("panaltext =", value, "panaltext");
            return (Criteria) this;
        }

        public Criteria andPanaltextNotEqualTo(String value) {
            addCriterion("panaltext <>", value, "panaltext");
            return (Criteria) this;
        }

        public Criteria andPanaltextGreaterThan(String value) {
            addCriterion("panaltext >", value, "panaltext");
            return (Criteria) this;
        }

        public Criteria andPanaltextGreaterThanOrEqualTo(String value) {
            addCriterion("panaltext >=", value, "panaltext");
            return (Criteria) this;
        }

        public Criteria andPanaltextLessThan(String value) {
            addCriterion("panaltext <", value, "panaltext");
            return (Criteria) this;
        }

        public Criteria andPanaltextLessThanOrEqualTo(String value) {
            addCriterion("panaltext <=", value, "panaltext");
            return (Criteria) this;
        }

        public Criteria andPanaltextLike(String value) {
            addCriterion("panaltext like", value, "panaltext");
            return (Criteria) this;
        }

        public Criteria andPanaltextNotLike(String value) {
            addCriterion("panaltext not like", value, "panaltext");
            return (Criteria) this;
        }

        public Criteria andPanaltextIn(List<String> values) {
            addCriterion("panaltext in", values, "panaltext");
            return (Criteria) this;
        }

        public Criteria andPanaltextNotIn(List<String> values) {
            addCriterion("panaltext not in", values, "panaltext");
            return (Criteria) this;
        }

        public Criteria andPanaltextBetween(String value1, String value2) {
            addCriterion("panaltext between", value1, value2, "panaltext");
            return (Criteria) this;
        }

        public Criteria andPanaltextNotBetween(String value1, String value2) {
            addCriterion("panaltext not between", value1, value2, "panaltext");
            return (Criteria) this;
        }

        public Criteria andBackgroundmusicIsNull() {
            addCriterion("backgroundmusic is null");
            return (Criteria) this;
        }

        public Criteria andBackgroundmusicIsNotNull() {
            addCriterion("backgroundmusic is not null");
            return (Criteria) this;
        }

        public Criteria andBackgroundmusicEqualTo(String value) {
            addCriterion("backgroundmusic =", value, "backgroundmusic");
            return (Criteria) this;
        }

        public Criteria andBackgroundmusicNotEqualTo(String value) {
            addCriterion("backgroundmusic <>", value, "backgroundmusic");
            return (Criteria) this;
        }

        public Criteria andBackgroundmusicGreaterThan(String value) {
            addCriterion("backgroundmusic >", value, "backgroundmusic");
            return (Criteria) this;
        }

        public Criteria andBackgroundmusicGreaterThanOrEqualTo(String value) {
            addCriterion("backgroundmusic >=", value, "backgroundmusic");
            return (Criteria) this;
        }

        public Criteria andBackgroundmusicLessThan(String value) {
            addCriterion("backgroundmusic <", value, "backgroundmusic");
            return (Criteria) this;
        }

        public Criteria andBackgroundmusicLessThanOrEqualTo(String value) {
            addCriterion("backgroundmusic <=", value, "backgroundmusic");
            return (Criteria) this;
        }

        public Criteria andBackgroundmusicLike(String value) {
            addCriterion("backgroundmusic like", value, "backgroundmusic");
            return (Criteria) this;
        }

        public Criteria andBackgroundmusicNotLike(String value) {
            addCriterion("backgroundmusic not like", value, "backgroundmusic");
            return (Criteria) this;
        }

        public Criteria andBackgroundmusicIn(List<String> values) {
            addCriterion("backgroundmusic in", values, "backgroundmusic");
            return (Criteria) this;
        }

        public Criteria andBackgroundmusicNotIn(List<String> values) {
            addCriterion("backgroundmusic not in", values, "backgroundmusic");
            return (Criteria) this;
        }

        public Criteria andBackgroundmusicBetween(String value1, String value2) {
            addCriterion("backgroundmusic between", value1, value2, "backgroundmusic");
            return (Criteria) this;
        }

        public Criteria andBackgroundmusicNotBetween(String value1, String value2) {
            addCriterion("backgroundmusic not between", value1, value2, "backgroundmusic");
            return (Criteria) this;
        }

        public Criteria andContactqqIsNull() {
            addCriterion("contactqq is null");
            return (Criteria) this;
        }

        public Criteria andContactqqIsNotNull() {
            addCriterion("contactqq is not null");
            return (Criteria) this;
        }

        public Criteria andContactqqEqualTo(String value) {
            addCriterion("contactqq =", value, "contactqq");
            return (Criteria) this;
        }

        public Criteria andContactqqNotEqualTo(String value) {
            addCriterion("contactqq <>", value, "contactqq");
            return (Criteria) this;
        }

        public Criteria andContactqqGreaterThan(String value) {
            addCriterion("contactqq >", value, "contactqq");
            return (Criteria) this;
        }

        public Criteria andContactqqGreaterThanOrEqualTo(String value) {
            addCriterion("contactqq >=", value, "contactqq");
            return (Criteria) this;
        }

        public Criteria andContactqqLessThan(String value) {
            addCriterion("contactqq <", value, "contactqq");
            return (Criteria) this;
        }

        public Criteria andContactqqLessThanOrEqualTo(String value) {
            addCriterion("contactqq <=", value, "contactqq");
            return (Criteria) this;
        }

        public Criteria andContactqqLike(String value) {
            addCriterion("contactqq like", value, "contactqq");
            return (Criteria) this;
        }

        public Criteria andContactqqNotLike(String value) {
            addCriterion("contactqq not like", value, "contactqq");
            return (Criteria) this;
        }

        public Criteria andContactqqIn(List<String> values) {
            addCriterion("contactqq in", values, "contactqq");
            return (Criteria) this;
        }

        public Criteria andContactqqNotIn(List<String> values) {
            addCriterion("contactqq not in", values, "contactqq");
            return (Criteria) this;
        }

        public Criteria andContactqqBetween(String value1, String value2) {
            addCriterion("contactqq between", value1, value2, "contactqq");
            return (Criteria) this;
        }

        public Criteria andContactqqNotBetween(String value1, String value2) {
            addCriterion("contactqq not between", value1, value2, "contactqq");
            return (Criteria) this;
        }

        public Criteria andContectemailIsNull() {
            addCriterion("contectemail is null");
            return (Criteria) this;
        }

        public Criteria andContectemailIsNotNull() {
            addCriterion("contectemail is not null");
            return (Criteria) this;
        }

        public Criteria andContectemailEqualTo(String value) {
            addCriterion("contectemail =", value, "contectemail");
            return (Criteria) this;
        }

        public Criteria andContectemailNotEqualTo(String value) {
            addCriterion("contectemail <>", value, "contectemail");
            return (Criteria) this;
        }

        public Criteria andContectemailGreaterThan(String value) {
            addCriterion("contectemail >", value, "contectemail");
            return (Criteria) this;
        }

        public Criteria andContectemailGreaterThanOrEqualTo(String value) {
            addCriterion("contectemail >=", value, "contectemail");
            return (Criteria) this;
        }

        public Criteria andContectemailLessThan(String value) {
            addCriterion("contectemail <", value, "contectemail");
            return (Criteria) this;
        }

        public Criteria andContectemailLessThanOrEqualTo(String value) {
            addCriterion("contectemail <=", value, "contectemail");
            return (Criteria) this;
        }

        public Criteria andContectemailLike(String value) {
            addCriterion("contectemail like", value, "contectemail");
            return (Criteria) this;
        }

        public Criteria andContectemailNotLike(String value) {
            addCriterion("contectemail not like", value, "contectemail");
            return (Criteria) this;
        }

        public Criteria andContectemailIn(List<String> values) {
            addCriterion("contectemail in", values, "contectemail");
            return (Criteria) this;
        }

        public Criteria andContectemailNotIn(List<String> values) {
            addCriterion("contectemail not in", values, "contectemail");
            return (Criteria) this;
        }

        public Criteria andContectemailBetween(String value1, String value2) {
            addCriterion("contectemail between", value1, value2, "contectemail");
            return (Criteria) this;
        }

        public Criteria andContectemailNotBetween(String value1, String value2) {
            addCriterion("contectemail not between", value1, value2, "contectemail");
            return (Criteria) this;
        }

        public Criteria andContectmobileIsNull() {
            addCriterion("contectmobile is null");
            return (Criteria) this;
        }

        public Criteria andContectmobileIsNotNull() {
            addCriterion("contectmobile is not null");
            return (Criteria) this;
        }

        public Criteria andContectmobileEqualTo(String value) {
            addCriterion("contectmobile =", value, "contectmobile");
            return (Criteria) this;
        }

        public Criteria andContectmobileNotEqualTo(String value) {
            addCriterion("contectmobile <>", value, "contectmobile");
            return (Criteria) this;
        }

        public Criteria andContectmobileGreaterThan(String value) {
            addCriterion("contectmobile >", value, "contectmobile");
            return (Criteria) this;
        }

        public Criteria andContectmobileGreaterThanOrEqualTo(String value) {
            addCriterion("contectmobile >=", value, "contectmobile");
            return (Criteria) this;
        }

        public Criteria andContectmobileLessThan(String value) {
            addCriterion("contectmobile <", value, "contectmobile");
            return (Criteria) this;
        }

        public Criteria andContectmobileLessThanOrEqualTo(String value) {
            addCriterion("contectmobile <=", value, "contectmobile");
            return (Criteria) this;
        }

        public Criteria andContectmobileLike(String value) {
            addCriterion("contectmobile like", value, "contectmobile");
            return (Criteria) this;
        }

        public Criteria andContectmobileNotLike(String value) {
            addCriterion("contectmobile not like", value, "contectmobile");
            return (Criteria) this;
        }

        public Criteria andContectmobileIn(List<String> values) {
            addCriterion("contectmobile in", values, "contectmobile");
            return (Criteria) this;
        }

        public Criteria andContectmobileNotIn(List<String> values) {
            addCriterion("contectmobile not in", values, "contectmobile");
            return (Criteria) this;
        }

        public Criteria andContectmobileBetween(String value1, String value2) {
            addCriterion("contectmobile between", value1, value2, "contectmobile");
            return (Criteria) this;
        }

        public Criteria andContectmobileNotBetween(String value1, String value2) {
            addCriterion("contectmobile not between", value1, value2, "contectmobile");
            return (Criteria) this;
        }

        public Criteria andContectaddressIsNull() {
            addCriterion("contectaddress is null");
            return (Criteria) this;
        }

        public Criteria andContectaddressIsNotNull() {
            addCriterion("contectaddress is not null");
            return (Criteria) this;
        }

        public Criteria andContectaddressEqualTo(String value) {
            addCriterion("contectaddress =", value, "contectaddress");
            return (Criteria) this;
        }

        public Criteria andContectaddressNotEqualTo(String value) {
            addCriterion("contectaddress <>", value, "contectaddress");
            return (Criteria) this;
        }

        public Criteria andContectaddressGreaterThan(String value) {
            addCriterion("contectaddress >", value, "contectaddress");
            return (Criteria) this;
        }

        public Criteria andContectaddressGreaterThanOrEqualTo(String value) {
            addCriterion("contectaddress >=", value, "contectaddress");
            return (Criteria) this;
        }

        public Criteria andContectaddressLessThan(String value) {
            addCriterion("contectaddress <", value, "contectaddress");
            return (Criteria) this;
        }

        public Criteria andContectaddressLessThanOrEqualTo(String value) {
            addCriterion("contectaddress <=", value, "contectaddress");
            return (Criteria) this;
        }

        public Criteria andContectaddressLike(String value) {
            addCriterion("contectaddress like", value, "contectaddress");
            return (Criteria) this;
        }

        public Criteria andContectaddressNotLike(String value) {
            addCriterion("contectaddress not like", value, "contectaddress");
            return (Criteria) this;
        }

        public Criteria andContectaddressIn(List<String> values) {
            addCriterion("contectaddress in", values, "contectaddress");
            return (Criteria) this;
        }

        public Criteria andContectaddressNotIn(List<String> values) {
            addCriterion("contectaddress not in", values, "contectaddress");
            return (Criteria) this;
        }

        public Criteria andContectaddressBetween(String value1, String value2) {
            addCriterion("contectaddress between", value1, value2, "contectaddress");
            return (Criteria) this;
        }

        public Criteria andContectaddressNotBetween(String value1, String value2) {
            addCriterion("contectaddress not between", value1, value2, "contectaddress");
            return (Criteria) this;
        }

        public Criteria andLastloginIsNull() {
            addCriterion("lastlogin is null");
            return (Criteria) this;
        }

        public Criteria andLastloginIsNotNull() {
            addCriterion("lastlogin is not null");
            return (Criteria) this;
        }

        public Criteria andLastloginEqualTo(Date value) {
            addCriterion("lastlogin =", value, "lastlogin");
            return (Criteria) this;
        }

        public Criteria andLastloginNotEqualTo(Date value) {
            addCriterion("lastlogin <>", value, "lastlogin");
            return (Criteria) this;
        }

        public Criteria andLastloginGreaterThan(Date value) {
            addCriterion("lastlogin >", value, "lastlogin");
            return (Criteria) this;
        }

        public Criteria andLastloginGreaterThanOrEqualTo(Date value) {
            addCriterion("lastlogin >=", value, "lastlogin");
            return (Criteria) this;
        }

        public Criteria andLastloginLessThan(Date value) {
            addCriterion("lastlogin <", value, "lastlogin");
            return (Criteria) this;
        }

        public Criteria andLastloginLessThanOrEqualTo(Date value) {
            addCriterion("lastlogin <=", value, "lastlogin");
            return (Criteria) this;
        }

        public Criteria andLastloginIn(List<Date> values) {
            addCriterion("lastlogin in", values, "lastlogin");
            return (Criteria) this;
        }

        public Criteria andLastloginNotIn(List<Date> values) {
            addCriterion("lastlogin not in", values, "lastlogin");
            return (Criteria) this;
        }

        public Criteria andLastloginBetween(Date value1, Date value2) {
            addCriterion("lastlogin between", value1, value2, "lastlogin");
            return (Criteria) this;
        }

        public Criteria andLastloginNotBetween(Date value1, Date value2) {
            addCriterion("lastlogin not between", value1, value2, "lastlogin");
            return (Criteria) this;
        }

        public Criteria andSpIsNull() {
            addCriterion("sp is null");
            return (Criteria) this;
        }

        public Criteria andSpIsNotNull() {
            addCriterion("sp is not null");
            return (Criteria) this;
        }

        public Criteria andSpEqualTo(String value) {
            addCriterion("sp =", value, "sp");
            return (Criteria) this;
        }

        public Criteria andSpNotEqualTo(String value) {
            addCriterion("sp <>", value, "sp");
            return (Criteria) this;
        }

        public Criteria andSpGreaterThan(String value) {
            addCriterion("sp >", value, "sp");
            return (Criteria) this;
        }

        public Criteria andSpGreaterThanOrEqualTo(String value) {
            addCriterion("sp >=", value, "sp");
            return (Criteria) this;
        }

        public Criteria andSpLessThan(String value) {
            addCriterion("sp <", value, "sp");
            return (Criteria) this;
        }

        public Criteria andSpLessThanOrEqualTo(String value) {
            addCriterion("sp <=", value, "sp");
            return (Criteria) this;
        }

        public Criteria andSpLike(String value) {
            addCriterion("sp like", value, "sp");
            return (Criteria) this;
        }

        public Criteria andSpNotLike(String value) {
            addCriterion("sp not like", value, "sp");
            return (Criteria) this;
        }

        public Criteria andSpIn(List<String> values) {
            addCriterion("sp in", values, "sp");
            return (Criteria) this;
        }

        public Criteria andSpNotIn(List<String> values) {
            addCriterion("sp not in", values, "sp");
            return (Criteria) this;
        }

        public Criteria andSpBetween(String value1, String value2) {
            addCriterion("sp between", value1, value2, "sp");
            return (Criteria) this;
        }

        public Criteria andSpNotBetween(String value1, String value2) {
            addCriterion("sp not between", value1, value2, "sp");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

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
}