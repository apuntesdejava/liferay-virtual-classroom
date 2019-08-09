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

package com.apuntesdejava.virtualclassroom.model.impl;

import com.apuntesdejava.virtualclassroom.model.CourseSession;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The cache model class for representing CourseSession in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@ProviderType
public class CourseSessionCacheModel
	implements CacheModel<CourseSession>, Externalizable {

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof CourseSessionCacheModel)) {
			return false;
		}

		CourseSessionCacheModel courseSessionCacheModel =
			(CourseSessionCacheModel)obj;

		if (courseSessionId == courseSessionCacheModel.courseSessionId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, courseSessionId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(23);

		sb.append("{courseSessionId=");
		sb.append(courseSessionId);
		sb.append(", groupId=");
		sb.append(groupId);
		sb.append(", companyId=");
		sb.append(companyId);
		sb.append(", userId=");
		sb.append(userId);
		sb.append(", userName=");
		sb.append(userName);
		sb.append(", createDate=");
		sb.append(createDate);
		sb.append(", modifiedDate=");
		sb.append(modifiedDate);
		sb.append(", title=");
		sb.append(title);
		sb.append(", description=");
		sb.append(description);
		sb.append(", dueDate=");
		sb.append(dueDate);
		sb.append(", courseId=");
		sb.append(courseId);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public CourseSession toEntityModel() {
		CourseSessionImpl courseSessionImpl = new CourseSessionImpl();

		courseSessionImpl.setCourseSessionId(courseSessionId);
		courseSessionImpl.setGroupId(groupId);
		courseSessionImpl.setCompanyId(companyId);
		courseSessionImpl.setUserId(userId);

		if (userName == null) {
			courseSessionImpl.setUserName("");
		}
		else {
			courseSessionImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			courseSessionImpl.setCreateDate(null);
		}
		else {
			courseSessionImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			courseSessionImpl.setModifiedDate(null);
		}
		else {
			courseSessionImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (title == null) {
			courseSessionImpl.setTitle("");
		}
		else {
			courseSessionImpl.setTitle(title);
		}

		if (description == null) {
			courseSessionImpl.setDescription("");
		}
		else {
			courseSessionImpl.setDescription(description);
		}

		if (dueDate == Long.MIN_VALUE) {
			courseSessionImpl.setDueDate(null);
		}
		else {
			courseSessionImpl.setDueDate(new Date(dueDate));
		}

		courseSessionImpl.setCourseId(courseId);

		courseSessionImpl.resetOriginalValues();

		return courseSessionImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		courseSessionId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		title = objectInput.readUTF();
		description = objectInput.readUTF();
		dueDate = objectInput.readLong();

		courseId = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(courseSessionId);

		objectOutput.writeLong(groupId);

		objectOutput.writeLong(companyId);

		objectOutput.writeLong(userId);

		if (userName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(userName);
		}

		objectOutput.writeLong(createDate);
		objectOutput.writeLong(modifiedDate);

		if (title == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(title);
		}

		if (description == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(description);
		}

		objectOutput.writeLong(dueDate);

		objectOutput.writeLong(courseId);
	}

	public long courseSessionId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String title;
	public String description;
	public long dueDate;
	public long courseId;

}