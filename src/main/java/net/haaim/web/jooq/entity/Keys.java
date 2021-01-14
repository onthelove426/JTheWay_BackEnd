/*
 * This file is generated by jOOQ.
 */
package net.haaim.web.jooq.entity;


import net.haaim.web.jooq.entity.tables.JAuthority;
import net.haaim.web.jooq.entity.tables.JClass;
import net.haaim.web.jooq.entity.tables.JClassCurriculum;
import net.haaim.web.jooq.entity.tables.JClassStudent;
import net.haaim.web.jooq.entity.tables.JCode;
import net.haaim.web.jooq.entity.tables.JCurriculum;
import net.haaim.web.jooq.entity.tables.JExamList;
import net.haaim.web.jooq.entity.tables.JGroupCode;
import net.haaim.web.jooq.entity.tables.JItemPool;
import net.haaim.web.jooq.entity.tables.JMenu;
import net.haaim.web.jooq.entity.tables.JMonthlyReport;
import net.haaim.web.jooq.entity.tables.JNotice;
import net.haaim.web.jooq.entity.tables.JScoreMngt;
import net.haaim.web.jooq.entity.tables.JStudentInfo;
import net.haaim.web.jooq.entity.tables.JUser;
import net.haaim.web.jooq.entity.tables.records.JAuthorityRecord;
import net.haaim.web.jooq.entity.tables.records.JClassCurriculumRecord;
import net.haaim.web.jooq.entity.tables.records.JClassRecord;
import net.haaim.web.jooq.entity.tables.records.JClassStudentRecord;
import net.haaim.web.jooq.entity.tables.records.JCodeRecord;
import net.haaim.web.jooq.entity.tables.records.JCurriculumRecord;
import net.haaim.web.jooq.entity.tables.records.JExamListRecord;
import net.haaim.web.jooq.entity.tables.records.JGroupCodeRecord;
import net.haaim.web.jooq.entity.tables.records.JItemPoolRecord;
import net.haaim.web.jooq.entity.tables.records.JMenuRecord;
import net.haaim.web.jooq.entity.tables.records.JMonthlyReportRecord;
import net.haaim.web.jooq.entity.tables.records.JNoticeRecord;
import net.haaim.web.jooq.entity.tables.records.JScoreMngtRecord;
import net.haaim.web.jooq.entity.tables.records.JStudentInfoRecord;
import net.haaim.web.jooq.entity.tables.records.JUserRecord;

import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.Internal;


/**
 * A class modelling foreign key relationships and constraints of tables of 
 * the <code>haaim_db</code> schema.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Keys {

    // -------------------------------------------------------------------------
    // IDENTITY definitions
    // -------------------------------------------------------------------------

    public static final Identity<JClassRecord, Integer> IDENTITY_CLASS = Identities0.IDENTITY_CLASS;
    public static final Identity<JClassCurriculumRecord, Integer> IDENTITY_CLASS_CURRICULUM = Identities0.IDENTITY_CLASS_CURRICULUM;
    public static final Identity<JClassStudentRecord, Integer> IDENTITY_CLASS_STUDENT = Identities0.IDENTITY_CLASS_STUDENT;
    public static final Identity<JCodeRecord, Integer> IDENTITY_CODE = Identities0.IDENTITY_CODE;
    public static final Identity<JCurriculumRecord, Integer> IDENTITY_CURRICULUM = Identities0.IDENTITY_CURRICULUM;
    public static final Identity<JExamListRecord, Integer> IDENTITY_EXAM_LIST = Identities0.IDENTITY_EXAM_LIST;
    public static final Identity<JGroupCodeRecord, Integer> IDENTITY_GROUP_CODE = Identities0.IDENTITY_GROUP_CODE;
    public static final Identity<JItemPoolRecord, Integer> IDENTITY_ITEM_POOL = Identities0.IDENTITY_ITEM_POOL;
    public static final Identity<JMonthlyReportRecord, Integer> IDENTITY_MONTHLY_REPORT = Identities0.IDENTITY_MONTHLY_REPORT;
    public static final Identity<JNoticeRecord, Integer> IDENTITY_NOTICE = Identities0.IDENTITY_NOTICE;
    public static final Identity<JScoreMngtRecord, Integer> IDENTITY_SCORE_MNGT = Identities0.IDENTITY_SCORE_MNGT;
    public static final Identity<JUserRecord, Integer> IDENTITY_USER = Identities0.IDENTITY_USER;

    // -------------------------------------------------------------------------
    // UNIQUE and PRIMARY KEY definitions
    // -------------------------------------------------------------------------

    public static final UniqueKey<JAuthorityRecord> KEY_AUTHORITY_PRIMARY = UniqueKeys0.KEY_AUTHORITY_PRIMARY;
    public static final UniqueKey<JClassRecord> KEY_CLASS_PRIMARY = UniqueKeys0.KEY_CLASS_PRIMARY;
    public static final UniqueKey<JClassCurriculumRecord> KEY_CLASS_CURRICULUM_PRIMARY = UniqueKeys0.KEY_CLASS_CURRICULUM_PRIMARY;
    public static final UniqueKey<JClassStudentRecord> KEY_CLASS_STUDENT_PRIMARY = UniqueKeys0.KEY_CLASS_STUDENT_PRIMARY;
    public static final UniqueKey<JCodeRecord> KEY_CODE_PRIMARY = UniqueKeys0.KEY_CODE_PRIMARY;
    public static final UniqueKey<JCurriculumRecord> KEY_CURRICULUM_PRIMARY = UniqueKeys0.KEY_CURRICULUM_PRIMARY;
    public static final UniqueKey<JExamListRecord> KEY_EXAM_LIST_PRIMARY = UniqueKeys0.KEY_EXAM_LIST_PRIMARY;
    public static final UniqueKey<JGroupCodeRecord> KEY_GROUP_CODE_PRIMARY = UniqueKeys0.KEY_GROUP_CODE_PRIMARY;
    public static final UniqueKey<JItemPoolRecord> KEY_ITEM_POOL_PRIMARY = UniqueKeys0.KEY_ITEM_POOL_PRIMARY;
    public static final UniqueKey<JMenuRecord> KEY_MENU_PRIMARY = UniqueKeys0.KEY_MENU_PRIMARY;
    public static final UniqueKey<JMonthlyReportRecord> KEY_MONTHLY_REPORT_PRIMARY = UniqueKeys0.KEY_MONTHLY_REPORT_PRIMARY;
    public static final UniqueKey<JNoticeRecord> KEY_NOTICE_PRIMARY = UniqueKeys0.KEY_NOTICE_PRIMARY;
    public static final UniqueKey<JScoreMngtRecord> KEY_SCORE_MNGT_PRIMARY = UniqueKeys0.KEY_SCORE_MNGT_PRIMARY;
    public static final UniqueKey<JStudentInfoRecord> KEY_STUDENT_INFO_PRIMARY = UniqueKeys0.KEY_STUDENT_INFO_PRIMARY;
    public static final UniqueKey<JUserRecord> KEY_USER_PRIMARY = UniqueKeys0.KEY_USER_PRIMARY;

    // -------------------------------------------------------------------------
    // FOREIGN KEY definitions
    // -------------------------------------------------------------------------

    public static final ForeignKey<JUserRecord, JStudentInfoRecord> USER_IBFK_1 = ForeignKeys0.USER_IBFK_1;

    // -------------------------------------------------------------------------
    // [#1459] distribute members to avoid static initialisers > 64kb
    // -------------------------------------------------------------------------

    private static class Identities0 {
        public static Identity<JClassRecord, Integer> IDENTITY_CLASS = Internal.createIdentity(JClass.CLASS, JClass.CLASS.CLASS_NO);
        public static Identity<JClassCurriculumRecord, Integer> IDENTITY_CLASS_CURRICULUM = Internal.createIdentity(JClassCurriculum.CLASS_CURRICULUM, JClassCurriculum.CLASS_CURRICULUM.NO);
        public static Identity<JClassStudentRecord, Integer> IDENTITY_CLASS_STUDENT = Internal.createIdentity(JClassStudent.CLASS_STUDENT, JClassStudent.CLASS_STUDENT.NO);
        public static Identity<JCodeRecord, Integer> IDENTITY_CODE = Internal.createIdentity(JCode.CODE, JCode.CODE.NO);
        public static Identity<JCurriculumRecord, Integer> IDENTITY_CURRICULUM = Internal.createIdentity(JCurriculum.CURRICULUM, JCurriculum.CURRICULUM.NO);
        public static Identity<JExamListRecord, Integer> IDENTITY_EXAM_LIST = Internal.createIdentity(JExamList.EXAM_LIST, JExamList.EXAM_LIST.EXAM_NO);
        public static Identity<JGroupCodeRecord, Integer> IDENTITY_GROUP_CODE = Internal.createIdentity(JGroupCode.GROUP_CODE, JGroupCode.GROUP_CODE.NO);
        public static Identity<JItemPoolRecord, Integer> IDENTITY_ITEM_POOL = Internal.createIdentity(JItemPool.ITEM_POOL, JItemPool.ITEM_POOL.ITEM_NO);
        public static Identity<JMonthlyReportRecord, Integer> IDENTITY_MONTHLY_REPORT = Internal.createIdentity(JMonthlyReport.MONTHLY_REPORT, JMonthlyReport.MONTHLY_REPORT.NO);
        public static Identity<JNoticeRecord, Integer> IDENTITY_NOTICE = Internal.createIdentity(JNotice.NOTICE, JNotice.NOTICE.NO);
        public static Identity<JScoreMngtRecord, Integer> IDENTITY_SCORE_MNGT = Internal.createIdentity(JScoreMngt.SCORE_MNGT, JScoreMngt.SCORE_MNGT.NO);
        public static Identity<JUserRecord, Integer> IDENTITY_USER = Internal.createIdentity(JUser.USER, JUser.USER.NO);
    }

    private static class UniqueKeys0 {
        public static final UniqueKey<JAuthorityRecord> KEY_AUTHORITY_PRIMARY = Internal.createUniqueKey(JAuthority.AUTHORITY, "KEY_authority_PRIMARY", new TableField[] { JAuthority.AUTHORITY.MENU_CODE, JAuthority.AUTHORITY.USER_TYPE }, true);
        public static final UniqueKey<JClassRecord> KEY_CLASS_PRIMARY = Internal.createUniqueKey(JClass.CLASS, "KEY_class_PRIMARY", new TableField[] { JClass.CLASS.CLASS_NO }, true);
        public static final UniqueKey<JClassCurriculumRecord> KEY_CLASS_CURRICULUM_PRIMARY = Internal.createUniqueKey(JClassCurriculum.CLASS_CURRICULUM, "KEY_class_curriculum_PRIMARY", new TableField[] { JClassCurriculum.CLASS_CURRICULUM.NO }, true);
        public static final UniqueKey<JClassStudentRecord> KEY_CLASS_STUDENT_PRIMARY = Internal.createUniqueKey(JClassStudent.CLASS_STUDENT, "KEY_class_student_PRIMARY", new TableField[] { JClassStudent.CLASS_STUDENT.NO }, true);
        public static final UniqueKey<JCodeRecord> KEY_CODE_PRIMARY = Internal.createUniqueKey(JCode.CODE, "KEY_code_PRIMARY", new TableField[] { JCode.CODE.NO }, true);
        public static final UniqueKey<JCurriculumRecord> KEY_CURRICULUM_PRIMARY = Internal.createUniqueKey(JCurriculum.CURRICULUM, "KEY_curriculum_PRIMARY", new TableField[] { JCurriculum.CURRICULUM.NO }, true);
        public static final UniqueKey<JExamListRecord> KEY_EXAM_LIST_PRIMARY = Internal.createUniqueKey(JExamList.EXAM_LIST, "KEY_exam_list_PRIMARY", new TableField[] { JExamList.EXAM_LIST.EXAM_NO }, true);
        public static final UniqueKey<JGroupCodeRecord> KEY_GROUP_CODE_PRIMARY = Internal.createUniqueKey(JGroupCode.GROUP_CODE, "KEY_group_code_PRIMARY", new TableField[] { JGroupCode.GROUP_CODE.NO }, true);
        public static final UniqueKey<JItemPoolRecord> KEY_ITEM_POOL_PRIMARY = Internal.createUniqueKey(JItemPool.ITEM_POOL, "KEY_item_pool_PRIMARY", new TableField[] { JItemPool.ITEM_POOL.ITEM_NO }, true);
        public static final UniqueKey<JMenuRecord> KEY_MENU_PRIMARY = Internal.createUniqueKey(JMenu.MENU, "KEY_menu_PRIMARY", new TableField[] { JMenu.MENU.MENU_CODE }, true);
        public static final UniqueKey<JMonthlyReportRecord> KEY_MONTHLY_REPORT_PRIMARY = Internal.createUniqueKey(JMonthlyReport.MONTHLY_REPORT, "KEY_monthly_report_PRIMARY", new TableField[] { JMonthlyReport.MONTHLY_REPORT.NO }, true);
        public static final UniqueKey<JNoticeRecord> KEY_NOTICE_PRIMARY = Internal.createUniqueKey(JNotice.NOTICE, "KEY_notice_PRIMARY", new TableField[] { JNotice.NOTICE.NO }, true);
        public static final UniqueKey<JScoreMngtRecord> KEY_SCORE_MNGT_PRIMARY = Internal.createUniqueKey(JScoreMngt.SCORE_MNGT, "KEY_score_mngt_PRIMARY", new TableField[] { JScoreMngt.SCORE_MNGT.NO }, true);
        public static final UniqueKey<JStudentInfoRecord> KEY_STUDENT_INFO_PRIMARY = Internal.createUniqueKey(JStudentInfo.STUDENT_INFO, "KEY_student_info_PRIMARY", new TableField[] { JStudentInfo.STUDENT_INFO.STUDENT_NO }, true);
        public static final UniqueKey<JUserRecord> KEY_USER_PRIMARY = Internal.createUniqueKey(JUser.USER, "KEY_user_PRIMARY", new TableField[] { JUser.USER.NO }, true);
    }

    private static class ForeignKeys0 {
        public static final ForeignKey<JUserRecord, JStudentInfoRecord> USER_IBFK_1 = Internal.createForeignKey(Keys.KEY_STUDENT_INFO_PRIMARY, JUser.USER, "user_ibfk_1", new TableField[] { JUser.USER.STUDENT_NO }, true);
    }
}
