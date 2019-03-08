package sh.otk.classchecker.classes.model;

import java.util.ArrayList;
import java.util.List;

public class ClassesExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ClassesExample() {
        oredCriteria = new ArrayList<>();
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
            criteria = new ArrayList<>();
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

        public Criteria andClassIdIsNull() {
            addCriterion("CLASS_ID is null");
            return (Criteria) this;
        }

        public Criteria andClassIdIsNotNull() {
            addCriterion("CLASS_ID is not null");
            return (Criteria) this;
        }

        public Criteria andClassIdEqualTo(Integer value) {
            addCriterion("CLASS_ID =", value, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdNotEqualTo(Integer value) {
            addCriterion("CLASS_ID <>", value, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdGreaterThan(Integer value) {
            addCriterion("CLASS_ID >", value, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("CLASS_ID >=", value, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdLessThan(Integer value) {
            addCriterion("CLASS_ID <", value, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdLessThanOrEqualTo(Integer value) {
            addCriterion("CLASS_ID <=", value, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdIn(List<Integer> values) {
            addCriterion("CLASS_ID in", values, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdNotIn(List<Integer> values) {
            addCriterion("CLASS_ID not in", values, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdBetween(Integer value1, Integer value2) {
            addCriterion("CLASS_ID between", value1, value2, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdNotBetween(Integer value1, Integer value2) {
            addCriterion("CLASS_ID not between", value1, value2, "classId");
            return (Criteria) this;
        }

        public Criteria andSubjectIsNull() {
            addCriterion("SUBJECT is null");
            return (Criteria) this;
        }

        public Criteria andSubjectIsNotNull() {
            addCriterion("SUBJECT is not null");
            return (Criteria) this;
        }

        public Criteria andSubjectEqualTo(String value) {
            addCriterion("SUBJECT =", value, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectNotEqualTo(String value) {
            addCriterion("SUBJECT <>", value, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectGreaterThan(String value) {
            addCriterion("SUBJECT >", value, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectGreaterThanOrEqualTo(String value) {
            addCriterion("SUBJECT >=", value, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectLessThan(String value) {
            addCriterion("SUBJECT <", value, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectLessThanOrEqualTo(String value) {
            addCriterion("SUBJECT <=", value, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectLike(String value) {
            addCriterion("SUBJECT like", value, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectNotLike(String value) {
            addCriterion("SUBJECT not like", value, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectIn(List<String> values) {
            addCriterion("SUBJECT in", values, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectNotIn(List<String> values) {
            addCriterion("SUBJECT not in", values, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectBetween(String value1, String value2) {
            addCriterion("SUBJECT between", value1, value2, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectNotBetween(String value1, String value2) {
            addCriterion("SUBJECT not between", value1, value2, "subject");
            return (Criteria) this;
        }

        public Criteria andClassUrlIsNull() {
            addCriterion("CLASS_URL is null");
            return (Criteria) this;
        }

        public Criteria andClassUrlIsNotNull() {
            addCriterion("CLASS_URL is not null");
            return (Criteria) this;
        }

        public Criteria andClassUrlEqualTo(String value) {
            addCriterion("CLASS_URL =", value, "classUrl");
            return (Criteria) this;
        }

        public Criteria andClassUrlNotEqualTo(String value) {
            addCriterion("CLASS_URL <>", value, "classUrl");
            return (Criteria) this;
        }

        public Criteria andClassUrlGreaterThan(String value) {
            addCriterion("CLASS_URL >", value, "classUrl");
            return (Criteria) this;
        }

        public Criteria andClassUrlGreaterThanOrEqualTo(String value) {
            addCriterion("CLASS_URL >=", value, "classUrl");
            return (Criteria) this;
        }

        public Criteria andClassUrlLessThan(String value) {
            addCriterion("CLASS_URL <", value, "classUrl");
            return (Criteria) this;
        }

        public Criteria andClassUrlLessThanOrEqualTo(String value) {
            addCriterion("CLASS_URL <=", value, "classUrl");
            return (Criteria) this;
        }

        public Criteria andClassUrlLike(String value) {
            addCriterion("CLASS_URL like", value, "classUrl");
            return (Criteria) this;
        }

        public Criteria andClassUrlNotLike(String value) {
            addCriterion("CLASS_URL not like", value, "classUrl");
            return (Criteria) this;
        }

        public Criteria andClassUrlIn(List<String> values) {
            addCriterion("CLASS_URL in", values, "classUrl");
            return (Criteria) this;
        }

        public Criteria andClassUrlNotIn(List<String> values) {
            addCriterion("CLASS_URL not in", values, "classUrl");
            return (Criteria) this;
        }

        public Criteria andClassUrlBetween(String value1, String value2) {
            addCriterion("CLASS_URL between", value1, value2, "classUrl");
            return (Criteria) this;
        }

        public Criteria andClassUrlNotBetween(String value1, String value2) {
            addCriterion("CLASS_URL not between", value1, value2, "classUrl");
            return (Criteria) this;
        }

        public Criteria andTermIsNull() {
            addCriterion("TERM is null");
            return (Criteria) this;
        }

        public Criteria andTermIsNotNull() {
            addCriterion("TERM is not null");
            return (Criteria) this;
        }

        public Criteria andTermEqualTo(Integer value) {
            addCriterion("TERM =", value, "term");
            return (Criteria) this;
        }

        public Criteria andTermNotEqualTo(Integer value) {
            addCriterion("TERM <>", value, "term");
            return (Criteria) this;
        }

        public Criteria andTermGreaterThan(Integer value) {
            addCriterion("TERM >", value, "term");
            return (Criteria) this;
        }

        public Criteria andTermGreaterThanOrEqualTo(Integer value) {
            addCriterion("TERM >=", value, "term");
            return (Criteria) this;
        }

        public Criteria andTermLessThan(Integer value) {
            addCriterion("TERM <", value, "term");
            return (Criteria) this;
        }

        public Criteria andTermLessThanOrEqualTo(Integer value) {
            addCriterion("TERM <=", value, "term");
            return (Criteria) this;
        }

        public Criteria andTermIn(List<Integer> values) {
            addCriterion("TERM in", values, "term");
            return (Criteria) this;
        }

        public Criteria andTermNotIn(List<Integer> values) {
            addCriterion("TERM not in", values, "term");
            return (Criteria) this;
        }

        public Criteria andTermBetween(Integer value1, Integer value2) {
            addCriterion("TERM between", value1, value2, "term");
            return (Criteria) this;
        }

        public Criteria andTermNotBetween(Integer value1, Integer value2) {
            addCriterion("TERM not between", value1, value2, "term");
            return (Criteria) this;
        }

        public Criteria andClassNumIsNull() {
            addCriterion("CLASS_NUM is null");
            return (Criteria) this;
        }

        public Criteria andClassNumIsNotNull() {
            addCriterion("CLASS_NUM is not null");
            return (Criteria) this;
        }

        public Criteria andClassNumEqualTo(Integer value) {
            addCriterion("CLASS_NUM =", value, "classNum");
            return (Criteria) this;
        }

        public Criteria andClassNumNotEqualTo(Integer value) {
            addCriterion("CLASS_NUM <>", value, "classNum");
            return (Criteria) this;
        }

        public Criteria andClassNumGreaterThan(Integer value) {
            addCriterion("CLASS_NUM >", value, "classNum");
            return (Criteria) this;
        }

        public Criteria andClassNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("CLASS_NUM >=", value, "classNum");
            return (Criteria) this;
        }

        public Criteria andClassNumLessThan(Integer value) {
            addCriterion("CLASS_NUM <", value, "classNum");
            return (Criteria) this;
        }

        public Criteria andClassNumLessThanOrEqualTo(Integer value) {
            addCriterion("CLASS_NUM <=", value, "classNum");
            return (Criteria) this;
        }

        public Criteria andClassNumIn(List<Integer> values) {
            addCriterion("CLASS_NUM in", values, "classNum");
            return (Criteria) this;
        }

        public Criteria andClassNumNotIn(List<Integer> values) {
            addCriterion("CLASS_NUM not in", values, "classNum");
            return (Criteria) this;
        }

        public Criteria andClassNumBetween(Integer value1, Integer value2) {
            addCriterion("CLASS_NUM between", value1, value2, "classNum");
            return (Criteria) this;
        }

        public Criteria andClassNumNotBetween(Integer value1, Integer value2) {
            addCriterion("CLASS_NUM not between", value1, value2, "classNum");
            return (Criteria) this;
        }

        public Criteria andClassTittleIsNull() {
            addCriterion("CLASS_TITTLE is null");
            return (Criteria) this;
        }

        public Criteria andClassTittleIsNotNull() {
            addCriterion("CLASS_TITTLE is not null");
            return (Criteria) this;
        }

        public Criteria andClassTittleEqualTo(String value) {
            addCriterion("CLASS_TITTLE =", value, "classTittle");
            return (Criteria) this;
        }

        public Criteria andClassTittleNotEqualTo(String value) {
            addCriterion("CLASS_TITTLE <>", value, "classTittle");
            return (Criteria) this;
        }

        public Criteria andClassTittleGreaterThan(String value) {
            addCriterion("CLASS_TITTLE >", value, "classTittle");
            return (Criteria) this;
        }

        public Criteria andClassTittleGreaterThanOrEqualTo(String value) {
            addCriterion("CLASS_TITTLE >=", value, "classTittle");
            return (Criteria) this;
        }

        public Criteria andClassTittleLessThan(String value) {
            addCriterion("CLASS_TITTLE <", value, "classTittle");
            return (Criteria) this;
        }

        public Criteria andClassTittleLessThanOrEqualTo(String value) {
            addCriterion("CLASS_TITTLE <=", value, "classTittle");
            return (Criteria) this;
        }

        public Criteria andClassTittleLike(String value) {
            addCriterion("CLASS_TITTLE like", value, "classTittle");
            return (Criteria) this;
        }

        public Criteria andClassTittleNotLike(String value) {
            addCriterion("CLASS_TITTLE not like", value, "classTittle");
            return (Criteria) this;
        }

        public Criteria andClassTittleIn(List<String> values) {
            addCriterion("CLASS_TITTLE in", values, "classTittle");
            return (Criteria) this;
        }

        public Criteria andClassTittleNotIn(List<String> values) {
            addCriterion("CLASS_TITTLE not in", values, "classTittle");
            return (Criteria) this;
        }

        public Criteria andClassTittleBetween(String value1, String value2) {
            addCriterion("CLASS_TITTLE between", value1, value2, "classTittle");
            return (Criteria) this;
        }

        public Criteria andClassTittleNotBetween(String value1, String value2) {
            addCriterion("CLASS_TITTLE not between", value1, value2, "classTittle");
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