package com.task.db.entity;


import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.GeneratedValue;

@Entity 
public class Task 
{
	public Task() {
		super();
	}
	public Task(int ticketNumber, String ticketLink, String estimatedHours, Date dateOfAssignment, Date dateOfDelivery,
			Date deadLine, Status status, Date createBy, Date createAt, Date updateBy, Date updateAt, boolean delay) {
		super();
		this.ticketNumber = ticketNumber;
		this.ticketLink = ticketLink;
		this.estimatedHours = estimatedHours;
		this.dateOfAssignment = dateOfAssignment;
		this.dateOfDelivery = dateOfDelivery;
		this.deadLine = deadLine;
		this.status = status;
		this.createBy = createBy;
		this.createAt = createAt;
		this.updateBy = updateBy;
		this.updateAt = updateAt;
		this.delay = delay;
	}
	public enum Status
	{
		ASSIGNED,PENDING,COMPLETED,SUBMITTED,IN_REVIEW,ACCEPTED,CLOSED
	}
	@Id 
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	private int ticketNumber;
	@Column(unique=true,nullable=false)
	
	private String ticketLink;
	@Column(nullable=false)
	private String estimatedHours;
	private Date dateOfAssignment;
	private Date dateOfDelivery;
	private Date deadLine;
	@Enumerated(EnumType.STRING)
	@Column(nullable=false)
	private  Status status;
	private Date createBy;

    @CreationTimestamp
	private Date createAt;
	private Date updateBy;
	@UpdateTimestamp
	private Date updateAt;
	private boolean delay;
	public int getTicketNumber() {
		return ticketNumber;
	}
	public void setTicketNumber(int ticketNumber) {
		this.ticketNumber = ticketNumber;
	}
	public String getTicketLink() {
		return ticketLink;
	}
	public void setTicketLink(String ticketLink) {
		this.ticketLink = ticketLink;
	}
	public String getEstimatedHours() {
		return estimatedHours;
	}
	public void setEstimatedHours(String estimatedHours) {
		this.estimatedHours = estimatedHours;
	}
	public Date getDateOfAssignment() {
		return dateOfAssignment;
	}
	public void setDateOfAssignment(Date dateOfAssignment) {
		this.dateOfAssignment = dateOfAssignment;
	}
	public Date getDateOfDelivery() {
		return dateOfDelivery;
	}
	public void setDateOfDelivery(Date dateOfDelivery) {
		this.dateOfDelivery = dateOfDelivery;
	}
	public Date getDeadLine() {
		return deadLine;
	}
	public void setDeadLine(Date deadLine) {
		this.deadLine = deadLine;
	}
	public Status getStatus() {
		return status;
	}
	public void setStatus(Status status) {
		this.status = status;
	}
	public Date getCreateBy() {
		return createBy;
	}
	public void setCreateBy(Date createBy) {
		this.createBy = createBy;
	}
	public Date getCreateAt() {
		return createAt;
	}
	public void setCreateAt(Date createAt) {
		this.createAt = createAt;
	}
	public Date getUpdateBy() {
		return updateBy;
	}
	public void setUpdateBy(Date updateBy) {
		this.updateBy = updateBy;
	}
	public Date getUpdateAt() {
		return updateAt;
	}
	public void setUpdateAt(Date updateAt) {
		this.updateAt = updateAt;
	}
	
	@Override
	public String toString() {
		return "Task [ticketNumber=" + ticketNumber + ", ticketLink=" + ticketLink + ", estimatedHours="
				+ estimatedHours + ", dateOfAssignment=" + dateOfAssignment + ", dateOfDelivery=" + dateOfDelivery
				+ ", deadLine=" + deadLine + ", status=" + status + ", createBy=" + createBy + ", createAt=" + createAt
				+ ", updateBy=" + updateBy + ", updateAt=" + updateAt + ", delay=" + delay + "]";
	}
	public boolean isDelay() {
		return delay;
	}
	public void setDelay(boolean delay) {
		this.delay = delay;
	}

}
