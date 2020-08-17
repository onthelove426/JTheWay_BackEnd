package net.haaim.web.common.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@MappedSuperclass
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
public class CommonEntity {
	
	@Column(name = "input_id", nullable = false, unique = false, length = 45)
	@JsonProperty(value = "input_id", access = JsonProperty.Access.WRITE_ONLY)
	protected String inputId;

	@Column(name = "input_date", nullable = false, unique = false)
	@JsonProperty(value = "input_date", access = JsonProperty.Access.WRITE_ONLY)
	protected Date inputDate;

	@Column(name = "update_id", nullable = true, unique = false, length = 45)
	@JsonProperty(value = "update_id", access = JsonProperty.Access.WRITE_ONLY)
	protected String updateId = "";

	@Column(name = "update_date", nullable = true, unique = false)
	@JsonProperty(value = "update_date", access = JsonProperty.Access.WRITE_ONLY)
	protected Date updateDate = new Date();
	
	
	
	protected CommonEntity(String inputId, Date inputDate, String updateId, Date updateDate) {
		this.inputId = inputId;
		this.inputDate = inputDate;
		this.updateId = updateId;
		this.updateDate = updateDate;
	}

}