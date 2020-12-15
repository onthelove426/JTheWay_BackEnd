/*
 * This file is generated by jOOQ.
 */
package net.haaim.web.jooq.entity.tables;


import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

import net.haaim.web.jooq.entity.JHaaimDb;
import net.haaim.web.jooq.entity.Keys;
import net.haaim.web.jooq.entity.tables.records.JClassCurriculumRecord;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row7;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


/**
 * 클래스&amp;커리큘럼 매핑
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class JClassCurriculum extends TableImpl<JClassCurriculumRecord> {

    private static final long serialVersionUID = -362758262;

    /**
     * The reference instance of <code>haaim_db.class_curriculum</code>
     */
    public static final JClassCurriculum CLASS_CURRICULUM = new JClassCurriculum();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<JClassCurriculumRecord> getRecordType() {
        return JClassCurriculumRecord.class;
    }

    /**
     * The column <code>haaim_db.class_curriculum.no</code>.
     */
    public final TableField<JClassCurriculumRecord, Integer> NO = createField(DSL.name("no"), org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>haaim_db.class_curriculum.class_no</code>. 클래스번호
     */
    public final TableField<JClassCurriculumRecord, Integer> CLASS_NO = createField(DSL.name("class_no"), org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "클래스번호");

    /**
     * The column <code>haaim_db.class_curriculum.cur_id</code>. 컬리큘럼ID
     */
    public final TableField<JClassCurriculumRecord, Integer> CUR_ID = createField(DSL.name("cur_id"), org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "컬리큘럼ID");

    /**
     * The column <code>haaim_db.class_curriculum.input_id</code>.
     */
    public final TableField<JClassCurriculumRecord, String> INPUT_ID = createField(DSL.name("input_id"), org.jooq.impl.SQLDataType.VARCHAR(45), this, "");

    /**
     * The column <code>haaim_db.class_curriculum.input_date</code>.
     */
    public final TableField<JClassCurriculumRecord, LocalDateTime> INPUT_DATE = createField(DSL.name("input_date"), org.jooq.impl.SQLDataType.LOCALDATETIME, this, "");

    /**
     * The column <code>haaim_db.class_curriculum.update_id</code>.
     */
    public final TableField<JClassCurriculumRecord, String> UPDATE_ID = createField(DSL.name("update_id"), org.jooq.impl.SQLDataType.VARCHAR(45), this, "");

    /**
     * The column <code>haaim_db.class_curriculum.update_date</code>.
     */
    public final TableField<JClassCurriculumRecord, LocalDateTime> UPDATE_DATE = createField(DSL.name("update_date"), org.jooq.impl.SQLDataType.LOCALDATETIME, this, "");

    /**
     * Create a <code>haaim_db.class_curriculum</code> table reference
     */
    public JClassCurriculum() {
        this(DSL.name("class_curriculum"), null);
    }

    /**
     * Create an aliased <code>haaim_db.class_curriculum</code> table reference
     */
    public JClassCurriculum(String alias) {
        this(DSL.name(alias), CLASS_CURRICULUM);
    }

    /**
     * Create an aliased <code>haaim_db.class_curriculum</code> table reference
     */
    public JClassCurriculum(Name alias) {
        this(alias, CLASS_CURRICULUM);
    }

    private JClassCurriculum(Name alias, Table<JClassCurriculumRecord> aliased) {
        this(alias, aliased, null);
    }

    private JClassCurriculum(Name alias, Table<JClassCurriculumRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("클래스&커리큘럼 매핑"), TableOptions.table());
    }

    public <O extends Record> JClassCurriculum(Table<O> child, ForeignKey<O, JClassCurriculumRecord> key) {
        super(child, key, CLASS_CURRICULUM);
    }

    @Override
    public Schema getSchema() {
        return JHaaimDb.HAAIM_DB;
    }

    @Override
    public Identity<JClassCurriculumRecord, Integer> getIdentity() {
        return Keys.IDENTITY_CLASS_CURRICULUM;
    }

    @Override
    public UniqueKey<JClassCurriculumRecord> getPrimaryKey() {
        return Keys.KEY_CLASS_CURRICULUM_PRIMARY;
    }

    @Override
    public List<UniqueKey<JClassCurriculumRecord>> getKeys() {
        return Arrays.<UniqueKey<JClassCurriculumRecord>>asList(Keys.KEY_CLASS_CURRICULUM_PRIMARY);
    }

    @Override
    public JClassCurriculum as(String alias) {
        return new JClassCurriculum(DSL.name(alias), this);
    }

    @Override
    public JClassCurriculum as(Name alias) {
        return new JClassCurriculum(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public JClassCurriculum rename(String name) {
        return new JClassCurriculum(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public JClassCurriculum rename(Name name) {
        return new JClassCurriculum(name, null);
    }

    // -------------------------------------------------------------------------
    // Row7 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row7<Integer, Integer, Integer, String, LocalDateTime, String, LocalDateTime> fieldsRow() {
        return (Row7) super.fieldsRow();
    }
}
