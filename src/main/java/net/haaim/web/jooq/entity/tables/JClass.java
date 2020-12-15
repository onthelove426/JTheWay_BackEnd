/*
 * This file is generated by jOOQ.
 */
package net.haaim.web.jooq.entity.tables;


import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

import net.haaim.web.jooq.entity.JHaaimDb;
import net.haaim.web.jooq.entity.Keys;
import net.haaim.web.jooq.entity.tables.records.JClassRecord;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row14;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


/**
 * 수업관리
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class JClass extends TableImpl<JClassRecord> {

    private static final long serialVersionUID = -658239331;

    /**
     * The reference instance of <code>haaim_db.class</code>
     */
    public static final JClass CLASS = new JClass();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<JClassRecord> getRecordType() {
        return JClassRecord.class;
    }

    /**
     * The column <code>haaim_db.class.class_no</code>. 클래스 번호
     */
    public final TableField<JClassRecord, Integer> CLASS_NO = createField(DSL.name("class_no"), org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "클래스 번호");

    /**
     * The column <code>haaim_db.class.year</code>. 기간
     */
    public final TableField<JClassRecord, Integer> YEAR = createField(DSL.name("year"), org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "기간");

    /**
     * The column <code>haaim_db.class.class_name</code>. 클래스명
     */
    public final TableField<JClassRecord, String> CLASS_NAME = createField(DSL.name("class_name"), org.jooq.impl.SQLDataType.VARCHAR(100), this, "클래스명");

    /**
     * The column <code>haaim_db.class.teacher_no</code>. 교사 no.
     */
    public final TableField<JClassRecord, Integer> TEACHER_NO = createField(DSL.name("teacher_no"), org.jooq.impl.SQLDataType.INTEGER, this, "교사 no.");

    /**
     * The column <code>haaim_db.class.start_date</code>. 클래스 시작 기간
     */
    public final TableField<JClassRecord, String> START_DATE = createField(DSL.name("start_date"), org.jooq.impl.SQLDataType.VARCHAR(8).nullable(false), this, "클래스 시작 기간");

    /**
     * The column <code>haaim_db.class.end_date</code>. 클래스 종료 기간
     */
    public final TableField<JClassRecord, String> END_DATE = createField(DSL.name("end_date"), org.jooq.impl.SQLDataType.VARCHAR(8).nullable(false), this, "클래스 종료 기간");

    /**
     * The column <code>haaim_db.class.day_time</code>. 수업 요일 &amp; 시간 
     */
    public final TableField<JClassRecord, String> DAY_TIME = createField(DSL.name("day_time"), org.jooq.impl.SQLDataType.VARCHAR(45), this, "수업 요일 & 시간 ");

    /**
     * The column <code>haaim_db.class.textbook</code>. 교재
     */
    public final TableField<JClassRecord, String> TEXTBOOK = createField(DSL.name("textbook"), org.jooq.impl.SQLDataType.VARCHAR(500), this, "교재");

    /**
     * The column <code>haaim_db.class.pass_score</code>. PASS 기준 점수
     */
    public final TableField<JClassRecord, Integer> PASS_SCORE = createField(DSL.name("pass_score"), org.jooq.impl.SQLDataType.INTEGER, this, "PASS 기준 점수");

    /**
     * The column <code>haaim_db.class.description</code>. 기타정보
     */
    public final TableField<JClassRecord, String> DESCRIPTION = createField(DSL.name("description"), org.jooq.impl.SQLDataType.VARCHAR(1024), this, "기타정보");

    /**
     * The column <code>haaim_db.class.input_id</code>.
     */
    public final TableField<JClassRecord, String> INPUT_ID = createField(DSL.name("input_id"), org.jooq.impl.SQLDataType.VARCHAR(45), this, "");

    /**
     * The column <code>haaim_db.class.input_date</code>.
     */
    public final TableField<JClassRecord, LocalDateTime> INPUT_DATE = createField(DSL.name("input_date"), org.jooq.impl.SQLDataType.LOCALDATETIME, this, "");

    /**
     * The column <code>haaim_db.class.update_id</code>.
     */
    public final TableField<JClassRecord, String> UPDATE_ID = createField(DSL.name("update_id"), org.jooq.impl.SQLDataType.VARCHAR(45), this, "");

    /**
     * The column <code>haaim_db.class.update_date</code>.
     */
    public final TableField<JClassRecord, LocalDateTime> UPDATE_DATE = createField(DSL.name("update_date"), org.jooq.impl.SQLDataType.LOCALDATETIME, this, "");

    /**
     * Create a <code>haaim_db.class</code> table reference
     */
    public JClass() {
        this(DSL.name("class"), null);
    }

    /**
     * Create an aliased <code>haaim_db.class</code> table reference
     */
    public JClass(String alias) {
        this(DSL.name(alias), CLASS);
    }

    /**
     * Create an aliased <code>haaim_db.class</code> table reference
     */
    public JClass(Name alias) {
        this(alias, CLASS);
    }

    private JClass(Name alias, Table<JClassRecord> aliased) {
        this(alias, aliased, null);
    }

    private JClass(Name alias, Table<JClassRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("수업관리"), TableOptions.table());
    }

    public <O extends Record> JClass(Table<O> child, ForeignKey<O, JClassRecord> key) {
        super(child, key, CLASS);
    }

    @Override
    public Schema getSchema() {
        return JHaaimDb.HAAIM_DB;
    }

    @Override
    public Identity<JClassRecord, Integer> getIdentity() {
        return Keys.IDENTITY_CLASS;
    }

    @Override
    public UniqueKey<JClassRecord> getPrimaryKey() {
        return Keys.KEY_CLASS_PRIMARY;
    }

    @Override
    public List<UniqueKey<JClassRecord>> getKeys() {
        return Arrays.<UniqueKey<JClassRecord>>asList(Keys.KEY_CLASS_PRIMARY);
    }

    @Override
    public JClass as(String alias) {
        return new JClass(DSL.name(alias), this);
    }

    @Override
    public JClass as(Name alias) {
        return new JClass(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public JClass rename(String name) {
        return new JClass(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public JClass rename(Name name) {
        return new JClass(name, null);
    }

    // -------------------------------------------------------------------------
    // Row14 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row14<Integer, Integer, String, Integer, String, String, String, String, Integer, String, String, LocalDateTime, String, LocalDateTime> fieldsRow() {
        return (Row14) super.fieldsRow();
    }
}
