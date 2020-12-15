/*
 * This file is generated by jOOQ.
 */
package net.haaim.web.jooq.entity;


import java.util.Arrays;
import java.util.List;

import net.haaim.web.jooq.entity.tables.JAuthority;
import net.haaim.web.jooq.entity.tables.JClass;
import net.haaim.web.jooq.entity.tables.JClassCurriculum;
import net.haaim.web.jooq.entity.tables.JClassStudent;
import net.haaim.web.jooq.entity.tables.JCode;
import net.haaim.web.jooq.entity.tables.JCurriculum;
import net.haaim.web.jooq.entity.tables.JExamList;
import net.haaim.web.jooq.entity.tables.JGroupCode;
import net.haaim.web.jooq.entity.tables.JMenu;
import net.haaim.web.jooq.entity.tables.JMonthlyReport;
import net.haaim.web.jooq.entity.tables.JNotice;
import net.haaim.web.jooq.entity.tables.JScoreMngt;
import net.haaim.web.jooq.entity.tables.JStudentInfo;
import net.haaim.web.jooq.entity.tables.JUser;

import org.jooq.Catalog;
import org.jooq.Table;
import org.jooq.impl.SchemaImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class JHaaimDb extends SchemaImpl {

    private static final long serialVersionUID = -621203960;

    /**
     * The reference instance of <code>haaim_db</code>
     */
    public static final JHaaimDb HAAIM_DB = new JHaaimDb();

    /**
     * 메뉴권한관리
     */
    public final JAuthority AUTHORITY = JAuthority.AUTHORITY;

    /**
     * 수업관리
     */
    public final JClass CLASS = JClass.CLASS;

    /**
     * 클래스&amp;커리큘럼 매핑
     */
    public final JClassCurriculum CLASS_CURRICULUM = JClassCurriculum.CLASS_CURRICULUM;

    /**
     * 클래스&amp;학생 매핑정보
     */
    public final JClassStudent CLASS_STUDENT = JClassStudent.CLASS_STUDENT;

    /**
     * 코드
     */
    public final JCode CODE = JCode.CODE;

    /**
     * 커리큘럼
     */
    public final JCurriculum CURRICULUM = JCurriculum.CURRICULUM;

    /**
     * 문제출제목록
     */
    public final JExamList EXAM_LIST = JExamList.EXAM_LIST;

    /**
     * 코드 그룹
     */
    public final JGroupCode GROUP_CODE = JGroupCode.GROUP_CODE;

    /**
     * 메뉴
     */
    public final JMenu MENU = JMenu.MENU;

    /**
     * 월간리포트
     */
    public final JMonthlyReport MONTHLY_REPORT = JMonthlyReport.MONTHLY_REPORT;

    /**
     * 공지사항
     */
    public final JNotice NOTICE = JNotice.NOTICE;

    /**
     * 시험점수관리(중간/기말/모의고사/수능점수)
     */
    public final JScoreMngt SCORE_MNGT = JScoreMngt.SCORE_MNGT;

    /**
     * 학생정보
     */
    public final JStudentInfo STUDENT_INFO = JStudentInfo.STUDENT_INFO;

    /**
     * 사용자
     */
    public final JUser USER = JUser.USER;

    /**
     * No further instances allowed
     */
    private JHaaimDb() {
        super("haaim_db", null);
    }


    @Override
    public Catalog getCatalog() {
        return DefaultCatalog.DEFAULT_CATALOG;
    }

    @Override
    public final List<Table<?>> getTables() {
        return Arrays.<Table<?>>asList(
            JAuthority.AUTHORITY,
            JClass.CLASS,
            JClassCurriculum.CLASS_CURRICULUM,
            JClassStudent.CLASS_STUDENT,
            JCode.CODE,
            JCurriculum.CURRICULUM,
            JExamList.EXAM_LIST,
            JGroupCode.GROUP_CODE,
            JMenu.MENU,
            JMonthlyReport.MONTHLY_REPORT,
            JNotice.NOTICE,
            JScoreMngt.SCORE_MNGT,
            JStudentInfo.STUDENT_INFO,
            JUser.USER);
    }
}
