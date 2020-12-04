/*
 * This file is generated by jOOQ.
 */
package net.haaim.web.jooq.entity.tables.records;


import java.time.LocalDateTime;

import net.haaim.web.jooq.entity.tables.JStudentInfo;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record11;
import org.jooq.Row11;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * 학생정보
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class JStudentInfoRecord extends UpdatableRecordImpl<JStudentInfoRecord> implements Record11<Integer, String, String, String, String, String, String, String, LocalDateTime, String, LocalDateTime> {

    private static final long serialVersionUID = 553971120;

    /**
     * Setter for <code>haaim_db.student_info.student_no</code>.
     */
    public void setStudentNo(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>haaim_db.student_info.student_no</code>.
     */
    public Integer getStudentNo() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>haaim_db.student_info.name</code>.
     */
    public void setName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>haaim_db.student_info.name</code>.
     */
    public String getName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>haaim_db.student_info.birth</code>. 생년월일
     */
    public void setBirth(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>haaim_db.student_info.birth</code>. 생년월일
     */
    public String getBirth() {
        return (String) get(2);
    }

    /**
     * Setter for <code>haaim_db.student_info.mobile</code>. 연락처
     */
    public void setMobile(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>haaim_db.student_info.mobile</code>. 연락처
     */
    public String getMobile() {
        return (String) get(3);
    }

    /**
     * Setter for <code>haaim_db.student_info.email</code>.
     */
    public void setEmail(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>haaim_db.student_info.email</code>.
     */
    public String getEmail() {
        return (String) get(4);
    }

    /**
     * Setter for <code>haaim_db.student_info.father_mobile</code>. 아버지연락처
     */
    public void setFatherMobile(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>haaim_db.student_info.father_mobile</code>. 아버지연락처
     */
    public String getFatherMobile() {
        return (String) get(5);
    }

    /**
     * Setter for <code>haaim_db.student_info.mother_mobile</code>. 어머니연락처
     */
    public void setMotherMobile(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>haaim_db.student_info.mother_mobile</code>. 어머니연락처
     */
    public String getMotherMobile() {
        return (String) get(6);
    }

    /**
     * Setter for <code>haaim_db.student_info.input_id</code>.
     */
    public void setInputId(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>haaim_db.student_info.input_id</code>.
     */
    public String getInputId() {
        return (String) get(7);
    }

    /**
     * Setter for <code>haaim_db.student_info.input_date</code>.
     */
    public void setInputDate(LocalDateTime value) {
        set(8, value);
    }

    /**
     * Getter for <code>haaim_db.student_info.input_date</code>.
     */
    public LocalDateTime getInputDate() {
        return (LocalDateTime) get(8);
    }

    /**
     * Setter for <code>haaim_db.student_info.update_id</code>.
     */
    public void setUpdateId(String value) {
        set(9, value);
    }

    /**
     * Getter for <code>haaim_db.student_info.update_id</code>.
     */
    public String getUpdateId() {
        return (String) get(9);
    }

    /**
     * Setter for <code>haaim_db.student_info.update_date</code>.
     */
    public void setUpdateDate(LocalDateTime value) {
        set(10, value);
    }

    /**
     * Getter for <code>haaim_db.student_info.update_date</code>.
     */
    public LocalDateTime getUpdateDate() {
        return (LocalDateTime) get(10);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record11 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row11<Integer, String, String, String, String, String, String, String, LocalDateTime, String, LocalDateTime> fieldsRow() {
        return (Row11) super.fieldsRow();
    }

    @Override
    public Row11<Integer, String, String, String, String, String, String, String, LocalDateTime, String, LocalDateTime> valuesRow() {
        return (Row11) super.valuesRow();
    }

    @Override
    public Field<Integer> field1() {
        return JStudentInfo.STUDENT_INFO.STUDENT_NO;
    }

    @Override
    public Field<String> field2() {
        return JStudentInfo.STUDENT_INFO.NAME;
    }

    @Override
    public Field<String> field3() {
        return JStudentInfo.STUDENT_INFO.BIRTH;
    }

    @Override
    public Field<String> field4() {
        return JStudentInfo.STUDENT_INFO.MOBILE;
    }

    @Override
    public Field<String> field5() {
        return JStudentInfo.STUDENT_INFO.EMAIL;
    }

    @Override
    public Field<String> field6() {
        return JStudentInfo.STUDENT_INFO.FATHER_MOBILE;
    }

    @Override
    public Field<String> field7() {
        return JStudentInfo.STUDENT_INFO.MOTHER_MOBILE;
    }

    @Override
    public Field<String> field8() {
        return JStudentInfo.STUDENT_INFO.INPUT_ID;
    }

    @Override
    public Field<LocalDateTime> field9() {
        return JStudentInfo.STUDENT_INFO.INPUT_DATE;
    }

    @Override
    public Field<String> field10() {
        return JStudentInfo.STUDENT_INFO.UPDATE_ID;
    }

    @Override
    public Field<LocalDateTime> field11() {
        return JStudentInfo.STUDENT_INFO.UPDATE_DATE;
    }

    @Override
    public Integer component1() {
        return getStudentNo();
    }

    @Override
    public String component2() {
        return getName();
    }

    @Override
    public String component3() {
        return getBirth();
    }

    @Override
    public String component4() {
        return getMobile();
    }

    @Override
    public String component5() {
        return getEmail();
    }

    @Override
    public String component6() {
        return getFatherMobile();
    }

    @Override
    public String component7() {
        return getMotherMobile();
    }

    @Override
    public String component8() {
        return getInputId();
    }

    @Override
    public LocalDateTime component9() {
        return getInputDate();
    }

    @Override
    public String component10() {
        return getUpdateId();
    }

    @Override
    public LocalDateTime component11() {
        return getUpdateDate();
    }

    @Override
    public Integer value1() {
        return getStudentNo();
    }

    @Override
    public String value2() {
        return getName();
    }

    @Override
    public String value3() {
        return getBirth();
    }

    @Override
    public String value4() {
        return getMobile();
    }

    @Override
    public String value5() {
        return getEmail();
    }

    @Override
    public String value6() {
        return getFatherMobile();
    }

    @Override
    public String value7() {
        return getMotherMobile();
    }

    @Override
    public String value8() {
        return getInputId();
    }

    @Override
    public LocalDateTime value9() {
        return getInputDate();
    }

    @Override
    public String value10() {
        return getUpdateId();
    }

    @Override
    public LocalDateTime value11() {
        return getUpdateDate();
    }

    @Override
    public JStudentInfoRecord value1(Integer value) {
        setStudentNo(value);
        return this;
    }

    @Override
    public JStudentInfoRecord value2(String value) {
        setName(value);
        return this;
    }

    @Override
    public JStudentInfoRecord value3(String value) {
        setBirth(value);
        return this;
    }

    @Override
    public JStudentInfoRecord value4(String value) {
        setMobile(value);
        return this;
    }

    @Override
    public JStudentInfoRecord value5(String value) {
        setEmail(value);
        return this;
    }

    @Override
    public JStudentInfoRecord value6(String value) {
        setFatherMobile(value);
        return this;
    }

    @Override
    public JStudentInfoRecord value7(String value) {
        setMotherMobile(value);
        return this;
    }

    @Override
    public JStudentInfoRecord value8(String value) {
        setInputId(value);
        return this;
    }

    @Override
    public JStudentInfoRecord value9(LocalDateTime value) {
        setInputDate(value);
        return this;
    }

    @Override
    public JStudentInfoRecord value10(String value) {
        setUpdateId(value);
        return this;
    }

    @Override
    public JStudentInfoRecord value11(LocalDateTime value) {
        setUpdateDate(value);
        return this;
    }

    @Override
    public JStudentInfoRecord values(Integer value1, String value2, String value3, String value4, String value5, String value6, String value7, String value8, LocalDateTime value9, String value10, LocalDateTime value11) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        value10(value10);
        value11(value11);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached JStudentInfoRecord
     */
    public JStudentInfoRecord() {
        super(JStudentInfo.STUDENT_INFO);
    }

    /**
     * Create a detached, initialised JStudentInfoRecord
     */
    public JStudentInfoRecord(Integer studentNo, String name, String birth, String mobile, String email, String fatherMobile, String motherMobile, String inputId, LocalDateTime inputDate, String updateId, LocalDateTime updateDate) {
        super(JStudentInfo.STUDENT_INFO);

        set(0, studentNo);
        set(1, name);
        set(2, birth);
        set(3, mobile);
        set(4, email);
        set(5, fatherMobile);
        set(6, motherMobile);
        set(7, inputId);
        set(8, inputDate);
        set(9, updateId);
        set(10, updateDate);
    }
}
