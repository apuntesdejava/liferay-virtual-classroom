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

import com.liferay.portal.kernel.service.ServiceWrapper;

import org.osgi.annotation.versioning.ProviderType;

/**
 * Provides a wrapper for {@link CourseSessionService}.
 *
 * @author Brian Wing Shun Chan
 * @see CourseSessionService
 * @generated
 */
@ProviderType
public class CourseSessionServiceWrapper
	implements CourseSessionService, ServiceWrapper<CourseSessionService> {

	public CourseSessionServiceWrapper(
		CourseSessionService courseSessionService) {

		_courseSessionService = courseSessionService;
	}

	@Override
	public com.apuntesdejava.virtualclassroom.model.CourseSession
			addCourseSession(
				String title, String description, long courseId,
				java.util.Date dueDate,
				com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _courseSessionService.addCourseSession(
			title, description, courseId, dueDate, serviceContext);
	}

	@Override
	public int countByCourseId(long courseId) {
		return _courseSessionService.countByCourseId(courseId);
	}

	@Override
	public java.util.List
		<com.apuntesdejava.virtualclassroom.model.CourseSession> findByCourseId(
			long courseId) {

		return _courseSessionService.findByCourseId(courseId);
	}

	@Override
	public java.util.List
		<com.apuntesdejava.virtualclassroom.model.CourseSession> findByCourseId(
			long courseId, int start, int end) {

		return _courseSessionService.findByCourseId(courseId, start, end);
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _courseSessionService.getOSGiServiceIdentifier();
	}

	@Override
	public com.apuntesdejava.virtualclassroom.model.CourseSession
			updateCourseSession(
				long courseSessionId, String title, String description,
				java.util.Date dueDate,
				com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _courseSessionService.updateCourseSession(
			courseSessionId, title, description, dueDate, serviceContext);
	}

	@Override
	public CourseSessionService getWrappedService() {
		return _courseSessionService;
	}

	@Override
	public void setWrappedService(CourseSessionService courseSessionService) {
		_courseSessionService = courseSessionService;
	}

	private CourseSessionService _courseSessionService;

}