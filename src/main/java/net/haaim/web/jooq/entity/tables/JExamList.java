/*
 * This file is generated by jOOQ.
 */
package net.haaim.web.jooq.entity.tables;


import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

import net.haaim.web.jooq.entity.Indexes;
import net.haaim.web.jooq.entity.JHaaimDb;
import net.haaim.web.jooq.entity.Keys;
import net.haaim.web.jooq.entity.tables.records.JExamListRecord;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row16;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


/**
 * 문제출제목록
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class JExamList extends TableImpl<JExamListRecord> {

    private static final long serialVersionUID = 790041912;

    /**
     * The reference instance of <code>haaim_db.exam_list</code>
     */
    public static final JExamList EXAM_LIST = new JExamList();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<JExamListRecord> getRecordType() {
        return JExamListRecord.class;
    }

    /**
     * The column <code>haaim_db.exam_list.exam_no</code>. 출제번호
     */
    public final TableField<JExamListRecord, Integer> EXAM_NO = createField(DSL.name("exam_no"), org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "출제번호");

    /**
     * The column <code>haaim_db.exam_list.date</code>. 출제일자
     */
    public final TableField<JExamListRecord, String> DATE = createField(DSL.name("date"), org.jooq.impl.SQLDataType.VARCHAR(8).nullable(false), this, "출제일자");

    /**
     * The column <code>haaim_db.exam_list.class_no</code>.
     */
    public final TableField<JExamListRecord, Integer> CLASS_NO = createField(DSL.name("class_no"), org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>haaim_db.exam_list.grade</code>. 학년
     */
    public final TableField<JExamListRecord, Integer> GRADE = createField(DSL.name("grade"), org.jooq.impl.SQLDataType.INTEGER, this, "학년");

    /**
     * The column <code>haaim_db.exam_list.course</code>. 학기/과정
     */
    public final TableField<JExamListRecord, String> COURSE = createField(DSL.name("course"), org.jooq.impl.SQLDataType.VARCHAR(4), this, "학기/과정");

    /**
     * The column <code>haaim_db.exam_list.medium_category</code>. 중분류
     */
    public final TableField<JExamListRecord, String> MEDIUM_CATEGORY = createField(DSL.name("medium_category"), org.jooq.impl.SQLDataType.VARCHAR(10), this, "중분류");

    /**
     * The column <code>haaim_db.exam_list.type_group</code>. 유형그룹
     */
    public final TableField<JExamListRecord, String> TYPE_GROUP = createField(DSL.name("type_group"), org.jooq.impl.SQLDataType.VARCHAR(4), this, "유형그룹");

    /**
     * The column <code>haaim_db.exam_list.count</code>. 문항수
     */
    public final TableField<JExamListRecord, Integer> COUNT = createField(DSL.name("count"), org.jooq.impl.SQLDataType.INTEGER, this, "문항수");

    /**
     * The column <code>haaim_db.exam_list.level_difficulty</code>. 난이도
     */
    public final TableField<JExamListRecord, Integer> LEVEL_DIFFICULTY = createField(DSL.name("level_difficulty"), org.jooq.impl.SQLDataType.INTEGER, this, "난이도");

    /**
     * The column <code>haaim_db.exam_list.target</code>. 응시대상
     */
    public final TableField<JExamListRecord, String> TARGET = createField(DSL.name("target"), org.jooq.impl.SQLDataType.VARCHAR(500), this, "응시대상");

    /**
     * The column <code>haaim_db.exam_list.goal_score</code>. pass 기준점수
     */
    public final TableField<JExamListRecord, Integer> GOAL_SCORE = createField(DSL.name("goal_score"), org.jooq.impl.SQLDataType.INTEGER, this, "pass 기준점수");

    /**
     * The column <code>haaim_db.exam_list.state</code>. 출제상태(출제/미출제)
     */
    public final TableField<JExamListRecord, Integer> STATE = createField(DSL.name("state"), org.jooq.impl.SQLDataType.INTEGER, this, "출제상태(출제/미출제)");

    /**
     * The column <code>haaim_db.exam_list.input_id</code>.
     */
    public final TableField<JExamListRecord, String> INPUT_ID = createField(DSL.name("input_id"), org.jooq.impl.SQLDataType.VARCHAR(45).nullable(false), this, "");

    /**
     * The column <code>haaim_db.exam_list.input_date</code>.
     */
    public final TableField<JExamListRecord, LocalDateTime> INPUT_DATE = createField(DSL.name("input_date"), org.jooq.impl.SQLDataType.LOCALDATETIME.nullable(false), this, "");

    /**
     * The column <code>haaim_db.exam_list.update_id</code>.
     */
    public final TableField<JExamListRecord, String> UPDATE_ID = createField(DSL.name("update_id"), org.jooq.impl.SQLDataType.VARCHAR(45), this, "");

    /**
     * The column <code>haaim_db.exam_list.update_date</code>.
     */
    public final TableField<JExamListRecord, LocalDateTime> UPDATE_DATE = createField(DSL.name("update_date"), org.jooq.impl.SQLDataType.LOCALDATETIME, this, "");

    /**
     * Create a <code>haaim_db.exam_list</code> table reference
     */
    public JExamList() {
        this(DSL.name("exam_list"), null);
    }

    /**
     * Create an aliased <code>haaim_db.exam_list</code> table reference
     */
    public JExamList(String alias) {
        this(DSL.name(alias), EXAM_LIST);
    }

    /**
     * Create an aliased <code>haaim_db.exam_list</code> table reference
     */
    public JExamList(Name alias) {
        this(alias, EXAM_LIST);
    }

    private JExamList(Name alias, Table<JExamListRecord> aliased) {
        this(alias, aliased, null);
    }

    private JExamList(Name alias, Table<JExamListRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("문제출제목록"), TableOptions.table());
    }

    public <O extends Record> JExamList(Table<O> child, ForeignKey<O, JExamListRecord> key) {
        super(child, key, EXAM_LIST);
    }

    @Override
    public Schema getSchema() {
        return JHaaimDb.HAAIM_DB;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.EXAM_LIST_FK_EXAM_LIST_CLASS1_IDX);
    }

    @Override
    public Identity<JExamListRecord, Integer> getIdentity() {
        return Keys.IDENTITY_EXAM_LIST;
    }

    @Override
    public UniqueKey<JExamListRecord> getPrimaryKey() {
        return Keys.KEY_EXAM_LIST_PRIMARY;
    }

    @Override
    public List<UniqueKey<JExamListRecord>> getKeys() {
        return Arrays.<UniqueKey<JExamListRecord>>asList(Keys.KEY_EXAM_LIST_PRIMARY);
    }

    @Override
    public JExamList as(String alias) {
        return new JExamList(DSL.name(alias), this);
    }

    @Override
    public JExamList as(Name alias) {
        return new JExamList(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public JExamList rename(String name) {
        return new JExamList(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public JExamList rename(Name name) {
        return new JExamList(name, null);
    }

    // -------------------------------------------------------------------------
    // Row16 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row16<Integer, String, Integer, Integer, String, String, String, Integer, Integer, String, Integer, Integer, String, LocalDateTime, String, LocalDateTime> fieldsRow() {
        return (Row16) super.fieldsRow();
    }
}