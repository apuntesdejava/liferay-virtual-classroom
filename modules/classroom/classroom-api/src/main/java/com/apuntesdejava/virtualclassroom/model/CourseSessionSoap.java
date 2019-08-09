/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.apuntesdejava.virtualclassroom.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.osgi.annotation.versioning.ProviderType;

/**
 * This class is used by SOAP remote services, specifically {@link com.apuntesdejava.virtualclassroom.service.http.CourseSessionServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@ProviderType
public class CourseSessionSoap implements Serializable {

	public static CourseSessionSoap toSoapModel(CourseSession model) {
		CourseSessionSoap soapModel = new CourseSessionSoap();

		soapModel.setCourseSessionId(model.getCourseSessionId());
		soapModel.setGroupId(model.getGroupId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setUserId(model.getUserId());
		soapModel.setUserName(model.getUserName());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setTitle(model.getTitle());
		soapModel.setDescription(model.getDescription());
		soapModel.setDueDate(model.getDueDate());
		soapModel.setCourseId(model.getCourseId());

		return soapModel;
	}

	public static CourseSessionSoap[] toSoapModels(CourseSession[] models) {
		CourseSessionSoap[] soapModels = new CourseSessionSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static CourseSessionSoap[][] toSoapModels(CourseSession[][] models) {
		CourseSessionSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new CourseSessionSoap[models.length][models[0].length];
		}
		else {
			soapModels = new CourseSessionSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static CourseSessionSoap[] toSoapModels(List<CourseSession> models) {
		List<CourseSessionSoap> soapModels = new ArrayList<CourseSessionSoap>(
			models.size());

		for (CourseSession model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new CourseSessionSoap[soapModels.size()]);
	}

	public CourseSessionSoap() {
	}

	public long getPrimaryKey() {
		return _courseSessionId;
	}

	public void setPrimaryKey(long pk) {
		setCourseSessionId(pk);
	}

	public long getCourseSessionId() {
		return _courseSessionId;
	}

	public void setCourseSessionId(long courseSessionId) {
		_courseSessionId = courseSessionId;
	}

	public long getGroupId() {
		return _groupId;
	}

	public void setGroupId(long groupId) {
		_groupId = groupId;
	}

	public long getCompanyId() {
		return _companyId;
	}

	public void setCompanyId(long companyId) {
		_companyId = companyId;
	}

	public long getUserId() {
		return _userId;
	}

	public void setUserId(long userId) {
		_userId = userId;
	}

	public String getUserName() {
		return _userName;
	}

	public void setUserName(String userName) {
		_userName = userName;
	}

	public Date getCreateDate() {
		return _createDate;
	}

	public void setCreateDate(Date createDate) {
		_createDate = createDate;
	}

	public Date getModifiedDate() {
		return _modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		_modifiedDate = modifiedDate;
	}

	public String getTitle() {
		return _title;
	}

	public void setTitle(String title) {
		_title = title;
	}

	public String getDescription() {
		return _description;
	}

	public void setDescription(String description) {
		_description = description;
	}

	public Date getDueDate() {
		return _dueDate;
	}

	public void setDueDate(Date dueDate) {
		_dueDate = dueDate;
	}

	public long getCourseId() {
		return _courseId;
	}

	public void setCourseId(long courseId) {
		_courseId = courseId;
	}

	private long _courseSessionId;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private String _title;
	private String _description;
	private Date _dueDate;
	private long _courseId;

}