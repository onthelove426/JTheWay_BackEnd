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
import net.haaim.web.jooq.entity.tables.records.JUserRecord;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Index;
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
 * 사용자
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class JUser extends TableImpl<JUserRecord> {

    private static final long serialVersionUID = -1122980187;

    /**
     * The reference instance of <code>haaim_db.user</code>
     */
    public static final JUser USER = new JUser();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<JUserRecord> getRecordType() {
        return JUserRecord.class;
    }

    /**
     * The column <code>haaim_db.user.no</code>.
     */
    public final TableField<JUserRecord, Integer> NO = createField(DSL.name("no"), org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>haaim_db.user.user_id</code>.
     */
    public final TableField<JUserRecord, String> USER_ID = createField(DSL.name("user_id"), org.jooq.impl.SQLDataType.VARCHAR(45).nullable(false), this, "");

    /**
     * The column <code>haaim_db.user.user_pw</code>.
     */
    public final TableField<JUserRecord, String> USER_PW = createField(DSL.name("user_pw"), org.jooq.impl.SQLDataType.VARCHAR(200).nullable(false), this, "");

    /**
     * The column <code>haaim_db.user.user_type</code>. 사용자의구분/권한 ( 4:관리자/3:원장/2:교사/1:코디/0:학생)
     */
    public final TableField<JUserRecord, Integer> USER_TYPE = createField(DSL.name("user_type"), org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "사용자의구분/권한 ( 4:관리자/3:원장/2:교사/1:코디/0:학생)");

    /**
     * The column <code>haaim_db.user.use_yn</code>. 사용여부
     */
    public final TableField<JUserRecord, Integer> USE_YN = createField(DSL.name("use_yn"), org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "사용여부");

    /**
     * The column <code>haaim_db.user.name</code>.
     */
    public final TableField<JUserRecord, String> NAME = createField(DSL.name("name"), org.jooq.impl.SQLDataType.VARCHAR(20), this, "");

    /**
     * The column <code>haaim_db.user.mobile</code>.
     */
    public final TableField<JUserRecord, String> MOBILE = createField(DSL.name("mobile"), org.jooq.impl.SQLDataType.VARCHAR(15), this, "");

    /**
     * The column <code>haaim_db.user.email</code>.
     */
    public final TableField<JUserRecord, String> EMAIL = createField(DSL.name("email"), org.jooq.impl.SQLDataType.VARCHAR(200), this, "");

    /**
     * The column <code>haaim_db.user.student_no</code>.
     */
    public final TableField<JUserRecord, Integer> STUDENT_NO = createField(DSL.name("student_no"), org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>haaim_db.user.state</code>.
     */
    public final TableField<JUserRecord, Integer> STATE = createField(DSL.name("state"), org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>haaim_db.user.input_id</code>.
     */
    public final TableField<JUserRecord, String> INPUT_ID = createField(DSL.name("input_id"), org.jooq.impl.SQLDataType.VARCHAR(45).nullable(false), this, "");

    /**
     * The column <code>haaim_db.user.input_date</code>.
     */
    public final TableField<JUserRecord, LocalDateTime> INPUT_DATE = createField(DSL.name("input_date"), org.jooq.impl.SQLDataType.LOCALDATETIME.nullable(false), this, "");

    /**
     * The column <code>haaim_db.user.update_id</code>.
     */
    public final TableField<JUserRecord, String> UPDATE_ID = createField(DSL.name("update_id"), org.jooq.impl.SQLDataType.VARCHAR(45), this, "");

    /**
     * The column <code>haaim_db.user.update_date</code>.
     */
    public final TableField<JUserRecord, LocalDateTime> UPDATE_DATE = createField(DSL.name("update_date"), org.jooq.impl.SQLDataType.LOCALDATETIME, this, "");

    /**
     * Create a <code>haaim_db.user</code> table reference
     */
    public JUser() {
        this(DSL.name("user"), null);
    }

    /**
     * Create an aliased <code>haaim_db.user</code> table reference
     */
    public JUser(String alias) {
        this(DSL.name(alias), USER);
    }

    /**
     * Create an aliased <code>haaim_db.user</code> table reference
     */
    public JUser(Name alias) {
        this(alias, USER);
    }

    private JUser(Name alias, Table<JUserRecord> aliased) {
        this(alias, aliased, null);
    }

    private JUser(Name alias, Table<JUserRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("사용자"), TableOptions.table());
    }

    public <O extends Record> JUser(Table<O> child, ForeignKey<O, JUserRecord> key) {
        super(child, key, USER);
    }

    @Override
    public Schema getSchema() {
        return JHaaimDb.HAAIM_DB;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.USER_STUDENT_NO);
    }

    @Override
    public Identity<JUserRecord, Integer> getIdentity() {
        return Keys.IDENTITY_USER;
    }

    @Override
    public UniqueKey<JUserRecord> getPrimaryKey() {
        return Keys.KEY_USER_PRIMARY;
    }

    @Override
    public List<UniqueKey<JUserRecord>> getKeys() {
        return Arrays.<UniqueKey<JUserRecord>>asList(Keys.KEY_USER_PRIMARY);
    }

    @Override
    public List<ForeignKey<JUserRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<JUserRecord, ?>>asList(Keys.USER_IBFK_1);
    }

    public JStudentInfo studentInfo() {
        return new JStudentInfo(this, Keys.USER_IBFK_1);
    }

    @Override
    public JUser as(String alias) {
        return new JUser(DSL.name(alias), this);
    }

    @Override
    public JUser as(Name alias) {
        return new JUser(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public JUser rename(String name) {
        return new JUser(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public JUser rename(Name name) {
        return new JUser(name, null);
    }

    // -------------------------------------------------------------------------
    // Row14 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row14<Integer, String, String, Integer, Integer, String, String, String, Integer, Integer, String, LocalDateTime, String, LocalDateTime> fieldsRow() {
        return (Row14) super.fieldsRow();
    }
}
