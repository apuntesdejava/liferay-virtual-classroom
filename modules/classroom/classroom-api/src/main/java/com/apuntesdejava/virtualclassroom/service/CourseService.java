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

package com.apuntesdejava.virtualclassroom.service;

import com.apuntesdejava.virtualclassroom.model.Course;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.jsonwebservice.JSONWebService;
import com.liferay.portal.kernel.security.access.control.AccessControlled;
import com.liferay.portal.kernel.service.BaseService;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.transaction.Isolation;
import com.liferay.portal.kernel.transaction.Propagation;
import com.liferay.portal.kernel.transaction.Transactional;
import com.liferay.portal.kernel.util.OrderByComparator;

import java.util.List;
import java.util.Locale;
import java.util.Map;

import org.osgi.annotation.versioning.ProviderType;

/**
 * Provides the remote service interface for Course. Methods of this
 * service are expected to have security checks based on the propagated JAAS
 * credentials because this service can be accessed remotely.
 *
 * @author Brian Wing Shun Chan
 * @see CourseServiceUtil
 * @generated
 */
@AccessControlled
@JSONWebService
@ProviderType
@Transactional(
	isolation = Isolation.PORTAL,
	rollbackFor = {PortalException.class, SystemException.class}
)
public interface CourseService extends BaseService {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link CourseServiceUtil} to access the course remote service. Add custom service methods to <code>com.apuntesdejava.virtualclassroom.service.impl.CourseServiceImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public Course addCourse(
			long groupId, Map<Locale, String> name, String description,
			ServiceContext serviceContext)
		throws PortalException;

	public int countByGroupId(long groupId);

	public int countByU_G(long userId, long groupId);

	public int countByUserId(long userId);

	public Course deleteCourse(long courseId) throws PortalException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public Course fetchCourse(long courseId);

	public List<Course> findByGroupId(long groupId);

	public List<Course> findByGroupId(long groupId, int start, int end);

	public List<Course> findByKeywords(
		long groupId, String keywords, int start, int end,
		OrderByComparator<Course> orderByComparator);

	public List<Course> findByU_G(long userId, long groupId);

	public List<Course> findByU_G(
		long userId, long groupId, int start, int end);

	public List<Course> findByUserId(long userId);

	public List<Course> findByUserId(long userId, int start, int end);

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	public String getOSGiServiceIdentifier();

	public Course updateCourse(
			long courseId, Map<Locale, String> name, String description,
			ServiceContext serviceContext)
		throws PortalException;

}