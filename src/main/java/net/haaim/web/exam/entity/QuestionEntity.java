package net.haaim.web.exam.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import net.haaim.web.common.entity.CommonEntity;

@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
public class QuestionEntity extends CommonEntity {
	
	//출제번호 exam_list
	@Column(name = "exam_no")
	@JsonProperty(access = JsonProperty.Access.AUTO)
	private Integer examNo;
	
	@Column(name = "class_no")
	@JsonProperty(access = JsonProperty.Access.AUTO)
	private Integer classNo;
	
	@Column(name = "year", nullable = true, unique = false, length = 4)
	@JsonProperty(access = JsonProperty.Access.AUTO)
	private Integer year;
	
	@Column(name = "grade", nullable = true, unique = false, length = 2)
	@JsonProperty(access = JsonProperty.Access.AUTO)
	private Integer grade;
	
	@Column(name = "course", nullable = true, unique = false, length = 4)
	@JsonProperty(access = JsonProperty.Access.AUTO)
	private Integer course;
	
	@Column(name = "large_category", nullable = true, unique = false)
	@JsonProperty(access = JsonProperty.Access.AUTO)
	private String largeCategory = null;
	
	@Column(name = "medium_category", nullable = true, unique = false)
	@JsonProperty(access = JsonProperty.Access.AUTO)
	private String mediumCategory = null;
	
	//출제일자 exam_list
	@Column(name = "date")
	@JsonProperty(access = JsonProperty.Access.AUTO)
	private String date; 	
	
	//문항수
	@Column(name = "count")
	@JsonProperty(access = JsonProperty.Access.AUTO)
	private Integer count;

	//응시여부(1-응시, 0-미응시)
	@Column(name = "stare")
	@JsonProperty(access = JsonProperty.Access.AUTO)
	private Integer stare;

	//응시점수
	@Column(name = "stare_score")
	@JsonProperty(access = JsonProperty.Access.AUTO)
	private Integer stareScore;
	
	//응시 일자
	@Column(name = "stare_date")
	@JsonProperty(access = JsonProperty.Access.AUTO)
	private Date stareDate;
	
	@Builder
	public QuestionEntity(String inputId, Date inputDate, String updateId, Date updateDate, Integer examNo,
			Integer classNo, Integer year, Integer grade, Integer course, String largeCategory, String mediumCategory,
			String date, Integer count, Integer stare, Integer stareScore, Date stareDate) {
		super(inputId, inputDate, updateId, updateDate);
		this.examNo = examNo;
		this.classNo = classNo;
		this.year = year;
		this.grade = grade;
		this.course = course;
		this.largeCategory = largeCategory;
		this.mediumCategory = mediumCategory;
		this.date = date;
		this.count = count;
		this.stare = stare;
		this.stareScore = stareScore;
		this.stareDate = stareDate;
		
		validate();
	}
	
	private void validate() {
		//단순 값 조건은 annotation으로 처리 하고 값 간의 조건 비교를 검사.
//		Assert.hasText(title, "title must not be empty");
//		Assert.hasText(contents, "contents must not be empty");
	}
}
