/*
 * This file is generated by jOOQ.
 */
package net.haaim.web.jooq.entity.tables;


import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

import net.haaim.web.jooq.entity.JHaaimDb;
import net.haaim.web.jooq.entity.Keys;
import net.haaim.web.jooq.entity.tables.records.JCodeRecord;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row9;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


/**
 * 코드
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class JCode extends TableImpl<JCodeRecord> {

    private static final long serialVersionUID = 2053689546;

    /**
     * The reference instance of <code>haaim_db.code</code>
     */
    public static final JCode CODE = new JCode();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<JCodeRecord> getRecordType() {
        return JCodeRecord.class;
    }

    /**
     * The column <code>haaim_db.code.no</code>.
     */
    public final TableField<JCodeRecord, Integer> NO = createField(DSL.name("no"), org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>haaim_db.code.group_code</code>. 그룹코드
     */
    public final TableField<JCodeRecord, String> GROUP_CODE = createField(DSL.name("group_code"), org.jooq.impl.SQLDataType.VARCHAR(20).nullable(false), this, "그룹코드");

    /**
     * The column <code>haaim_db.code.code</code>. 코드
     */
    public final TableField<JCodeRecord, String> CODE_ = createField(DSL.name("code"), org.jooq.impl.SQLDataType.VARCHAR(20).nullable(false), this, "코드");

    /**
     * The column <code>haaim_db.code.code_name</code>. 코드명
     */
    public final TableField<JCodeRecord, String> CODE_NAME = createField(DSL.name("code_name"), org.jooq.impl.SQLDataType.VARCHAR(100).nullable(false), this, "코드명");

    /**
     * The column <code>haaim_db.code.use_yn</code>. 사용여부
     */
    public final TableField<JCodeRecord, Integer> USE_YN = createField(DSL.name("use_yn"), org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "사용여부");

    /**
     * The column <code>haaim_db.code.input_id</code>.
     */
    public final TableField<JCodeRecord, String> INPUT_ID = createField(DSL.name("input_id"), org.jooq.impl.SQLDataType.VARCHAR(45).nullable(false), this, "");

    /**
     * The column <code>haaim_db.code.input_date</code>.
     */
    public final TableField<JCodeRecord, LocalDateTime> INPUT_DATE = createField(DSL.name("input_date"), org.jooq.impl.SQLDataType.LOCALDATETIME.nullable(false), this, "");

    /**
     * The column <code>haaim_db.code.update_id</code>.
     */
    public final TableField<JCodeRecord, String> UPDATE_ID = createField(DSL.name("update_id"), org.jooq.impl.SQLDataType.VARCHAR(45), this, "");

    /**
     * The column <code>haaim_db.code.update_date</code>.
     */
    public final TableField<JCodeRecord, LocalDateTime> UPDATE_DATE = createField(DSL.name("update_date"), org.jooq.impl.SQLDataType.LOCALDATETIME, this, "");

    /**
     * Create a <code>haaim_db.code</code> table reference
     */
    public JCode() {
        this(DSL.name("code"), null);
    }

    /**
     * Create an aliased <code>haaim_db.code</code> table reference
     */
    public JCode(String alias) {
        this(DSL.name(alias), CODE);
    }

    /**
     * Create an aliased <code>haaim_db.code</code> table reference
     */
    public JCode(Name alias) {
        this(alias, CODE);
    }

    private JCode(Name alias, Table<JCodeRecord> aliased) {
        this(alias, aliased, null);
    }

    private JCode(Name alias, Table<JCodeRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("코드"), TableOptions.table());
    }

    public <O extends Record> JCode(Table<O> child, ForeignKey<O, JCodeRecord> key) {
        super(child, key, CODE);
    }

    @Override
    public Schema getSchema() {
        return JHaaimDb.HAAIM_DB;
    }

    @Override
    public Identity<JCodeRecord, Integer> getIdentity() {
        return Keys.IDENTITY_CODE;
    }

    @Override
    public UniqueKey<JCodeRecord> getPrimaryKey() {
        return Keys.KEY_CODE_PRIMARY;
    }

    @Override
    public List<UniqueKey<JCodeRecord>> getKeys() {
        return Arrays.<UniqueKey<JCodeRecord>>asList(Keys.KEY_CODE_PRIMARY);
    }

    @Override
    public JCode as(String alias) {
        return new JCode(DSL.name(alias), this);
    }

    @Override
    public JCode as(Name alias) {
        return new JCode(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public JCode rename(String name) {
        return new JCode(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public JCode rename(Name name) {
        return new JCode(name, null);
    }

    // -------------------------------------------------------------------------
    // Row9 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row9<Integer, String, String, String, Integer, String, LocalDateTime, String, LocalDateTime> fieldsRow() {
        return (Row9) super.fieldsRow();
    }
}
