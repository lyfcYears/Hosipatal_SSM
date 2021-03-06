package com.hospital.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MedicinePrescriptionFeeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MedicinePrescriptionFeeExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andRegistrationInfoNoIsNull() {
            addCriterion("registration_info_no is null");
            return (Criteria) this;
        }

        public Criteria andRegistrationInfoNoIsNotNull() {
            addCriterion("registration_info_no is not null");
            return (Criteria) this;
        }

        public Criteria andRegistrationInfoNoEqualTo(Integer value) {
            addCriterion("registration_info_no =", value, "registrationInfoNo");
            return (Criteria) this;
        }

        public Criteria andRegistrationInfoNoNotEqualTo(Integer value) {
            addCriterion("registration_info_no <>", value, "registrationInfoNo");
            return (Criteria) this;
        }

        public Criteria andRegistrationInfoNoGreaterThan(Integer value) {
            addCriterion("registration_info_no >", value, "registrationInfoNo");
            return (Criteria) this;
        }

        public Criteria andRegistrationInfoNoGreaterThanOrEqualTo(Integer value) {
            addCriterion("registration_info_no >=", value, "registrationInfoNo");
            return (Criteria) this;
        }

        public Criteria andRegistrationInfoNoLessThan(Integer value) {
            addCriterion("registration_info_no <", value, "registrationInfoNo");
            return (Criteria) this;
        }

        public Criteria andRegistrationInfoNoLessThanOrEqualTo(Integer value) {
            addCriterion("registration_info_no <=", value, "registrationInfoNo");
            return (Criteria) this;
        }

        public Criteria andRegistrationInfoNoIn(List<Integer> values) {
            addCriterion("registration_info_no in", values, "registrationInfoNo");
            return (Criteria) this;
        }

        public Criteria andRegistrationInfoNoNotIn(List<Integer> values) {
            addCriterion("registration_info_no not in", values, "registrationInfoNo");
            return (Criteria) this;
        }

        public Criteria andRegistrationInfoNoBetween(Integer value1, Integer value2) {
            addCriterion("registration_info_no between", value1, value2, "registrationInfoNo");
            return (Criteria) this;
        }

        public Criteria andRegistrationInfoNoNotBetween(Integer value1, Integer value2) {
            addCriterion("registration_info_no not between", value1, value2, "registrationInfoNo");
            return (Criteria) this;
        }

        public Criteria andMedicalRecordIsNull() {
            addCriterion("medical_record is null");
            return (Criteria) this;
        }

        public Criteria andMedicalRecordIsNotNull() {
            addCriterion("medical_record is not null");
            return (Criteria) this;
        }

        public Criteria andMedicalRecordEqualTo(String value) {
            addCriterion("medical_record =", value, "medicalRecord");
            return (Criteria) this;
        }

        public Criteria andMedicalRecordNotEqualTo(String value) {
            addCriterion("medical_record <>", value, "medicalRecord");
            return (Criteria) this;
        }

        public Criteria andMedicalRecordGreaterThan(String value) {
            addCriterion("medical_record >", value, "medicalRecord");
            return (Criteria) this;
        }

        public Criteria andMedicalRecordGreaterThanOrEqualTo(String value) {
            addCriterion("medical_record >=", value, "medicalRecord");
            return (Criteria) this;
        }

        public Criteria andMedicalRecordLessThan(String value) {
            addCriterion("medical_record <", value, "medicalRecord");
            return (Criteria) this;
        }

        public Criteria andMedicalRecordLessThanOrEqualTo(String value) {
            addCriterion("medical_record <=", value, "medicalRecord");
            return (Criteria) this;
        }

        public Criteria andMedicalRecordLike(String value) {
            addCriterion("medical_record like", value, "medicalRecord");
            return (Criteria) this;
        }

        public Criteria andMedicalRecordNotLike(String value) {
            addCriterion("medical_record not like", value, "medicalRecord");
            return (Criteria) this;
        }

        public Criteria andMedicalRecordIn(List<String> values) {
            addCriterion("medical_record in", values, "medicalRecord");
            return (Criteria) this;
        }

        public Criteria andMedicalRecordNotIn(List<String> values) {
            addCriterion("medical_record not in", values, "medicalRecord");
            return (Criteria) this;
        }

        public Criteria andMedicalRecordBetween(String value1, String value2) {
            addCriterion("medical_record between", value1, value2, "medicalRecord");
            return (Criteria) this;
        }

        public Criteria andMedicalRecordNotBetween(String value1, String value2) {
            addCriterion("medical_record not between", value1, value2, "medicalRecord");
            return (Criteria) this;
        }

        public Criteria andPatientNameIsNull() {
            addCriterion("patient_name is null");
            return (Criteria) this;
        }

        public Criteria andPatientNameIsNotNull() {
            addCriterion("patient_name is not null");
            return (Criteria) this;
        }

        public Criteria andPatientNameEqualTo(String value) {
            addCriterion("patient_name =", value, "patientName");
            return (Criteria) this;
        }

        public Criteria andPatientNameNotEqualTo(String value) {
            addCriterion("patient_name <>", value, "patientName");
            return (Criteria) this;
        }

        public Criteria andPatientNameGreaterThan(String value) {
            addCriterion("patient_name >", value, "patientName");
            return (Criteria) this;
        }

        public Criteria andPatientNameGreaterThanOrEqualTo(String value) {
            addCriterion("patient_name >=", value, "patientName");
            return (Criteria) this;
        }

        public Criteria andPatientNameLessThan(String value) {
            addCriterion("patient_name <", value, "patientName");
            return (Criteria) this;
        }

        public Criteria andPatientNameLessThanOrEqualTo(String value) {
            addCriterion("patient_name <=", value, "patientName");
            return (Criteria) this;
        }

        public Criteria andPatientNameLike(String value) {
            addCriterion("patient_name like", value, "patientName");
            return (Criteria) this;
        }

        public Criteria andPatientNameNotLike(String value) {
            addCriterion("patient_name not like", value, "patientName");
            return (Criteria) this;
        }

        public Criteria andPatientNameIn(List<String> values) {
            addCriterion("patient_name in", values, "patientName");
            return (Criteria) this;
        }

        public Criteria andPatientNameNotIn(List<String> values) {
            addCriterion("patient_name not in", values, "patientName");
            return (Criteria) this;
        }

        public Criteria andPatientNameBetween(String value1, String value2) {
            addCriterion("patient_name between", value1, value2, "patientName");
            return (Criteria) this;
        }

        public Criteria andPatientNameNotBetween(String value1, String value2) {
            addCriterion("patient_name not between", value1, value2, "patientName");
            return (Criteria) this;
        }

        public Criteria andMedicinePrescriptionApplicationNoIsNull() {
            addCriterion("medicine_prescription_application_no is null");
            return (Criteria) this;
        }

        public Criteria andMedicinePrescriptionApplicationNoIsNotNull() {
            addCriterion("medicine_prescription_application_no is not null");
            return (Criteria) this;
        }

        public Criteria andMedicinePrescriptionApplicationNoEqualTo(Integer value) {
            addCriterion("medicine_prescription_application_no =", value, "medicinePrescriptionApplicationNo");
            return (Criteria) this;
        }

        public Criteria andMedicinePrescriptionApplicationNoNotEqualTo(Integer value) {
            addCriterion("medicine_prescription_application_no <>", value, "medicinePrescriptionApplicationNo");
            return (Criteria) this;
        }

        public Criteria andMedicinePrescriptionApplicationNoGreaterThan(Integer value) {
            addCriterion("medicine_prescription_application_no >", value, "medicinePrescriptionApplicationNo");
            return (Criteria) this;
        }

        public Criteria andMedicinePrescriptionApplicationNoGreaterThanOrEqualTo(Integer value) {
            addCriterion("medicine_prescription_application_no >=", value, "medicinePrescriptionApplicationNo");
            return (Criteria) this;
        }

        public Criteria andMedicinePrescriptionApplicationNoLessThan(Integer value) {
            addCriterion("medicine_prescription_application_no <", value, "medicinePrescriptionApplicationNo");
            return (Criteria) this;
        }

        public Criteria andMedicinePrescriptionApplicationNoLessThanOrEqualTo(Integer value) {
            addCriterion("medicine_prescription_application_no <=", value, "medicinePrescriptionApplicationNo");
            return (Criteria) this;
        }

        public Criteria andMedicinePrescriptionApplicationNoIn(List<Integer> values) {
            addCriterion("medicine_prescription_application_no in", values, "medicinePrescriptionApplicationNo");
            return (Criteria) this;
        }

        public Criteria andMedicinePrescriptionApplicationNoNotIn(List<Integer> values) {
            addCriterion("medicine_prescription_application_no not in", values, "medicinePrescriptionApplicationNo");
            return (Criteria) this;
        }

        public Criteria andMedicinePrescriptionApplicationNoBetween(Integer value1, Integer value2) {
            addCriterion("medicine_prescription_application_no between", value1, value2, "medicinePrescriptionApplicationNo");
            return (Criteria) this;
        }

        public Criteria andMedicinePrescriptionApplicationNoNotBetween(Integer value1, Integer value2) {
            addCriterion("medicine_prescription_application_no not between", value1, value2, "medicinePrescriptionApplicationNo");
            return (Criteria) this;
        }

        public Criteria andDepartmentNoIsNull() {
            addCriterion("department_no is null");
            return (Criteria) this;
        }

        public Criteria andDepartmentNoIsNotNull() {
            addCriterion("department_no is not null");
            return (Criteria) this;
        }

        public Criteria andDepartmentNoEqualTo(Integer value) {
            addCriterion("department_no =", value, "departmentNo");
            return (Criteria) this;
        }

        public Criteria andDepartmentNoNotEqualTo(Integer value) {
            addCriterion("department_no <>", value, "departmentNo");
            return (Criteria) this;
        }

        public Criteria andDepartmentNoGreaterThan(Integer value) {
            addCriterion("department_no >", value, "departmentNo");
            return (Criteria) this;
        }

        public Criteria andDepartmentNoGreaterThanOrEqualTo(Integer value) {
            addCriterion("department_no >=", value, "departmentNo");
            return (Criteria) this;
        }

        public Criteria andDepartmentNoLessThan(Integer value) {
            addCriterion("department_no <", value, "departmentNo");
            return (Criteria) this;
        }

        public Criteria andDepartmentNoLessThanOrEqualTo(Integer value) {
            addCriterion("department_no <=", value, "departmentNo");
            return (Criteria) this;
        }

        public Criteria andDepartmentNoIn(List<Integer> values) {
            addCriterion("department_no in", values, "departmentNo");
            return (Criteria) this;
        }

        public Criteria andDepartmentNoNotIn(List<Integer> values) {
            addCriterion("department_no not in", values, "departmentNo");
            return (Criteria) this;
        }

        public Criteria andDepartmentNoBetween(Integer value1, Integer value2) {
            addCriterion("department_no between", value1, value2, "departmentNo");
            return (Criteria) this;
        }

        public Criteria andDepartmentNoNotBetween(Integer value1, Integer value2) {
            addCriterion("department_no not between", value1, value2, "departmentNo");
            return (Criteria) this;
        }

        public Criteria andOutpatientDoctorNoIsNull() {
            addCriterion("outpatient_doctor_no is null");
            return (Criteria) this;
        }

        public Criteria andOutpatientDoctorNoIsNotNull() {
            addCriterion("outpatient_doctor_no is not null");
            return (Criteria) this;
        }

        public Criteria andOutpatientDoctorNoEqualTo(Integer value) {
            addCriterion("outpatient_doctor_no =", value, "outpatientDoctorNo");
            return (Criteria) this;
        }

        public Criteria andOutpatientDoctorNoNotEqualTo(Integer value) {
            addCriterion("outpatient_doctor_no <>", value, "outpatientDoctorNo");
            return (Criteria) this;
        }

        public Criteria andOutpatientDoctorNoGreaterThan(Integer value) {
            addCriterion("outpatient_doctor_no >", value, "outpatientDoctorNo");
            return (Criteria) this;
        }

        public Criteria andOutpatientDoctorNoGreaterThanOrEqualTo(Integer value) {
            addCriterion("outpatient_doctor_no >=", value, "outpatientDoctorNo");
            return (Criteria) this;
        }

        public Criteria andOutpatientDoctorNoLessThan(Integer value) {
            addCriterion("outpatient_doctor_no <", value, "outpatientDoctorNo");
            return (Criteria) this;
        }

        public Criteria andOutpatientDoctorNoLessThanOrEqualTo(Integer value) {
            addCriterion("outpatient_doctor_no <=", value, "outpatientDoctorNo");
            return (Criteria) this;
        }

        public Criteria andOutpatientDoctorNoIn(List<Integer> values) {
            addCriterion("outpatient_doctor_no in", values, "outpatientDoctorNo");
            return (Criteria) this;
        }

        public Criteria andOutpatientDoctorNoNotIn(List<Integer> values) {
            addCriterion("outpatient_doctor_no not in", values, "outpatientDoctorNo");
            return (Criteria) this;
        }

        public Criteria andOutpatientDoctorNoBetween(Integer value1, Integer value2) {
            addCriterion("outpatient_doctor_no between", value1, value2, "outpatientDoctorNo");
            return (Criteria) this;
        }

        public Criteria andOutpatientDoctorNoNotBetween(Integer value1, Integer value2) {
            addCriterion("outpatient_doctor_no not between", value1, value2, "outpatientDoctorNo");
            return (Criteria) this;
        }

        public Criteria andOutpatientDoctorNameIsNull() {
            addCriterion("outpatient_doctor_name is null");
            return (Criteria) this;
        }

        public Criteria andOutpatientDoctorNameIsNotNull() {
            addCriterion("outpatient_doctor_name is not null");
            return (Criteria) this;
        }

        public Criteria andOutpatientDoctorNameEqualTo(String value) {
            addCriterion("outpatient_doctor_name =", value, "outpatientDoctorName");
            return (Criteria) this;
        }

        public Criteria andOutpatientDoctorNameNotEqualTo(String value) {
            addCriterion("outpatient_doctor_name <>", value, "outpatientDoctorName");
            return (Criteria) this;
        }

        public Criteria andOutpatientDoctorNameGreaterThan(String value) {
            addCriterion("outpatient_doctor_name >", value, "outpatientDoctorName");
            return (Criteria) this;
        }

        public Criteria andOutpatientDoctorNameGreaterThanOrEqualTo(String value) {
            addCriterion("outpatient_doctor_name >=", value, "outpatientDoctorName");
            return (Criteria) this;
        }

        public Criteria andOutpatientDoctorNameLessThan(String value) {
            addCriterion("outpatient_doctor_name <", value, "outpatientDoctorName");
            return (Criteria) this;
        }

        public Criteria andOutpatientDoctorNameLessThanOrEqualTo(String value) {
            addCriterion("outpatient_doctor_name <=", value, "outpatientDoctorName");
            return (Criteria) this;
        }

        public Criteria andOutpatientDoctorNameLike(String value) {
            addCriterion("outpatient_doctor_name like", value, "outpatientDoctorName");
            return (Criteria) this;
        }

        public Criteria andOutpatientDoctorNameNotLike(String value) {
            addCriterion("outpatient_doctor_name not like", value, "outpatientDoctorName");
            return (Criteria) this;
        }

        public Criteria andOutpatientDoctorNameIn(List<String> values) {
            addCriterion("outpatient_doctor_name in", values, "outpatientDoctorName");
            return (Criteria) this;
        }

        public Criteria andOutpatientDoctorNameNotIn(List<String> values) {
            addCriterion("outpatient_doctor_name not in", values, "outpatientDoctorName");
            return (Criteria) this;
        }

        public Criteria andOutpatientDoctorNameBetween(String value1, String value2) {
            addCriterion("outpatient_doctor_name between", value1, value2, "outpatientDoctorName");
            return (Criteria) this;
        }

        public Criteria andOutpatientDoctorNameNotBetween(String value1, String value2) {
            addCriterion("outpatient_doctor_name not between", value1, value2, "outpatientDoctorName");
            return (Criteria) this;
        }

        public Criteria andRegistrationPayWayNoIsNull() {
            addCriterion("registration_pay_way_no is null");
            return (Criteria) this;
        }

        public Criteria andRegistrationPayWayNoIsNotNull() {
            addCriterion("registration_pay_way_no is not null");
            return (Criteria) this;
        }

        public Criteria andRegistrationPayWayNoEqualTo(Integer value) {
            addCriterion("registration_pay_way_no =", value, "registrationPayWayNo");
            return (Criteria) this;
        }

        public Criteria andRegistrationPayWayNoNotEqualTo(Integer value) {
            addCriterion("registration_pay_way_no <>", value, "registrationPayWayNo");
            return (Criteria) this;
        }

        public Criteria andRegistrationPayWayNoGreaterThan(Integer value) {
            addCriterion("registration_pay_way_no >", value, "registrationPayWayNo");
            return (Criteria) this;
        }

        public Criteria andRegistrationPayWayNoGreaterThanOrEqualTo(Integer value) {
            addCriterion("registration_pay_way_no >=", value, "registrationPayWayNo");
            return (Criteria) this;
        }

        public Criteria andRegistrationPayWayNoLessThan(Integer value) {
            addCriterion("registration_pay_way_no <", value, "registrationPayWayNo");
            return (Criteria) this;
        }

        public Criteria andRegistrationPayWayNoLessThanOrEqualTo(Integer value) {
            addCriterion("registration_pay_way_no <=", value, "registrationPayWayNo");
            return (Criteria) this;
        }

        public Criteria andRegistrationPayWayNoIn(List<Integer> values) {
            addCriterion("registration_pay_way_no in", values, "registrationPayWayNo");
            return (Criteria) this;
        }

        public Criteria andRegistrationPayWayNoNotIn(List<Integer> values) {
            addCriterion("registration_pay_way_no not in", values, "registrationPayWayNo");
            return (Criteria) this;
        }

        public Criteria andRegistrationPayWayNoBetween(Integer value1, Integer value2) {
            addCriterion("registration_pay_way_no between", value1, value2, "registrationPayWayNo");
            return (Criteria) this;
        }

        public Criteria andRegistrationPayWayNoNotBetween(Integer value1, Integer value2) {
            addCriterion("registration_pay_way_no not between", value1, value2, "registrationPayWayNo");
            return (Criteria) this;
        }

        public Criteria andMedicinePrescriptionDrugsNamesIsNull() {
            addCriterion("medicine_prescription_drugs_names is null");
            return (Criteria) this;
        }

        public Criteria andMedicinePrescriptionDrugsNamesIsNotNull() {
            addCriterion("medicine_prescription_drugs_names is not null");
            return (Criteria) this;
        }

        public Criteria andMedicinePrescriptionDrugsNamesEqualTo(String value) {
            addCriterion("medicine_prescription_drugs_names =", value, "medicinePrescriptionDrugsNames");
            return (Criteria) this;
        }

        public Criteria andMedicinePrescriptionDrugsNamesNotEqualTo(String value) {
            addCriterion("medicine_prescription_drugs_names <>", value, "medicinePrescriptionDrugsNames");
            return (Criteria) this;
        }

        public Criteria andMedicinePrescriptionDrugsNamesGreaterThan(String value) {
            addCriterion("medicine_prescription_drugs_names >", value, "medicinePrescriptionDrugsNames");
            return (Criteria) this;
        }

        public Criteria andMedicinePrescriptionDrugsNamesGreaterThanOrEqualTo(String value) {
            addCriterion("medicine_prescription_drugs_names >=", value, "medicinePrescriptionDrugsNames");
            return (Criteria) this;
        }

        public Criteria andMedicinePrescriptionDrugsNamesLessThan(String value) {
            addCriterion("medicine_prescription_drugs_names <", value, "medicinePrescriptionDrugsNames");
            return (Criteria) this;
        }

        public Criteria andMedicinePrescriptionDrugsNamesLessThanOrEqualTo(String value) {
            addCriterion("medicine_prescription_drugs_names <=", value, "medicinePrescriptionDrugsNames");
            return (Criteria) this;
        }

        public Criteria andMedicinePrescriptionDrugsNamesLike(String value) {
            addCriterion("medicine_prescription_drugs_names like", value, "medicinePrescriptionDrugsNames");
            return (Criteria) this;
        }

        public Criteria andMedicinePrescriptionDrugsNamesNotLike(String value) {
            addCriterion("medicine_prescription_drugs_names not like", value, "medicinePrescriptionDrugsNames");
            return (Criteria) this;
        }

        public Criteria andMedicinePrescriptionDrugsNamesIn(List<String> values) {
            addCriterion("medicine_prescription_drugs_names in", values, "medicinePrescriptionDrugsNames");
            return (Criteria) this;
        }

        public Criteria andMedicinePrescriptionDrugsNamesNotIn(List<String> values) {
            addCriterion("medicine_prescription_drugs_names not in", values, "medicinePrescriptionDrugsNames");
            return (Criteria) this;
        }

        public Criteria andMedicinePrescriptionDrugsNamesBetween(String value1, String value2) {
            addCriterion("medicine_prescription_drugs_names between", value1, value2, "medicinePrescriptionDrugsNames");
            return (Criteria) this;
        }

        public Criteria andMedicinePrescriptionDrugsNamesNotBetween(String value1, String value2) {
            addCriterion("medicine_prescription_drugs_names not between", value1, value2, "medicinePrescriptionDrugsNames");
            return (Criteria) this;
        }

        public Criteria andRegistrarNoIsNull() {
            addCriterion("registrar_no is null");
            return (Criteria) this;
        }

        public Criteria andRegistrarNoIsNotNull() {
            addCriterion("registrar_no is not null");
            return (Criteria) this;
        }

        public Criteria andRegistrarNoEqualTo(Integer value) {
            addCriterion("registrar_no =", value, "registrarNo");
            return (Criteria) this;
        }

        public Criteria andRegistrarNoNotEqualTo(Integer value) {
            addCriterion("registrar_no <>", value, "registrarNo");
            return (Criteria) this;
        }

        public Criteria andRegistrarNoGreaterThan(Integer value) {
            addCriterion("registrar_no >", value, "registrarNo");
            return (Criteria) this;
        }

        public Criteria andRegistrarNoGreaterThanOrEqualTo(Integer value) {
            addCriterion("registrar_no >=", value, "registrarNo");
            return (Criteria) this;
        }

        public Criteria andRegistrarNoLessThan(Integer value) {
            addCriterion("registrar_no <", value, "registrarNo");
            return (Criteria) this;
        }

        public Criteria andRegistrarNoLessThanOrEqualTo(Integer value) {
            addCriterion("registrar_no <=", value, "registrarNo");
            return (Criteria) this;
        }

        public Criteria andRegistrarNoIn(List<Integer> values) {
            addCriterion("registrar_no in", values, "registrarNo");
            return (Criteria) this;
        }

        public Criteria andRegistrarNoNotIn(List<Integer> values) {
            addCriterion("registrar_no not in", values, "registrarNo");
            return (Criteria) this;
        }

        public Criteria andRegistrarNoBetween(Integer value1, Integer value2) {
            addCriterion("registrar_no between", value1, value2, "registrarNo");
            return (Criteria) this;
        }

        public Criteria andRegistrarNoNotBetween(Integer value1, Integer value2) {
            addCriterion("registrar_no not between", value1, value2, "registrarNo");
            return (Criteria) this;
        }

        public Criteria andRegistrarNameIsNull() {
            addCriterion("registrar_name is null");
            return (Criteria) this;
        }

        public Criteria andRegistrarNameIsNotNull() {
            addCriterion("registrar_name is not null");
            return (Criteria) this;
        }

        public Criteria andRegistrarNameEqualTo(String value) {
            addCriterion("registrar_name =", value, "registrarName");
            return (Criteria) this;
        }

        public Criteria andRegistrarNameNotEqualTo(String value) {
            addCriterion("registrar_name <>", value, "registrarName");
            return (Criteria) this;
        }

        public Criteria andRegistrarNameGreaterThan(String value) {
            addCriterion("registrar_name >", value, "registrarName");
            return (Criteria) this;
        }

        public Criteria andRegistrarNameGreaterThanOrEqualTo(String value) {
            addCriterion("registrar_name >=", value, "registrarName");
            return (Criteria) this;
        }

        public Criteria andRegistrarNameLessThan(String value) {
            addCriterion("registrar_name <", value, "registrarName");
            return (Criteria) this;
        }

        public Criteria andRegistrarNameLessThanOrEqualTo(String value) {
            addCriterion("registrar_name <=", value, "registrarName");
            return (Criteria) this;
        }

        public Criteria andRegistrarNameLike(String value) {
            addCriterion("registrar_name like", value, "registrarName");
            return (Criteria) this;
        }

        public Criteria andRegistrarNameNotLike(String value) {
            addCriterion("registrar_name not like", value, "registrarName");
            return (Criteria) this;
        }

        public Criteria andRegistrarNameIn(List<String> values) {
            addCriterion("registrar_name in", values, "registrarName");
            return (Criteria) this;
        }

        public Criteria andRegistrarNameNotIn(List<String> values) {
            addCriterion("registrar_name not in", values, "registrarName");
            return (Criteria) this;
        }

        public Criteria andRegistrarNameBetween(String value1, String value2) {
            addCriterion("registrar_name between", value1, value2, "registrarName");
            return (Criteria) this;
        }

        public Criteria andRegistrarNameNotBetween(String value1, String value2) {
            addCriterion("registrar_name not between", value1, value2, "registrarName");
            return (Criteria) this;
        }

        public Criteria andDrugDoctorNoIsNull() {
            addCriterion("drug_doctor_no is null");
            return (Criteria) this;
        }

        public Criteria andDrugDoctorNoIsNotNull() {
            addCriterion("drug_doctor_no is not null");
            return (Criteria) this;
        }

        public Criteria andDrugDoctorNoEqualTo(Integer value) {
            addCriterion("drug_doctor_no =", value, "drugDoctorNo");
            return (Criteria) this;
        }

        public Criteria andDrugDoctorNoNotEqualTo(Integer value) {
            addCriterion("drug_doctor_no <>", value, "drugDoctorNo");
            return (Criteria) this;
        }

        public Criteria andDrugDoctorNoGreaterThan(Integer value) {
            addCriterion("drug_doctor_no >", value, "drugDoctorNo");
            return (Criteria) this;
        }

        public Criteria andDrugDoctorNoGreaterThanOrEqualTo(Integer value) {
            addCriterion("drug_doctor_no >=", value, "drugDoctorNo");
            return (Criteria) this;
        }

        public Criteria andDrugDoctorNoLessThan(Integer value) {
            addCriterion("drug_doctor_no <", value, "drugDoctorNo");
            return (Criteria) this;
        }

        public Criteria andDrugDoctorNoLessThanOrEqualTo(Integer value) {
            addCriterion("drug_doctor_no <=", value, "drugDoctorNo");
            return (Criteria) this;
        }

        public Criteria andDrugDoctorNoIn(List<Integer> values) {
            addCriterion("drug_doctor_no in", values, "drugDoctorNo");
            return (Criteria) this;
        }

        public Criteria andDrugDoctorNoNotIn(List<Integer> values) {
            addCriterion("drug_doctor_no not in", values, "drugDoctorNo");
            return (Criteria) this;
        }

        public Criteria andDrugDoctorNoBetween(Integer value1, Integer value2) {
            addCriterion("drug_doctor_no between", value1, value2, "drugDoctorNo");
            return (Criteria) this;
        }

        public Criteria andDrugDoctorNoNotBetween(Integer value1, Integer value2) {
            addCriterion("drug_doctor_no not between", value1, value2, "drugDoctorNo");
            return (Criteria) this;
        }

        public Criteria andDrugDoctorNameIsNull() {
            addCriterion("drug_doctor_name is null");
            return (Criteria) this;
        }

        public Criteria andDrugDoctorNameIsNotNull() {
            addCriterion("drug_doctor_name is not null");
            return (Criteria) this;
        }

        public Criteria andDrugDoctorNameEqualTo(String value) {
            addCriterion("drug_doctor_name =", value, "drugDoctorName");
            return (Criteria) this;
        }

        public Criteria andDrugDoctorNameNotEqualTo(String value) {
            addCriterion("drug_doctor_name <>", value, "drugDoctorName");
            return (Criteria) this;
        }

        public Criteria andDrugDoctorNameGreaterThan(String value) {
            addCriterion("drug_doctor_name >", value, "drugDoctorName");
            return (Criteria) this;
        }

        public Criteria andDrugDoctorNameGreaterThanOrEqualTo(String value) {
            addCriterion("drug_doctor_name >=", value, "drugDoctorName");
            return (Criteria) this;
        }

        public Criteria andDrugDoctorNameLessThan(String value) {
            addCriterion("drug_doctor_name <", value, "drugDoctorName");
            return (Criteria) this;
        }

        public Criteria andDrugDoctorNameLessThanOrEqualTo(String value) {
            addCriterion("drug_doctor_name <=", value, "drugDoctorName");
            return (Criteria) this;
        }

        public Criteria andDrugDoctorNameLike(String value) {
            addCriterion("drug_doctor_name like", value, "drugDoctorName");
            return (Criteria) this;
        }

        public Criteria andDrugDoctorNameNotLike(String value) {
            addCriterion("drug_doctor_name not like", value, "drugDoctorName");
            return (Criteria) this;
        }

        public Criteria andDrugDoctorNameIn(List<String> values) {
            addCriterion("drug_doctor_name in", values, "drugDoctorName");
            return (Criteria) this;
        }

        public Criteria andDrugDoctorNameNotIn(List<String> values) {
            addCriterion("drug_doctor_name not in", values, "drugDoctorName");
            return (Criteria) this;
        }

        public Criteria andDrugDoctorNameBetween(String value1, String value2) {
            addCriterion("drug_doctor_name between", value1, value2, "drugDoctorName");
            return (Criteria) this;
        }

        public Criteria andDrugDoctorNameNotBetween(String value1, String value2) {
            addCriterion("drug_doctor_name not between", value1, value2, "drugDoctorName");
            return (Criteria) this;
        }

        public Criteria andPriceIsNull() {
            addCriterion("price is null");
            return (Criteria) this;
        }

        public Criteria andPriceIsNotNull() {
            addCriterion("price is not null");
            return (Criteria) this;
        }

        public Criteria andPriceEqualTo(BigDecimal value) {
            addCriterion("price =", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotEqualTo(BigDecimal value) {
            addCriterion("price <>", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThan(BigDecimal value) {
            addCriterion("price >", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("price >=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThan(BigDecimal value) {
            addCriterion("price <", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("price <=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceIn(List<BigDecimal> values) {
            addCriterion("price in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotIn(List<BigDecimal> values) {
            addCriterion("price not in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("price between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("price not between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
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