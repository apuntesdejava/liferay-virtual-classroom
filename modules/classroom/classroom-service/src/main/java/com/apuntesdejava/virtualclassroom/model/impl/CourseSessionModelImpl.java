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
import com.apuntesdejava.virtualclassroom.model.CourseSessionModel;
import com.apuntesdejava.virtualclassroom.model.CourseSessionSoap;

import com.liferay.expando.kernel.model.ExpandoBridge;
import com.liferay.expando.kernel.util.ExpandoBridgeFactoryUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.json.JSON;
import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.model.impl.BaseModelImpl;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.UserLocalServiceUtil;
import com.liferay.portal.kernel.util.ProxyUtil;

import java.io.Serializable;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationHandler;

import java.sql.Types;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Function;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The base model implementation for the CourseSession service. Represents a row in the &quot;vc_CourseSession&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface </code>CourseSessionModel</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link CourseSessionImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CourseSessionImpl
 * @generated
 */
@JSON(strict = true)
@ProviderType
public class CourseSessionModelImpl
	extends BaseModelImpl<CourseSession> implements CourseSessionModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a course session model instance should use the <code>CourseSession</code> interface instead.
	 */
	public static final String TABLE_NAME = "vc_CourseSession";

	public static final Object[][] TABLE_COLUMNS = {
		{"courseSessionId", Types.BIGINT}, {"groupId", Types.BIGINT},
		{"companyId", Types.BIGINT}, {"userId", Types.BIGINT},
		{"userName", Types.VARCHAR}, {"createDate", Types.TIMESTAMP},
		{"modifiedDate", Types.TIMESTAMP}, {"title", Types.VARCHAR},
		{"description", Types.VARCHAR}, {"dueDate", Types.TIMESTAMP},
		{"courseId", Types.BIGINT}
	};

	public static final Map<String, Integer> TABLE_COLUMNS_MAP =
		new HashMap<String, Integer>();

	static {
		TABLE_COLUMNS_MAP.put("courseSessionId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("groupId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("companyId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("userId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("userName", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("createDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("modifiedDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("title", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("description", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("dueDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("courseId", Types.BIGINT);
	}

	public static final String TABLE_SQL_CREATE =
		"create table vc_CourseSession (courseSessionId LONG not null primary key,groupId LONG,companyId LONG,userId LONG,userName VARCHAR(75) null,createDate DATE null,modifiedDate DATE null,title VARCHAR(75) null,description VARCHAR(75) null,dueDate DATE null,courseId LONG)";

	public static final String TABLE_SQL_DROP = "drop table vc_CourseSession";

	public static final String ORDER_BY_JPQL =
		" ORDER BY courseSession.courseSessionId ASC";

	public static final String ORDER_BY_SQL =
		" ORDER BY vc_CourseSession.courseSessionId ASC";

	public static final String DATA_SOURCE = "liferayDataSource";

	public static final String SESSION_FACTORY = "liferaySessionFactory";

	public static final String TX_MANAGER = "liferayTransactionManager";

	public static final long COURSEID_COLUMN_BITMASK = 1L;

	public static final long COURSESESSIONID_COLUMN_BITMASK = 2L;

	public static void setEntityCacheEnabled(boolean entityCacheEnabled) {
		_entityCacheEnabled = entityCacheEnabled;
	}

	public static void setFinderCacheEnabled(boolean finderCacheEnabled) {
		_finderCacheEnabled = finderCacheEnabled;
	}

	/**
	 * Converts the soap model instance into a normal model instance.
	 *
	 * @param soapModel the soap model instance to convert
	 * @return the normal model instance
	 */
	public static CourseSession toModel(CourseSessionSoap soapModel) {
		if (soapModel == null) {
			return null;
		}

		CourseSession model = new CourseSessionImpl();

		model.setCourseSessionId(soapModel.getCourseSessionId());
		model.setGroupId(soapModel.getGroupId());
		model.setCompanyId(soapModel.getCompanyId());
		model.setUserId(soapModel.getUserId());
		model.setUserName(soapModel.getUserName());
		model.setCreateDate(soapModel.getCreateDate());
		model.setModifiedDate(soapModel.getModifiedDate());
		model.setTitle(soapModel.getTitle());
		model.setDescription(soapModel.getDescription());
		model.setDueDate(soapModel.getDueDate());
		model.setCourseId(soapModel.getCourseId());

		return model;
	}

	/**
	 * Converts the soap model instances into normal model instances.
	 *
	 * @param soapModels the soap model instances to convert
	 * @return the normal model instances
	 */
	public static List<CourseSession> toModels(CourseSessionSoap[] soapModels) {
		if (soapModels == null) {
			return null;
		}

		List<CourseSession> models = new ArrayList<CourseSession>(
			soapModels.length);

		for (CourseSessionSoap soapModel : soapModels) {
			models.add(toModel(soapModel));
		}

		return models;
	}

	public CourseSessionModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _courseSessionId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setCourseSessionId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _courseSessionId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return CourseSession.class;
	}

	@Override
	public String getModelClassName() {
		return CourseSession.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		Map<String, Function<CourseSession, Object>> attributeGetterFunctions =
			getAttributeGetterFunctions();

		for (Map.Entry<String, Function<CourseSession, Object>> entry :
				attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<CourseSession, Object> attributeGetterFunction =
				entry.getValue();

			attributes.put(
				attributeName,
				attributeGetterFunction.apply((CourseSession)this));
		}

		attributes.put("entityCacheEnabled", isEntityCacheEnabled());
		attributes.put("finderCacheEnabled", isFinderCacheEnabled());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Map<String, BiConsumer<CourseSession, Object>>
			attributeSetterBiConsumers = getAttributeSetterBiConsumers();

		for (Map.Entry<String, Object> entry : attributes.entrySet()) {
			String attributeName = entry.getKey();

			BiConsumer<CourseSession, Object> attributeSetterBiConsumer =
				attributeSetterBiConsumers.get(attributeName);

			if (attributeSetterBiConsumer != null) {
				attributeSetterBiConsumer.accept(
					(CourseSession)this, entry.getValue());
			}
		}
	}

	public Map<String, Function<CourseSession, Object>>
		getAttributeGetterFunctions() {

		return _attributeGetterFunctions;
	}

	public Map<String, BiConsumer<CourseSession, Object>>
		getAttributeSetterBiConsumers() {

		return _attributeSetterBiConsumers;
	}

	private static Function<InvocationHandler, CourseSession>
		_getProxyProviderFunction() {

		Class<?> proxyClass = ProxyUtil.getProxyClass(
			CourseSession.class.getClassLoader(), CourseSession.class,
			ModelWrapper.class);

		try {
			Constructor<CourseSession> constructor =
				(Constructor<CourseSession>)proxyClass.getConstructor(
					InvocationHandler.class);

			return invocationHandler -> {
				try {
					return constructor.newInstance(invocationHandler);
				}
				catch (ReflectiveOperationException roe) {
					throw new InternalError(roe);
				}
			};
		}
		catch (NoSuchMethodException nsme) {
			throw new InternalError(nsme);
		}
	}

	private static final Map<String, Function<CourseSession, Object>>
		_attributeGetterFunctions;
	private static final Map<String, BiConsumer<CourseSession, Object>>
		_attributeSetterBiConsumers;

	static {
		Map<String, Function<CourseSession, Object>> attributeGetterFunctions =
			new LinkedHashMap<String, Function<CourseSession, Object>>();
		Map<String, BiConsumer<CourseSession, ?>> attributeSetterBiConsumers =
			new LinkedHashMap<String, BiConsumer<CourseSession, ?>>();

		attributeGetterFunctions.put(
			"courseSessionId", CourseSession::getCourseSessionId);
		attributeSetterBiConsumers.put(
			"courseSessionId",
			(BiConsumer<CourseSession, Long>)CourseSession::setCourseSessionId);
		attributeGetterFunctions.put("groupId", CourseSession::getGroupId);
		attributeSetterBiConsumers.put(
			"groupId",
			(BiConsumer<CourseSession, Long>)CourseSession::setGroupId);
		attributeGetterFunctions.put("companyId", CourseSession::getCompanyId);
		attributeSetterBiConsumers.put(
			"companyId",
			(BiConsumer<CourseSession, Long>)CourseSession::setCompanyId);
		attributeGetterFunctions.put("userId", CourseSession::getUserId);
		attributeSetterBiConsumers.put(
			"userId",
			(BiConsumer<CourseSession, Long>)CourseSession::setUserId);
		attributeGetterFunctions.put("userName", CourseSession::getUserName);
		attributeSetterBiConsumers.put(
			"userName",
			(BiConsumer<CourseSession, String>)CourseSession::setUserName);
		attributeGetterFunctions.put(
			"createDate", CourseSession::getCreateDate);
		attributeSetterBiConsumers.put(
			"createDate",
			(BiConsumer<CourseSession, Date>)CourseSession::setCreateDate);
		attributeGetterFunctions.put(
			"modifiedDate", CourseSession::getModifiedDate);
		attributeSetterBiConsumers.put(
			"modifiedDate",
			(BiConsumer<CourseSession, Date>)CourseSession::setModifiedDate);
		attributeGetterFunctions.put("title", CourseSession::getTitle);
		attributeSetterBiConsumers.put(
			"title",
			(BiConsumer<CourseSession, String>)CourseSession::setTitle);
		attributeGetterFunctions.put(
			"description", CourseSession::getDescription);
		attributeSetterBiConsumers.put(
			"description",
			(BiConsumer<CourseSession, String>)CourseSession::setDescription);
		attributeGetterFunctions.put("dueDate", CourseSession::getDueDate);
		attributeSetterBiConsumers.put(
			"dueDate",
			(BiConsumer<CourseSession, Date>)CourseSession::setDueDate);
		attributeGetterFunctions.put("courseId", CourseSession::getCourseId);
		attributeSetterBiConsumers.put(
			"courseId",
			(BiConsumer<CourseSession, Long>)CourseSession::setCourseId);

		_attributeGetterFunctions = Collections.unmodifiableMap(
			attributeGetterFunctions);
		_attributeSetterBiConsumers = Collections.unmodifiableMap(
			(Map)attributeSetterBiConsumers);
	}

	@JSON
	@Override
	public long getCourseSessionId() {
		return _courseSessionId;
	}

	@Override
	public void setCourseSessionId(long courseSessionId) {
		_courseSessionId = courseSessionId;
	}

	@JSON
	@Override
	public long getGroupId() {
		return _groupId;
	}

	@Override
	public void setGroupId(long groupId) {
		_groupId = groupId;
	}

	@JSON
	@Override
	public long getCompanyId() {
		return _companyId;
	}

	@Override
	public void setCompanyId(long companyId) {
		_companyId = companyId;
	}

	@JSON
	@Override
	public long getUserId() {
		return _userId;
	}

	@Override
	public void setUserId(long userId) {
		_userId = userId;
	}

	@Override
	public String getUserUuid() {
		try {
			User user = UserLocalServiceUtil.getUserById(getUserId());

			return user.getUuid();
		}
		catch (PortalException pe) {
			return "";
		}
	}

	@Override
	public void setUserUuid(String userUuid) {
	}

	@JSON
	@Override
	public String getUserName() {
		if (_userName == null) {
			return "";
		}
		else {
			return _userName;
		}
	}

	@Override
	public void setUserName(String userName) {
		_userName = userName;
	}

	@JSON
	@Override
	public Date getCreateDate() {
		return _createDate;
	}

	@Override
	public void setCreateDate(Date createDate) {
		_createDate = createDate;
	}

	@JSON
	@Override
	public Date getModifiedDate() {
		return _modifiedDate;
	}

	public boolean hasSetModifiedDate() {
		return _setModifiedDate;
	}

	@Override
	public void setModifiedDate(Date modifiedDate) {
		_setModifiedDate = true;

		_modifiedDate = modifiedDate;
	}

	@JSON
	@Override
	public String getTitle() {
		if (_title == null) {
			return "";
		}
		else {
			return _title;
		}
	}

	@Override
	public void setTitle(String title) {
		_title = title;
	}

	@JSON
	@Override
	public String getDescription() {
		if (_description == null) {
			return "";
		}
		else {
			return _description;
		}
	}

	@Override
	public void setDescription(String description) {
		_description = description;
	}

	@JSON
	@Override
	public Date getDueDate() {
		return _dueDate;
	}

	@Override
	public void setDueDate(Date dueDate) {
		_dueDate = dueDate;
	}

	@JSON
	@Override
	public long getCourseId() {
		return _courseId;
	}

	@Override
	public void setCourseId(long courseId) {
		_columnBitmask |= COURSEID_COLUMN_BITMASK;

		if (!_setOriginalCourseId) {
			_setOriginalCourseId = true;

			_originalCourseId = _courseId;
		}

		_courseId = courseId;
	}

	public long getOriginalCourseId() {
		return _originalCourseId;
	}

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(
			getCompanyId(), CourseSession.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public CourseSession toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = _escapedModelProxyProviderFunction.apply(
				new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		CourseSessionImpl courseSessionImpl = new CourseSessionImpl();

		courseSessionImpl.setCourseSessionId(getCourseSessionId());
		courseSessionImpl.setGroupId(getGroupId());
		courseSessionImpl.setCompanyId(getCompanyId());
		courseSessionImpl.setUserId(getUserId());
		courseSessionImpl.setUserName(getUserName());
		courseSessionImpl.setCreateDate(getCreateDate());
		courseSessionImpl.setModifiedDate(getModifiedDate());
		courseSessionImpl.setTitle(getTitle());
		courseSessionImpl.setDescription(getDescription());
		courseSessionImpl.setDueDate(getDueDate());
		courseSessionImpl.setCourseId(getCourseId());

		courseSessionImpl.resetOriginalValues();

		return courseSessionImpl;
	}

	@Override
	public int compareTo(CourseSession courseSession) {
		long primaryKey = courseSession.getPrimaryKey();

		if (getPrimaryKey() < primaryKey) {
			return -1;
		}
		else if (getPrimaryKey() > primaryKey) {
			return 1;
		}
		else {
			return 0;
		}
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof CourseSession)) {
			return false;
		}

		CourseSession courseSession = (CourseSession)obj;

		long primaryKey = courseSession.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _entityCacheEnabled;
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _finderCacheEnabled;
	}

	@Override
	public void resetOriginalValues() {
		CourseSessionModelImpl courseSessionModelImpl = this;

		courseSessionModelImpl._setModifiedDate = false;

		courseSessionModelImpl._originalCourseId =
			courseSessionModelImpl._courseId;

		courseSessionModelImpl._setOriginalCourseId = false;

		courseSessionModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<CourseSession> toCacheModel() {
		CourseSessionCacheModel courseSessionCacheModel =
			new CourseSessionCacheModel();

		courseSessionCacheModel.courseSessionId = getCourseSessionId();

		courseSessionCacheModel.groupId = getGroupId();

		courseSessionCacheModel.companyId = getCompanyId();

		courseSessionCacheModel.userId = getUserId();

		courseSessionCacheModel.userName = getUserName();

		String userName = courseSessionCacheModel.userName;

		if ((userName != null) && (userName.length() == 0)) {
			courseSessionCacheModel.userName = null;
		}

		Date createDate = getCreateDate();

		if (createDate != null) {
			courseSessionCacheModel.createDate = createDate.getTime();
		}
		else {
			courseSessionCacheModel.createDate = Long.MIN_VALUE;
		}

		Date modifiedDate = getModifiedDate();

		if (modifiedDate != null) {
			courseSessionCacheModel.modifiedDate = modifiedDate.getTime();
		}
		else {
			courseSessionCacheModel.modifiedDate = Long.MIN_VALUE;
		}

		courseSessionCacheModel.title = getTitle();

		String title = courseSessionCacheModel.title;

		if ((title != null) && (title.length() == 0)) {
			courseSessionCacheModel.title = null;
		}

		courseSessionCacheModel.description = getDescription();

		String description = courseSessionCacheModel.description;

		if ((description != null) && (description.length() == 0)) {
			courseSessionCacheModel.description = null;
		}

		Date dueDate = getDueDate();

		if (dueDate != null) {
			courseSessionCacheModel.dueDate = dueDate.getTime();
		}
		else {
			courseSessionCacheModel.dueDate = Long.MIN_VALUE;
		}

		courseSessionCacheModel.courseId = getCourseId();

		return courseSessionCacheModel;
	}

	@Override
	public String toString() {
		Map<String, Function<CourseSession, Object>> attributeGetterFunctions =
			getAttributeGetterFunctions();

		StringBundler sb = new StringBundler(
			4 * attributeGetterFunctions.size() + 2);

		sb.append("{");

		for (Map.Entry<String, Function<CourseSession, Object>> entry :
				attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<CourseSession, Object> attributeGetterFunction =
				entry.getValue();

			sb.append(attributeName);
			sb.append("=");
			sb.append(attributeGetterFunction.apply((CourseSession)this));
			sb.append(", ");
		}

		if (sb.index() > 1) {
			sb.setIndex(sb.index() - 1);
		}

		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		Map<String, Function<CourseSession, Object>> attributeGetterFunctions =
			getAttributeGetterFunctions();

		StringBundler sb = new StringBundler(
			5 * attributeGetterFunctions.size() + 4);

		sb.append("<model><model-name>");
		sb.append(getModelClassName());
		sb.append("</model-name>");

		for (Map.Entry<String, Function<CourseSession, Object>> entry :
				attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<CourseSession, Object> attributeGetterFunction =
				entry.getValue();

			sb.append("<column><column-name>");
			sb.append(attributeName);
			sb.append("</column-name><column-value><![CDATA[");
			sb.append(attributeGetterFunction.apply((CourseSession)this));
			sb.append("]]></column-value></column>");
		}

		sb.append("</model>");

		return sb.toString();
	}

	private static final Function<InvocationHandler, CourseSession>
		_escapedModelProxyProviderFunction = _getProxyProviderFunction();
	private static boolean _entityCacheEnabled;
	private static boolean _finderCacheEnabled;

	private long _courseSessionId;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private boolean _setModifiedDate;
	private String _title;
	private String _description;
	private Date _dueDate;
	private long _courseId;
	private long _originalCourseId;
	private boolean _setOriginalCourseId;
	private long _columnBitmask;
	private CourseSession _escapedModel;

}