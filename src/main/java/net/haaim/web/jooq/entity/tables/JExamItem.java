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
import net.haaim.web.jooq.entity.tables.records.JExamItemRecord;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row18;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


/**
 * 문제출제
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class JExamItem extends TableImpl<JExamItemRecord> {

    private static final long serialVersionUID = -840791451;

    /**
     * The reference instance of <code>haaim_db.exam_item</code>
     */
    public static final JExamItem EXAM_ITEM = new JExamItem();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<JExamItemRecord> getRecordType() {
        return JExamItemRecord.class;
    }

    /**
     * The column <code>haaim_db.exam_item.exam_no</code>.
     */
    public final TableField<JExamItemRecord, Integer> EXAM_NO = createField(DSL.name("exam_no"), org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>haaim_db.exam_item.no</code>. 문제순서
     */
    public final TableField<JExamItemRecord, Integer> NO = createField(DSL.name("no"), org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "문제순서");

    /**
     * The column <code>haaim_db.exam_item.item_no</code>.
     */
    public final TableField<JExamItemRecord, Integer> ITEM_NO = createField(DSL.name("item_no"), org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>haaim_db.exam_item.question_type</code>. 문제형태(객관식/주관식)
     */
    public final TableField<JExamItemRecord, Integer> QUESTION_TYPE = createField(DSL.name("question_type"), org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "문제형태(객관식/주관식)");

    /**
     * The column <code>haaim_db.exam_item.question</code>.
     */
    public final TableField<JExamItemRecord, String> QUESTION = createField(DSL.name("question"), org.jooq.impl.SQLDataType.VARCHAR(1024).nullable(false), this, "");

    /**
     * The column <code>haaim_db.exam_item.choice1</code>. 객관식 보기1
     */
    public final TableField<JExamItemRecord, String> CHOICE1 = createField(DSL.name("choice1"), org.jooq.impl.SQLDataType.VARCHAR(1024), this, "객관식 보기1");

    /**
     * The column <code>haaim_db.exam_item.choice2</code>. 객관식 보기2
     */
    public final TableField<JExamItemRecord, String> CHOICE2 = createField(DSL.name("choice2"), org.jooq.impl.SQLDataType.VARCHAR(1024), this, "객관식 보기2");

    /**
     * The column <code>haaim_db.exam_item.choice3</code>. 객관식 보기3
     */
    public final TableField<JExamItemRecord, String> CHOICE3 = createField(DSL.name("choice3"), org.jooq.impl.SQLDataType.VARCHAR(1024), this, "객관식 보기3");

    /**
     * The column <code>haaim_db.exam_item.choice4</code>. 객관식 보기4
     */
    public final TableField<JExamItemRecord, String> CHOICE4 = createField(DSL.name("choice4"), org.jooq.impl.SQLDataType.VARCHAR(1024), this, "객관식 보기4");

    /**
     * The column <code>haaim_db.exam_item.choice5</code>. 객관식 보기5
     */
    public final TableField<JExamItemRecord, String> CHOICE5 = createField(DSL.name("choice5"), org.jooq.impl.SQLDataType.VARCHAR(1024), this, "객관식 보기5");

    /**
     * The column <code>haaim_db.exam_item.file_path</code>.
     */
    public final TableField<JExamItemRecord, String> FILE_PATH = createField(DSL.name("file_path"), org.jooq.impl.SQLDataType.VARCHAR(500), this, "");

    /**
     * The column <code>haaim_db.exam_item.mark_type</code>. 채점 방법(자동/수동)
     */
    public final TableField<JExamItemRecord, Integer> MARK_TYPE = createField(DSL.name("mark_type"), org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "채점 방법(자동/수동)");

    /**
     * The column <code>haaim_db.exam_item.answer</code>. 주관식 답
     */
    public final TableField<JExamItemRecord, String> ANSWER = createField(DSL.name("answer"), org.jooq.impl.SQLDataType.VARCHAR(1024), this, "주관식 답");

    /**
     * The column <code>haaim_db.exam_item.answer_path</code>. 주관식 답 image
     */
    public final TableField<JExamItemRecord, String> ANSWER_PATH = createField(DSL.name("answer_path"), org.jooq.impl.SQLDataType.VARCHAR(500), this, "주관식 답 image");

    /**
     * The column <code>haaim_db.exam_item.input_id</code>.
     */
    public final TableField<JExamItemRecord, String> INPUT_ID = createField(DSL.name("input_id"), org.jooq.impl.SQLDataType.VARCHAR(45).nullable(false), this, "");

    /**
     * The column <code>haaim_db.exam_item.input_date</code>.
     */
    public final TableField<JExamItemRecord, LocalDateTime> INPUT_DATE = createField(DSL.name("input_date"), org.jooq.impl.SQLDataType.LOCALDATETIME.nullable(false), this, "");

    /**
     * The column <code>haaim_db.exam_item.update_id</code>.
     */
    public final TableField<JExamItemRecord, String> UPDATE_ID = createField(DSL.name("update_id"), org.jooq.impl.SQLDataType.VARCHAR(45), this, "");

    /**
     * The column <code>haaim_db.exam_item.update_date</code>.
     */
    public final TableField<JExamItemRecord, LocalDateTime> UPDATE_DATE = createField(DSL.name("update_date"), org.jooq.impl.SQLDataType.LOCALDATETIME, this, "");

    /**
     * Create a <code>haaim_db.exam_item</code> table reference
     */
    public JExamItem() {
        this(DSL.name("exam_item"), null);
    }

    /**
     * Create an aliased <code>haaim_db.exam_item</code> table reference
     */
    public JExamItem(String alias) {
        this(DSL.name(alias), EXAM_ITEM);
    }

    /**
     * Create an aliased <code>haaim_db.exam_item</code> table reference
     */
    public JExamItem(Name alias) {
        this(alias, EXAM_ITEM);
    }

    private JExamItem(Name alias, Table<JExamItemRecord> aliased) {
        this(alias, aliased, null);
    }

    private JExamItem(Name alias, Table<JExamItemRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("문제출제"), TableOptions.table());
    }

    public <O extends Record> JExamItem(Table<O> child, ForeignKey<O, JExamItemRecord> key) {
        super(child, key, EXAM_ITEM);
    }

    @Override
    public Schema getSchema() {
        return JHaaimDb.HAAIM_DB;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.EXAM_ITEM_FK_EXAM_ITEM_EXAM_LIST1_IDX, Indexes.EXAM_ITEM_FK_EXAM_ITEM_ITEM_POOL1_IDX);
    }

    @Override
    public UniqueKey<JExamItemRecord> getPrimaryKey() {
        return Keys.KEY_EXAM_ITEM_PRIMARY;
    }

    @Override
    public List<UniqueKey<JExamItemRecord>> getKeys() {
        return Arrays.<UniqueKey<JExamItemRecord>>asList(Keys.KEY_EXAM_ITEM_PRIMARY);
    }

    @Override
    public JExamItem as(String alias) {
        return new JExamItem(DSL.name(alias), this);
    }

    @Override
    public JExamItem as(Name alias) {
        return new JExamItem(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public JExamItem rename(String name) {
        return new JExamItem(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public JExamItem rename(Name name) {
        return new JExamItem(name, null);
    }

    // -------------------------------------------------------------------------
    // Row18 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row18<Integer, Integer, Integer, Integer, String, String, String, String, String, String, String, Integer, String, String, String, LocalDateTime, String, LocalDateTime> fieldsRow() {
        return (Row18) super.fieldsRow();
    }
}
