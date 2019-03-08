package sh.otk.classchecker.section.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class SectionsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SectionsExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        protected void addCriterionForJDBCTime(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Time(value.getTime()), property);
        }

        protected void addCriterionForJDBCTime(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Time> timeList = new ArrayList<>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                timeList.add(new java.sql.Time(iter.next().getTime()));
            }
            addCriterion(condition, timeList, property);
        }

        protected void addCriterionForJDBCTime(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Time(value1.getTime()), new java.sql.Time(value2.getTime()), property);
        }

        public Criteria andSectionIdIsNull() {
            addCriterion("SECTION_ID is null");
            return (Criteria) this;
        }

        public Criteria andSectionIdIsNotNull() {
            addCriterion("SECTION_ID is not null");
            return (Criteria) this;
        }

        public Criteria andSectionIdEqualTo(Integer value) {
            addCriterion("SECTION_ID =", value, "sectionId");
            return (Criteria) this;
        }

        public Criteria andSectionIdNotEqualTo(Integer value) {
            addCriterion("SECTION_ID <>", value, "sectionId");
            return (Criteria) this;
        }

        public Criteria andSectionIdGreaterThan(Integer value) {
            addCriterion("SECTION_ID >", value, "sectionId");
            return (Criteria) this;
        }

        public Criteria andSectionIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("SECTION_ID >=", value, "sectionId");
            return (Criteria) this;
        }

        public Criteria andSectionIdLessThan(Integer value) {
            addCriterion("SECTION_ID <", value, "sectionId");
            return (Criteria) this;
        }

        public Criteria andSectionIdLessThanOrEqualTo(Integer value) {
            addCriterion("SECTION_ID <=", value, "sectionId");
            return (Criteria) this;
        }

        public Criteria andSectionIdIn(List<Integer> values) {
            addCriterion("SECTION_ID in", values, "sectionId");
            return (Criteria) this;
        }

        public Criteria andSectionIdNotIn(List<Integer> values) {
            addCriterion("SECTION_ID not in", values, "sectionId");
            return (Criteria) this;
        }

        public Criteria andSectionIdBetween(Integer value1, Integer value2) {
            addCriterion("SECTION_ID between", value1, value2, "sectionId");
            return (Criteria) this;
        }

        public Criteria andSectionIdNotBetween(Integer value1, Integer value2) {
            addCriterion("SECTION_ID not between", value1, value2, "sectionId");
            return (Criteria) this;
        }

        public Criteria andSeessionIsNull() {
            addCriterion("SEESSION is null");
            return (Criteria) this;
        }

        public Criteria andSeessionIsNotNull() {
            addCriterion("SEESSION is not null");
            return (Criteria) this;
        }

        public Criteria andSeessionEqualTo(String value) {
            addCriterion("SEESSION =", value, "seession");
            return (Criteria) this;
        }

        public Criteria andSeessionNotEqualTo(String value) {
            addCriterion("SEESSION <>", value, "seession");
            return (Criteria) this;
        }

        public Criteria andSeessionGreaterThan(String value) {
            addCriterion("SEESSION >", value, "seession");
            return (Criteria) this;
        }

        public Criteria andSeessionGreaterThanOrEqualTo(String value) {
            addCriterion("SEESSION >=", value, "seession");
            return (Criteria) this;
        }

        public Criteria andSeessionLessThan(String value) {
            addCriterion("SEESSION <", value, "seession");
            return (Criteria) this;
        }

        public Criteria andSeessionLessThanOrEqualTo(String value) {
            addCriterion("SEESSION <=", value, "seession");
            return (Criteria) this;
        }

        public Criteria andSeessionLike(String value) {
            addCriterion("SEESSION like", value, "seession");
            return (Criteria) this;
        }

        public Criteria andSeessionNotLike(String value) {
            addCriterion("SEESSION not like", value, "seession");
            return (Criteria) this;
        }

        public Criteria andSeessionIn(List<String> values) {
            addCriterion("SEESSION in", values, "seession");
            return (Criteria) this;
        }

        public Criteria andSeessionNotIn(List<String> values) {
            addCriterion("SEESSION not in", values, "seession");
            return (Criteria) this;
        }

        public Criteria andSeessionBetween(String value1, String value2) {
            addCriterion("SEESSION between", value1, value2, "seession");
            return (Criteria) this;
        }

        public Criteria andSeessionNotBetween(String value1, String value2) {
            addCriterion("SEESSION not between", value1, value2, "seession");
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

        public Criteria andUnitIsNull() {
            addCriterion("UNIT is null");
            return (Criteria) this;
        }

        public Criteria andUnitIsNotNull() {
            addCriterion("UNIT is not null");
            return (Criteria) this;
        }

        public Criteria andUnitEqualTo(Integer value) {
            addCriterion("UNIT =", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotEqualTo(Integer value) {
            addCriterion("UNIT <>", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitGreaterThan(Integer value) {
            addCriterion("UNIT >", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitGreaterThanOrEqualTo(Integer value) {
            addCriterion("UNIT >=", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitLessThan(Integer value) {
            addCriterion("UNIT <", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitLessThanOrEqualTo(Integer value) {
            addCriterion("UNIT <=", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitIn(List<Integer> values) {
            addCriterion("UNIT in", values, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotIn(List<Integer> values) {
            addCriterion("UNIT not in", values, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitBetween(Integer value1, Integer value2) {
            addCriterion("UNIT between", value1, value2, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotBetween(Integer value1, Integer value2) {
            addCriterion("UNIT not between", value1, value2, "unit");
            return (Criteria) this;
        }

        public Criteria andGradingIsNull() {
            addCriterion("GRADING is null");
            return (Criteria) this;
        }

        public Criteria andGradingIsNotNull() {
            addCriterion("GRADING is not null");
            return (Criteria) this;
        }

        public Criteria andGradingEqualTo(String value) {
            addCriterion("GRADING =", value, "grading");
            return (Criteria) this;
        }

        public Criteria andGradingNotEqualTo(String value) {
            addCriterion("GRADING <>", value, "grading");
            return (Criteria) this;
        }

        public Criteria andGradingGreaterThan(String value) {
            addCriterion("GRADING >", value, "grading");
            return (Criteria) this;
        }

        public Criteria andGradingGreaterThanOrEqualTo(String value) {
            addCriterion("GRADING >=", value, "grading");
            return (Criteria) this;
        }

        public Criteria andGradingLessThan(String value) {
            addCriterion("GRADING <", value, "grading");
            return (Criteria) this;
        }

        public Criteria andGradingLessThanOrEqualTo(String value) {
            addCriterion("GRADING <=", value, "grading");
            return (Criteria) this;
        }

        public Criteria andGradingLike(String value) {
            addCriterion("GRADING like", value, "grading");
            return (Criteria) this;
        }

        public Criteria andGradingNotLike(String value) {
            addCriterion("GRADING not like", value, "grading");
            return (Criteria) this;
        }

        public Criteria andGradingIn(List<String> values) {
            addCriterion("GRADING in", values, "grading");
            return (Criteria) this;
        }

        public Criteria andGradingNotIn(List<String> values) {
            addCriterion("GRADING not in", values, "grading");
            return (Criteria) this;
        }

        public Criteria andGradingBetween(String value1, String value2) {
            addCriterion("GRADING between", value1, value2, "grading");
            return (Criteria) this;
        }

        public Criteria andGradingNotBetween(String value1, String value2) {
            addCriterion("GRADING not between", value1, value2, "grading");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNull() {
            addCriterion("DESCRIPTION is null");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNotNull() {
            addCriterion("DESCRIPTION is not null");
            return (Criteria) this;
        }

        public Criteria andDescriptionEqualTo(String value) {
            addCriterion("DESCRIPTION =", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotEqualTo(String value) {
            addCriterion("DESCRIPTION <>", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThan(String value) {
            addCriterion("DESCRIPTION >", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("DESCRIPTION >=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThan(String value) {
            addCriterion("DESCRIPTION <", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThanOrEqualTo(String value) {
            addCriterion("DESCRIPTION <=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLike(String value) {
            addCriterion("DESCRIPTION like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotLike(String value) {
            addCriterion("DESCRIPTION not like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionIn(List<String> values) {
            addCriterion("DESCRIPTION in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotIn(List<String> values) {
            addCriterion("DESCRIPTION not in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionBetween(String value1, String value2) {
            addCriterion("DESCRIPTION between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotBetween(String value1, String value2) {
            addCriterion("DESCRIPTION not between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andPreqIsNull() {
            addCriterion("PREQ is null");
            return (Criteria) this;
        }

        public Criteria andPreqIsNotNull() {
            addCriterion("PREQ is not null");
            return (Criteria) this;
        }

        public Criteria andPreqEqualTo(String value) {
            addCriterion("PREQ =", value, "preq");
            return (Criteria) this;
        }

        public Criteria andPreqNotEqualTo(String value) {
            addCriterion("PREQ <>", value, "preq");
            return (Criteria) this;
        }

        public Criteria andPreqGreaterThan(String value) {
            addCriterion("PREQ >", value, "preq");
            return (Criteria) this;
        }

        public Criteria andPreqGreaterThanOrEqualTo(String value) {
            addCriterion("PREQ >=", value, "preq");
            return (Criteria) this;
        }

        public Criteria andPreqLessThan(String value) {
            addCriterion("PREQ <", value, "preq");
            return (Criteria) this;
        }

        public Criteria andPreqLessThanOrEqualTo(String value) {
            addCriterion("PREQ <=", value, "preq");
            return (Criteria) this;
        }

        public Criteria andPreqLike(String value) {
            addCriterion("PREQ like", value, "preq");
            return (Criteria) this;
        }

        public Criteria andPreqNotLike(String value) {
            addCriterion("PREQ not like", value, "preq");
            return (Criteria) this;
        }

        public Criteria andPreqIn(List<String> values) {
            addCriterion("PREQ in", values, "preq");
            return (Criteria) this;
        }

        public Criteria andPreqNotIn(List<String> values) {
            addCriterion("PREQ not in", values, "preq");
            return (Criteria) this;
        }

        public Criteria andPreqBetween(String value1, String value2) {
            addCriterion("PREQ between", value1, value2, "preq");
            return (Criteria) this;
        }

        public Criteria andPreqNotBetween(String value1, String value2) {
            addCriterion("PREQ not between", value1, value2, "preq");
            return (Criteria) this;
        }

        public Criteria andRequireLecIsNull() {
            addCriterion("REQUIRE_LEC is null");
            return (Criteria) this;
        }

        public Criteria andRequireLecIsNotNull() {
            addCriterion("REQUIRE_LEC is not null");
            return (Criteria) this;
        }

        public Criteria andRequireLecEqualTo(Byte value) {
            addCriterion("REQUIRE_LEC =", value, "requireLec");
            return (Criteria) this;
        }

        public Criteria andRequireLecNotEqualTo(Byte value) {
            addCriterion("REQUIRE_LEC <>", value, "requireLec");
            return (Criteria) this;
        }

        public Criteria andRequireLecGreaterThan(Byte value) {
            addCriterion("REQUIRE_LEC >", value, "requireLec");
            return (Criteria) this;
        }

        public Criteria andRequireLecGreaterThanOrEqualTo(Byte value) {
            addCriterion("REQUIRE_LEC >=", value, "requireLec");
            return (Criteria) this;
        }

        public Criteria andRequireLecLessThan(Byte value) {
            addCriterion("REQUIRE_LEC <", value, "requireLec");
            return (Criteria) this;
        }

        public Criteria andRequireLecLessThanOrEqualTo(Byte value) {
            addCriterion("REQUIRE_LEC <=", value, "requireLec");
            return (Criteria) this;
        }

        public Criteria andRequireLecIn(List<Byte> values) {
            addCriterion("REQUIRE_LEC in", values, "requireLec");
            return (Criteria) this;
        }

        public Criteria andRequireLecNotIn(List<Byte> values) {
            addCriterion("REQUIRE_LEC not in", values, "requireLec");
            return (Criteria) this;
        }

        public Criteria andRequireLecBetween(Byte value1, Byte value2) {
            addCriterion("REQUIRE_LEC between", value1, value2, "requireLec");
            return (Criteria) this;
        }

        public Criteria andRequireLecNotBetween(Byte value1, Byte value2) {
            addCriterion("REQUIRE_LEC not between", value1, value2, "requireLec");
            return (Criteria) this;
        }

        public Criteria andRequireRecIsNull() {
            addCriterion("REQUIRE_REC is null");
            return (Criteria) this;
        }

        public Criteria andRequireRecIsNotNull() {
            addCriterion("REQUIRE_REC is not null");
            return (Criteria) this;
        }

        public Criteria andRequireRecEqualTo(Byte value) {
            addCriterion("REQUIRE_REC =", value, "requireRec");
            return (Criteria) this;
        }

        public Criteria andRequireRecNotEqualTo(Byte value) {
            addCriterion("REQUIRE_REC <>", value, "requireRec");
            return (Criteria) this;
        }

        public Criteria andRequireRecGreaterThan(Byte value) {
            addCriterion("REQUIRE_REC >", value, "requireRec");
            return (Criteria) this;
        }

        public Criteria andRequireRecGreaterThanOrEqualTo(Byte value) {
            addCriterion("REQUIRE_REC >=", value, "requireRec");
            return (Criteria) this;
        }

        public Criteria andRequireRecLessThan(Byte value) {
            addCriterion("REQUIRE_REC <", value, "requireRec");
            return (Criteria) this;
        }

        public Criteria andRequireRecLessThanOrEqualTo(Byte value) {
            addCriterion("REQUIRE_REC <=", value, "requireRec");
            return (Criteria) this;
        }

        public Criteria andRequireRecIn(List<Byte> values) {
            addCriterion("REQUIRE_REC in", values, "requireRec");
            return (Criteria) this;
        }

        public Criteria andRequireRecNotIn(List<Byte> values) {
            addCriterion("REQUIRE_REC not in", values, "requireRec");
            return (Criteria) this;
        }

        public Criteria andRequireRecBetween(Byte value1, Byte value2) {
            addCriterion("REQUIRE_REC between", value1, value2, "requireRec");
            return (Criteria) this;
        }

        public Criteria andRequireRecNotBetween(Byte value1, Byte value2) {
            addCriterion("REQUIRE_REC not between", value1, value2, "requireRec");
            return (Criteria) this;
        }

        public Criteria andReqireLabIsNull() {
            addCriterion("REQIRE_LAB is null");
            return (Criteria) this;
        }

        public Criteria andReqireLabIsNotNull() {
            addCriterion("REQIRE_LAB is not null");
            return (Criteria) this;
        }

        public Criteria andReqireLabEqualTo(Byte value) {
            addCriterion("REQIRE_LAB =", value, "reqireLab");
            return (Criteria) this;
        }

        public Criteria andReqireLabNotEqualTo(Byte value) {
            addCriterion("REQIRE_LAB <>", value, "reqireLab");
            return (Criteria) this;
        }

        public Criteria andReqireLabGreaterThan(Byte value) {
            addCriterion("REQIRE_LAB >", value, "reqireLab");
            return (Criteria) this;
        }

        public Criteria andReqireLabGreaterThanOrEqualTo(Byte value) {
            addCriterion("REQIRE_LAB >=", value, "reqireLab");
            return (Criteria) this;
        }

        public Criteria andReqireLabLessThan(Byte value) {
            addCriterion("REQIRE_LAB <", value, "reqireLab");
            return (Criteria) this;
        }

        public Criteria andReqireLabLessThanOrEqualTo(Byte value) {
            addCriterion("REQIRE_LAB <=", value, "reqireLab");
            return (Criteria) this;
        }

        public Criteria andReqireLabIn(List<Byte> values) {
            addCriterion("REQIRE_LAB in", values, "reqireLab");
            return (Criteria) this;
        }

        public Criteria andReqireLabNotIn(List<Byte> values) {
            addCriterion("REQIRE_LAB not in", values, "reqireLab");
            return (Criteria) this;
        }

        public Criteria andReqireLabBetween(Byte value1, Byte value2) {
            addCriterion("REQIRE_LAB between", value1, value2, "reqireLab");
            return (Criteria) this;
        }

        public Criteria andReqireLabNotBetween(Byte value1, Byte value2) {
            addCriterion("REQIRE_LAB not between", value1, value2, "reqireLab");
            return (Criteria) this;
        }

        public Criteria andIsRecIsNull() {
            addCriterion("IS_REC is null");
            return (Criteria) this;
        }

        public Criteria andIsRecIsNotNull() {
            addCriterion("IS_REC is not null");
            return (Criteria) this;
        }

        public Criteria andIsRecEqualTo(Byte value) {
            addCriterion("IS_REC =", value, "isRec");
            return (Criteria) this;
        }

        public Criteria andIsRecNotEqualTo(Byte value) {
            addCriterion("IS_REC <>", value, "isRec");
            return (Criteria) this;
        }

        public Criteria andIsRecGreaterThan(Byte value) {
            addCriterion("IS_REC >", value, "isRec");
            return (Criteria) this;
        }

        public Criteria andIsRecGreaterThanOrEqualTo(Byte value) {
            addCriterion("IS_REC >=", value, "isRec");
            return (Criteria) this;
        }

        public Criteria andIsRecLessThan(Byte value) {
            addCriterion("IS_REC <", value, "isRec");
            return (Criteria) this;
        }

        public Criteria andIsRecLessThanOrEqualTo(Byte value) {
            addCriterion("IS_REC <=", value, "isRec");
            return (Criteria) this;
        }

        public Criteria andIsRecIn(List<Byte> values) {
            addCriterion("IS_REC in", values, "isRec");
            return (Criteria) this;
        }

        public Criteria andIsRecNotIn(List<Byte> values) {
            addCriterion("IS_REC not in", values, "isRec");
            return (Criteria) this;
        }

        public Criteria andIsRecBetween(Byte value1, Byte value2) {
            addCriterion("IS_REC between", value1, value2, "isRec");
            return (Criteria) this;
        }

        public Criteria andIsRecNotBetween(Byte value1, Byte value2) {
            addCriterion("IS_REC not between", value1, value2, "isRec");
            return (Criteria) this;
        }

        public Criteria andMeetMonIsNull() {
            addCriterion("MEET_MON is null");
            return (Criteria) this;
        }

        public Criteria andMeetMonIsNotNull() {
            addCriterion("MEET_MON is not null");
            return (Criteria) this;
        }

        public Criteria andMeetMonEqualTo(Byte value) {
            addCriterion("MEET_MON =", value, "meetMon");
            return (Criteria) this;
        }

        public Criteria andMeetMonNotEqualTo(Byte value) {
            addCriterion("MEET_MON <>", value, "meetMon");
            return (Criteria) this;
        }

        public Criteria andMeetMonGreaterThan(Byte value) {
            addCriterion("MEET_MON >", value, "meetMon");
            return (Criteria) this;
        }

        public Criteria andMeetMonGreaterThanOrEqualTo(Byte value) {
            addCriterion("MEET_MON >=", value, "meetMon");
            return (Criteria) this;
        }

        public Criteria andMeetMonLessThan(Byte value) {
            addCriterion("MEET_MON <", value, "meetMon");
            return (Criteria) this;
        }

        public Criteria andMeetMonLessThanOrEqualTo(Byte value) {
            addCriterion("MEET_MON <=", value, "meetMon");
            return (Criteria) this;
        }

        public Criteria andMeetMonIn(List<Byte> values) {
            addCriterion("MEET_MON in", values, "meetMon");
            return (Criteria) this;
        }

        public Criteria andMeetMonNotIn(List<Byte> values) {
            addCriterion("MEET_MON not in", values, "meetMon");
            return (Criteria) this;
        }

        public Criteria andMeetMonBetween(Byte value1, Byte value2) {
            addCriterion("MEET_MON between", value1, value2, "meetMon");
            return (Criteria) this;
        }

        public Criteria andMeetMonNotBetween(Byte value1, Byte value2) {
            addCriterion("MEET_MON not between", value1, value2, "meetMon");
            return (Criteria) this;
        }

        public Criteria andMeetTueIsNull() {
            addCriterion("MEET_TUE is null");
            return (Criteria) this;
        }

        public Criteria andMeetTueIsNotNull() {
            addCriterion("MEET_TUE is not null");
            return (Criteria) this;
        }

        public Criteria andMeetTueEqualTo(Byte value) {
            addCriterion("MEET_TUE =", value, "meetTue");
            return (Criteria) this;
        }

        public Criteria andMeetTueNotEqualTo(Byte value) {
            addCriterion("MEET_TUE <>", value, "meetTue");
            return (Criteria) this;
        }

        public Criteria andMeetTueGreaterThan(Byte value) {
            addCriterion("MEET_TUE >", value, "meetTue");
            return (Criteria) this;
        }

        public Criteria andMeetTueGreaterThanOrEqualTo(Byte value) {
            addCriterion("MEET_TUE >=", value, "meetTue");
            return (Criteria) this;
        }

        public Criteria andMeetTueLessThan(Byte value) {
            addCriterion("MEET_TUE <", value, "meetTue");
            return (Criteria) this;
        }

        public Criteria andMeetTueLessThanOrEqualTo(Byte value) {
            addCriterion("MEET_TUE <=", value, "meetTue");
            return (Criteria) this;
        }

        public Criteria andMeetTueIn(List<Byte> values) {
            addCriterion("MEET_TUE in", values, "meetTue");
            return (Criteria) this;
        }

        public Criteria andMeetTueNotIn(List<Byte> values) {
            addCriterion("MEET_TUE not in", values, "meetTue");
            return (Criteria) this;
        }

        public Criteria andMeetTueBetween(Byte value1, Byte value2) {
            addCriterion("MEET_TUE between", value1, value2, "meetTue");
            return (Criteria) this;
        }

        public Criteria andMeetTueNotBetween(Byte value1, Byte value2) {
            addCriterion("MEET_TUE not between", value1, value2, "meetTue");
            return (Criteria) this;
        }

        public Criteria andMeetWedIsNull() {
            addCriterion("MEET_WED is null");
            return (Criteria) this;
        }

        public Criteria andMeetWedIsNotNull() {
            addCriterion("MEET_WED is not null");
            return (Criteria) this;
        }

        public Criteria andMeetWedEqualTo(Byte value) {
            addCriterion("MEET_WED =", value, "meetWed");
            return (Criteria) this;
        }

        public Criteria andMeetWedNotEqualTo(Byte value) {
            addCriterion("MEET_WED <>", value, "meetWed");
            return (Criteria) this;
        }

        public Criteria andMeetWedGreaterThan(Byte value) {
            addCriterion("MEET_WED >", value, "meetWed");
            return (Criteria) this;
        }

        public Criteria andMeetWedGreaterThanOrEqualTo(Byte value) {
            addCriterion("MEET_WED >=", value, "meetWed");
            return (Criteria) this;
        }

        public Criteria andMeetWedLessThan(Byte value) {
            addCriterion("MEET_WED <", value, "meetWed");
            return (Criteria) this;
        }

        public Criteria andMeetWedLessThanOrEqualTo(Byte value) {
            addCriterion("MEET_WED <=", value, "meetWed");
            return (Criteria) this;
        }

        public Criteria andMeetWedIn(List<Byte> values) {
            addCriterion("MEET_WED in", values, "meetWed");
            return (Criteria) this;
        }

        public Criteria andMeetWedNotIn(List<Byte> values) {
            addCriterion("MEET_WED not in", values, "meetWed");
            return (Criteria) this;
        }

        public Criteria andMeetWedBetween(Byte value1, Byte value2) {
            addCriterion("MEET_WED between", value1, value2, "meetWed");
            return (Criteria) this;
        }

        public Criteria andMeetWedNotBetween(Byte value1, Byte value2) {
            addCriterion("MEET_WED not between", value1, value2, "meetWed");
            return (Criteria) this;
        }

        public Criteria andMeetThuIsNull() {
            addCriterion("MEET_THU is null");
            return (Criteria) this;
        }

        public Criteria andMeetThuIsNotNull() {
            addCriterion("MEET_THU is not null");
            return (Criteria) this;
        }

        public Criteria andMeetThuEqualTo(Byte value) {
            addCriterion("MEET_THU =", value, "meetThu");
            return (Criteria) this;
        }

        public Criteria andMeetThuNotEqualTo(Byte value) {
            addCriterion("MEET_THU <>", value, "meetThu");
            return (Criteria) this;
        }

        public Criteria andMeetThuGreaterThan(Byte value) {
            addCriterion("MEET_THU >", value, "meetThu");
            return (Criteria) this;
        }

        public Criteria andMeetThuGreaterThanOrEqualTo(Byte value) {
            addCriterion("MEET_THU >=", value, "meetThu");
            return (Criteria) this;
        }

        public Criteria andMeetThuLessThan(Byte value) {
            addCriterion("MEET_THU <", value, "meetThu");
            return (Criteria) this;
        }

        public Criteria andMeetThuLessThanOrEqualTo(Byte value) {
            addCriterion("MEET_THU <=", value, "meetThu");
            return (Criteria) this;
        }

        public Criteria andMeetThuIn(List<Byte> values) {
            addCriterion("MEET_THU in", values, "meetThu");
            return (Criteria) this;
        }

        public Criteria andMeetThuNotIn(List<Byte> values) {
            addCriterion("MEET_THU not in", values, "meetThu");
            return (Criteria) this;
        }

        public Criteria andMeetThuBetween(Byte value1, Byte value2) {
            addCriterion("MEET_THU between", value1, value2, "meetThu");
            return (Criteria) this;
        }

        public Criteria andMeetThuNotBetween(Byte value1, Byte value2) {
            addCriterion("MEET_THU not between", value1, value2, "meetThu");
            return (Criteria) this;
        }

        public Criteria andMeetFriIsNull() {
            addCriterion("MEET_FRI is null");
            return (Criteria) this;
        }

        public Criteria andMeetFriIsNotNull() {
            addCriterion("MEET_FRI is not null");
            return (Criteria) this;
        }

        public Criteria andMeetFriEqualTo(Byte value) {
            addCriterion("MEET_FRI =", value, "meetFri");
            return (Criteria) this;
        }

        public Criteria andMeetFriNotEqualTo(Byte value) {
            addCriterion("MEET_FRI <>", value, "meetFri");
            return (Criteria) this;
        }

        public Criteria andMeetFriGreaterThan(Byte value) {
            addCriterion("MEET_FRI >", value, "meetFri");
            return (Criteria) this;
        }

        public Criteria andMeetFriGreaterThanOrEqualTo(Byte value) {
            addCriterion("MEET_FRI >=", value, "meetFri");
            return (Criteria) this;
        }

        public Criteria andMeetFriLessThan(Byte value) {
            addCriterion("MEET_FRI <", value, "meetFri");
            return (Criteria) this;
        }

        public Criteria andMeetFriLessThanOrEqualTo(Byte value) {
            addCriterion("MEET_FRI <=", value, "meetFri");
            return (Criteria) this;
        }

        public Criteria andMeetFriIn(List<Byte> values) {
            addCriterion("MEET_FRI in", values, "meetFri");
            return (Criteria) this;
        }

        public Criteria andMeetFriNotIn(List<Byte> values) {
            addCriterion("MEET_FRI not in", values, "meetFri");
            return (Criteria) this;
        }

        public Criteria andMeetFriBetween(Byte value1, Byte value2) {
            addCriterion("MEET_FRI between", value1, value2, "meetFri");
            return (Criteria) this;
        }

        public Criteria andMeetFriNotBetween(Byte value1, Byte value2) {
            addCriterion("MEET_FRI not between", value1, value2, "meetFri");
            return (Criteria) this;
        }

        public Criteria andStartTimeIsNull() {
            addCriterion("START_TIME is null");
            return (Criteria) this;
        }

        public Criteria andStartTimeIsNotNull() {
            addCriterion("START_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andStartTimeEqualTo(Date value) {
            addCriterionForJDBCTime("START_TIME =", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotEqualTo(Date value) {
            addCriterionForJDBCTime("START_TIME <>", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeGreaterThan(Date value) {
            addCriterionForJDBCTime("START_TIME >", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("START_TIME >=", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeLessThan(Date value) {
            addCriterionForJDBCTime("START_TIME <", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("START_TIME <=", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeIn(List<Date> values) {
            addCriterionForJDBCTime("START_TIME in", values, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotIn(List<Date> values) {
            addCriterionForJDBCTime("START_TIME not in", values, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("START_TIME between", value1, value2, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("START_TIME not between", value1, value2, "startTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeIsNull() {
            addCriterion("END_TIME is null");
            return (Criteria) this;
        }

        public Criteria andEndTimeIsNotNull() {
            addCriterion("END_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andEndTimeEqualTo(Date value) {
            addCriterionForJDBCTime("END_TIME =", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotEqualTo(Date value) {
            addCriterionForJDBCTime("END_TIME <>", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeGreaterThan(Date value) {
            addCriterionForJDBCTime("END_TIME >", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("END_TIME >=", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLessThan(Date value) {
            addCriterionForJDBCTime("END_TIME <", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("END_TIME <=", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeIn(List<Date> values) {
            addCriterionForJDBCTime("END_TIME in", values, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotIn(List<Date> values) {
            addCriterionForJDBCTime("END_TIME not in", values, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("END_TIME between", value1, value2, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("END_TIME not between", value1, value2, "endTime");
            return (Criteria) this;
        }

        public Criteria andStartDateIsNull() {
            addCriterion("START_DATE is null");
            return (Criteria) this;
        }

        public Criteria andStartDateIsNotNull() {
            addCriterion("START_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andStartDateEqualTo(Date value) {
            addCriterionForJDBCDate("START_DATE =", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("START_DATE <>", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateGreaterThan(Date value) {
            addCriterionForJDBCDate("START_DATE >", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("START_DATE >=", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateLessThan(Date value) {
            addCriterionForJDBCDate("START_DATE <", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("START_DATE <=", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateIn(List<Date> values) {
            addCriterionForJDBCDate("START_DATE in", values, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("START_DATE not in", values, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("START_DATE between", value1, value2, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("START_DATE not between", value1, value2, "startDate");
            return (Criteria) this;
        }

        public Criteria andEndDateIsNull() {
            addCriterion("END_DATE is null");
            return (Criteria) this;
        }

        public Criteria andEndDateIsNotNull() {
            addCriterion("END_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andEndDateEqualTo(Date value) {
            addCriterionForJDBCDate("END_DATE =", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("END_DATE <>", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateGreaterThan(Date value) {
            addCriterionForJDBCDate("END_DATE >", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("END_DATE >=", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateLessThan(Date value) {
            addCriterionForJDBCDate("END_DATE <", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("END_DATE <=", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateIn(List<Date> values) {
            addCriterionForJDBCDate("END_DATE in", values, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("END_DATE not in", values, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("END_DATE between", value1, value2, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("END_DATE not between", value1, value2, "endDate");
            return (Criteria) this;
        }

        public Criteria andRoomIsNull() {
            addCriterion("ROOM is null");
            return (Criteria) this;
        }

        public Criteria andRoomIsNotNull() {
            addCriterion("ROOM is not null");
            return (Criteria) this;
        }

        public Criteria andRoomEqualTo(String value) {
            addCriterion("ROOM =", value, "room");
            return (Criteria) this;
        }

        public Criteria andRoomNotEqualTo(String value) {
            addCriterion("ROOM <>", value, "room");
            return (Criteria) this;
        }

        public Criteria andRoomGreaterThan(String value) {
            addCriterion("ROOM >", value, "room");
            return (Criteria) this;
        }

        public Criteria andRoomGreaterThanOrEqualTo(String value) {
            addCriterion("ROOM >=", value, "room");
            return (Criteria) this;
        }

        public Criteria andRoomLessThan(String value) {
            addCriterion("ROOM <", value, "room");
            return (Criteria) this;
        }

        public Criteria andRoomLessThanOrEqualTo(String value) {
            addCriterion("ROOM <=", value, "room");
            return (Criteria) this;
        }

        public Criteria andRoomLike(String value) {
            addCriterion("ROOM like", value, "room");
            return (Criteria) this;
        }

        public Criteria andRoomNotLike(String value) {
            addCriterion("ROOM not like", value, "room");
            return (Criteria) this;
        }

        public Criteria andRoomIn(List<String> values) {
            addCriterion("ROOM in", values, "room");
            return (Criteria) this;
        }

        public Criteria andRoomNotIn(List<String> values) {
            addCriterion("ROOM not in", values, "room");
            return (Criteria) this;
        }

        public Criteria andRoomBetween(String value1, String value2) {
            addCriterion("ROOM between", value1, value2, "room");
            return (Criteria) this;
        }

        public Criteria andRoomNotBetween(String value1, String value2) {
            addCriterion("ROOM not between", value1, value2, "room");
            return (Criteria) this;
        }

        public Criteria andCampusIsNull() {
            addCriterion("CAMPUS is null");
            return (Criteria) this;
        }

        public Criteria andCampusIsNotNull() {
            addCriterion("CAMPUS is not null");
            return (Criteria) this;
        }

        public Criteria andCampusEqualTo(String value) {
            addCriterion("CAMPUS =", value, "campus");
            return (Criteria) this;
        }

        public Criteria andCampusNotEqualTo(String value) {
            addCriterion("CAMPUS <>", value, "campus");
            return (Criteria) this;
        }

        public Criteria andCampusGreaterThan(String value) {
            addCriterion("CAMPUS >", value, "campus");
            return (Criteria) this;
        }

        public Criteria andCampusGreaterThanOrEqualTo(String value) {
            addCriterion("CAMPUS >=", value, "campus");
            return (Criteria) this;
        }

        public Criteria andCampusLessThan(String value) {
            addCriterion("CAMPUS <", value, "campus");
            return (Criteria) this;
        }

        public Criteria andCampusLessThanOrEqualTo(String value) {
            addCriterion("CAMPUS <=", value, "campus");
            return (Criteria) this;
        }

        public Criteria andCampusLike(String value) {
            addCriterion("CAMPUS like", value, "campus");
            return (Criteria) this;
        }

        public Criteria andCampusNotLike(String value) {
            addCriterion("CAMPUS not like", value, "campus");
            return (Criteria) this;
        }

        public Criteria andCampusIn(List<String> values) {
            addCriterion("CAMPUS in", values, "campus");
            return (Criteria) this;
        }

        public Criteria andCampusNotIn(List<String> values) {
            addCriterion("CAMPUS not in", values, "campus");
            return (Criteria) this;
        }

        public Criteria andCampusBetween(String value1, String value2) {
            addCriterion("CAMPUS between", value1, value2, "campus");
            return (Criteria) this;
        }

        public Criteria andCampusNotBetween(String value1, String value2) {
            addCriterion("CAMPUS not between", value1, value2, "campus");
            return (Criteria) this;
        }

        public Criteria andLocationIsNull() {
            addCriterion("`LOCATION` is null");
            return (Criteria) this;
        }

        public Criteria andLocationIsNotNull() {
            addCriterion("`LOCATION` is not null");
            return (Criteria) this;
        }

        public Criteria andLocationEqualTo(String value) {
            addCriterion("`LOCATION` =", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationNotEqualTo(String value) {
            addCriterion("`LOCATION` <>", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationGreaterThan(String value) {
            addCriterion("`LOCATION` >", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationGreaterThanOrEqualTo(String value) {
            addCriterion("`LOCATION` >=", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationLessThan(String value) {
            addCriterion("`LOCATION` <", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationLessThanOrEqualTo(String value) {
            addCriterion("`LOCATION` <=", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationLike(String value) {
            addCriterion("`LOCATION` like", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationNotLike(String value) {
            addCriterion("`LOCATION` not like", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationIn(List<String> values) {
            addCriterion("`LOCATION` in", values, "location");
            return (Criteria) this;
        }

        public Criteria andLocationNotIn(List<String> values) {
            addCriterion("`LOCATION` not in", values, "location");
            return (Criteria) this;
        }

        public Criteria andLocationBetween(String value1, String value2) {
            addCriterion("`LOCATION` between", value1, value2, "location");
            return (Criteria) this;
        }

        public Criteria andLocationNotBetween(String value1, String value2) {
            addCriterion("`LOCATION` not between", value1, value2, "location");
            return (Criteria) this;
        }

        public Criteria andTextbookIsNull() {
            addCriterion("TEXTBOOK is null");
            return (Criteria) this;
        }

        public Criteria andTextbookIsNotNull() {
            addCriterion("TEXTBOOK is not null");
            return (Criteria) this;
        }

        public Criteria andTextbookEqualTo(String value) {
            addCriterion("TEXTBOOK =", value, "textbook");
            return (Criteria) this;
        }

        public Criteria andTextbookNotEqualTo(String value) {
            addCriterion("TEXTBOOK <>", value, "textbook");
            return (Criteria) this;
        }

        public Criteria andTextbookGreaterThan(String value) {
            addCriterion("TEXTBOOK >", value, "textbook");
            return (Criteria) this;
        }

        public Criteria andTextbookGreaterThanOrEqualTo(String value) {
            addCriterion("TEXTBOOK >=", value, "textbook");
            return (Criteria) this;
        }

        public Criteria andTextbookLessThan(String value) {
            addCriterion("TEXTBOOK <", value, "textbook");
            return (Criteria) this;
        }

        public Criteria andTextbookLessThanOrEqualTo(String value) {
            addCriterion("TEXTBOOK <=", value, "textbook");
            return (Criteria) this;
        }

        public Criteria andTextbookLike(String value) {
            addCriterion("TEXTBOOK like", value, "textbook");
            return (Criteria) this;
        }

        public Criteria andTextbookNotLike(String value) {
            addCriterion("TEXTBOOK not like", value, "textbook");
            return (Criteria) this;
        }

        public Criteria andTextbookIn(List<String> values) {
            addCriterion("TEXTBOOK in", values, "textbook");
            return (Criteria) this;
        }

        public Criteria andTextbookNotIn(List<String> values) {
            addCriterion("TEXTBOOK not in", values, "textbook");
            return (Criteria) this;
        }

        public Criteria andTextbookBetween(String value1, String value2) {
            addCriterion("TEXTBOOK between", value1, value2, "textbook");
            return (Criteria) this;
        }

        public Criteria andTextbookNotBetween(String value1, String value2) {
            addCriterion("TEXTBOOK not between", value1, value2, "textbook");
            return (Criteria) this;
        }

        public Criteria andCurrentStatusIsNull() {
            addCriterion("CURRENT_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andCurrentStatusIsNotNull() {
            addCriterion("CURRENT_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andCurrentStatusEqualTo(Integer value) {
            addCriterion("CURRENT_STATUS =", value, "currentStatus");
            return (Criteria) this;
        }

        public Criteria andCurrentStatusNotEqualTo(Integer value) {
            addCriterion("CURRENT_STATUS <>", value, "currentStatus");
            return (Criteria) this;
        }

        public Criteria andCurrentStatusGreaterThan(Integer value) {
            addCriterion("CURRENT_STATUS >", value, "currentStatus");
            return (Criteria) this;
        }

        public Criteria andCurrentStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("CURRENT_STATUS >=", value, "currentStatus");
            return (Criteria) this;
        }

        public Criteria andCurrentStatusLessThan(Integer value) {
            addCriterion("CURRENT_STATUS <", value, "currentStatus");
            return (Criteria) this;
        }

        public Criteria andCurrentStatusLessThanOrEqualTo(Integer value) {
            addCriterion("CURRENT_STATUS <=", value, "currentStatus");
            return (Criteria) this;
        }

        public Criteria andCurrentStatusIn(List<Integer> values) {
            addCriterion("CURRENT_STATUS in", values, "currentStatus");
            return (Criteria) this;
        }

        public Criteria andCurrentStatusNotIn(List<Integer> values) {
            addCriterion("CURRENT_STATUS not in", values, "currentStatus");
            return (Criteria) this;
        }

        public Criteria andCurrentStatusBetween(Integer value1, Integer value2) {
            addCriterion("CURRENT_STATUS between", value1, value2, "currentStatus");
            return (Criteria) this;
        }

        public Criteria andCurrentStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("CURRENT_STATUS not between", value1, value2, "currentStatus");
            return (Criteria) this;
        }

        public Criteria andClassCapIsNull() {
            addCriterion("CLASS_CAP is null");
            return (Criteria) this;
        }

        public Criteria andClassCapIsNotNull() {
            addCriterion("CLASS_CAP is not null");
            return (Criteria) this;
        }

        public Criteria andClassCapEqualTo(Integer value) {
            addCriterion("CLASS_CAP =", value, "classCap");
            return (Criteria) this;
        }

        public Criteria andClassCapNotEqualTo(Integer value) {
            addCriterion("CLASS_CAP <>", value, "classCap");
            return (Criteria) this;
        }

        public Criteria andClassCapGreaterThan(Integer value) {
            addCriterion("CLASS_CAP >", value, "classCap");
            return (Criteria) this;
        }

        public Criteria andClassCapGreaterThanOrEqualTo(Integer value) {
            addCriterion("CLASS_CAP >=", value, "classCap");
            return (Criteria) this;
        }

        public Criteria andClassCapLessThan(Integer value) {
            addCriterion("CLASS_CAP <", value, "classCap");
            return (Criteria) this;
        }

        public Criteria andClassCapLessThanOrEqualTo(Integer value) {
            addCriterion("CLASS_CAP <=", value, "classCap");
            return (Criteria) this;
        }

        public Criteria andClassCapIn(List<Integer> values) {
            addCriterion("CLASS_CAP in", values, "classCap");
            return (Criteria) this;
        }

        public Criteria andClassCapNotIn(List<Integer> values) {
            addCriterion("CLASS_CAP not in", values, "classCap");
            return (Criteria) this;
        }

        public Criteria andClassCapBetween(Integer value1, Integer value2) {
            addCriterion("CLASS_CAP between", value1, value2, "classCap");
            return (Criteria) this;
        }

        public Criteria andClassCapNotBetween(Integer value1, Integer value2) {
            addCriterion("CLASS_CAP not between", value1, value2, "classCap");
            return (Criteria) this;
        }

        public Criteria andWaitlistCapIsNull() {
            addCriterion("WAITLIST_CAP is null");
            return (Criteria) this;
        }

        public Criteria andWaitlistCapIsNotNull() {
            addCriterion("WAITLIST_CAP is not null");
            return (Criteria) this;
        }

        public Criteria andWaitlistCapEqualTo(Integer value) {
            addCriterion("WAITLIST_CAP =", value, "waitlistCap");
            return (Criteria) this;
        }

        public Criteria andWaitlistCapNotEqualTo(Integer value) {
            addCriterion("WAITLIST_CAP <>", value, "waitlistCap");
            return (Criteria) this;
        }

        public Criteria andWaitlistCapGreaterThan(Integer value) {
            addCriterion("WAITLIST_CAP >", value, "waitlistCap");
            return (Criteria) this;
        }

        public Criteria andWaitlistCapGreaterThanOrEqualTo(Integer value) {
            addCriterion("WAITLIST_CAP >=", value, "waitlistCap");
            return (Criteria) this;
        }

        public Criteria andWaitlistCapLessThan(Integer value) {
            addCriterion("WAITLIST_CAP <", value, "waitlistCap");
            return (Criteria) this;
        }

        public Criteria andWaitlistCapLessThanOrEqualTo(Integer value) {
            addCriterion("WAITLIST_CAP <=", value, "waitlistCap");
            return (Criteria) this;
        }

        public Criteria andWaitlistCapIn(List<Integer> values) {
            addCriterion("WAITLIST_CAP in", values, "waitlistCap");
            return (Criteria) this;
        }

        public Criteria andWaitlistCapNotIn(List<Integer> values) {
            addCriterion("WAITLIST_CAP not in", values, "waitlistCap");
            return (Criteria) this;
        }

        public Criteria andWaitlistCapBetween(Integer value1, Integer value2) {
            addCriterion("WAITLIST_CAP between", value1, value2, "waitlistCap");
            return (Criteria) this;
        }

        public Criteria andWaitlistCapNotBetween(Integer value1, Integer value2) {
            addCriterion("WAITLIST_CAP not between", value1, value2, "waitlistCap");
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

        public Criteria andSubjectNumIsNull() {
            addCriterion("SUBJECT_NUM is null");
            return (Criteria) this;
        }

        public Criteria andSubjectNumIsNotNull() {
            addCriterion("SUBJECT_NUM is not null");
            return (Criteria) this;
        }

        public Criteria andSubjectNumEqualTo(Integer value) {
            addCriterion("SUBJECT_NUM =", value, "subjectNum");
            return (Criteria) this;
        }

        public Criteria andSubjectNumNotEqualTo(Integer value) {
            addCriterion("SUBJECT_NUM <>", value, "subjectNum");
            return (Criteria) this;
        }

        public Criteria andSubjectNumGreaterThan(Integer value) {
            addCriterion("SUBJECT_NUM >", value, "subjectNum");
            return (Criteria) this;
        }

        public Criteria andSubjectNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("SUBJECT_NUM >=", value, "subjectNum");
            return (Criteria) this;
        }

        public Criteria andSubjectNumLessThan(Integer value) {
            addCriterion("SUBJECT_NUM <", value, "subjectNum");
            return (Criteria) this;
        }

        public Criteria andSubjectNumLessThanOrEqualTo(Integer value) {
            addCriterion("SUBJECT_NUM <=", value, "subjectNum");
            return (Criteria) this;
        }

        public Criteria andSubjectNumIn(List<Integer> values) {
            addCriterion("SUBJECT_NUM in", values, "subjectNum");
            return (Criteria) this;
        }

        public Criteria andSubjectNumNotIn(List<Integer> values) {
            addCriterion("SUBJECT_NUM not in", values, "subjectNum");
            return (Criteria) this;
        }

        public Criteria andSubjectNumBetween(Integer value1, Integer value2) {
            addCriterion("SUBJECT_NUM between", value1, value2, "subjectNum");
            return (Criteria) this;
        }

        public Criteria andSubjectNumNotBetween(Integer value1, Integer value2) {
            addCriterion("SUBJECT_NUM not between", value1, value2, "subjectNum");
            return (Criteria) this;
        }

        public Criteria andSectionNumIsNull() {
            addCriterion("SECTION_NUM is null");
            return (Criteria) this;
        }

        public Criteria andSectionNumIsNotNull() {
            addCriterion("SECTION_NUM is not null");
            return (Criteria) this;
        }

        public Criteria andSectionNumEqualTo(Integer value) {
            addCriterion("SECTION_NUM =", value, "sectionNum");
            return (Criteria) this;
        }

        public Criteria andSectionNumNotEqualTo(Integer value) {
            addCriterion("SECTION_NUM <>", value, "sectionNum");
            return (Criteria) this;
        }

        public Criteria andSectionNumGreaterThan(Integer value) {
            addCriterion("SECTION_NUM >", value, "sectionNum");
            return (Criteria) this;
        }

        public Criteria andSectionNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("SECTION_NUM >=", value, "sectionNum");
            return (Criteria) this;
        }

        public Criteria andSectionNumLessThan(Integer value) {
            addCriterion("SECTION_NUM <", value, "sectionNum");
            return (Criteria) this;
        }

        public Criteria andSectionNumLessThanOrEqualTo(Integer value) {
            addCriterion("SECTION_NUM <=", value, "sectionNum");
            return (Criteria) this;
        }

        public Criteria andSectionNumIn(List<Integer> values) {
            addCriterion("SECTION_NUM in", values, "sectionNum");
            return (Criteria) this;
        }

        public Criteria andSectionNumNotIn(List<Integer> values) {
            addCriterion("SECTION_NUM not in", values, "sectionNum");
            return (Criteria) this;
        }

        public Criteria andSectionNumBetween(Integer value1, Integer value2) {
            addCriterion("SECTION_NUM between", value1, value2, "sectionNum");
            return (Criteria) this;
        }

        public Criteria andSectionNumNotBetween(Integer value1, Integer value2) {
            addCriterion("SECTION_NUM not between", value1, value2, "sectionNum");
            return (Criteria) this;
        }

        public Criteria andCourseNumIsNull() {
            addCriterion("COURSE_NUM is null");
            return (Criteria) this;
        }

        public Criteria andCourseNumIsNotNull() {
            addCriterion("COURSE_NUM is not null");
            return (Criteria) this;
        }

        public Criteria andCourseNumEqualTo(Integer value) {
            addCriterion("COURSE_NUM =", value, "courseNum");
            return (Criteria) this;
        }

        public Criteria andCourseNumNotEqualTo(Integer value) {
            addCriterion("COURSE_NUM <>", value, "courseNum");
            return (Criteria) this;
        }

        public Criteria andCourseNumGreaterThan(Integer value) {
            addCriterion("COURSE_NUM >", value, "courseNum");
            return (Criteria) this;
        }

        public Criteria andCourseNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("COURSE_NUM >=", value, "courseNum");
            return (Criteria) this;
        }

        public Criteria andCourseNumLessThan(Integer value) {
            addCriterion("COURSE_NUM <", value, "courseNum");
            return (Criteria) this;
        }

        public Criteria andCourseNumLessThanOrEqualTo(Integer value) {
            addCriterion("COURSE_NUM <=", value, "courseNum");
            return (Criteria) this;
        }

        public Criteria andCourseNumIn(List<Integer> values) {
            addCriterion("COURSE_NUM in", values, "courseNum");
            return (Criteria) this;
        }

        public Criteria andCourseNumNotIn(List<Integer> values) {
            addCriterion("COURSE_NUM not in", values, "courseNum");
            return (Criteria) this;
        }

        public Criteria andCourseNumBetween(Integer value1, Integer value2) {
            addCriterion("COURSE_NUM between", value1, value2, "courseNum");
            return (Criteria) this;
        }

        public Criteria andCourseNumNotBetween(Integer value1, Integer value2) {
            addCriterion("COURSE_NUM not between", value1, value2, "courseNum");
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

        public Criteria andTittleIsNull() {
            addCriterion("TITTLE is null");
            return (Criteria) this;
        }

        public Criteria andTittleIsNotNull() {
            addCriterion("TITTLE is not null");
            return (Criteria) this;
        }

        public Criteria andTittleEqualTo(String value) {
            addCriterion("TITTLE =", value, "tittle");
            return (Criteria) this;
        }

        public Criteria andTittleNotEqualTo(String value) {
            addCriterion("TITTLE <>", value, "tittle");
            return (Criteria) this;
        }

        public Criteria andTittleGreaterThan(String value) {
            addCriterion("TITTLE >", value, "tittle");
            return (Criteria) this;
        }

        public Criteria andTittleGreaterThanOrEqualTo(String value) {
            addCriterion("TITTLE >=", value, "tittle");
            return (Criteria) this;
        }

        public Criteria andTittleLessThan(String value) {
            addCriterion("TITTLE <", value, "tittle");
            return (Criteria) this;
        }

        public Criteria andTittleLessThanOrEqualTo(String value) {
            addCriterion("TITTLE <=", value, "tittle");
            return (Criteria) this;
        }

        public Criteria andTittleLike(String value) {
            addCriterion("TITTLE like", value, "tittle");
            return (Criteria) this;
        }

        public Criteria andTittleNotLike(String value) {
            addCriterion("TITTLE not like", value, "tittle");
            return (Criteria) this;
        }

        public Criteria andTittleIn(List<String> values) {
            addCriterion("TITTLE in", values, "tittle");
            return (Criteria) this;
        }

        public Criteria andTittleNotIn(List<String> values) {
            addCriterion("TITTLE not in", values, "tittle");
            return (Criteria) this;
        }

        public Criteria andTittleBetween(String value1, String value2) {
            addCriterion("TITTLE between", value1, value2, "tittle");
            return (Criteria) this;
        }

        public Criteria andTittleNotBetween(String value1, String value2) {
            addCriterion("TITTLE not between", value1, value2, "tittle");
            return (Criteria) this;
        }

        public Criteria andClassAttributeIsNull() {
            addCriterion("CLASS_ATTRIBUTE is null");
            return (Criteria) this;
        }

        public Criteria andClassAttributeIsNotNull() {
            addCriterion("CLASS_ATTRIBUTE is not null");
            return (Criteria) this;
        }

        public Criteria andClassAttributeEqualTo(String value) {
            addCriterion("CLASS_ATTRIBUTE =", value, "classAttribute");
            return (Criteria) this;
        }

        public Criteria andClassAttributeNotEqualTo(String value) {
            addCriterion("CLASS_ATTRIBUTE <>", value, "classAttribute");
            return (Criteria) this;
        }

        public Criteria andClassAttributeGreaterThan(String value) {
            addCriterion("CLASS_ATTRIBUTE >", value, "classAttribute");
            return (Criteria) this;
        }

        public Criteria andClassAttributeGreaterThanOrEqualTo(String value) {
            addCriterion("CLASS_ATTRIBUTE >=", value, "classAttribute");
            return (Criteria) this;
        }

        public Criteria andClassAttributeLessThan(String value) {
            addCriterion("CLASS_ATTRIBUTE <", value, "classAttribute");
            return (Criteria) this;
        }

        public Criteria andClassAttributeLessThanOrEqualTo(String value) {
            addCriterion("CLASS_ATTRIBUTE <=", value, "classAttribute");
            return (Criteria) this;
        }

        public Criteria andClassAttributeLike(String value) {
            addCriterion("CLASS_ATTRIBUTE like", value, "classAttribute");
            return (Criteria) this;
        }

        public Criteria andClassAttributeNotLike(String value) {
            addCriterion("CLASS_ATTRIBUTE not like", value, "classAttribute");
            return (Criteria) this;
        }

        public Criteria andClassAttributeIn(List<String> values) {
            addCriterion("CLASS_ATTRIBUTE in", values, "classAttribute");
            return (Criteria) this;
        }

        public Criteria andClassAttributeNotIn(List<String> values) {
            addCriterion("CLASS_ATTRIBUTE not in", values, "classAttribute");
            return (Criteria) this;
        }

        public Criteria andClassAttributeBetween(String value1, String value2) {
            addCriterion("CLASS_ATTRIBUTE between", value1, value2, "classAttribute");
            return (Criteria) this;
        }

        public Criteria andClassAttributeNotBetween(String value1, String value2) {
            addCriterion("CLASS_ATTRIBUTE not between", value1, value2, "classAttribute");
            return (Criteria) this;
        }

        public Criteria andInstructorIsNull() {
            addCriterion("INSTRUCTOR is null");
            return (Criteria) this;
        }

        public Criteria andInstructorIsNotNull() {
            addCriterion("INSTRUCTOR is not null");
            return (Criteria) this;
        }

        public Criteria andInstructorEqualTo(String value) {
            addCriterion("INSTRUCTOR =", value, "instructor");
            return (Criteria) this;
        }

        public Criteria andInstructorNotEqualTo(String value) {
            addCriterion("INSTRUCTOR <>", value, "instructor");
            return (Criteria) this;
        }

        public Criteria andInstructorGreaterThan(String value) {
            addCriterion("INSTRUCTOR >", value, "instructor");
            return (Criteria) this;
        }

        public Criteria andInstructorGreaterThanOrEqualTo(String value) {
            addCriterion("INSTRUCTOR >=", value, "instructor");
            return (Criteria) this;
        }

        public Criteria andInstructorLessThan(String value) {
            addCriterion("INSTRUCTOR <", value, "instructor");
            return (Criteria) this;
        }

        public Criteria andInstructorLessThanOrEqualTo(String value) {
            addCriterion("INSTRUCTOR <=", value, "instructor");
            return (Criteria) this;
        }

        public Criteria andInstructorLike(String value) {
            addCriterion("INSTRUCTOR like", value, "instructor");
            return (Criteria) this;
        }

        public Criteria andInstructorNotLike(String value) {
            addCriterion("INSTRUCTOR not like", value, "instructor");
            return (Criteria) this;
        }

        public Criteria andInstructorIn(List<String> values) {
            addCriterion("INSTRUCTOR in", values, "instructor");
            return (Criteria) this;
        }

        public Criteria andInstructorNotIn(List<String> values) {
            addCriterion("INSTRUCTOR not in", values, "instructor");
            return (Criteria) this;
        }

        public Criteria andInstructorBetween(String value1, String value2) {
            addCriterion("INSTRUCTOR between", value1, value2, "instructor");
            return (Criteria) this;
        }

        public Criteria andInstructorNotBetween(String value1, String value2) {
            addCriterion("INSTRUCTOR not between", value1, value2, "instructor");
            return (Criteria) this;
        }

        public Criteria andCareerIsNull() {
            addCriterion("CAREER is null");
            return (Criteria) this;
        }

        public Criteria andCareerIsNotNull() {
            addCriterion("CAREER is not null");
            return (Criteria) this;
        }

        public Criteria andCareerEqualTo(String value) {
            addCriterion("CAREER =", value, "career");
            return (Criteria) this;
        }

        public Criteria andCareerNotEqualTo(String value) {
            addCriterion("CAREER <>", value, "career");
            return (Criteria) this;
        }

        public Criteria andCareerGreaterThan(String value) {
            addCriterion("CAREER >", value, "career");
            return (Criteria) this;
        }

        public Criteria andCareerGreaterThanOrEqualTo(String value) {
            addCriterion("CAREER >=", value, "career");
            return (Criteria) this;
        }

        public Criteria andCareerLessThan(String value) {
            addCriterion("CAREER <", value, "career");
            return (Criteria) this;
        }

        public Criteria andCareerLessThanOrEqualTo(String value) {
            addCriterion("CAREER <=", value, "career");
            return (Criteria) this;
        }

        public Criteria andCareerLike(String value) {
            addCriterion("CAREER like", value, "career");
            return (Criteria) this;
        }

        public Criteria andCareerNotLike(String value) {
            addCriterion("CAREER not like", value, "career");
            return (Criteria) this;
        }

        public Criteria andCareerIn(List<String> values) {
            addCriterion("CAREER in", values, "career");
            return (Criteria) this;
        }

        public Criteria andCareerNotIn(List<String> values) {
            addCriterion("CAREER not in", values, "career");
            return (Criteria) this;
        }

        public Criteria andCareerBetween(String value1, String value2) {
            addCriterion("CAREER between", value1, value2, "career");
            return (Criteria) this;
        }

        public Criteria andCareerNotBetween(String value1, String value2) {
            addCriterion("CAREER not between", value1, value2, "career");
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