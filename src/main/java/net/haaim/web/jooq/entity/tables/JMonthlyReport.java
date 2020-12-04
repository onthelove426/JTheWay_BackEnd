/*
 * This file is generated by jOOQ.
 */
package net.haaim.web.jooq.entity.tables;


import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

import net.haaim.web.jooq.entity.JHaaimDb;
import net.haaim.web.jooq.entity.Keys;
import net.haaim.web.jooq.entity.tables.records.JMonthlyReportRecord;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row17;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


/**
 * 월간리포트
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class JMonthlyReport extends TableImpl<JMonthlyReportRecord> {

    private static final long serialVersionUID = -1716918427;

    /**
     * The reference instance of <code>haaim_db.monthly_report</code>
     */
    public static final JMonthlyReport MONTHLY_REPORT = new JMonthlyReport();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<JMonthlyReportRecord> getRecordType() {
        return JMonthlyReportRecord.class;
    }

    /**
     * The column <code>haaim_db.monthly_report.no</code>.
     */
    public final TableField<JMonthlyReportRecord, Integer> NO = createField(DSL.name("no"), org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>haaim_db.monthly_report.class_no</code>.
     */
    public final TableField<JMonthlyReportRecord, Integer> CLASS_NO = createField(DSL.name("class_no"), org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>haaim_db.monthly_report.student_no</code>.
     */
    public final TableField<JMonthlyReportRecord, Integer> STUDENT_NO = createField(DSL.name("student_no"), org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>haaim_db.monthly_report.year</code>. 년
     */
    public final TableField<JMonthlyReportRecord, Integer> YEAR = createField(DSL.name("year"), org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "년");

    /**
     * The column <code>haaim_db.monthly_report.month</code>. 월
     */
    public final TableField<JMonthlyReportRecord, Integer> MONTH = createField(DSL.name("month"), org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "월");

    /**
     * The column <code>haaim_db.monthly_report.title</code>. 월간리포트 타이틀
     */
    public final TableField<JMonthlyReportRecord, String> TITLE = createField(DSL.name("title"), org.jooq.impl.SQLDataType.VARCHAR(200), this, "월간리포트 타이틀");

    /**
     * The column <code>haaim_db.monthly_report.start_date</code>. 기간 시작일
     */
    public final TableField<JMonthlyReportRecord, String> START_DATE = createField(DSL.name("start_date"), org.jooq.impl.SQLDataType.VARCHAR(8), this, "기간 시작일");

    /**
     * The column <code>haaim_db.monthly_report.end_date</code>. 기간 종료일
     */
    public final TableField<JMonthlyReportRecord, String> END_DATE = createField(DSL.name("end_date"), org.jooq.impl.SQLDataType.VARCHAR(8), this, "기간 종료일");

    /**
     * The column <code>haaim_db.monthly_report.homework</code>. 과제이행 회수
     */
    public final TableField<JMonthlyReportRecord, Integer> HOMEWORK = createField(DSL.name("homework"), org.jooq.impl.SQLDataType.INTEGER, this, "과제이행 회수");

    /**
     * The column <code>haaim_db.monthly_report.homework_total</code>. 과제 총 횟수
     */
    public final TableField<JMonthlyReportRecord, Integer> HOMEWORK_TOTAL = createField(DSL.name("homework_total"), org.jooq.impl.SQLDataType.INTEGER, this, "과제 총 횟수");

    /**
     * The column <code>haaim_db.monthly_report.excellence</code>. 장점
     */
    public final TableField<JMonthlyReportRecord, String> EXCELLENCE = createField(DSL.name("excellence"), org.jooq.impl.SQLDataType.VARCHAR(300), this, "장점");

    /**
     * The column <code>haaim_db.monthly_report.goal</code>. 목표
     */
    public final TableField<JMonthlyReportRecord, String> GOAL = createField(DSL.name("goal"), org.jooq.impl.SQLDataType.VARCHAR(300), this, "목표");

    /**
     * The column <code>haaim_db.monthly_report.notice</code>. 전달사항
     */
    public final TableField<JMonthlyReportRecord, String> NOTICE = createField(DSL.name("notice"), org.jooq.impl.SQLDataType.VARCHAR(500), this, "전달사항");

    /**
     * The column <code>haaim_db.monthly_report.input_id</code>.
     */
    public final TableField<JMonthlyReportRecord, String> INPUT_ID = createField(DSL.name("input_id"), org.jooq.impl.SQLDataType.VARCHAR(45).nullable(false), this, "");

    /**
     * The column <code>haaim_db.monthly_report.input_date</code>.
     */
    public final TableField<JMonthlyReportRecord, LocalDateTime> INPUT_DATE = createField(DSL.name("input_date"), org.jooq.impl.SQLDataType.LOCALDATETIME.nullable(false), this, "");

    /**
     * The column <code>haaim_db.monthly_report.update_id</code>.
     */
    public final TableField<JMonthlyReportRecord, String> UPDATE_ID = createField(DSL.name("update_id"), org.jooq.impl.SQLDataType.VARCHAR(45), this, "");

    /**
     * The column <code>haaim_db.monthly_report.update_date</code>.
     */
    public final TableField<JMonthlyReportRecord, LocalDateTime> UPDATE_DATE = createField(DSL.name("update_date"), org.jooq.impl.SQLDataType.LOCALDATETIME, this, "");

    /**
     * Create a <code>haaim_db.monthly_report</code> table reference
     */
    public JMonthlyReport() {
        this(DSL.name("monthly_report"), null);
    }

    /**
     * Create an aliased <code>haaim_db.monthly_report</code> table reference
     */
    public JMonthlyReport(String alias) {
        this(DSL.name(alias), MONTHLY_REPORT);
    }

    /**
     * Create an aliased <code>haaim_db.monthly_report</code> table reference
     */
    public JMonthlyReport(Name alias) {
        this(alias, MONTHLY_REPORT);
    }

    private JMonthlyReport(Name alias, Table<JMonthlyReportRecord> aliased) {
        this(alias, aliased, null);
    }

    private JMonthlyReport(Name alias, Table<JMonthlyReportRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("월간리포트"), TableOptions.table());
    }

    public <O extends Record> JMonthlyReport(Table<O> child, ForeignKey<O, JMonthlyReportRecord> key) {
        super(child, key, MONTHLY_REPORT);
    }

    @Override
    public Schema getSchema() {
        return JHaaimDb.HAAIM_DB;
    }

    @Override
    public Identity<JMonthlyReportRecord, Integer> getIdentity() {
        return Keys.IDENTITY_MONTHLY_REPORT;
    }

    @Override
    public UniqueKey<JMonthlyReportRecord> getPrimaryKey() {
        return Keys.KEY_MONTHLY_REPORT_PRIMARY;
    }

    @Override
    public List<UniqueKey<JMonthlyReportRecord>> getKeys() {
        return Arrays.<UniqueKey<JMonthlyReportRecord>>asList(Keys.KEY_MONTHLY_REPORT_PRIMARY);
    }

    @Override
    public JMonthlyReport as(String alias) {
        return new JMonthlyReport(DSL.name(alias), this);
    }

    @Override
    public JMonthlyReport as(Name alias) {
        return new JMonthlyReport(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public JMonthlyReport rename(String name) {
        return new JMonthlyReport(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public JMonthlyReport rename(Name name) {
        return new JMonthlyReport(name, null);
    }

    // -------------------------------------------------------------------------
    // Row17 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row17<Integer, Integer, Integer, Integer, Integer, String, String, String, Integer, Integer, String, String, String, String, LocalDateTime, String, LocalDateTime> fieldsRow() {
        return (Row17) super.fieldsRow();
    }
}
