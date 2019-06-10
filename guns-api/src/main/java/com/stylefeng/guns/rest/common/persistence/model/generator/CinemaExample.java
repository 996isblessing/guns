package com.stylefeng.guns.rest.common.persistence.model.generator;

import java.util.ArrayList;
import java.util.List;

public class CinemaExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CinemaExample() {
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

        public Criteria andCinemaNameIsNull() {
            addCriterion("cinema_name is null");
            return (Criteria) this;
        }

        public Criteria andCinemaNameIsNotNull() {
            addCriterion("cinema_name is not null");
            return (Criteria) this;
        }

        public Criteria andCinemaNameEqualTo(String value) {
            addCriterion("cinema_name =", value, "cinemaName");
            return (Criteria) this;
        }

        public Criteria andCinemaNameNotEqualTo(String value) {
            addCriterion("cinema_name <>", value, "cinemaName");
            return (Criteria) this;
        }

        public Criteria andCinemaNameGreaterThan(String value) {
            addCriterion("cinema_name >", value, "cinemaName");
            return (Criteria) this;
        }

        public Criteria andCinemaNameGreaterThanOrEqualTo(String value) {
            addCriterion("cinema_name >=", value, "cinemaName");
            return (Criteria) this;
        }

        public Criteria andCinemaNameLessThan(String value) {
            addCriterion("cinema_name <", value, "cinemaName");
            return (Criteria) this;
        }

        public Criteria andCinemaNameLessThanOrEqualTo(String value) {
            addCriterion("cinema_name <=", value, "cinemaName");
            return (Criteria) this;
        }

        public Criteria andCinemaNameLike(String value) {
            addCriterion("cinema_name like", value, "cinemaName");
            return (Criteria) this;
        }

        public Criteria andCinemaNameNotLike(String value) {
            addCriterion("cinema_name not like", value, "cinemaName");
            return (Criteria) this;
        }

        public Criteria andCinemaNameIn(List<String> values) {
            addCriterion("cinema_name in", values, "cinemaName");
            return (Criteria) this;
        }

        public Criteria andCinemaNameNotIn(List<String> values) {
            addCriterion("cinema_name not in", values, "cinemaName");
            return (Criteria) this;
        }

        public Criteria andCinemaNameBetween(String value1, String value2) {
            addCriterion("cinema_name between", value1, value2, "cinemaName");
            return (Criteria) this;
        }

        public Criteria andCinemaNameNotBetween(String value1, String value2) {
            addCriterion("cinema_name not between", value1, value2, "cinemaName");
            return (Criteria) this;
        }

        public Criteria andCinemaPhoneIsNull() {
            addCriterion("cinema_phone is null");
            return (Criteria) this;
        }

        public Criteria andCinemaPhoneIsNotNull() {
            addCriterion("cinema_phone is not null");
            return (Criteria) this;
        }

        public Criteria andCinemaPhoneEqualTo(String value) {
            addCriterion("cinema_phone =", value, "cinemaPhone");
            return (Criteria) this;
        }

        public Criteria andCinemaPhoneNotEqualTo(String value) {
            addCriterion("cinema_phone <>", value, "cinemaPhone");
            return (Criteria) this;
        }

        public Criteria andCinemaPhoneGreaterThan(String value) {
            addCriterion("cinema_phone >", value, "cinemaPhone");
            return (Criteria) this;
        }

        public Criteria andCinemaPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("cinema_phone >=", value, "cinemaPhone");
            return (Criteria) this;
        }

        public Criteria andCinemaPhoneLessThan(String value) {
            addCriterion("cinema_phone <", value, "cinemaPhone");
            return (Criteria) this;
        }

        public Criteria andCinemaPhoneLessThanOrEqualTo(String value) {
            addCriterion("cinema_phone <=", value, "cinemaPhone");
            return (Criteria) this;
        }

        public Criteria andCinemaPhoneLike(String value) {
            addCriterion("cinema_phone like", value, "cinemaPhone");
            return (Criteria) this;
        }

        public Criteria andCinemaPhoneNotLike(String value) {
            addCriterion("cinema_phone not like", value, "cinemaPhone");
            return (Criteria) this;
        }

        public Criteria andCinemaPhoneIn(List<String> values) {
            addCriterion("cinema_phone in", values, "cinemaPhone");
            return (Criteria) this;
        }

        public Criteria andCinemaPhoneNotIn(List<String> values) {
            addCriterion("cinema_phone not in", values, "cinemaPhone");
            return (Criteria) this;
        }

        public Criteria andCinemaPhoneBetween(String value1, String value2) {
            addCriterion("cinema_phone between", value1, value2, "cinemaPhone");
            return (Criteria) this;
        }

        public Criteria andCinemaPhoneNotBetween(String value1, String value2) {
            addCriterion("cinema_phone not between", value1, value2, "cinemaPhone");
            return (Criteria) this;
        }

        public Criteria andBrandIdIsNull() {
            addCriterion("brand_id is null");
            return (Criteria) this;
        }

        public Criteria andBrandIdIsNotNull() {
            addCriterion("brand_id is not null");
            return (Criteria) this;
        }

        public Criteria andBrandIdEqualTo(Integer value) {
            addCriterion("brand_id =", value, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdNotEqualTo(Integer value) {
            addCriterion("brand_id <>", value, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdGreaterThan(Integer value) {
            addCriterion("brand_id >", value, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("brand_id >=", value, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdLessThan(Integer value) {
            addCriterion("brand_id <", value, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdLessThanOrEqualTo(Integer value) {
            addCriterion("brand_id <=", value, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdIn(List<Integer> values) {
            addCriterion("brand_id in", values, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdNotIn(List<Integer> values) {
            addCriterion("brand_id not in", values, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdBetween(Integer value1, Integer value2) {
            addCriterion("brand_id between", value1, value2, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdNotBetween(Integer value1, Integer value2) {
            addCriterion("brand_id not between", value1, value2, "brandId");
            return (Criteria) this;
        }

        public Criteria andAreaIdIsNull() {
            addCriterion("area_id is null");
            return (Criteria) this;
        }

        public Criteria andAreaIdIsNotNull() {
            addCriterion("area_id is not null");
            return (Criteria) this;
        }

        public Criteria andAreaIdEqualTo(Integer value) {
            addCriterion("area_id =", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdNotEqualTo(Integer value) {
            addCriterion("area_id <>", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdGreaterThan(Integer value) {
            addCriterion("area_id >", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("area_id >=", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdLessThan(Integer value) {
            addCriterion("area_id <", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdLessThanOrEqualTo(Integer value) {
            addCriterion("area_id <=", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdIn(List<Integer> values) {
            addCriterion("area_id in", values, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdNotIn(List<Integer> values) {
            addCriterion("area_id not in", values, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdBetween(Integer value1, Integer value2) {
            addCriterion("area_id between", value1, value2, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdNotBetween(Integer value1, Integer value2) {
            addCriterion("area_id not between", value1, value2, "areaId");
            return (Criteria) this;
        }

        public Criteria andHallIdsIsNull() {
            addCriterion("hall_ids is null");
            return (Criteria) this;
        }

        public Criteria andHallIdsIsNotNull() {
            addCriterion("hall_ids is not null");
            return (Criteria) this;
        }

        public Criteria andHallIdsEqualTo(String value) {
            addCriterion("hall_ids =", value, "hallIds");
            return (Criteria) this;
        }

        public Criteria andHallIdsNotEqualTo(String value) {
            addCriterion("hall_ids <>", value, "hallIds");
            return (Criteria) this;
        }

        public Criteria andHallIdsGreaterThan(String value) {
            addCriterion("hall_ids >", value, "hallIds");
            return (Criteria) this;
        }

        public Criteria andHallIdsGreaterThanOrEqualTo(String value) {
            addCriterion("hall_ids >=", value, "hallIds");
            return (Criteria) this;
        }

        public Criteria andHallIdsLessThan(String value) {
            addCriterion("hall_ids <", value, "hallIds");
            return (Criteria) this;
        }

        public Criteria andHallIdsLessThanOrEqualTo(String value) {
            addCriterion("hall_ids <=", value, "hallIds");
            return (Criteria) this;
        }

        public Criteria andHallIdsLike(String value) {
            addCriterion("hall_ids like", value, "hallIds");
            return (Criteria) this;
        }

        public Criteria andHallIdsNotLike(String value) {
            addCriterion("hall_ids not like", value, "hallIds");
            return (Criteria) this;
        }

        public Criteria andHallIdsIn(List<String> values) {
            addCriterion("hall_ids in", values, "hallIds");
            return (Criteria) this;
        }

        public Criteria andHallIdsNotIn(List<String> values) {
            addCriterion("hall_ids not in", values, "hallIds");
            return (Criteria) this;
        }

        public Criteria andHallIdsBetween(String value1, String value2) {
            addCriterion("hall_ids between", value1, value2, "hallIds");
            return (Criteria) this;
        }

        public Criteria andHallIdsNotBetween(String value1, String value2) {
            addCriterion("hall_ids not between", value1, value2, "hallIds");
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

        public Criteria andCinemaAddressIsNull() {
            addCriterion("cinema_address is null");
            return (Criteria) this;
        }

        public Criteria andCinemaAddressIsNotNull() {
            addCriterion("cinema_address is not null");
            return (Criteria) this;
        }

        public Criteria andCinemaAddressEqualTo(String value) {
            addCriterion("cinema_address =", value, "cinemaAddress");
            return (Criteria) this;
        }

        public Criteria andCinemaAddressNotEqualTo(String value) {
            addCriterion("cinema_address <>", value, "cinemaAddress");
            return (Criteria) this;
        }

        public Criteria andCinemaAddressGreaterThan(String value) {
            addCriterion("cinema_address >", value, "cinemaAddress");
            return (Criteria) this;
        }

        public Criteria andCinemaAddressGreaterThanOrEqualTo(String value) {
            addCriterion("cinema_address >=", value, "cinemaAddress");
            return (Criteria) this;
        }

        public Criteria andCinemaAddressLessThan(String value) {
            addCriterion("cinema_address <", value, "cinemaAddress");
            return (Criteria) this;
        }

        public Criteria andCinemaAddressLessThanOrEqualTo(String value) {
            addCriterion("cinema_address <=", value, "cinemaAddress");
            return (Criteria) this;
        }

        public Criteria andCinemaAddressLike(String value) {
            addCriterion("cinema_address like", value, "cinemaAddress");
            return (Criteria) this;
        }

        public Criteria andCinemaAddressNotLike(String value) {
            addCriterion("cinema_address not like", value, "cinemaAddress");
            return (Criteria) this;
        }

        public Criteria andCinemaAddressIn(List<String> values) {
            addCriterion("cinema_address in", values, "cinemaAddress");
            return (Criteria) this;
        }

        public Criteria andCinemaAddressNotIn(List<String> values) {
            addCriterion("cinema_address not in", values, "cinemaAddress");
            return (Criteria) this;
        }

        public Criteria andCinemaAddressBetween(String value1, String value2) {
            addCriterion("cinema_address between", value1, value2, "cinemaAddress");
            return (Criteria) this;
        }

        public Criteria andCinemaAddressNotBetween(String value1, String value2) {
            addCriterion("cinema_address not between", value1, value2, "cinemaAddress");
            return (Criteria) this;
        }

        public Criteria andMinimumPriceIsNull() {
            addCriterion("minimum_price is null");
            return (Criteria) this;
        }

        public Criteria andMinimumPriceIsNotNull() {
            addCriterion("minimum_price is not null");
            return (Criteria) this;
        }

        public Criteria andMinimumPriceEqualTo(Integer value) {
            addCriterion("minimum_price =", value, "minimumPrice");
            return (Criteria) this;
        }

        public Criteria andMinimumPriceNotEqualTo(Integer value) {
            addCriterion("minimum_price <>", value, "minimumPrice");
            return (Criteria) this;
        }

        public Criteria andMinimumPriceGreaterThan(Integer value) {
            addCriterion("minimum_price >", value, "minimumPrice");
            return (Criteria) this;
        }

        public Criteria andMinimumPriceGreaterThanOrEqualTo(Integer value) {
            addCriterion("minimum_price >=", value, "minimumPrice");
            return (Criteria) this;
        }

        public Criteria andMinimumPriceLessThan(Integer value) {
            addCriterion("minimum_price <", value, "minimumPrice");
            return (Criteria) this;
        }

        public Criteria andMinimumPriceLessThanOrEqualTo(Integer value) {
            addCriterion("minimum_price <=", value, "minimumPrice");
            return (Criteria) this;
        }

        public Criteria andMinimumPriceIn(List<Integer> values) {
            addCriterion("minimum_price in", values, "minimumPrice");
            return (Criteria) this;
        }

        public Criteria andMinimumPriceNotIn(List<Integer> values) {
            addCriterion("minimum_price not in", values, "minimumPrice");
            return (Criteria) this;
        }

        public Criteria andMinimumPriceBetween(Integer value1, Integer value2) {
            addCriterion("minimum_price between", value1, value2, "minimumPrice");
            return (Criteria) this;
        }

        public Criteria andMinimumPriceNotBetween(Integer value1, Integer value2) {
            addCriterion("minimum_price not between", value1, value2, "minimumPrice");
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