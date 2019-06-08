package com.stylefeng.guns.rest.common.persistence.model.generator;

import java.util.ArrayList;
import java.util.List;

public class HallFilmInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HallFilmInfoExample() {
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

        public Criteria andUuidIsNull() {
            addCriterion("UUID is null");
            return (Criteria) this;
        }

        public Criteria andUuidIsNotNull() {
            addCriterion("UUID is not null");
            return (Criteria) this;
        }

        public Criteria andUuidEqualTo(Integer value) {
            addCriterion("UUID =", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidNotEqualTo(Integer value) {
            addCriterion("UUID <>", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidGreaterThan(Integer value) {
            addCriterion("UUID >", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidGreaterThanOrEqualTo(Integer value) {
            addCriterion("UUID >=", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidLessThan(Integer value) {
            addCriterion("UUID <", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidLessThanOrEqualTo(Integer value) {
            addCriterion("UUID <=", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidIn(List<Integer> values) {
            addCriterion("UUID in", values, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidNotIn(List<Integer> values) {
            addCriterion("UUID not in", values, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidBetween(Integer value1, Integer value2) {
            addCriterion("UUID between", value1, value2, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidNotBetween(Integer value1, Integer value2) {
            addCriterion("UUID not between", value1, value2, "uuid");
            return (Criteria) this;
        }

        public Criteria andFilmIdIsNull() {
            addCriterion("film_id is null");
            return (Criteria) this;
        }

        public Criteria andFilmIdIsNotNull() {
            addCriterion("film_id is not null");
            return (Criteria) this;
        }

        public Criteria andFilmIdEqualTo(Integer value) {
            addCriterion("film_id =", value, "filmId");
            return (Criteria) this;
        }

        public Criteria andFilmIdNotEqualTo(Integer value) {
            addCriterion("film_id <>", value, "filmId");
            return (Criteria) this;
        }

        public Criteria andFilmIdGreaterThan(Integer value) {
            addCriterion("film_id >", value, "filmId");
            return (Criteria) this;
        }

        public Criteria andFilmIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("film_id >=", value, "filmId");
            return (Criteria) this;
        }

        public Criteria andFilmIdLessThan(Integer value) {
            addCriterion("film_id <", value, "filmId");
            return (Criteria) this;
        }

        public Criteria andFilmIdLessThanOrEqualTo(Integer value) {
            addCriterion("film_id <=", value, "filmId");
            return (Criteria) this;
        }

        public Criteria andFilmIdIn(List<Integer> values) {
            addCriterion("film_id in", values, "filmId");
            return (Criteria) this;
        }

        public Criteria andFilmIdNotIn(List<Integer> values) {
            addCriterion("film_id not in", values, "filmId");
            return (Criteria) this;
        }

        public Criteria andFilmIdBetween(Integer value1, Integer value2) {
            addCriterion("film_id between", value1, value2, "filmId");
            return (Criteria) this;
        }

        public Criteria andFilmIdNotBetween(Integer value1, Integer value2) {
            addCriterion("film_id not between", value1, value2, "filmId");
            return (Criteria) this;
        }

        public Criteria andFilmNameIsNull() {
            addCriterion("film_name is null");
            return (Criteria) this;
        }

        public Criteria andFilmNameIsNotNull() {
            addCriterion("film_name is not null");
            return (Criteria) this;
        }

        public Criteria andFilmNameEqualTo(String value) {
            addCriterion("film_name =", value, "filmName");
            return (Criteria) this;
        }

        public Criteria andFilmNameNotEqualTo(String value) {
            addCriterion("film_name <>", value, "filmName");
            return (Criteria) this;
        }

        public Criteria andFilmNameGreaterThan(String value) {
            addCriterion("film_name >", value, "filmName");
            return (Criteria) this;
        }

        public Criteria andFilmNameGreaterThanOrEqualTo(String value) {
            addCriterion("film_name >=", value, "filmName");
            return (Criteria) this;
        }

        public Criteria andFilmNameLessThan(String value) {
            addCriterion("film_name <", value, "filmName");
            return (Criteria) this;
        }

        public Criteria andFilmNameLessThanOrEqualTo(String value) {
            addCriterion("film_name <=", value, "filmName");
            return (Criteria) this;
        }

        public Criteria andFilmNameLike(String value) {
            addCriterion("film_name like", value, "filmName");
            return (Criteria) this;
        }

        public Criteria andFilmNameNotLike(String value) {
            addCriterion("film_name not like", value, "filmName");
            return (Criteria) this;
        }

        public Criteria andFilmNameIn(List<String> values) {
            addCriterion("film_name in", values, "filmName");
            return (Criteria) this;
        }

        public Criteria andFilmNameNotIn(List<String> values) {
            addCriterion("film_name not in", values, "filmName");
            return (Criteria) this;
        }

        public Criteria andFilmNameBetween(String value1, String value2) {
            addCriterion("film_name between", value1, value2, "filmName");
            return (Criteria) this;
        }

        public Criteria andFilmNameNotBetween(String value1, String value2) {
            addCriterion("film_name not between", value1, value2, "filmName");
            return (Criteria) this;
        }

        public Criteria andFilmLengthIsNull() {
            addCriterion("film_length is null");
            return (Criteria) this;
        }

        public Criteria andFilmLengthIsNotNull() {
            addCriterion("film_length is not null");
            return (Criteria) this;
        }

        public Criteria andFilmLengthEqualTo(String value) {
            addCriterion("film_length =", value, "filmLength");
            return (Criteria) this;
        }

        public Criteria andFilmLengthNotEqualTo(String value) {
            addCriterion("film_length <>", value, "filmLength");
            return (Criteria) this;
        }

        public Criteria andFilmLengthGreaterThan(String value) {
            addCriterion("film_length >", value, "filmLength");
            return (Criteria) this;
        }

        public Criteria andFilmLengthGreaterThanOrEqualTo(String value) {
            addCriterion("film_length >=", value, "filmLength");
            return (Criteria) this;
        }

        public Criteria andFilmLengthLessThan(String value) {
            addCriterion("film_length <", value, "filmLength");
            return (Criteria) this;
        }

        public Criteria andFilmLengthLessThanOrEqualTo(String value) {
            addCriterion("film_length <=", value, "filmLength");
            return (Criteria) this;
        }

        public Criteria andFilmLengthLike(String value) {
            addCriterion("film_length like", value, "filmLength");
            return (Criteria) this;
        }

        public Criteria andFilmLengthNotLike(String value) {
            addCriterion("film_length not like", value, "filmLength");
            return (Criteria) this;
        }

        public Criteria andFilmLengthIn(List<String> values) {
            addCriterion("film_length in", values, "filmLength");
            return (Criteria) this;
        }

        public Criteria andFilmLengthNotIn(List<String> values) {
            addCriterion("film_length not in", values, "filmLength");
            return (Criteria) this;
        }

        public Criteria andFilmLengthBetween(String value1, String value2) {
            addCriterion("film_length between", value1, value2, "filmLength");
            return (Criteria) this;
        }

        public Criteria andFilmLengthNotBetween(String value1, String value2) {
            addCriterion("film_length not between", value1, value2, "filmLength");
            return (Criteria) this;
        }

        public Criteria andFilmCatsIsNull() {
            addCriterion("film_cats is null");
            return (Criteria) this;
        }

        public Criteria andFilmCatsIsNotNull() {
            addCriterion("film_cats is not null");
            return (Criteria) this;
        }

        public Criteria andFilmCatsEqualTo(String value) {
            addCriterion("film_cats =", value, "filmCats");
            return (Criteria) this;
        }

        public Criteria andFilmCatsNotEqualTo(String value) {
            addCriterion("film_cats <>", value, "filmCats");
            return (Criteria) this;
        }

        public Criteria andFilmCatsGreaterThan(String value) {
            addCriterion("film_cats >", value, "filmCats");
            return (Criteria) this;
        }

        public Criteria andFilmCatsGreaterThanOrEqualTo(String value) {
            addCriterion("film_cats >=", value, "filmCats");
            return (Criteria) this;
        }

        public Criteria andFilmCatsLessThan(String value) {
            addCriterion("film_cats <", value, "filmCats");
            return (Criteria) this;
        }

        public Criteria andFilmCatsLessThanOrEqualTo(String value) {
            addCriterion("film_cats <=", value, "filmCats");
            return (Criteria) this;
        }

        public Criteria andFilmCatsLike(String value) {
            addCriterion("film_cats like", value, "filmCats");
            return (Criteria) this;
        }

        public Criteria andFilmCatsNotLike(String value) {
            addCriterion("film_cats not like", value, "filmCats");
            return (Criteria) this;
        }

        public Criteria andFilmCatsIn(List<String> values) {
            addCriterion("film_cats in", values, "filmCats");
            return (Criteria) this;
        }

        public Criteria andFilmCatsNotIn(List<String> values) {
            addCriterion("film_cats not in", values, "filmCats");
            return (Criteria) this;
        }

        public Criteria andFilmCatsBetween(String value1, String value2) {
            addCriterion("film_cats between", value1, value2, "filmCats");
            return (Criteria) this;
        }

        public Criteria andFilmCatsNotBetween(String value1, String value2) {
            addCriterion("film_cats not between", value1, value2, "filmCats");
            return (Criteria) this;
        }

        public Criteria andFilmLanguageIsNull() {
            addCriterion("film_language is null");
            return (Criteria) this;
        }

        public Criteria andFilmLanguageIsNotNull() {
            addCriterion("film_language is not null");
            return (Criteria) this;
        }

        public Criteria andFilmLanguageEqualTo(String value) {
            addCriterion("film_language =", value, "filmLanguage");
            return (Criteria) this;
        }

        public Criteria andFilmLanguageNotEqualTo(String value) {
            addCriterion("film_language <>", value, "filmLanguage");
            return (Criteria) this;
        }

        public Criteria andFilmLanguageGreaterThan(String value) {
            addCriterion("film_language >", value, "filmLanguage");
            return (Criteria) this;
        }

        public Criteria andFilmLanguageGreaterThanOrEqualTo(String value) {
            addCriterion("film_language >=", value, "filmLanguage");
            return (Criteria) this;
        }

        public Criteria andFilmLanguageLessThan(String value) {
            addCriterion("film_language <", value, "filmLanguage");
            return (Criteria) this;
        }

        public Criteria andFilmLanguageLessThanOrEqualTo(String value) {
            addCriterion("film_language <=", value, "filmLanguage");
            return (Criteria) this;
        }

        public Criteria andFilmLanguageLike(String value) {
            addCriterion("film_language like", value, "filmLanguage");
            return (Criteria) this;
        }

        public Criteria andFilmLanguageNotLike(String value) {
            addCriterion("film_language not like", value, "filmLanguage");
            return (Criteria) this;
        }

        public Criteria andFilmLanguageIn(List<String> values) {
            addCriterion("film_language in", values, "filmLanguage");
            return (Criteria) this;
        }

        public Criteria andFilmLanguageNotIn(List<String> values) {
            addCriterion("film_language not in", values, "filmLanguage");
            return (Criteria) this;
        }

        public Criteria andFilmLanguageBetween(String value1, String value2) {
            addCriterion("film_language between", value1, value2, "filmLanguage");
            return (Criteria) this;
        }

        public Criteria andFilmLanguageNotBetween(String value1, String value2) {
            addCriterion("film_language not between", value1, value2, "filmLanguage");
            return (Criteria) this;
        }

        public Criteria andActorsIsNull() {
            addCriterion("actors is null");
            return (Criteria) this;
        }

        public Criteria andActorsIsNotNull() {
            addCriterion("actors is not null");
            return (Criteria) this;
        }

        public Criteria andActorsEqualTo(String value) {
            addCriterion("actors =", value, "actors");
            return (Criteria) this;
        }

        public Criteria andActorsNotEqualTo(String value) {
            addCriterion("actors <>", value, "actors");
            return (Criteria) this;
        }

        public Criteria andActorsGreaterThan(String value) {
            addCriterion("actors >", value, "actors");
            return (Criteria) this;
        }

        public Criteria andActorsGreaterThanOrEqualTo(String value) {
            addCriterion("actors >=", value, "actors");
            return (Criteria) this;
        }

        public Criteria andActorsLessThan(String value) {
            addCriterion("actors <", value, "actors");
            return (Criteria) this;
        }

        public Criteria andActorsLessThanOrEqualTo(String value) {
            addCriterion("actors <=", value, "actors");
            return (Criteria) this;
        }

        public Criteria andActorsLike(String value) {
            addCriterion("actors like", value, "actors");
            return (Criteria) this;
        }

        public Criteria andActorsNotLike(String value) {
            addCriterion("actors not like", value, "actors");
            return (Criteria) this;
        }

        public Criteria andActorsIn(List<String> values) {
            addCriterion("actors in", values, "actors");
            return (Criteria) this;
        }

        public Criteria andActorsNotIn(List<String> values) {
            addCriterion("actors not in", values, "actors");
            return (Criteria) this;
        }

        public Criteria andActorsBetween(String value1, String value2) {
            addCriterion("actors between", value1, value2, "actors");
            return (Criteria) this;
        }

        public Criteria andActorsNotBetween(String value1, String value2) {
            addCriterion("actors not between", value1, value2, "actors");
            return (Criteria) this;
        }

        public Criteria andImgAddressIsNull() {
            addCriterion("img_address is null");
            return (Criteria) this;
        }

        public Criteria andImgAddressIsNotNull() {
            addCriterion("img_address is not null");
            return (Criteria) this;
        }

        public Criteria andImgAddressEqualTo(String value) {
            addCriterion("img_address =", value, "imgAddress");
            return (Criteria) this;
        }

        public Criteria andImgAddressNotEqualTo(String value) {
            addCriterion("img_address <>", value, "imgAddress");
            return (Criteria) this;
        }

        public Criteria andImgAddressGreaterThan(String value) {
            addCriterion("img_address >", value, "imgAddress");
            return (Criteria) this;
        }

        public Criteria andImgAddressGreaterThanOrEqualTo(String value) {
            addCriterion("img_address >=", value, "imgAddress");
            return (Criteria) this;
        }

        public Criteria andImgAddressLessThan(String value) {
            addCriterion("img_address <", value, "imgAddress");
            return (Criteria) this;
        }

        public Criteria andImgAddressLessThanOrEqualTo(String value) {
            addCriterion("img_address <=", value, "imgAddress");
            return (Criteria) this;
        }

        public Criteria andImgAddressLike(String value) {
            addCriterion("img_address like", value, "imgAddress");
            return (Criteria) this;
        }

        public Criteria andImgAddressNotLike(String value) {
            addCriterion("img_address not like", value, "imgAddress");
            return (Criteria) this;
        }

        public Criteria andImgAddressIn(List<String> values) {
            addCriterion("img_address in", values, "imgAddress");
            return (Criteria) this;
        }

        public Criteria andImgAddressNotIn(List<String> values) {
            addCriterion("img_address not in", values, "imgAddress");
            return (Criteria) this;
        }

        public Criteria andImgAddressBetween(String value1, String value2) {
            addCriterion("img_address between", value1, value2, "imgAddress");
            return (Criteria) this;
        }

        public Criteria andImgAddressNotBetween(String value1, String value2) {
            addCriterion("img_address not between", value1, value2, "imgAddress");
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