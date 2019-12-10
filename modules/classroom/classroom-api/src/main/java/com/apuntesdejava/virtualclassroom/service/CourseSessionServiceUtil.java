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

import org.osgi.annotation.versioning.ProviderType;
import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;
import org.osgi.util.tracker.ServiceTracker;

/**
 * Provides the remote service utility for CourseSession. This utility wraps
 * <code>com.apuntesdejava.virtualclassroom.service.impl.CourseSessionServiceImpl</code> and is an
 * access point for service operations in application layer code running on a
 * remote server. Methods of this service are expected to have security checks
 * based on the propagated JAAS credentials because this service can be
 * accessed remotely.
 *
 * @author Brian Wing Shun Chan
 * @see CourseSessionService
 * @generated
 */
@ProviderType
public class CourseSessionServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.apuntesdejava.virtualclassroom.service.impl.CourseSessionServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static com.apuntesdejava.virtualclassroom.model.CourseSession
			addCourseSession(
				String title, String description, long courseId,
				java.util.Date dueDate,
				com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().addCourseSession(
			title, description, courseId, dueDate, serviceContext);
	}

	public static int countByCourseId(long courseId) {
		return getService().countByCourseId(courseId);
	}

	public static java.util.List
		<com.apuntesdejava.virtualclassroom.model.CourseSession> findByCourseId(
			long courseId) {

		return getService().findByCourseId(courseId);
	}

	public static java.util.List
		<com.apuntesdejava.virtualclassroom.model.CourseSession> findByCourseId(
			long courseId, int start, int end) {

		return getService().findByCourseId(courseId, start, end);
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	public static String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	public static com.apuntesdejava.virtualclassroom.model.CourseSession
			updateCourseSession(
				long courseSessionId, String title, String description,
				java.util.Date dueDate,
				com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().updateCourseSession(
			courseSessionId, title, description, dueDate, serviceContext);
	}

	public static CourseSessionService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<CourseSessionService, CourseSessionService>
		_serviceTracker;

	static {
		Bundle bundle = FrameworkUtil.getBundle(CourseSessionService.class);

		ServiceTracker<CourseSessionService, CourseSessionService>
			serviceTracker =
				new ServiceTracker<CourseSessionService, CourseSessionService>(
					bundle.getBundleContext(), CourseSessionService.class,
					null);

		serviceTracker.open();

		_serviceTracker = serviceTracker;
	}

}